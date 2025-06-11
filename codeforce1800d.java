import java.util.*;

public class codeforce1800d{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // length of the string
            String s = sc.next(); // the input string
            
            HashSet<String> results = new HashSet<>();
            
            for (int i = 0; i < n - 1; i++) {
                String newStr = s.substring(0, i) + s.substring(i + 2);
                results.add(newStr);
            }
            
            System.out.println(results.size());
        }
        
        sc.close();
    }
}
 