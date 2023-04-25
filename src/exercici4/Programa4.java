package exercici4;

import java.util.Arrays;
import java.util.List;

public class Programa4 {
    public static void main(String[] args) {
        List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
        meses.forEach(System.out::println);
    }
    }
