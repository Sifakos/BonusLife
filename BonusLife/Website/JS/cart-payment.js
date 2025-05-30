document.addEventListener('DOMContentLoaded', () => {
    // Επιλογή στοιχείων της φόρμας
    const payment_form = document.getElementById("payment-form");
    const credit_card_input = document.getElementById("credit-card");
    const cvv_input = document.getElementById("cvv");
    const expiry_date_input = document.getElementById("expiry-date");
    const location_input = document.getElementById("location-delivery");
    const map_container = document.getElementById("map");
    const purchase_button = document.getElementById("pay-cart");

    // Βοηθητική συνάρτηση: Μορφοποίηση αριθμού πιστωτικής κάρτας
    function formatCreditCardNumber(value) {
        const cleaned = value.replace(/\D/g, '');
        const parts = cleaned.match(/.{1,4}/g);
        return (parts ? parts.join('-') : cleaned);
    }

    // Βοηθητική συνάρτηση: Εμφάνιση μηνύματος σφάλματος
    function show_error(input, message) {
        const existing_error = input.nextElementSibling;
        if (existing_error && existing_error.classList.contains("error-message")) {
            existing_error.remove();
        }

        // Δημιουργία μηνυμάτων σφάλματος
        const error_div = document.createElement("div");
        error_div.className = "error-message";
        error_div.style.color = "red";
        error_div.style.fontFamily = "Rubik";
        error_div.style.fontSize = "12px";
        error_div.style.position = "absolute";
        error_div.style.fontWeight = "bold";
        
        if (input.id === "credit-card") {
            error_div.style.top = "170px";
            error_div.style.left = "68px";
        } else if (input.id === "cvv") {
            error_div.style.top = "250px";
            error_div.style.left = "68px";
        } else if (input.id === "expiry-date") {
            error_div.style.top = "330px";
            error_div.style.left = "68px";
        } else if (input.id === "location-delivery") {
            error_div.style.top = "410px";
            error_div.style.left = "68px";
        }
        error_div.textContent = message;
        input.parentNode.insertBefore(error_div, input.nextSibling);
    }

    // Βοηθητική συνάρτηση: Καθαρισμός όλων των μηνυμάτων σφάλματος
    function clear_errors() {
        const error_messages = document.querySelectorAll(".error-message");
        error_messages.forEach(error => error.remove());
    }

    // Συναρτήσεις ελέγχου εγκυρότητας
    function valid_credit_card(card) {
        const cleaned = card.replace(/\D/g, '');
        return cleaned.length === 16;
    }

    function valid_cvv(cvv) {
        const cleaned = cvv.replace(/\D/g, '');
        return cleaned.length === 3;
    }

    function valid_expiry_date(date) {
        return /^(0[1-9]|1[0-2])\/[0-9]{2}$/.test(date);
    }

    function valid_location(location) {
        return (/^Lat: -?\d+\.\d+, Lng: -?\d+\.\d+$/.test(location));
    }

    // Αρχικοποίηση χάρτη
    let map, marker;
    function initMap() {
        const defaultLocation = [37.9838, 23.7275]; // Αθήνα, Ελλάδα
        map = L.map(map_container).setView(defaultLocation, 12);
        L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
            attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a>'
        }).addTo(map);
        map.on('click', (event) => {
            const latLng = event.latlng;
            if (marker) {
                marker.setLatLng(latLng);
            } else {
                marker = L.marker(latLng).addTo(map);
            }
            location_input.value = `Lat: ${latLng.lat}, Lng: ${latLng.lng}`;
            const existing_error = location_input.nextElementSibling;
            if (existing_error && existing_error.classList.contains("error-message")) {
                existing_error.remove();
            }
        });
    }

    // Χειρισμός εισαγωγής στα πεδία
    credit_card_input.addEventListener("input", (e) => {
        const cursor_position = e.target.selectionStart;
        const value = e.target.value.replace(/\D/g, '');
        const formatted = formatCreditCardNumber(value);
        e.target.value = formatted;
        const existing_error = e.target.nextElementSibling;
        if (existing_error && existing_error.classList.contains("error-message")) {
            existing_error.remove();
        }
    });

    cvv_input.addEventListener("input", (e) => {
        e.target.value = e.target.value.replace(/\D/g, '');
        const existing_error = e.target.nextElementSibling;
        if (existing_error && existing_error.classList.contains("error-message")) {
            existing_error.remove();
        }
    });

    expiry_date_input.addEventListener("input", (e) => {
        const existing_error = e.target.nextElementSibling;
        if (existing_error && existing_error.classList.contains("error-message")) {
            existing_error.remove();
        }
    });

    // Χειρισμός χάρτη και τοποθεσίας
    let mapInitialized = false;
    location_input.addEventListener("click", () => {
        map_container.style.display = "block";
        if (!mapInitialized) {
            initMap();
            mapInitialized = true;
        }
        const existing_error = location_input.nextElementSibling;
        if (existing_error && existing_error.classList.contains("error-message")) {
            existing_error.remove();
        }
    });

    // Χειρισμός κλικ στο κουμπί αγοράς
    purchase_button.addEventListener("click", (e) => {
        e.preventDefault();
        clear_errors();
        let is_valid = true;

        if (!credit_card_input.value.trim()) {
            show_error(credit_card_input, "You must fill your credit card number");
            is_valid = false;
        } else if (!valid_credit_card(credit_card_input.value)) {
            show_error(credit_card_input, "Invalid credit card number");
            is_valid = false;
        }

        if (!cvv_input.value.trim()) {
            show_error(cvv_input, "You must fill your CVV");
            is_valid = false;
        } else if (!valid_cvv(cvv_input.value)) {
            show_error(cvv_input, "Invalid CVV");
            is_valid = false;
        }

        if (!expiry_date_input.value.trim()) {
            show_error(expiry_date_input, "You must fill your expiry date");
            is_valid = false;
        } 

        if (!valid_location(location_input.value)) {
            show_error(location_input, "You must select delivery location");
            is_valid = false;
        }

        if (is_valid) {
            localStorage.setItem("cart", JSON.stringify([]));
            window.location.href = "shopping-cart.html";
            alert("Purchase completed");
        }
        map_container.style.display = "none";
    });
});