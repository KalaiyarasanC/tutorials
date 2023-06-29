package constructor;
import java.util.Scanner;
public class arms{
  // armstrong num like 153=1^3+5^3+3^3=153
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int r,k;
        
        for (int i= 100; i < n; i++) {
            int sum=0;
            k=i;
          while(k>0){
            r=k%10;
            sum=sum+r*r*r;
            k=k/10;
          }
            if(i==sum){
                System.out.println(i+" :"+"armstrong num.......");
            }
        }
            
        
    }
}