package StringsInJava;

public class StrongPasswordCheckerII {
    public static boolean strongPasswordCheckerII(String password) {
        String characters = "!@#$%^&*()-+";
        if(password.length() < 8){
            return false;
        }

        boolean lowercase = false;
        boolean uppercase = false;
        boolean digit = false;
        boolean specialChar = false;
        char prev = ' ';

        for(int i= 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if(ch == prev){
                return false;
            }
            prev = ch;

            if(Character.isLowerCase(ch)){
                lowercase = true;
            }
            else if(Character.isUpperCase(ch)){
                uppercase = true;
            }
            else if(Character.isDigit(ch)){
                digit = true;
            }
            else if(characters.indexOf(ch) != -1){
                specialChar = true;
            }
        }
        return lowercase && uppercase && digit && specialChar;
    }
    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("Hello@12345"));
    }
}
