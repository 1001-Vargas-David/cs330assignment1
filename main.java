public class main {
    public static void main(String[] args) {
    System.out.println("Hello World!");
    
    Vehicle myVehicle = new Car();
    System.out.println(myVehicle.getMake() + " "+ myVehicle.getModel());

    myVehicle = new Bicycle();
    System.out.println(myVehicle.getMake() + " "+ myVehicle.getModel());

    

 }
}