import java.lang.Math;
import java.util.*;
public class PowerCalculation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int a = sc.nextInt();
        System.out.println("Enter the power");
        int b = sc.nextInt();
        System.out.println(a+" raise to the power "+b+" is :"+Math.pow(a,b));
    }
}

        
