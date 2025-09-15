

import java.util.*;
class arr{

public static void main(String q[]){

int sum=0;
Scanner sc=new Scanner(System.in);
int a[] = new  int[5];
for (int i=0;i<a.length;i++){
a[i]=sc.nextInt();
}
for (int i=0;i<a.length;i++){
sum+=a[i];
}
System.out.println("sum="+sum);
}
}

