
package newpackage;

import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
       Sort s=new Sort();
       Scanner scanner=new Scanner(System.in);
       System.out.print("请输入整数个数:");
       int b=scanner.nextInt();
       int[] num=new int [b];
      s.Add(num);
      s.select(num);
      s.show(num);
       }
    }
class Sort{
    public void Add(int []a){
        int t=1;
       for(int i=0;t>0;i++){
           Scanner scanner=new Scanner(System.in);
               t=scanner.nextInt();
               if(t>0)
           a[i]=t;  
       }
    
}
    public void show(int []a){
         for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
    }

    
    public void select(int []a){
  for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }
}
