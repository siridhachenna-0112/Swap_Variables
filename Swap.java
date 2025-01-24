import java.util.Scanner;
public class Swap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 'a' value:");
        int a=sc.nextInt();
        System.out.print("Enter 'b' value:");
        int b=sc.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
