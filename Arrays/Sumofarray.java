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
        int size=sc.nextInt();
        int A[]=new int[size];
       
        for(int i=0;i<A.length;i++)
        {
             A[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        System.out.println(sum);
        
    }
    
}
