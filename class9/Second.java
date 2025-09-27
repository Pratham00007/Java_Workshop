class Second implements Runnable{
Student s;
Second (Student s){
this.s=s;
}
public void run(){
Student s=new Student();
s.deposit(70000);
}}