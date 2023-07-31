package Calculator;

public class Sub implements CalculatorInterface {

    @Override
    public void Calculate(int a, int b) {
        if (b > a) {
            System.out.println("Not Sub");
        } else {
            System.out.println("Sub two numbers" + (a - b));
        }

    }
}
