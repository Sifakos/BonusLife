document.addEventListener("DOMContentLoaded", function() {

    // Αναμονή για τη φόρτωση του DOM
    const welcome_message = document.getElementById("welcome-message");
    const username = localStorage.getItem("username");

    // Έλεγχος αν υπάρχει username στο localStorage
    if (username) {
        welcome_message.textContent = `Welcome, ${username}`;
    } else {
        welcome_message.textContent = "Welcome, Guest"; // Προαιρετικό: εμφάνιση "Guest" αν δεν υπάρχει username
    }

    document.getElementById("nutrition-info").addEventListener("click", function() {
        // Μεταφέρουμε τον χρήστη στον επιθυμητό σύνδεσμο
        window.location.href = "https://1-hp.org/blog/healthy-eating/diet-101-nutrition-for-gamers/";
    });
});