package constructor;

public class square {
    public static void main(String[] args) {
        int num=153;
        int r=0,sum=0;
        while(num>0){
            r=num%10;
            r=r*r*r;
            sum+=r;
            num=num/10;
        }System.out.println(sum);
    }
}
