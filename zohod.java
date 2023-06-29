import java.util.Scanner;
public class zohod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();//a1b4c7
        int num=0;
        char temp;
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i))>='0' && (s.charAt(i))<='9'){
                temp=s.charAt(i-1);
                while(i<s.length()&&(s.charAt(i))>='0' && (s.charAt(i))<='9'){
                     num=(num*10)+(s.charAt(i)-48);
                     i++;
                     }
                for (int j = 0; j < num; j++) {
                    System.out.print(temp);
                
                }
            }num=0;
            
        }
        
    }
}
