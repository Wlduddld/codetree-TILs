import java.util.Scanner;
public class Main {
    public static int plus(int a,int b){
        return a+b;
    }
    public static int minus(int a,int b){
        return a-b;
    }
    public static int times(int a,int b){
        return a*b;
    }
    public static int divide(int a,int b){
        return a/b;
    }




    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char o = scan.next().charAt(0);
        int c = scan.nextInt();

        if(o=='+')
         System.out.println(a+" + "+c+" = "+plus(a,c));
        else if(o=='-')
         System.out.println(a+" - "+c+" = "+minus(a,c));
        else if(o=='*')
          System.out.println(a+" * "+c+" = "+times(a,c));
        else if(o=='/')
         System.out.println(a+" / "+c+" = "+divide(a,c));
        else 
         System.out.println("False");



    }
}