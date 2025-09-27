class ThreadDemo2 implements Runnable{
public void run(){
for(int i=1;i<=20;i++){
System.out.println("5 *"+i+"="+(5*i));
}}}