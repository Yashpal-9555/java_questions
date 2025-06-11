import java.util.*;

public class CodeForces433B {
    public static void Solution(long n, long[] arr, long m, long[][] queries) {
        // Calculate prefix sum for the unsorted array (1-based indexing)
        long[] unsortedPrefix = new long[(int) n + 1];
        for (int i = 1; i <= n; i++) {
            unsortedPrefix[i] = unsortedPrefix[i - 1] + arr[i];
        }

        // Sort the array (ignoring index 0) and calculate prefix sum for the sorted array
        long[] sortedArr = arr.clone();
        Arrays.sort(sortedArr, 1, (int) n + 1); // Sort from index 1 to n
        long[] sortedPrefix = new long[(int) n + 1];
        for (int i = 1; i <= n; i++) {
            sortedPrefix[i] = sortedPrefix[i - 1] + sortedArr[i];
        }

        // Process each query
        for (int i = 0; i < m; i++) {
            int type = (int) queries[i][0];
            int left = (int) queries[i][1];
            int right = (int) queries[i][2];

            if (type == 1) {
                System.out.println(unsortedPrefix[right] - unsortedPrefix[left - 1]);
            } else {
                System.out.println(sortedPrefix[right] - sortedPrefix[left - 1]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of stones
        System.out.println("Enter number of stones:");
        long stones = sc.nextLong();

        // Input weights of stones (1-based indexing)
        long[] arr = new long[(int) stones + 1]; // Increase size by 1 for 1-based indexing
        System.out.println("Enter weight of stones:");
        for (int i = 1; i <= stones; i++) { // Start from index 1
            arr[i] = sc.nextLong();
        }

        // Input number of queries
        System.out.println("Enter number of queries:");
        long m = sc.nextLong();

        // Input queries
        long[][] queries = new long[(int) m][3];
        System.out.println("Enter queries (type, left, right):");
        for (int i = 0; i < m; i++) {
            queries[i][0] = sc.nextLong(); // type
            queries[i][1] = sc.nextLong(); // left
            queries[i][2] = sc.nextLong(); // right
        }

        // Call the solution method
        Solution(stones, arr, m, queries);
    }
}
