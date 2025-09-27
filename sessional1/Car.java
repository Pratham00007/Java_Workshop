class Car{
    String model;
    int speed;
    void display(){
        System.out.println("Cars model is: "+ model);
        System.out.println("Cars Speed is: "+ speed);
    }
    public static void main(String a[]){
        Car c=new Car();
        c.model="BMW";
        c.speed=200;
        c.display();
    }
}