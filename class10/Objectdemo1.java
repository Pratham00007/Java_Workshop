import java.io.*;
class ObjectDemo1{
    public static void main(String a[]){
        try{
            ObjectOutputStream ops=new ObjectOutputStream(new FileOutputStream("first.txt"));
            ops.writeObject(new customer());
            ops.close();

        }catch(IOException e)
            System.out.println(e);
        }
    }
}