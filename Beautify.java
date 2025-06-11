import java.util.*;
public class Beautify{

    public static int beauty(int n){
    int c=0;
    while( n/10!=0){
        n+=1;
        c+=1;
        while(n%10==0){
            n/=10;
        }
         int rem = n%10;
        c+=(10-rem);
        n/=10;

        while(n!=0 && n%10==0){
            n/=10;
        }

    }
    if(n!=0){
        c+=9;
    }
    return c;
    }

    public static void main(String args[]){
        System.out.println(beauty(29953));
    }
}