package controller;
import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        System.out.println("-----------EJERCICIOS-----------");

        // Ejercicio 1: Detección de duplicados en un arreglo
        System.out.println("EJERCICIO 1: Detección de duplicados en un arreglo");
        System.out.println("Resultado para 'null': " + tieneDuplicados(null));
        System.out.println("Resultado para {1, 2, 3, 4, 5}: " + tieneDuplicados(new int[]{1, 2, 3, 4, 5})); 
        System.out.println("Resultado para {1, 2, 3, 4, 5, 4, 3, 2, 45}: " + tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));

        // Ejercicio 2: Comprobación de isograma con palabras más complejas
        System.out.println("\nEJERCICIO 2: Comprobación de isograma");
        System.out.println("Resultado para 'fluctuaciones': " + esIsograma("fluctuaciones"));        
        System.out.println("Resultado para 'universidad': " + esIsograma("universidad"));
        System.out.println("Resultado para 'contextualizacion': " + esIsograma("contextualizacion"));
        System.out.println("Resultado para 'microbiologia': " + esIsograma("microbiologia"));
        System.out.println("Resultado para 'biotecnologia': " + esIsograma("biotecnologia"));
        System.out.println("Resultado para 'matematica': " + esIsograma("matematica"));

        // Ejercicio 3: Contar palabras únicas en un texto
        System.out.println("\nEJERCICIO 3: Contar palabras únicas en un texto");
        String texto = """
                        La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?

            Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.

            En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.
                        """;
        boolean palabrasUnicas = contarPalabrasUnicas(texto);
        int cantidadPalabras = contarPalabrasUnicasConContador(texto);
        System.out.println("¿El texto tiene palabras únicas? " + palabrasUnicas);
        System.out.println("Cantidad de palabras únicas encontradas: " + cantidadPalabras);
    }

    public boolean tieneDuplicados(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return false; 
        }
        Set<Integer> set = new HashSet<>();
        for (int num : numeros) {
            if (!set.add(num)) {
                return true; 
            }
        }
        return false;
    }
    
    public boolean esIsograma(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return false; 
        }
        Set<Character> set = new HashSet<>();
        palabra = palabra.toLowerCase(); 
        for (char c : palabra.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true; 
    }

    public boolean contarPalabrasUnicas(String frase) {
        if (frase == null || frase.isEmpty()) {
            return false; 
        }
        frase = frase.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] palabras = frase.split("\\s+");
        Set<String> set = new HashSet<>();
        for (String palabra : palabras) {
            set.add(palabra);
        }
        return set.size() == palabras.length; 
    }

    public int contarPalabrasUnicasConContador(String frase) {
        if (frase == null || frase.isEmpty()) {
            return 0; 
        }
        frase = frase.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] palabras = frase.split("\\s+");
        Set<String> set = new HashSet<>();
        for (String palabra : palabras) {
            set.add(palabra);
        }
        return set.size(); 
}

}
