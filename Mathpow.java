import java.util.Scanner;

public class Mathpow{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
         int b=sc.nextInt();
// int t=sc.nextInt();
    int sum=a;
// for (int i = 0; i < t; i++) {
        for (int j = 0; j < n; j++) {
            sum+=Math.pow(2, j)*b;
            System.out.print(sum+" ");
            
        }System.out.println();
    }

// }
}
//}

