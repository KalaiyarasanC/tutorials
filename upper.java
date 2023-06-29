import java.util.*;
public class upper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 mat[i][j]=sc.nextInt();
                //this is only upper rank trianglerows only basd on the total length col is the one row colum length
            }
            
        }int rows=mat.length;
        int col=mat[0].length;
        if(rows!=col) System.out.println("not matrix");
        else System.out.println("upper matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if(i>j)System.out.print(0+" ");
                else System.out.print(mat[i][j]+" ");

            }
            System.out.println(" ");
            
        }
        
    }
}
