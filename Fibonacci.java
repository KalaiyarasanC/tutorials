package constructor;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner =new Scanner (System.in);
         System.out.print("enter the Fibonacci no:");
         int num=scanner.nextInt();
        displayFibonacciseries(num);
        


    }

     static void displayFibonacciseries(int num) {
        int x=1,y=0,z=0,count=1;
        while(count<=num){
        System.out.print(z+" ");
        z=x+y;
        x=y;
        y=z;
        count++;
        }


    }
}
