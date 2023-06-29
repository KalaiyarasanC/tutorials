import java.util.*;
public class zohoe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=0;
        int []temp=new int[n+m];
        int A[]=new int[n];
        System.out.println(n);
        for (int i = 0; i <n; i++) {
            A[i]=sc.nextInt();
            
        } 
        int B[]=new int[m];
        System.out.println(m);
        for (int j = 0; j <m; j++) {
            B[j]=sc.nextInt();
        } 
        // for (int h = 0; h < m+n; h++) {
        //     int temp[]=new int[m+n];
        
       
        int i=0,j=0;
       while(i<n && j<m){
        //System.out.println(9.);
                if(A[i]<B[j]){
                    temp[k]=A[i];
                    i++;
                }
                else{
                    temp[k]=B[j];
                    j++;    
                }
                k++;
            }
            while(i<n){
                temp[k]=A[i];
                i++;
                k++;
            }
            while(j<m){
                temp[k]=B[j];
                j++;
                k++;
            }
        
        
            
        for (i= 0; i <m+n; i++) {
            System.out.print(temp[i]+" ");
            
        }
}
}
