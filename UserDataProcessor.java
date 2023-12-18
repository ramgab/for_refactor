public class UserDataProcessor {

    public void processUserData(String username, String email, String phoneNumber) {
        if (isValidUsername(username)) {
            if (isValidEmail(email)) {
                if (isValidPhoneNumber(phoneNumber)) {
                    saveUserData(username, email, phoneNumber);
                } else {
                    logError("Invalid phone number");
                }
            } else {
                logError("Invalid email address");
            }
        } else {
            logError("Invalid username");
        }
    }

    private boolean isValidUsername(String username) {
        return username != null && !username.isEmpty();
    }

    private boolean isValidEmail(String email) {
        return email != null && email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.matches("\\d{10}");
    }

    private void saveUserData(String username, String email, String phoneNumber) {
        // Логика сохранения пользовательских данных
    }

    private void logError(String message) {
        System.out.println("Error: " + message);
    }
}
