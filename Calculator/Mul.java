package Calculator;

public class Mul implements CalculatorInterface {

    @Override
    public void Calculate(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Any thing multiplu zero value zero");
        } else {
            System.out.println("Mul two numbers" + (a * b));
        }
    }
}
