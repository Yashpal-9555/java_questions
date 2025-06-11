import java.util.Scanner;

public class codeforce118A{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                continue;
            } else {
                result.append('.').append(ch);
            }
        }

        System.out.println(result.toString());
        scanner.close();
    }
}
