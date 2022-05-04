public class Casting {
    public static void main (String[] args) throws Exception{
        double dub = 112.35;
        int num = (int)dub;

        System.out.println("Double: "+ dub);
        System.out.println("int: " + num);

        String str = "49";
        int num2 = Integer.parseInt(str);

        System.out.println("The string value is: " + str);
        System.out.println("The integer value is: " + num2);
    }
}
