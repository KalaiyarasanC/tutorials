package constructor;

public class overloading {
    public static void main(String[] args) {
        System.out.println(volume(5)+" " +volume(10, 5, 1));
    }
     static int volume(int a) {
        return a*a*a;
    } static int volume(int a,int b,int c) {
        return a*b*c;
    }
}
