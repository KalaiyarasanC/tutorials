import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the rows ");
      int rows=scanner.nextInt();
      System.out.println("**printing the pattern....**");
      pattern(rows);
      scanner.close();
   }
public static void pattern(int rows){
    for(int a=1;a<=rows;a++){
        for(int b=1;b<=rows-a;b++){
            System.out.print("\t");
        }
         for(int b=1;b<=a;b++){
            System.out.print(b+"\t");
         }
        System.out.println();
        }        
      }
}
 
