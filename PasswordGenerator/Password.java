import java.util.Random;

public class Password {
    public static void main(String[] args) {
        int length = 8;
        System.out.println(generatorPassword(length));
    }

    static char[] generatorPassword(int length) {
        System.out.println("Generating password using random() :");
        System.out.println("your new password is :");

        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*-_+=?/><.,)(;";
        String values = Capital_chars + small_chars + numbers + symbols;
        Random random = new Random();
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            password[i] = values.charAt(random.nextInt(values.length()));

        }
        return password;
    }
}
