import java.util.*;

class Constructor{
    int rollno,id;
    Constructor(int rollno,int sid){
        id=sid;
        this.rollno=rollno;
        // this.roll= rollno of class and =rollno mean argumented rollno

    }
    public static void main(String a[]){
        Constructor s=new Constructor(10,11);
        System.out.println(s.rollno);
        System.out.println(s.id);
    }
}