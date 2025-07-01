import controller.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();

        runHashSet(sets);
        runLinkedHashSet(sets);
        construirTreeSet(sets);
        construirTreeSetConComparador(sets);  // Correcta invocación del método
    }

    public static void runHashSet(Sets sets) {
        System.out.println("-----------HashSet----------");
        System.out.println("ELEMENTOS DEL HASHSET NO SE GARANTIZA EL ORDEN");
        sets.construirHashSet();  
    }

    public static void runLinkedHashSet(Sets sets) {
        System.out.println("-----------LinkedHashSet----------");
        System.out.println("ELEMENTOS DEL LINKEDHASHSET SE GARANTIZA EL ORDEN DE INSERCION");
        sets.construirLinkedHashSet();  
    }

    public static void construirTreeSet(Sets sets) {
        System.out.println("-----------TreeSet----------");
        System.out.println("ELEMENTOS DEL TREESET (ORDEN ASCENDENTE)");
        sets.construirTreeSet(); 
    }

      public static void construirTreeSetConComparador(Sets sets) {
        System.out.println("-----------TreeSet Con Comparador----------");
        System.out.println("ELEMENTOS DEL TREESET CON COMPARADOR (ORDEN POR LONGITUD Y ALFABÉTICO)");
        sets.construirTreeSetConComparador();  // Corregir el nombre del método aquí
    }
}
