package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1;
        System.out.println(a); // double é maior que int

        float b = (float) 1.0; // explícita (CAST)
        System.out.println(b);

        int c = 91;
        byte d = (byte) c; // explícita (CAST)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // explícita (CAST)
        System.out.println(f);
    }
}
