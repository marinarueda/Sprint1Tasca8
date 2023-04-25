package exercici8;

public class Programa8 {
    public static void main(String[] args) {
        CadenaInvertida reverser = (palabra) -> {
            StringBuilder cadena = new StringBuilder(palabra);
            return cadena.reverse().toString();
        };

        String input = "Hello world!";
        System.out.println(reverser.reverse(input));

    }
}
