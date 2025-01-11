import java.util.*;
public class AreaOfCircle{
    public static double Calculate(int radius){
        return 3.14 * radius * radius;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle : ");
        int radius = sc.nextInt();
        double area = Calculate(radius);
        System.out.println("Area of Circle with radius "+radius+" is: "+String.format("%.2f",area));
    }
}

