import java.util.Scanner;

public class ReverseSubstring1155A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        
        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                System.out.println("YES");
                System.out.println((i + 1) + " " + (i + 2)); // 1-based index
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("NO");
        }
    }
}
