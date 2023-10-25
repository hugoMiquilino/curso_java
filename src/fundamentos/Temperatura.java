package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // ( °F - 32 ) x 5/9 = °C

        Celsius(86);

        Celsius(150);
    }
    public static void Celsius(double i) {
        final int AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;
        double celsius = ( i - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C");
    }
}
