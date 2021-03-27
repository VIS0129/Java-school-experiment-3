package newpackage;

public class NewClass2 {
     private static int n=0;
    public static void main(String[] args){
    int[] queen=new int[8];
  
    for(long num = 0;num <Math.pow(8,8);num++)
{
         divide((int)num, queen);
           if(check(queen))    //check做冲突检查
                output(queen);   //不冲突，输出一组解
}
}
public static void divide(int number,int[] a){
  
  for(int i=0;i<a.length;i++){
 a[7-i]=(int)(number%8);//八进制转化成十进制，存入数组queen
number=number/8;
  }               
    }
    public static boolean check(int[] a){
        for(int i=0;i<a.length;i++)
        { 
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]||a[i]+i==a[j]+j||a[i]-i==a[j]-j)
                    return false;
            }
        }
     
        return  true;
    }
    public static void output(int[] a){
        n++;
         System.out.print(n+":");
        for(int i=0;i<a.length;i++)
        {
        System.out.print("("+i+","+a[i]+")");    
         
        }
        System.out.println("");
    }
}