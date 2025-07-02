package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparatorConNumero implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        // Compara primero por número, si son iguales compara por nombre
        int result = c1.getTelefono().compareTo(c2.getTelefono());
        if (result == 0) {
            return c1.getNombre().compareTo(c2.getNombre());
        }
        return result;
    }
}
