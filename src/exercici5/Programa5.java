package exercici5;

public class Programa5 {
    public static void main(String[] args) {
        PiValue piValue = () -> 3.1415;
        double pi = piValue.getPiValue();
        System.out.println("El número Pi es igual a: " + pi);
    }
}
