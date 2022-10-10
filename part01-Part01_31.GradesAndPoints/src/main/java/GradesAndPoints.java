
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = Integer.parseInt(scan.nextLine());
        
        if(grade > 100){
            System.out.println("Incredible!");
        }
        if(grade >= 90 && grade <= 100){
            System.out.println("5");
        }
        if(grade >= 80 && grade <= 89){
            System.out.println("4");
        }
        if(grade >= 70 && grade <= 79){
            System.out.println("3");
        }
        if(grade >= 60 && grade <= 69){
            System.out.println("2");
        }
        if(grade >= 50 && grade <= 59){
            System.out.println("1");
        }
        if(grade >= 0 && grade <= 49){
            System.out.println("failed");
        }
        if(grade < 0){
            System.out.println("Impossible!");
        }
    }
}
