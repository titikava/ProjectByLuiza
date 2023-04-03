package uroki;

public class StringRev {
    public static String rev(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}