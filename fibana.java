package oop;
import java.util.Scanner;

public class fibana {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int n1=0;
        int n2=1;
        int s=0;

        System.out.print(n1+" "+n2);
        for (int i = 2; i <=num; i++) {
            
        

        s=n1+n2;
        System.out.print(" "+s);
        n1=n2;
        n2=s;
        }
    }
    
}
