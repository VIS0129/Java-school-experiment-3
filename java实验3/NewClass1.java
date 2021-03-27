
package newpackage;

//5，2，2，7，4，4，7，1，9，1 
import java.util.Arrays;
public class NewClass1 {
    public static void main(String[] args){
        int[] a={5,2,2,7,4,4,7,1,9,1};
        int t=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                
                if(a[i]==a[j]){
                    for(int m=j;m<a.length-1;m++)
                    {a[m]=a[m+1];
                    }
                    j--;
                    a=Arrays.copyOf(a,a.length-1);
                } 
            }
        }
        for(int k=0;k<a.length;k++){
           System.out.print(a[k]+" ");}
    }
}
