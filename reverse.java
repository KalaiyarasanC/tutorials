public class reverse {
    public static void main(String[] args) {
//int arr[]={5,9,23,7,12,1};
        
      /* */
        //int max=arr[0];    
        
          //  for (int i = 5; i >=0; i--) {
            //    if(arr[i]>max){
              //      max=arr[i];
                //}
            
            // System.out.print(arr[i]+" ");
       //}
       //System.out.println(max);*/
       int arr[]={123,24,564,224,555,765};
       int max=0;
//System.out.println("........reverse order.......");
//for (int i = 5; i >=0; i--) {
  //      if( arr[i]>max){
    //        max=arr[i];
      //  }
        //System.out.println( arr[i]);
        
       System.out.println("..........maximum value in the array...........");
       //System.out.println(max);
       for(int e:arr){
        if(e>max){
            max=e;
            
        }
    }
            System.out.println(max);
        

       

    }
} 

