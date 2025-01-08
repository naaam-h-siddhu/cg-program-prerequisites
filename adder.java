import java.util.*;
public class adder{
    public static int adder(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        System.out.println("The sum of a+b = " + adder(a,b));
    }
}
        

