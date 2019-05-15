import java.util.Random;

public class TestUtils {
    public static String randomString(int length) {
        String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++) {
            char letter = abc.charAt(r.nextInt(abc.length()));
            sb.append(letter);
        }
        return sb.toString();
    }
}
