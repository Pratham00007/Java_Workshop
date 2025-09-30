import java.io.*;
class ObjectDemo2{
    public static void main(String a[]){
        try{
            ObjectInputStream obs=new ObjectInputStream(new FileInputStream("first.txt"));
            customer c=(customer)obs.readObject();
            obs.close();
            System.out.println("Username="+c.userid);
            System.out.println("pwd="+c.pwd);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
