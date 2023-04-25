package exercici7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Programa7 {
    public static void main(String[] args) {
        List<Object> lista = Arrays.asList("Bombero", 10, "Camarero", 3, "Azafata", 5);

        lista.sort(Comparator.comparing(Object::toString, Comparator.comparing(String::length).reversed()));

        System.out.println(lista);
    }
}
