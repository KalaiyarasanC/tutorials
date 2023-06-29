import java.util.Scanner;


public class add {
    public static void main(String[] args) {
        int a[][],b[][],c[][],i,j;
        a=new int[4][4];
        b=new int[4][4];
        c=new int[4][4];
        Scanner sc=new Scanner(System.in)
;        System.out.println("Enter first matrix");
        for ( i = 0; i < 4; i++)
           for ( j = 0; j < 4; j++)
           a[i][j]=sc .nextInt();

           System.out.println("Enter Second matrix");
        for ( i = 0; i < 4; i++)
           for ( j = 0; j < 4; j++)
           b[i][j]=sc .nextInt();

           System.out.println("Addition.....");
        for ( i = 0; i < 4; i++){
           for ( j = 0; j < 4; j++){
           c[i][j]=a[i][j]+b[i][j];
           System.out.print(c[i][j]+"");
        }
          System.out.println();
    }
        System.out.println("Subtraction....");
                for ( i = 0; i < 4; i++) {
                    for ( j = 0; j < 4; j++) {
                        c[i][j]=a[i][j]-b[i][j];
                        System.out.print(c[i][j]+"");
                    }
                    System.out.println();
                    
                }

            
           }
            
        }
    

