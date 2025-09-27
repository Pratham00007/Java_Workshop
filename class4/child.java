class Child extends Parent{
Child(){
super(10);

System.out.println("in child");
}
Child(String s,float  f){

super(s,f);
System.out.println("in child");
}
public static void main(String a[]){
Child c=new Child();
new Child("hello",10.5F);
}
}