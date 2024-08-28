public class Engine {

    String type;
    String power;
    boolean ignition;

    public Engine()
    {
        String type = "Gas";
        String power = "V8";
        boolean ignition = false;
    }

    public void Start()
    {
       ignition = true;
       System.out.println("Engine is on");
    }
 
    public void Off()
    {
       ignition = false;
       System.out.println("Engine is off");
    }

    public String getType()
    {
        System.out.println(type);
        return type;
    }
    public void setType(String newType)
    {
        type = newType; 
    }

    public String getPower()
    {
        System.out.println(power);
        return type;
    }
    public void setPower(String newPower)
    {
        power = newPower; 
    }
    public static void main(String []args) 
    {
       Engine E1 = new Engine();
       E1.Start();
       E1.Off();
    //    System.out.println(E1.getPower());
    //    System.out.println(E1.getType());
       
    }
}