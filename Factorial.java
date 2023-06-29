package constructor;
import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the factorial:");
        int num=scanner.nextInt();
      //  Factorial fobj=new Factorial();
        //int fact=fobj.factorial(num);
     
      //  System.out.print("Factorial of "+ num +" ="+ fact);

    
    //int factorial(int num){
        int fact=1;
        for (int i = 2; i <=num; i++) {
            fact*=i;
            
        }
        System.out.print("Factorial of "+ num +" ="+ fact);
  //      return fact;

    }

    
}
