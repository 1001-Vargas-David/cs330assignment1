public class Bicycle extends Vehicle
{
    private Wheel wheel = new Wheel();
    String make = "Catgirl Bikes";
    String model = "Basic Bike 150";
    int maxSpeed = 100;
    int currentSpeed = 0;
    int acceleration = 2; 
    public Bicycle()
    {
        wheel = new Wheel();
        make = "Catgirl Bikes";
        model = "Basic Bike 150";
        maxSpeed = 100;
        currentSpeed = 0;
        acceleration = 2; 
    }

    public void setYear(int newyear)
   {
      year = newyear;
   }

   public int getYear()
   {
      return year;
   }

   public void setColor(String newcolor)
   {
      color = newcolor;
   }

   public String getColor()
   {
      return color;
   }
   
    public String getMake()
    {
        return make;
    }
    public void setMake(String newMake)
    {
        make = newMake;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String newModel)
    {
        model = newModel;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed)
    {
        maxSpeed = newMaxSpeed;
    }

    //for now currentSpeed will be increased by our 
    public void increaseSpeed()
    {
        int newSpeed = currentSpeed += acceleration;
        if(newSpeed <= maxSpeed)
            currentSpeed = newSpeed;
    }

    //decreaseSpeed will subtract acceleration value from current speed
    public void decreaseSpeed()
    {
        //case where we cant reach zero
        int newSpeed = currentSpeed -= acceleration;
        if(newSpeed >= 0)
            currentSpeed = newSpeed;
        if(currentSpeed <= acceleration)
        {
            currentSpeed = 0; 
        }
    } 


    public static void main(String []args) 
    {
       Bicycle b1 = new Bicycle();
       System.out.println(b1.getMake());
       System.out.println(b1.getModel());
       System.out.println(b1.getMaxSpeed());
       System.out.println(b1.wheel.getMake());


    }
 }