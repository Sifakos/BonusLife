document.addEventListener('DOMContentLoaded', () => {
    const food_icon = document.getElementById("food");
    const drink_icon = document.getElementById("drinks");
    const supplement_icon = document.getElementById("supplements");
    const section_3 = document.querySelector(".section-3");

    // Έλεγχος αν υπάρχουν τα στοιχεία
    if (!food_icon || !drink_icon || !supplement_icon || !section_3) {
        console.error('Ένα ή περισσότερα στοιχεία δεν βρέθηκαν:', {
            food_icon: !! food_icon,
            drink_icon: !! drink_icon,
            supplement_icon: !! supplement_icon,
            section_3: !! section_3
        });
        return;
    }

    // Δεδομένα προϊόντων με 12 προϊόντα για gamers ανά κατηγορία
    const products = {
        food: [
            {id: 1, name: "G Fuel Energy Snack Bar (Peanut Butter)", price: 3.99, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTOuEIIQg9hDNuakPpeUqfryvZyJ35HudwdQ&s"},
            {id: 2, name: "G Fuel Energy Snack Bar (Chocolate)", price: 3.99, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSN4eCQkSrVPnq1hpHVC5DjLSsH9PnHb4frGA&s"},
            {id: 3, name: "Respawn Protein Bar (Cookies & Cream)", price: 4.49, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTQXD_rwlxLTX3uS2bQOYAum3puC0EzzRljPA&s"},
            {id: 4, name: "Respawn Protein Bar (Chocolate Peanut Butter)", price: 4.49, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcq_BiHXhQL_EPKFbugIkoKIi8-ylPx0WFjg&s"},
            {id: 5, name: "Sneak Energy Protein Bar (Blue Raspberry)", price: 3.79, image: "https://www.sneakywholefoods.com/cdn/shop/files/sneaky-wholefoods-blueberry-white-choc-crumble-protein-bar.png?v=1745570531&width=320"},
            {id: 6, name: "Sneak Energy Protein Bar (Tropical)", price: 3.79, image: "https://wave-grocery.s3.eu-central-1.amazonaws.com/thanopoulos/products/5200252162968_1_1.jpg"},
            {id: 7, name: "KontrolFreek Energy Bar (Mixed Berry)", price: 4.29, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSRtuaIb6ykaErRNwdnHxUhE4JlzRwORzKx4A&s"},
            {id: 8, name: "KontrolFreek Energy Bar (Vanilla)", price: 4.29, image: "https://dextro-energy.com/cdn/shop/files/13_Energy-Bar_02_Vanilla_Small_1b27513e-2163-473b-8a58-aa2694261c2e.jpg?v=1704262520"},
            {id: 9, name: "Gamer Supps Energy Bites (Sour Apple)", price: 5.99, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSL4ROjbfb1oGExxklD1m4O783aPQ7CosSV8g&s"},
            {id: 10, name: "Gamer Supps Energy Bites (Mango)", price: 5.99, image: "https://www.familypharmacy.gr/mediastream/w640/files/products/1b7b39df443cbdaf45255075c92e29a1.jpg.webp"},
            {id: 11, name: "Rogue Energy Protein Bar (Strawberry)", price: 4.19, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAWj6DNR15G_-UE9YFyl7oB91kDw1usVFc0w&s"},
            {id: 12, name: "Rogue Energy Protein Bar (Cookies)", price: 4.19, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbTvBg5iQAtdbd9vXYc0aUCUJnDmPpgyfgPA&s"}
        ],
        drinks: [
            {id: 13, name: "G Fuel Energy Drink (PewDiePie Lingonberry)", price: 2.99, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTilLweBv4tZHU-kc5FOT_hVyvRD5IQUMwKdw&s"},
            {id: 14, name: "G Fuel Energy Drink (FaZeberry)", price: 2.99, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrWaKlF0X6aOo3b4cjen3MdZeIggr8QGkc0Q&s"},
            {id: 15, name: "Gamer Supps GG Energy (Guacamole Gamer Fart)", price: 3.49, image: "https://cavamikrohorio.com/wp-content/uploads/2021/10/b52-energy-250ml-1.jpg"},
            {id: 16, name: "Gamer Supps GG Energy (Mango Meta)", price: 3.49, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ4QNxKVvKSWWRu34BHb5DnOUHgUiEVj-V1w&s"},
            {id: 17, name: "Sneak Energy Drink (Blue Raspberry)", price: 2.79, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKtW3j2gM16-KaQC9pLEKIsmulKWSTc2FTHw&s"},
            {id: 18, name: "Sneak Energy Drink (Cherry Bomb)", price: 2.79, image: "https://sneakenergy.com/cdn/shop/files/Sneak_500ml_Can_Blizzard_b0d58e1e-ed0d-4a58-a877-8c8fbf30a07c_650x.jpg?v=1744718262"},
            {id: 19, name: "Rogue Energy Drink (Strawberry Kiwi)", price: 3.19, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSybLH_gIKoSm0s0E79_GXSlfxAEjgb39RQ0g&s"},
            {id: 20, name: "Rogue Energy Drink (Dragon Fruit)", price: 3.19, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlE3HMdMqxoYqGXTaUghftOT5mRgIVCKIQig&s"},
            {id: 21, name: "Respawn Energy Drink (Tropical Punch)", price: 3.29, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcxtnSJoT_ANaArvqhJqd7x0tDDdQgw6OrGA&s"},
            {id: 22, name: "Respawn Energy Drink (Citrus)", price: 3.29, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDDrFtjt-Tgp2yF9itc4VNGOpauPRUePxFiVbLTttD0ZATgdapW4r7kYR7F8aIM6s19JA&usqp=CAU"},
            {id: 23, name: "Mana Energy Drink (Peach)", price: 2.89, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSaMrrf5T-MBVdzJKwouQFUJvZgXLO0_y6UAA&s"},
            {id: 24, name: "Mana Energy Drink (Watermelon)", price: 2.89, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQXUS-TGEUEt3fz4F_2LuFIZzH_EFBuSezsIg&s"}
        ],
        supplements: [
            {id: 25, name: "G Fuel Hydration (Clickbait)", price: 14.99, image: "https://gfuel.com/cdn/shop/products/clickbait-cans-rtd-g-fuel-gamer-drink-211972_450x450.png?v=1659725537"},
            {id: 26, name: "G Fuel Hydration (Hype Sauce)", price: 14.99, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7EYpPZLUUZir5aDYHJoAycZEjs5jkMy7Ajg&s"},
            {id: 27, name: "Gamer Supps GG Focus (Titty Milk)", price: 29.99, image: "https://gamersupps.gg/cdn/shop/files/guacamole-gamer-fart-9000-100-serving-front-tilted-right.png?crop=center&height=1000&v=1699917007&width=1000"},
            {id: 28, name: "Gamer Supps GG Focus (Pineapple Cocktail)", price: 29.99, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWwPaEHHqLYm4ow4aNtU9WV-agdI8-rgVq2g&s"},
            {id: 29, name: "Sneak Focus Formula (Purple Storm)", price: 19.99, image: "https://sneakenergy.com/cdn/shop/files/NEW-Sneak_150g_Tub_Purple_Storm_UK_1000x.png?v=1726484770"},
            {id: 30, name: "Sneak Focus Formula (Bubblegum)", price: 19.99, image: "https://m.media-amazon.com/images/I/81dKT8I1CqL.jpg"},
            {id: 31, name: "Rogue Energy Hydration (Green Apple)", price: 17.49, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzW3OwbIDGfY58MN6C_ZYq-NLwt8Ri3_DybQ&s"},
            {id: 32, name: "Rogue Energy Hydration (Pink Lemonade)", price: 17.49, image: "https://gamerbulk.com/wp-content/uploads/2022/04/Rogue_Pink-Lemonade.png"},
            {id: 33, name: "Respawn Focus Powder (Raspberry Lemonade)", price: 24.99, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRzY-QEXD0G1U10pGtzqsAs9RLegWQ-y8pRUQ&s"},
            {id: 34, name: "Respawn Focus Powder (Grape)", price: 24.99, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnjkQIQabMehgm75Gxcvftp63mbhQxTGln3g&s"},
            {id: 35, name: "Mana Energy Powder (Tangerine)", price: 15.99, image: "https://m.media-amazon.com/images/I/613p3CecIWL._AC_UF894,1000_QL80_.jpg"},
            {id: 36, name: "Mana Energy Powder (Berry)", price: 15.99, image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdTkKt84LYJzoWNphxbc919yn0XRS52Z9yCA&s"}
        ]
    };

    // Συνάρτηση για τη δημιουργία και εμφάνιση των κουτιών προϊόντων
    function displayProducts(category) {
        console.log("Εμφάνιση προϊόντων για κατηγορία: ${category}");
        section_3.innerHTML = ''; // Καθαρισμός προηγούμενου περιεχομένου

        // Βασικό στυλ για το section-3 ώστε να τακτοποιούνται τα κουτιά
        section_3.style.display = "grid";
        section_3.style.gridTemplateColumns = "repeat(auto-fit, minmax(250px, 1fr))";
        section_3.style.gap = "10px";
        section_3.style.padding = "20px";

        products[category].forEach(product => {
            // Δημιουργία κουτιού προϊόντος
            const product_box = document.createElement('div');
            product_box.className = 'product-box';
            // Inline στυλ για πιο χαμηλό κουτί
            product_box.style.backgroundColor = "rgb(255,255,255)";
            product_box.style.border = "0px";
            product_box.style.borderRadius = "8px";
            product_box.style.height = "350px";
            product_box.style.padding = "20px"; 
            product_box.style.textAlign = "center";
            product_box.style.boxShadow = "0 2px 5px rgba(0, 0, 0, 0.1)";
            product_box.style.margin = "0";
            product_box.style.transition = "transform 0.2s";

            // Δημιουργία εικόνας προϊόντος
            const img = document.createElement("img");
            img.src = product.image;
            img.alt = product.name;
            img.className = "product-image";
            img.style.maxWidth = "100%";
            img.style.height = "100px"; 
            img.style.objectFit = "contain";
            img.style.marginBottom = "8px"; 

            // Δημιουργία ονόματος προϊόντος
            const name = document.createElement("h3");
            name.textContent = product.name;
            name.style.fontFamily = "Rubik";
            name.style.fontSize = "1.1rem";
            name.style.color = "rgb(195, 0, 255)";
            name.style.marginBottom = "8px"; 

            // Δημιουργία τιμής
            const price = document.createElement("p");
            price.className = "price";
            price.textContent = `$${product.price.toFixed(2)}`;
            price.style.fontFamily = "Rubik";
            price.style.fontSize = "20"; 
            price.style.color = "rgb(195, 0, 255)"
            price.style.marginBottom = "8px"; 
            price.style.fontWeight = "bold";

            // Δημιουργία περιέκτη ποσότητας
            const quantity_container = document.createElement("div");
            quantity_container.className = "quantity-container";
            quantity_container.style.display = "flex";
            quantity_container.style.alignItems = "center";
            quantity_container.style.left = "center";
            quantity_container.style.gap = "10px";
            quantity_container.style.marginLeft = "80px";
            quantity_container.style.marginBottom = "8px"; 

            // Δημιουργία ετικέτας ποσότητας
            const quantity_label = document.createElement("label");
            quantity_label.htmlFor = `quantity-${product.id}`;
            quantity_label.textContent = "Quantity:";
            quantity_label.style.fontFamily = "Rubik";
            quantity_label.style.fontSize = "15px"; 
            quantity_label.style.color = "rgb(0,0,0)";
            quantity_label.style.fontWeight = "bold";

            // Δημιουργία εισόδου ποσότητας
            const quantity_input = document.createElement("input");
            quantity_input.type = "number";
            quantity_input.id = `quantity-${product.id}`;
            quantity_input.min = "1";
            quantity_input.value = "1";
            quantity_input.style.width = "60px";
            quantity_input.style.padding = "5px";
            quantity_input.style.fontFamily = '"Roboto Mono", monospace';
            quantity_input.style.fontSize = "0.8rem"; 
            quantity_input.style.border = "1px";
            quantity_input.style.borderRadius = "4px";
            quantity_input.style.textAlign = "center";
            quantity_input.style.fontWeight = "bold";

            // Προσθήκη στοιχείων ποσότητας στον περιέκτη
            quantity_container.appendChild(quantity_label);
            quantity_container.appendChild(quantity_input);

            // Δημιουργία κουμπιού Προσθήκη στο Καλάθι
            const cart_button = document.createElement("button");
            cart_button.className = "add-to-cart";
            cart_button.dataset.id = product.id;
            cart_button.textContent = "Add to Cart";
            cart_button.style.backgroundColor = "rgb(195, 0, 255)";
            cart_button.style.color = "rgb(255, 255, 255)";
            cart_button.style.border = "none";
            cart_button.style.padding = "8px 16px"; 
            cart_button.style.fontFamily = '"Rubik", sans-serif';
            cart_button.style.fontSize = "0.9rem"; 
            cart_button.style.borderRadius = "4px";
            cart_button.style.cursor = "pointer";
            cart_button.style.marginBottom = "8px";

            // Δημιουργία συνολικής τιμής
            const total_price = document.createElement("p");
            total_price.className = "total-price";
            total_price.textContent = `Total Price: $${product.price.toFixed(2)}`;
            total_price.style.fontFamily = "Rubik";
            total_price.style.fontSize = "1.3rem"; 
            total_price.style.color = "rgb(195, 0, 255)";
            total_price.style.fontWeight = "bold";

            // Προσθήκη όλων των στοιχείων στο κουτί προϊόντος
            product_box.appendChild(img);
            product_box.appendChild(name);
            product_box.appendChild(price);
            product_box.appendChild(quantity_container);
            product_box.appendChild(cart_button);
            product_box.appendChild(total_price);

            // Προσθήκη κουτιού προϊόντος στο section-3
            section_3.appendChild(product_box);

            // Προσθήκη ακροατή γεγονότων για την είσοδο ποσότητας
            quantity_input.addEventListener("input", () => {
                const quantity = parseInt(quantity_input.value) || 1;
                const total = (product.price * quantity).toFixed(2);
                total_price.textContent = `Total Price: $${total}`;
            });

            // Προσθήκη ακροατή γεγονότων για το κουμπί Προσθήκη στο Καλάθι
            cart_button.addEventListener("click", () => {
                const quantity = parseInt(quantity_input.value) || 1;
                let cart = JSON.parse(localStorage.getItem('cart')) || [];

                // Έλεγχος αν το προϊόν υπάρχει ήδη στο καλάθι
                const existing_item = cart.find(item => item.id === product.id);
                if (existing_item) {
                    existing_item.quantity += quantity;
                } else {
                    cart.push({
                        id: product.id,
                        name: product.name,
                        price: product.price,
                        image: product.image,
                        quantity: quantity
                    });
                }

                // Αποθήκευση στο localStorage
                localStorage.setItem('cart', JSON.stringify(cart));
                alert(`${quantity} ${product.name} added to cart`);
            });
        });
    }

    
    // Ακροατές γεγονότων για τα εικονίδια κατηγοριών
    food_icon.addEventListener('click', () => {
        console.log('Κλικ στο εικονίδιο φαγητού');
        displayProducts('food');
    });
    drink_icon.addEventListener('click', () => {
        console.log('Κλικ στο εικονίδιο ποτών');
        displayProducts('drinks');
    });
    supplement_icon.addEventListener('click', () => {
        console.log('Κλικ στο εικονίδιο συμπληρωμάτων');
        displayProducts('supplements');
    });
});

