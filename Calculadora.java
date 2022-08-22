import static java.lang.Math.pow;

public class Calculadora {
    // Mostra uma soma entre a e b
    public void soma(int a, int b){
        System.out.println(a+b);
    }
    // Mostra a subtraido de b
    public void subt(int a, int b){
        System.out.println(a - b);
    }

    // Mostra a multiplicado por b
    public void mult(int a, int b){
        System.out.println(a * b);
    }

    // Mostra a dividido por b desde que b seja diferente de zero
    public void divi(int a, int b){
        if(b == 0)
            System.out.println("Operacao impossivel");
        else
            System.out.println(a / b);
    }

    // Mostra a elevado a b
    public void pot(int a, int b){
        System.out.println(pow(a,b));
    }
}
