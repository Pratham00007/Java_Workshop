import java.util.*;


class Input{
void display(String s){
System.out.println(s);

System.out.println("Bye");
}

public static void main(String a[]){
Input i= new Input();
Scanner sc =new Scanner (System.in);
String s2= sc.nextLine();
i.display(s2);
}
}
