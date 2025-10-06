import java.util.*;
class EmpArrayList{
    public static void main(String a[]){
    ArrayList<Employee> al=new ArrayList<Employee>();
    al.add(new Employee ("Ala",5000));
    al.add(new Employee ("Pala",7000));
    al.add(new Employee ("Kala",9000));
    Iterator i=al.iterator();
    while(i.hasNext()){
        Employee e=(Employee)i.next();
        System.out.println(e.name+" "+e.salary);
    }
    }
}