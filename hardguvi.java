package constructor;

public class hardguvi {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,0};
        int mid=arr.length/2;
        int n=mid,m=mid;
        for (int i = 0; i < mid; i++) {
            arr[n++]=arr[--m];

            
        }for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
}
