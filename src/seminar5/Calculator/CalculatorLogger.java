package seminar5.Calculator;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

import java.util.Scanner;



public class CalculatorLogger {

    private static final Logger logger = LogManager.getLogger(CalculatorLogger.class);



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            logger.info("Select operation:");

            logger.info("1. Add");

            logger.info("2. Subtract");

            logger.info("3. Multiply");

            logger.info("4. Divide");

            logger.info("5. Power");

            logger.info("6. Square root");

            logger.info("7. Add complex numbers");

            logger.info("8. Subtract complex numbers");

            logger.info("9. Multiply complex numbers");

            logger.info("10. Divide complex numbers");

            logger.info("11. Power of complex number");

            logger.info("12. Modulus of complex number");

            logger.info("13. Argument of complex number");

            logger.info("0. Exit");

            int choice = scanner.nextInt();

            if (choice == 0) {

                break;

            }

            switch (choice) {

                case 1:

                    logger.info("Enter first rational number:");

                    RationalNumber a = new RationalNumber(scanner.nextInt(), scanner.nextInt());

                    logger.info("Enter second rational number:");

                    RationalNumber b = new RationalNumber(scanner.nextInt(), scanner.nextInt());

                    RationalNumber result = a.add(b);

                    logger.info("Result: " + result.toString());

                    break;

                case 2:

                    // ...

                case 3:

                    // ...

                case 4:

                    // ...

                case 5:

                    // ...

                case 6:

                    // ...

                case 7:

                    logger.info("Enter first complex number (real, imaginary):");

                    ComplexNumber c = new ComplexNumber(scanner.nextDouble(), scanner.nextDouble());

                    logger.info("Enter second complex number (real, imaginary):");

                    ComplexNumber d = new ComplexNumber(scanner.nextDouble(), scanner.nextDouble());

                    ComplexNumber res = c.add(d);

                    logger.info("Result: " + res.toString());

                    break;

                case 8:

                    // ...

                case 9:

                    // ...

                case 10:

                    // ...

                case 11:

                    // ...

                case 12:

                    // ...

                case 13:

                    // ...

                default:

                    logger.info("Invalid input");

                    break;

            }

        }

    }

}