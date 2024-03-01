public class ljk {
    private String specialSymbols = ",.;:-_!";
    static boolean validtePassword(String passwordToValidate) {
        if (passwordToValidate == null || passwordToValidate.length() < 8){
            return false;
        }
        int upper = 0;
        int lower = 0;
        int digits = 0;
        int special = 0;
        for (int i = 0; i < passwordToValidate.length();i++) {
            char ch = passwordToValidate.charAt(i);
            if (Character.isDigit(ch)) digits++;
            if (Character.isUpperCase(ch)) upper++;
            if (Character.isLowerCase(ch)) lower++;
            if (specialSymbols.contains(ch+"")) special++;
        }
        if (lower < 1) {
            System.out.println("Password" +
                    "must contain at" +
                    "least one lowercase letter");
        }
        if (upper < 1) {
            System.out.println("Password" +
                    "must contain at" +
                    "least one upperrcase letter");
        }
        if (digits < 1) {
            System.out.println("Password" +
                    "must contain at" +
                    "least one digit letter");
        }
        if (special < 1) {
            System.out.println("Password" +
                    "must contain at" +
                    "least one special letter");
        }
    }

}
