class Student{
int amount=50000;
synchronized void withdraw(int amt){
System.out.println("in withdraw");

if (this.amount<100000){
System.out.println("less amount to withdraw");
try{
wait();
}
catch(Exception e){}
}
this.amount=this.amount-amt;
System.out.println("amount withdrawn \n Bal="+this.amount);
}
synchronized void deposit(int amt){

try{
this.amount +=amt;
System.out.println("amount deposited");
notify();}
catch( Exception e){}
}
}