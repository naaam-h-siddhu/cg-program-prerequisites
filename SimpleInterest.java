import java.util.*;
public class SimpleInterest{
    public static double calculate(int p, int r , int t){
        return (p*r*t)/ 100;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle: ");
        int p = sc.nextInt();
        System.out.println("Enter the Rate of Interest : ");
        int r = sc.nextInt();
        System.out.println("Enter the Time Period: ");
        int t = sc.nextInt();
        System.out.println("Simple interest is: "+ String.format("%.2f", calculate(p,r,t)));


        
    }
}


