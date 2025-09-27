class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
    public static void main(String z[]){
        Dog d= new Dog();
        d.sound(); // it will give Dog Barks

        Animal a=new Animal(); 
        a.sound(); //it will give animal makes sound

        Animal b=new Dog();
        b.sound();
        //since object of Dg so print Dog Barks but at complie time check sound methos in animal class
        // runtime polymorphism
    }
}