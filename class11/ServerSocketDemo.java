import java.util.*;
import java.net.*;
import java.io.*;
class ServerSocketDemo{
public static void main(String a[]){
try{
ServerSocket ss= new ServerSocket(1234);
while (true){
Socket s=ss.accept();
InputStream is=s.getInputStream();
InputStreamReader ir=new InputStreamReader(is);
BufferedReader br=new BufferedReader(ir);
String s2=br.readLine();
System.out.println(s2);
OutputStream os=s.getOutputStream();
OutputStreamWriter ow= new OutputStreamWriter(os);
BufferedWriter bw=new BufferedWriter(ow);
bw.write("  hey Bro how do you do \n");
bw.flush();
}}catch(Exception e){
    System.out.println(e);
}}
}
