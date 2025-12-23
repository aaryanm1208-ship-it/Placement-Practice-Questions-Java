import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Button Number");
        int button = sc.nextInt(); 
        switch(button) { 
            case 1:
                System.out.println("King Kohli");
                break;
            case 2:
                System.out.println("Modern Master");
                break;
            case 3:
                System.out.println("Run-Machine Kohli");
                break;
            default: 
                System.out.println("Virat Kohli");
                break;
        }
    }
}
