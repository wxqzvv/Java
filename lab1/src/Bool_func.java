
import java.util.Scanner;
public class Bool_func {

    public static int ConverToInt(boolean x)
    {
        if (x == true){
             return 1;
        }
        else{
            return 0;
        }
    }
    public static boolean ConverToBoolean(int q){

        if (q == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        boolean x = scanner.nextBoolean();
        System.out.println( ConverToInt(x));
        System.out.println("Enter a value for q: ");
        int q = scanner.nextInt();
        System.out.println(ConverToBoolean(q));

    }
}
