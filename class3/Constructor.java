import java.util.*;

class  Constructor{
	int rollno;
	Constructor(){
		this.rollno=10;
		}
	public static void main(String a[]){
		Constructor s = new Constructor();
		System.out.println(s.rollno);
	}
}