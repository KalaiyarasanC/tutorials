package constructor;
import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;

public class zohoB {
    public static void main(String[] args) {
        int []arr={1,2,2,3,1,4,7,2,4};
        // int n;
        // for (int i = 0; i < arr.length; i++) {
        //     n=0;
        //     for (int j = 0; j < arr.length; j++) {
        //         if(arr[i]==arr[j]){
        //             n++;
        //         }
                
        //     }System.out.print(arr[i]+"("+n+")"+" ");
        // }
        HashMap<Integer,Integer> map=new <Integer,Integer>HashMap();
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
            for(int key:map.keySet()){
                System.out.print(key+"("+map.get(key)+") ");
            }
            
        

    }
}
