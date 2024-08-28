public class Wheel
{
    String make = "idk";
    String model = "idk";
    int loadCapacity= 100;

    public Wheel()
   {
      make = "costco";
      model = "123-A";
      loadCapacity = 200;
   }
   
   public static void main(String[] args)
   {
       Wheel myWheel = new Wheel();
       
       System.out.print("Tire: " + " " + myWheel.make + " " + myWheel.model);
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
      model = newModel;
   }

   public String getModel()
   {
      return model;
   }

   public void setLoadCapacity(int newLoadCapacity)
   {
      loadCapacity = newLoadCapacity;
   }

   public int getLoadCapacity()
   {
      return loadCapacity;
   }

}