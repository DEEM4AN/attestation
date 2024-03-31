package View;

import java.util.Scanner;
import java.util.function.Function;

public class UI {

    Scanner in = new Scanner(System.in, "cp866");

    public Function<String, Double> inputDouble = msg -> {
        System.out.println(msg);
        return in.nextDouble();
    };


    public int getChoice() {
        System.out.println("Choice operation:");
        System.out.println("\t1. Summarize");
        System.out.println("\t2. Subtraction");
        System.out.println("\t3. Multiplication");
        System.out.println("\t4. Division");
        return in.nextInt();
    }
}