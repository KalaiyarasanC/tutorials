import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        Integer a[]={3,5,1,8,7};
        // Collections.sort(arr);
   
     //     long minSum=0,maxSum=0,totalSum=0;
     
     // for(int num : arr){
     //     totalSum+=num;  
     // }
     // minSum=totalSum-arr.get(4);
     // maxSum=totalSum-arr.get(0);
     
     // System.out.println(minSum+" "+maxSum);*/
     
     // }
   
   
           for (int i = 0; i < a.length; i++) {
              for (int j = 0; j < a.length-i-1; j++) {
                  if(a[j]>a[j+1]){
                      int temp=a[j];
                     a[j]=a[j+1];
                      a[j+1]=temp;
                   }
                   
               }
               
           }for (int i = 0; i < a.length; i++) {
              System.out.print(a[i]+" ");
               
          }
          String[]names={"kalai","kavin","abu","manoj","pubg"};
          System.out.println("before"+Arrays.toString(names));
          Arrays.sort(names);
          System.out.println("after"+Arrays.toString(names));

         }
    }

