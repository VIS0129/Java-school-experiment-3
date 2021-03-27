
package newpackage;

public class Test {
    public static void main(String[] args){
        String s="JavaHelloOK";
                   s=change(s);
        System.out.println(s);
    }

    static String change(String ss){
       return  ss.substring(4,9);
    
        
    }
}

