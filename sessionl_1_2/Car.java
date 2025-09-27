class Car extends Vehicle{
    void number_of_wheels(){
        System.out.println("Car has 4 wheels");
    }

    public static void main(String a[]){
        Car c=new Car();
        c.fuel_type();
        c.number_of_wheels();
    }
}