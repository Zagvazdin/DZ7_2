public class InputValidationService {
    public static boolean isValid(String input) {
        String regex = "^[1-9]|10[+\\-*/][1-9]|10$";
        return input.matches(regex);
    }
}
