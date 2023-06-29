 import java.util.Scanner;
 
 public class teothree {
    public static void main(String[] args) {
        //int a[][]={{1, 2, 3},
          //         {1, 2, 3}};
        //int b[][]={{1, 2, 3},
          //         {1, 2, 3}}; 
        //int c[][]={{0, 0, 0},
          //         {0, 0, 0}};
            //       for (int i = 0; i < a.length; i++) {
              //      for (int j = 0; j < a[i].length; j++) {
                //        System.out.format("settlin value for i=%d\n and j=%d\n",i,j);
                  //      c[i][j]=a[i][j]+b[i][j];
                   // }
                //}
                 
                   
        //for (int i = 0; i < a.length; i++) {
          //  for (int j = 0; j < a[i].length; j++) {
            //    System.out.print(c[i][j]+" ");
              //  c[i][j]=a[i][j]+b[i][j];
            //}System.out.println(" ");
            
        //}                     
        //add topic modwl
        int a[][],b[][],c[][],i,j;
        a=new int[2][3];
        b=new int[2][3];
        c=new int[2][3];
        Scanner sc=new Scanner(System.in)
;        System.out.println("Enter first matrix");
        for ( i = 0; i < 2; i++)
           for ( j = 0; j < 3; j++)
           a[i][j]=sc .nextInt();

           System.out.println("Enter Second matrix");
        for ( i = 0; i < 2; i++)
           for ( j = 0; j < 3; j++)
           b[i][j]=sc .nextInt();

           System.out.println("Addition.....");
        for ( i = 0; i < 2; i++){
           for ( j = 0; j < 3; j++){
           c[i][j]=a[i][j]+b[i][j];
           System.out.print(c[i][j]+" ");
        }
          System.out.println();
    }
        System.out.println("Subtraction....");
                for ( i = 0; i < 2; i++) {
                    for ( j = 0; j < 3; j++) {
                        c[i][j]=a[i][j]-b[i][j];
                        System.out.print(c[i][j]+" ");
                    }
                    System.out.println();
                    
                }

            

    }
}
