class GarbageCollection{
public void finalize(){
//over writng the garbage finalize block
System.out.println("Object is garbage collected");
}

//we are not calling it but its running autoatic see


void display(){
System.out.println("its not null so not gc");
}

public static void main(String args[]){

GarbageCollection s1=new GarbageCollection();
GarbageCollection s2=new GarbageCollection();
GarbageCollection s3=new GarbageCollection();


s1=null;
s2=null;
s3.display();


//bcs they are null thats why its gc
System.gc();
}
}