package oop;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int N=sc.nextInt();
        int count;
        for (int i = 1; i <=N; i++) {
            count=0;
            for (int index = 1; index <=i; index++) {
                
            
            if(i%index==0){
                count++;
            
            }
        }
            
        if(count==2){
            System.out.print(i+" ");
        }
    }

    }
}
