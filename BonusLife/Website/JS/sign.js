document.addEventListener("DOMContentLoaded", function() {
    // Επιλογή στοιχείων της φόρμας
    const form = document.getElementById("sign-form");
    const username = document.getElementById("username");
    const password = document.getElementById("password");
    const email = document.getElementById("email");
    const sign_button = document.getElementById("sign");

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
        error_div.style.left = "48px";
        error_div.style.fontWeight = "bold";

        if (input.id === "username") {
            error_div.style.top = "160px";
        } else if (input.id === "password") {
            error_div.style.top = "240px";
        } else if (input.id === "email") {
            error_div.style.top = "320px";
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
    function valid_username(username) {
        return (/^[a-zA-Z0-9]*$/.test(username) && /[a-zA-Z]/.test(username));
    }

    function valid_password(password) {
        return (/^[a-zA-Z0-9!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?]*$/.test(password) && /[a-zA-Z]/.test(password));
    }

    function valid_email(email) {
        return (/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email));
    }

    // Χειρισμός εισαγωγής στα πεδία (καθαρισμός σφαλμάτων)
    [username, password, email].forEach(input => {
        input.addEventListener("input", function() {
            const existing_error = input.nextElementSibling;
            if (existing_error && existing_error.classList.contains("error-message")) {
                existing_error.remove();
            }
        });
    });

    // Χειρισμός κλικ στο κουμπί εγγραφής
    sign_button.addEventListener("click", function(e) {
        e.preventDefault();
        clear_errors();
        let is_valid = true;

        if (!username.value.trim()) {
            show_error(username, "You must fill your username");
            is_valid = false;
        } else if (!valid_username(username.value.trim())) {
            show_error(username, "Your username is invalid");
            is_valid = false;
        }

        if (!password.value.trim()) {
            show_error(password, "You must fill your password");
            is_valid = false;
        } else if (!valid_password(password.value.trim())) {
            show_error(password, "Your password is invalid");
            is_valid = false;
        }

        if (!email.value.trim()) {
            show_error(email, "You must fill your e-mail");
            is_valid = false;
        } else if (!valid_email(email.value.trim())) {
            show_error(email, "Your e-mail is invalid");
            is_valid = false;
        }

        if (is_valid) {
            localStorage.setItem("username", username.value.trim());
            localStorage.setItem("password", password.value.trim());
            localStorage.setItem("email", email.value.trim());
            window.location.href = "bonuslife.html";
        }
    });
});