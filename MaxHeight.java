import java.util.*;
public class MaxHeight {

    public static void MaxHeight(int n, int[] arr){
        int max=0;
        for(int i=1; i<n;i++){
         arr[i]+=arr[i-1];
        }

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("Answer");
        System.out.println(max);

    }
 
public static void main(String args[]){
Scanner sc = new Scanner(System.in); 

int n = sc.nextInt();
int arr[] = new int[n];

System.out.println("Height");
for(int i=0; i<n; i++){
    arr[i] = sc.nextInt();
}
 MaxHeight(n,arr);
}
    
}
