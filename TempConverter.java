import java.util.*;
public class TempConverter{
    public static double convert(int Temp){
        return Temp * (9.0/5)+32;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celcius: ");
        int Temp = sc.nextInt();
        double TempInF = convert(Temp);
        System.out.println("Temperature in Farenheit is : " + String.format("%.2f",TempInF));
    }
}


    
