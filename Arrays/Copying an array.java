package practisngarray;
import java.util.*;
/**
 *
 * @author DIPANKAR
 */
public class PractisngArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of array:");
        int size=sc.nextInt();
        int A[]=new int[size];
     
       
        for(int i=0;i<size;i++)
        {
             A[i]=sc.nextInt();
        }
    
      int B[]=new int[size];
        
           
       
        for(int i=0;i<size;i++)
         {
               B[i]=A[i];
           }
       
          for(int i=0;i<size;i++)
           {
             System.out.print(A[i]+" ");  
           }
    
        
    }
