abstract class Vehicle
{
    String make;
    String model;
    int currentSpeed;
    int maxSpeed;
    int acceleration;
    int year;
    String color;
    int numWheels;

    abstract void setMake(String newMake);
    abstract String getMake();

    abstract void setModel(String newModel);
    abstract String getModel();

    abstract int getMaxSpeed();
    abstract void setMaxSpeed(int newMaxSpeed);

    abstract public void decreaseSpeed();
    abstract public void increaseSpeed();

}