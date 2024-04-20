import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Random random =  new Random();
        Scanner scanner = new Scanner(System.in);
        a1(random.nextInt(1,5),scanner.nextInt());

    }
    public static  void  a1 (int scanner12 , int random ){
        System.out.println(scanner12);
        if (scanner12!=random) System.out.println("barabar emes: "+random);
        else System.out.println("barabar: "+scanner12);
        }}



