public class Car extends Vehicle{


   private int year;
   private String color;
   private Wheel carWheel = new Wheel();

   public Car()
   {
      make = "Ford";
      model = "F-150";
      year = 2002;
      color = "Blue";

      //setting wheel class attributes
      carWheel.setMake("bubble");
      carWheel.setModel("123");
      carWheel.setLoadCapacity(250);
      numWheels = 4;
   }
   public static void main(String[] args) 
   {
      Car myCar = new Car();
      System.out.println("Car: " + myCar.make + " " + myCar.model);         
   }

   public void setMake(String newMake)
   {
      make = newMake;
   }

   public String getMake()
   {
      return make;
   }

   public void setModel(String newModel)
   {
      make = newModel;
   }

   public String getModel()
   {
      return model;
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

   public void setnumWheels(int newNumWheels)
   {
      numWheels = newNumWheels;
   }

   public int getnumWheels()
   {
      return numWheels;
   }

   public int getMaxSpeed()
   {
       return maxSpeed;
   }

   public void setMaxSpeed(int newMaxSpeed)
   {
       maxSpeed = newMaxSpeed;
   }


 }