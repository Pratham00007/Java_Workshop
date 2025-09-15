import java.util.*;
class Fact{

int factorial(int a){
int fact=1;
for (int i=1;i<=a;i++){
fact*=i;
}
return fact;
}

public static void main(String s[]){
Fact f=new Fact();
System.out.println("Enter number: ");
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
int ans=f.factorial(num);
System.out.println(ans);
}
}
