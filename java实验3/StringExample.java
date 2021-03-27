
package newpackage;

public class StringExample {
    public static void main(String[] args){
        String s1=new String("china");
        String s2="china";
        if(s1.equals(s2)){//判断s1和s2串值是否相同
            System.out.println("s1和s2相同");}
            else{
                     System.out.println("s1和s2不同");
                    }
 String s3=new String("320106199105120467");
 if(s3.substring(0,7)=="320106"){//判断s3的前缀是否是“320106”
     System.out.println("江苏南京的身份证");       
        }
 int position =0;
 String path ="d:\\javaKK\\scr\\Lesson3\\example.java";
 position=path.indexOf("x")-2;    //获取path中最后出现目录分隔符号的位置
         System.out.println(path+"中最后出现\\的位置："+position);
 String fileName =path.substring(22,34);          //获取path中的文件名"example.java"
   System.out.println("fileName="+fileName);
 String s4="100";
 String s5="123.678";
 String s6="876.321";                               //将s5反转为“876.321”赋给s6
   int num1=Integer.parseInt(s4);                                        //将字符串s4转化成int  
   double num2=Double.parseDouble(s6);                        //将字符串s6转化成double
   double sum=num1+num2;
   System.out.println("sum="+sum);
   String s7="ABCDEF";
   for(int i=0;i<s7.length();i++){
       System.out.println(s7.charAt(i));
   }
   char arr[]=s7.toCharArray(); //将s7存放到arr中
           for(int i=arr.length-1;i>=0;i--){
               System.out.printf("%3c", arr[i]);
           }
    }
}
