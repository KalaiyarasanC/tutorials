package constructor;

public class exception {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=0;;
        try{
        c=a/b;
        }
        catch(Exception w){
            System.err.println("error.........");
        }
        System.out.println(c);
    }
    
}
