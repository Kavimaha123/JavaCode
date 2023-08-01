package Calculator;

public class Div implements CalculatorInterface {

    @Override
    public void Calculate(int a, int b) {
        if (b == 0) {
            System.out.println("Not validate");
        } 
        else{
            System.out.println("Div two numbers" + (a / b));
        }
    }
}
