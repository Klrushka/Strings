import task3.Turtle;
import task4.Receipt;
import task5.ConversionTest;

import java.io.PrintStream;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {


        /*
        Exercise 3: (1) Modify Turtle.java so that it sends all output to System.err.
         */

        PrintStream outAlias = System.err;
        Turtle tommy = new Turtle("Tommy",
                new Formatter(System.err));
        Turtle terry = new Turtle("Terry",
                new Formatter(outAlias));
        tommy.move(0, 0);
        terry.move(4, 8);
        tommy.move(3, 4);
        terry.move(2, 5);
        tommy.move(3, 3);
        terry.move(3, 3);


        System.out.println();


        /*
        Exercise 4: (3) Modify Receipt.java so that the widths are all controlled by a single set of
        constant values. The goal is to allow you to easily change a width by changing a single value
        in one place.
         */


        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack’s Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);


        receipt.setWidth(15,5,10);  // you can set width in this method, now defaults
        receipt.printTotal();

        System.out.println();


        /*
        Exercise 5: (5) For each of the basic conversion types in the above table, write the most
        complex formatting expression possible. That is, use all the possible format specifiers
        available for that conversion type.
         */

        ConversionTest conversionTest = new ConversionTest();


        conversionTest.test("d");
        conversionTest.test("c");
        conversionTest.test("b");
        conversionTest.test("s");
        conversionTest.test("f");
        conversionTest.test("e");
        conversionTest.test("x");
        conversionTest.test("h");


        /*

         */


    }
}
