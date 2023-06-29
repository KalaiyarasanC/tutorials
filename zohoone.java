package constructor;
import java.util.Scanner;
public class zohoone {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n,e1=0,o1=0;
        n=sc.nextInt();
       int arr[]=new int[n];
       for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
    }
       for (int i = 0; i < n; i++) {
        if(arr[i]%2==0){
                e1++;
        }
        else {
            o1++;
        }
    }
       int e[]=new int[e1];
       int o[]=new int[o1];
       
        int m=0,num=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                e[m++]=arr[i];
            }
            else {
                o[num++]=arr[i];
            }
        }
        for (int i = 0; i < e1-1; i++) {
            for (int j = i+1; j < e1; j++) {
                if(e[i]<e[j]){
                    int t=e[i];
                    e[i]=e[j];
                    e[j]=t;
                }
                
            }
            
        } for (int i = 0; i < o1-1; i++) {
            for (int j = i+1; j < o1; j++) {
                if(o[i]>o[j]){
                    int t=o[i];
                    o[i]=o[j];
                    o[j]=t;
                }
                
            }
            
        }
        int i = 0,j=0;
        for (; i < e1 && j<o1 ; i++,j++) {
            System.out.print(o[j]+" "+e[i]+" ");           
            
        }
        while (i<e1){
            System.out.print(e[i++]+" ");
        }while(j<o1){
            System.out.print(o[j++]+" ");
        }
       

    }
    
}
