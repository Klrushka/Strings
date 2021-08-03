import task10.Expressions;
import task19.ClassNamesInSourceCode;
import task20.ClassWithFields;
import task3.Turtle;
import task4.Receipt;
import task5.ConversionTest;
import task6.Fields;
import task7.CheckCase;

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


        receipt.setWidth(15, 5, 10);  // you can set width in this method, now defaults
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


        System.out.println();

        /*
        Exercise 6: (2) Create a class that contains int, long, float and double fields. Create a
        toString( ) method for this class that uses String.format( ), and demonstrate that your
        class works correctly.
         */


        Fields fields = new Fields();

        fields.print();

        System.out.println("\n");

        /*
        Exercise 7: (5) Using the documentation for java.util.regex.Pattern as a resource,
        write and test a regular expression that checks a sentence to see that it begins with a capital
        letter and ends with a period.
         */


        CheckCase checkCase = new CheckCase();

        System.out.println(checkCase.check("Good day."));

        /*
        Exercise 10: (2) For the phrase "Java now has regular expressions" evaluate whether the
        following expressions will find a match:
         */

        Expressions expressions = new Expressions();

        for (int i = 0; i < 9; i++){
            System.out.println("Regex: \"" + expressions.getRegexes()[i] + "\" is " + expressions.test(expressions.getRegexes()[i]));
        }


        System.out.println();


        /*
        Exercise 19: (8) Building on the previous two exercises, write a program that examines
        Java source code and produces all the class names used in a particular program.
         */


        ClassNamesInSourceCode names = new ClassNamesInSourceCode();

        System.out.println(names.findAllClassNames());

        class Test {

        }


        /*
        Exercise 20: (2) Create a class that contains int, long, float and double and String
        fields. Create a constructor for this class that takes a single String argument, and scans that
        string into the various fields. Add a toString( ) method and demonstrate that your class
        works correctly.
         */

        ClassWithFields classWithFields = new ClassWithFields("12 12345678 12 3 hi");

        System.out.println(classWithFields);


    }
}
