
package newpackage;

public class NewClass {
    public static void main(String[] args){
       int[][] a=new int [5][5];
       Sum s=new Sum();
       s.show(a);//按行列输出数组的值
       s.add(a);//最外一圈的元素之和,求主对角线中的最大元素及其位置。
}
}
 class Sum{
     public void show(int[][] number){
         int count=0;
             for(int i=0;i<number.length;i++)
           for(int j=0;j<number[i].length;j++)
           {//(int)(Math.random()*(n-m+1))+m    [m,n];
               number[i][j]=(int)(Math.random()*(99-10+1))+10;
           }
        for(int i=0;i<number.length;i++)
           for(int j=0;j<number[i].length;j++)
           {
               System.out.print(number[i][j]+"\t");
               count++;
               if(count%5==0){
                   System.out.print("\n");
               }      
           }
     }
     public void add(int[][] number){
         double result=0;
      for(int i=0;i<1;i++)
           for(int j=0;j<number[0].length;j++){
               result+=number[i][j];
           }
     for(int i=number.length-1;i<number.length;i++)
           for(int j=0;j<number[4].length;j++){
             result+=number[i][j];
    }
        for(int i=1;i<number.length-1;i++)
           for(int j=0;j<1;j++){
             result+=number[i][j];
               
}
         for(int i=1;i<number.length-1;i++)
           for(int j=number.length-1;j<number.length;j++){
                result+=number[i][j];
           }
         System.out.println("最外一圈的元素之和:"+result);
           //求主对角线中的最大元素及其位置。
           int max=number[0][0];int a=0;int b=0;
          for(int i=0;i<number.length;i++){
           for(int j=0;j<number[i].length;j++){
               if(i==j)
               {
                   if(number[i][j]>max)
                       max=number[i][j];
                   a=i;b=j;
               }
           }          
     }
           System.out.print("主对角线中的最大元素:"+max+" 元素所在位置第"+a+"行第"+b+"列");
           }
     }
     
 
