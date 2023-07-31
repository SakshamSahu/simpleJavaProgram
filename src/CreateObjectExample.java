public class CreateObjectExample
{
    void show()
    {
        System.out.println("Welcome to javaTpoint");
    }
    public static void main(String[] args)
    {
//creating an object using new keyword
        CreateObjectExample obj = new CreateObjectExample();
//invoking method using the object
        obj.show();
    }
}