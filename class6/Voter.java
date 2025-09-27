class Voter{
void validAge(int age)throws InvalidAgeException // give to forward required
{
if (age<18){
throw (new InvalidAgeException()); // declear and memory
}
else{
System.out.println("Valid User");
}
}
}