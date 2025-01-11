import java.util.*;
public class VolumeOfCylinder{
    public static double calculate(int radius, int height){
        return 3.14 * radius *radius * height;
            
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = sc.nextInt();
        System.out.println("Enter the heigh: ");
        int height = sc.nextInt();
        double area = calculate(radius,height);
        System.out.println("Volume of Cylinder is : "+ String.format("%.2f",area));
    }
}

