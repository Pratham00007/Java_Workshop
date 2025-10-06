import java.util.*;
class Demo4{
    public static void main(String a[]){
        ArrayList<String> l= new ArrayList<String>();
        l.add("Kala");
        l.add("bala");
        l.add("Ram");
        // before sort
        for (String s:l){
            System.out.println(s);
        }
System.out.println("After sort");
        // after sort
        Collections.sort(l);
        for (String s:l){
            System.out.println(s);
        }
        }
    }
