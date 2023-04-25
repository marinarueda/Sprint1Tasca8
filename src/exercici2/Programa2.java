package exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Programa2 {
    public static void main(String[] args) {
        List<String> profesiones = Arrays.asList("Policia", "Bombero", "Administrativa", "Camarero", "Artista Gráfico");

        List<String> resultado = profesiones.stream()
                .filter(lista -> lista.contains("o") && lista.length() > 5)
                .collect(Collectors.toList());

        System.out.println("Profesiones que contienen la letra 'o' y con más de 5 letras " + resultado);
    }
}
