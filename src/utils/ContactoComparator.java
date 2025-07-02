package utils;
import models.Contacto;
import java.util.Comparator;

public class ContactoComparator implements Comparator<Contacto> {

    // Método para comparar dos objetos Contacto
    @Override
    public int compare(Contacto c1, Contacto c2) {
        // primero el apeelido orden alfabético
        int nombreCompare = c1.getNombre().compareTo(c2.getNombre());

        // Segundo si son iguales por el nombre orden alfabético por el apellido
        if (nombreCompare == 0) {
            return c1.getApellido().compareTo(c2.getApellido());
        }

        return nombreCompare;
    }
    
    
}
