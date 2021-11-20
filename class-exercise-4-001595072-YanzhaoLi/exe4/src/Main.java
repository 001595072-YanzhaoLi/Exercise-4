import java.util.regex.Pattern;

/**
 * main
 *
 * @author Yanzhao Li
 * @date 2021/11/12
 */
public class Main {
    /**
     * Main
     *
     * @param args arg array
     */
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[0-9]{5}(-[0-9]{4})?", "12344-1461"));
        System.out.println(Pattern.matches("[0-9]{5}(-[0-9]{4})?", "12344-14161"));

        System.out.println(Pattern.matches("([0-9]{1})([0-9]{1})([0-9]{1})([0-9]{1})", "1234"));
        System.out.println(Pattern.matches("([0-9]{1})([0-9]{1})([0-9]{1})([0-9]{1})", "abcd"));

        System.out.println(Pattern.matches("([a-z]{1})([a-z]{1})([a-z]{1})([a-z]{1})", "abcd"));
        System.out.println(Pattern.matches("([a-z]{1})([a-z]{1})([a-z]{1})([a-z]{1})", "1234"));

        System.out.println(Pattern.matches("[0-9]{1}-[0-9]{2}-[0-9]{3}", "1-23-456"));
        System.out.println(Pattern.matches("[0-9]{1}-[0-9]{2}-[0-9]{3}", "a-bc-def"));

        System.out.println(Pattern.matches("[0-9]{5}(-[A-Z]{4})?", "12345-ASDF"));
        System.out.println(Pattern.matches("[0-9]{5}(-[A-Z]{4})?", "12345-s"));
    }
}