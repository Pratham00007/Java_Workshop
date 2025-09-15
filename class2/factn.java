import java.util.*;
class Factn{

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
for (int i=0;i<=num;i++){
if (i<1){

System.out.println(0);
}
int ans=f.factorial(i);

System.out.println(ans);
}
}
}
