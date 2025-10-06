import java.util.*;
class Demo{
    public static void main(String a[]){
        ArrayList<String> l= new ArrayList<String>();
        l.add("Kala");
        l.add("bala");
        l.add("Ram");
        Iterator i = l.iterator();
        while(i.hasNext()){
            String s=(String)i.next();
            System.out.println(s);
        }
    }
}