import java.util.Arrays;

public class Lab_04_Java_Variables {
    public static void main(String[] args) {

//Variable Declarations

        int intOperandA = 25;
        int intOperandB = 75;
        int intSum = 5;
        int intProduct = 33;
        int intDifference = 19;
        int intQuotient = 15;
        int intModulo = 40;

//Double Variables

        double doubleOperandA = 45.25;
        double doubleOperandB = 35.72;
        double doubleSum = 15.20;
        double doubleProduct = 3.25;
        double doubleDifference = 22.10;
        double doubleQuotient = 6.8;
        double doubleModulo = 1.5;

//Assignment Statements for integers

        intSum = intOperandA + intOperandB;

           System.out.println("The sum of" + "" + intOperandA + "" + intOperandB + "" + "is" + intSum);

        intProduct = intOperandB * intOperandA;

           System.out.println("The product of" + "" + intOperandB + "" + intOperandA + "" +"is" + intProduct);

        intDifference = intOperandB - intOperandA;

           System.out.println("The difference of" + "" + intOperandB + "" + intOperandA + "" + "is" + intDifference);

        intQuotient = intModulo / intOperandA;

           System.out.println("The quotient of" + intModulo + "" + intOperandA + "" +  "is" + intQuotient);

        intModulo =  intOperandA % intOperandB;

        System.out.println("The modulo of" + intOperandB + "" + intOperandA + "" + "is" + intModulo);

//Assignment Statements for doubles.

        doubleSum = doubleOperandA + doubleOperandB;

        System.out.println("The sum of" + "" + doubleOperandA + "" + doubleOperandB + "" + "is" + doubleSum);

        doubleProduct = doubleOperandB * doubleOperandA;

        System.out.println("The product of" + "" + doubleOperandB + "" + doubleOperandA + "" +"is" + doubleProduct);

        doubleDifference = doubleOperandB - doubleOperandA;

        System.out.println("The difference of" + "" + doubleOperandB + "" + doubleOperandA + "" + "is" + doubleDifference);

        doubleQuotient = doubleModulo / doubleOperandA;

        System.out.println("The quotient of" + doubleModulo + "" + doubleOperandA + "" +  "is" + doubleQuotient);



    }
}