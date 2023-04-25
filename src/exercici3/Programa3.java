package exercici3;

import java.util.Arrays;
import java.util.List;

public class Programa3 {
    public static void main(String[] args) {
        List<String> meses = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio", "Agosto","Septiembre","Octubre","Noviembre","Diciembre");

        meses.forEach(mes -> System.out.println(mes));
    }
}
