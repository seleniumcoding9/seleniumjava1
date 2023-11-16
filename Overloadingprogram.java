public class Overloadingprogram
{
    public static void main(String[] args)
    {
        Sample s= new Sample();
        int result1= s.method(4,8,6);
        System.out.println(result1);
        int result2= s.method(4,8,6,7);
        System.out.println(result2);
        String result3= s.method("akhil", "vattikuti");
        System.out.println("akhil vattikuti");
        System.out.println("akhilvattikuti10278@gmail.com");

    }
}
