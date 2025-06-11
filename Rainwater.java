public class Rainwater {
    public static int trap(int arr[]){
        int n=arr.length;
        int water=0;
        for(int i =0; i<n;i++){
            int lmax=arr[i];
            int rmax=arr[i];
            for(int j=0; j<=i; j++){
            lmax=Math.max(arr[j], lmax);
            }

            for(int k=i; k<n; k++){
            rmax=Math.max(arr[k],rmax); 
            }

            int c = Math.min(rmax,lmax);
            water += c-arr[i];
        }

        return water;
    }

    public static void main(String args[]){
    int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(trap(arr));
    }
}
