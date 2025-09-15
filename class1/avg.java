import java.util.*;
class Avg{

public static void main(String arg[]){

int sum=0;
for(int i=1;i<arg.length;i++){
sum += Integer.parseInt(arg[i]);
}

System.out.println("total marks of " + arg[0] + " is: " + sum);

System.out.println("Average marks of " + arg[0] + " is: " + sum/arg.length);
}}