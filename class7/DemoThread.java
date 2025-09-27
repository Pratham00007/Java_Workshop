class ThreadDemo implements Runnable{
public void run(){
for(int i=1;i<20;i++){
System.out.println("2 *"+i+"="+(2*i));
}
}
public static void main(String a[]){
ThreadDemo td=new ThreadDemo();
Thread t=new Thread(td);
t.start();
Thread t2=new Thread(td);
t2.start();

ThreadDemo2 td2=new ThreadDemo2();
Thread t3=new Thread(td3);
t3.start();
}

}