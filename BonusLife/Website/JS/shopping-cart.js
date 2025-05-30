document.addEventListener('DOMContentLoaded', () => {
    const cart_container = document.querySelector(".section-2");
    const total_price_element = document.querySelector(".total-price");
    const buy_cart_button = document.getElementById("buy-cart");

    // Αρχικοποίηση καλαθιού από το localStorage ή κενός πίνακας
    let cart = JSON.parse(localStorage.getItem("cart")) || [];

    // Συνάρτηση για ενημέρωση της συνολικής τιμής του καλαθιού
    function updateTotalPrice() {
        const total = cart.reduce((sum, item) => sum + (item.price * item.quantity), 0);
        total_price_element.textContent = `Total Cart Price: $${total.toFixed(2)}`;
    }

    // Συνάρτηση για εμφάνιση των προϊόντων στο καλάθι
    function displayCart() {
        // Καθαρισμός προηγούμενων προϊόντων εκτός από το κουτί συνολικής τιμής
        const total_price_box = document.querySelector(".total-price-box");
        cart_container.innerHTML = '';
        cart_container.appendChild(total_price_box);

        cart.forEach(item => {
            // Δημιουργία κουτιού για κάθε προϊόν στο καλάθι
            const cart_item_box = document.createElement("div");
            cart_item_box.className = "cart-item-box";
            cart_item_box.style.backgroundColor = "#fff";
            cart_item_box.style.height = "100px";
            cart_item_box.style.width = "600px";
            cart_item_box.style.border = "1px solid #ddd";
            cart_item_box.style.borderRadius = "8px";
            cart_item_box.style.padding = "15px";
            cart_item_box.style.marginBottom = "10px"; 
            cart_item_box.style.display = "flex";
            cart_item_box.style.alignItems = "center";
            cart_item_box.style.gap = "15px";
            cart_item_box.style.boxShadow = "0 2px 5px rgba(0, 0, 0, 0.1)";

            // Εικόνα προϊόντος
            const img = document.createElement("img");
            img.src = item.image;
            img.alt = item.name;
            img.style.width = "80px";
            img.style.height = "80px";
            img.style.objectFit = "contain";

            // Όνομα προϊόντος
            const name = document.createElement("h3");
            name.textContent = item.name;
            name.style.fontFamily = "Rubik, sans-seri";
            name.style.fontSize = "1.1rem";
            name.style.color = "rgb(195, 0, 255)";
            name.style.margin = "0";

            // Ποσότητα
            const quantity = document.createElement("p");
            quantity.textContent = `Quantity: ${item.quantity}`;
            quantity.style.fontFamily = "Rubik, sans-serif";
            quantity.style.fontSize = "0.9rem";
            quantity.style.color = "#000";
            quantity.style.margin = "5px 0";
            quantity.style.fontWeight = "bold";

            // Συνολική τιμή προϊόντος
            const total_price = document.createElement("p");
            total_price.textContent = `Total Price: $${(item.price * item.quantity).toFixed(2)}`;
            total_price.style.fontFamily = "Rubik, sans-serif";
            total_price.style.fontSize = "0.9rem";
            total_price.style.color = "rgb(195, 0, 255)";
            total_price.style.margin = "5px 0";
            total_price.style.fontWeight = "bold";

            // Κουμπί διαγραφής
            const clear_button = document.createElement("button");
            clear_button.textContent = "Clear";
            clear_button.style.backgroundColor = "rgb(195, 0, 255)";
            clear_button.style.color = "#fff";
            clear_button.style.border = "none";
            clear_button.style.padding = "8px 16px";
            clear_button.style.fontFamily = "Rubik, sans-serif";
            clear_button.style.fontSize = "0.9rem";
            clear_button.style.borderRadius = "4px";
            clear_button.style.cursor = "pointer";
            clear_button.style.fontWeight = "bold";

            // Ακροατής γεγονότος για το κουμπί διαγραφής
            clear_button.addEventListener("click", () => {
                cart = cart.filter(cart_item => cart_item.id !== item.id);
                localStorage.setItem('cart', JSON.stringify(cart));
                displayCart();
            });

            // Προσθήκη στοιχείων στο κουτί προϊόντος
            cart_item_box.appendChild(img);
            cart_item_box.appendChild(name);
            cart_item_box.appendChild(quantity);
            cart_item_box.appendChild(total_price);
            cart_item_box.appendChild(clear_button);

            // Προσθήκη κουτιού προϊόντος μετά το κουτί συνολικής τιμής
            cart_container.appendChild(cart_item_box);
        });

        updateTotalPrice();
    }

    // Αρχική εμφάνιση καλαθιού
    displayCart();

    // Κουμπί αγοράς καλαθιού
    buy_cart_button.addEventListener("click", () => {
        if (cart.length === 0) {
            alert("Cart is empty");
            return;
        } else {
            window.location.href = "cart-payment.html";
        }

    });
});