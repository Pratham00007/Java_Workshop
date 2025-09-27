class MainDemo{
public static void main(String a[]){
Student s2=new Student();
First f=new First(s2);
Thread t= new Thread(f);
t.start();
Second s=new Second(s2);
Thread t2=new Thread(s);
t2.start();
}}