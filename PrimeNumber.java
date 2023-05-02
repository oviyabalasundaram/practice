import java.util.Scanner;
public class PrimeNumber{
    public static void main(String args[]){
        int n=9;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("composite");
            }
            else{
                System.out.println("prime");
            }
        }
    }
}