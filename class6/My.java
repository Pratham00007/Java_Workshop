class My{
public static void main(String a[]){
Voter v=new Voter();
try{
v.validAge(17);
}
catch (InvalidAgeException ae){
System.out.println(ae);
}
System.out.println("End of prg");

}
}
