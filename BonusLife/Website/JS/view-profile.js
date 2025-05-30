document.addEventListener("DOMContentLoaded", function() {
    // Επιλογή των στοιχείων που θα εμφανίζουν τα δεδομένα του χρήστη
    const username_display = document.getElementById("username-display");
    const password_display = document.getElementById("password-display");
    const email_display = document.getElementById("email-display");

    // Ανάκτηση των στοιχείων από το localStorage
    const stored_username = localStorage.getItem("username");
    const stored_password = localStorage.getItem("password");
    const stored_email = localStorage.getItem("email");

    // Συνάρτηση για εφαρμογή στυλ στα στοιχεία εμφάνισης
    const applyDisplayStyles = (element, topPosition) => {
        element.style.position = "absolute";
        element.style.fontFamily = "Rubik, sans-serif";
        element.style.fontSize = "15px";
        element.style.color = "rgb(195, 0, 255)";
        element.style.top = topPosition;
        element.style.left = "170px";
        element.style.width = "350px";
        element.style.textAlign = "left";
        element.style.fontWeight = "bold";
    };

    // Ενημέρωση και στυλ για username
    if (stored_username) {
        username_display.textContent = stored_username;
        applyDisplayStyles(username_display, "53px");
    } else {
        username_display.textContent = "No username available";
        applyDisplayStyles(username_display, "53px");
    }

    // Ενημέρωση και στυλ για password
    if (stored_password) {
        password_display.textContent = stored_password;
        applyDisplayStyles(password_display, "123px");
    } else {
        password_display.textContent = "No password available";
        applyDisplayStyles(password_display, "123px");
    }

    // Ενημέρωση και στυλ για email
    if (stored_email) {
        email_display.textContent = stored_email;
        applyDisplayStyles(email_display, "193px");
    } else {
        email_display.textContent = "No email available";
        applyDisplayStyles(email_display, "193px");
    }
});