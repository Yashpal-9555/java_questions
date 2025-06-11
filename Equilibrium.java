public class Equilibrium {
    public static void RiverOfSums(int arr[]){
        int sum=0;
        int lsum=0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }

        for(int i=0;i<arr.length;i++){
            sum= sum-arr[i];
            if(lsum==sum){
                System.out.println(i);
                return;
            }
            lsum+=arr[i];
        }
        System.out.println("no");
        

    }

    public static void main(String args[]){
        int arr[]={1,3,5,2,2};
         RiverOfSums(arr);
        
    }
    
}
