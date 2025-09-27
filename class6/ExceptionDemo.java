import java.util.*;
class ExceptionDemo{
public static void main(String a[]){
try{
System.out.println("in main");
Scanner sc=new Scanner(System.in);
int b=Integer.parseInt(a[0]);
System.out.println("Before Exception");
int res=10/b;
System.out.println("Bye");
}
catch(ArithmeticException ae){
System.out.println("in divide by zero exception \n Debominator can not be zero");
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array not given");
}
finally{
System.out.println("in finally");
}
System.out.println("End of Prg");
}
}