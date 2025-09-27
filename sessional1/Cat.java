class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meows");
    }
    public static void main(String a[]){
        Cat c= new Cat();
        c.sound();
    }

}