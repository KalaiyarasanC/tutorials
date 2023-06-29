package constructor;

import javax.swing.text.html.FormView;

public class trans {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int mid=arr.length/2;
        for (int i = 0; i < mid/2; i++) {
            int temp=arr[i];
            arr[i]=arr[mid-1];
            arr[mid-1]=temp;
            --mid;
        }
         mid=arr.length;
        int x=mid/4;
        for (int i = mid/2; i < arr.length-x; i++) {
            int temp=arr[i];
            arr[i]=arr[mid-1];
            arr[mid-1]=temp;
            --mid;
            
        }
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i]+" ");
    
}
    }
}
