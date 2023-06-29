import java.util.Scanner;

public class triangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("......matrix........");
        int[][] mat = new int[n][n];
         for( int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        boolean flagUpper=false;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < i; j++) {
                
                if(mat[i][j]==0)
                    flagUpper=true;
                else{
                    flagUpper=false;
                    break;
                }
            }
        }

        boolean flagLower=false;
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j <mat.length ; j++) {
                if(mat[i][j]==0)
                    flagLower=true;
                else{
                    flagLower=false;
                    break;
                }
            }
        }

        if(flagLower==true)
        System.out.println("Lower triangular matrix");
        
        else if(flagUpper==true)
        System.out.println("Upper triangular matrix");
        else 
        System.out.println("Not a triangular matix" );
    }
}
