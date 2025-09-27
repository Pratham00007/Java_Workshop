class First implements Runnable{
Student s;
First (Student s){
this.s=s;
}
public void run(){
// Student s=new Student();
s.withdraw(100000);
}}