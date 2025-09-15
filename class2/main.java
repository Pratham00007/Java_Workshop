import java.util.Scanner;
public class main {
    public static void main (String[] args){
      //error handling by do while:
      Scanner scanner= new Scanner(System.in);
      double a;
      do{
        System.out.print("Enter postive value of a");
        a=scanner.nextDouble();
      }
      while(a<0);

    }
}                 