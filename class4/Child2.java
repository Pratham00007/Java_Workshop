public class Child2 extends Parent2{
void display(String s){
System.out.println("in child"+s);
}

public static void main(String a[]){
Parent2 p = new Child2();
p.display("Class");
}
}