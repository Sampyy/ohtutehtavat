import java.util.*;
import ohtu.Multiplier;


public class Main   {
    public static void main(String[] args)  {
        System.out.println("hello wolrdld");
        Scanner scanner = new Scanner (System.in);
        Multiplier viisi = new Multiplier(5);
        System.out.println("Anna luku");
        int luku = scanner.nextInt();

        System.out.println("luku kertaa viisi on " + viisi.multipliedBy(luku));
    }
}