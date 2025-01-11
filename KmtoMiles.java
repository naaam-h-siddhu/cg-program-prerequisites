import java.util.*;
public class KmtoMiles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Distance in KM: ");
        int distance = sc.nextInt();
        double miles = distance * 0.621371;
        System.out.println(String.format("%.2f", miles));
    }
}

