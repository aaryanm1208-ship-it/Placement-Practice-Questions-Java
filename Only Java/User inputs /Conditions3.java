import java.util.Scanner;
public class Conditions3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A and B ");
    int A = sc.nextInt();
    int B = sc.nextInt();
    if(A==B){
        System.out.println("Equal");
    }
    else{
        if(A>B){
            System.out.println("A ia greater");
        }
        else{
            System.out.println("B is greater");
        }
        
    }
  }
}
