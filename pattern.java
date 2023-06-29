import java.util.Scanner;

public class pattern {

     static int kalai=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        // double nn =9.0;
        // pattern3(nn);
        if(pattern3(n)){
            System.out.println("printed sucessfully");
        }else{
            System.out.println("failed");
        }
        // pattern3(n,nn);
    }

    private static boolean pattern3(int g) {
        boolean s=false;
        for (int i = 1; i <=g; i++) {
            int y=i;
            for (int j = 1; j <=i; j++) {
                System.out.print(y+" ");
                y+=g-j;
                s=true;

            }
            System.out.println();
        }
        return s;
    }

}
