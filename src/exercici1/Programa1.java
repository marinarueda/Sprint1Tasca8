package exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class Programa1 {
        public static void main(String[] args) {
            List<String> profesiones = Arrays.asList("Policia", "Bombero", "Administrativa", "Camarero", "Artista Gráfico");

            List<String> resultado = profesiones.stream()
                    .filter(lista -> lista.contains("o"))
                    .collect(Collectors.toList());

            System.out.println("Profesiones que contienen la 'o': " + resultado);
        }
    }

