import java.util.Base64;

public class JPOPassword {

    public static final String PASSWORD = "YnJhdjA";
    public static final char[] CHARACTERS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b',
            'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z' };
    public static void main(String[] args) {
        for (int i = 0; i < CHARACTERS.length; i++) {
            for (int j = 0; j < CHARACTERS.length; j++) {
                for (int k = 0; k < CHARACTERS.length; k++) {
                    for (int k2 = 0; k2 < CHARACTERS.length; k2++) {
                        for (int l = 0; l < CHARACTERS.length; l++) {
                            String password = CHARACTERS[i] + "" + CHARACTERS[j] + "" + CHARACTERS[k] + "" + CHARACTERS[k2] + "" + CHARACTERS[l];
                            boolean test = testPassword(password);
                            if (test) {
                                System.out.println(password);
                                break;
                            }
                        }
                    }
                }
 
            }
        }
 
    }
    public static boolean testPassword(String passwordToTest) {
        boolean retour = false;
        byte[] decodedBytes = Base64.getDecoder().decode(PASSWORD);
        String decodedPwd = new String(decodedBytes);
 
        if (passwordToTest.equals(decodedPwd)) {
            retour = true;
        }
        return retour;
    }
}
