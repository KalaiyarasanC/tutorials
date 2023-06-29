import java.util.*;
public class zohog {
    static boolean isVowel(char ch){
      // ch=tolower(ch);
       return ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u';
    }//manager er ag an
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
       String s=sc.nextLine();
       int n=s.length();
       for (int i = n-1; i >=0; i--) {
       // System.out.print(s.charAt(i));
        if(isVowel(s.charAt(i))){
            System.out.println(s.charAt(i));
            s.charAt(i)='\0';
        }

       }
    }
}
