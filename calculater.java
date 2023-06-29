package constructor;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("enter the first no1:");
    int no1=scanner.nextInt();
    System.out.print("enter the second no2:");
    int no2=scanner.nextInt();
    System.out.print("enter the required operator[+ ,- ,/,* ] :");
    char operator=scanner.next().charAt(0);
    int ans=calculate(no1,no2,operator);
    System.out.println(no1+""+operator+""+no2+"="+ans);
    }
   static int calculate(int x, int y, char operator) {
        int ans=0;
        switch(operator){
            case '+': 
                ans=x+y;
                break;
            case '-':
                ans=x-y;
                break;
            case '/':
                ans=x/y;
                break;
            case '*':
                ans=x*y;
                break;
        }
        return ans;
    } 
 }

