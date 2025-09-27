class ThredDemo extends Thread{
public void run(){
for(int i=1;i<=20;i++){
System.out.println(5*i);
}
}
public static void main(String a[]){
ThredDemo t= new ThredDemo();
t.start();
}

}