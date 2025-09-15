
//func overloading
import java.util.*;
class FuncOver{
int sum (int i,int j){
return (i+j);
}
int sum(int i,int j,int k){
return (i+j+k);
}

public static void main(String q[]){
FuncOver f=new FuncOver();
int a=f.sum(5,10);
int b=f.sum(5,0,9);
System.out.println(a);
System.out.println(b);
}
}

