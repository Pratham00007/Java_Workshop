import java.net.*;
import java.io.*;
import java.util.*;

class SocketDemo{
    public static void main(String a[]){
        try{
            Socket s=new Socket("127.0.0.1",1234);
            InputStream is = s.getInputStream();
            InputStreamReader ir=new InputStreamReader(is);
            BufferedReader br=new BufferedReader(ir);
            OutputStream os= s.getOutputStream();
            OutputStreamWriter ow = new OutputStreamWriter(os);
            BufferedWriter bw=new BufferedWriter(ow);

            bw.write("Hi How are you   \n");
            bw.flush();
            String s2=br.readLine();
            System.out.println(s2);
            s.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}