//more than 1 constructor = constructor overloading

//  there is demo.java from where it call 
class Demo2{
    Demo2(){
        System.out.println("Demo");
    }
    Demo2(Demo d,int i){
        d.display();
        System.out.println(i);
    }
    Demo2(float f){
        System.out.println(f);
    }
    public static void main(String a[]){
        Demo2 d1=new Demo2();
        Demo2 d2=new Demo2(new Demo(),10);
        Demo2 d3=new Demo2(10.5F);
                
    }
}