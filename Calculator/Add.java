package Calculator;

public class Add implements CalculatorInterface {

    @Override
    public void Calculate(int a,int b) {

        System.out.println("Adding two numbers" + (a+b));
    }
}