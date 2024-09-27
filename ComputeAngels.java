/*
 * author: Ashya
 * filename: ComputeAngels.java
 */
package ComputeAngels;
import java.util.Scanner;

public class ComputeAngels {
    public static void main(String[] args) {
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("please enter three points: ");
        System.out.println("please enter x1: \n");
        x1 = s.nextDouble();
        System.out.println("please enter y1: \n");
        y1 = s.nextDouble();
        System.out.println("please enter x2: \n");
        x2 = s.nextDouble();
        System.out.println("please enter y2: \n");
        y2 = s.nextDouble();
        System.out.println("please enter x3: \n");
        x3 = s.nextDouble();
        System.out.println("please enter y3: \n");
        y3 = s.nextDouble();
        
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        //square root of (x2 - x3) squared plus (y2-y3) squared 
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y2) * (y1 - y2));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * c)));
        
        System.out.println("The three angles are: ");
        System.out.printf("A = %.2f \n", A);
        System.out.printf("B = %.2f \n", B);
        System.out.printf("C = %.2f \n ", C);
    }
}
