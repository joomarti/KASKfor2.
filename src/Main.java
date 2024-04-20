import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a2 = new int[100];
        a1(a2);
            }
            public  static void a1 (int[] array   ){
        int a3 =  0;
                for (int i = 0; i < array.length; i++) {
                    a3++;
                    if (a3%2== 0) System.out.println("TAK SAN");
                    else System.out.println("JUP SAN");
                    System.out.println(a3);

                }
    }
}




