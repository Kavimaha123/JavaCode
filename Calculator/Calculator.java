package Calculator;
public class Calculator{
    public static void main(String[] args) {
        CalculatorInterface add=new Add();
        CalculatorInterface sub=new Sub();
        CalculatorInterface mul=new Mul();
        CalculatorInterface div=new Div();
        div.Calculate(5, 0);
        add.Calculate(10, 5);
        sub.Calculate(10, 25);
        mul.Calculate(0, 5);  
    }
}