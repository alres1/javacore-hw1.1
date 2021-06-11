package hwCore11;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(10, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide2.apply(a, b);
        int d = calc.multiply.apply(a,b);
        int e = calc.pow.apply(a);
        int f = calc.abs.apply(b);


        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);
    }
}
