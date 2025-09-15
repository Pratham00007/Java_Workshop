import java.util.*;
class Factgtn{

int factorial(int a){
int fact=1;
if (a>0){
for (int i=1;i<=a;i++){
fact*=i;
}
return fact;
}else{
return 0;
}
}

public static void main(String s[]){
Fact f=new Fact();
System.out.println("Enter number: ");
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
if (num>=10){
for (int i=0;i<=num;i++){

int ans=f.factorial(i);

System.out.println(ans);
}
}
else{
System.out.println("Less than 10");
}

}
}
