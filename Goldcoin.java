import java.util.*;
public class Goldcoin {
    public static void Goldcoin(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            arr[i]+=arr[i-1];
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
         arr[i]=sc.nextInt();
        }
        Goldcoin(arr);
    }
}
