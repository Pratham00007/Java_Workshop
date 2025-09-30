import java.io.*;
class FileReaderDemo{
    public static void main(){
    try{
        FileReader fr=FileReader("one.txt");
        int i;
        while ((i=fr.read())!=1)
        System.out.println((char)i);
        fr.close();

    }catch (Exception e){
        System.out.println(e);
    }
    }
}