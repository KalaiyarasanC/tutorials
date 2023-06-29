package constructor;

public class threadsstartrun {
    public static void main(String[] args) throws Exception {
        num n=new num();
        book b=new book();
        n.start();
        b.name();
        n.join();
        b.join();
        System.out.println(" end ...........");
    }
}
class num extends Thread{
    public void run(){
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
class book{
    void name(){
      String array[]={"A","B","C","D","E"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public void join() {
    }
}
