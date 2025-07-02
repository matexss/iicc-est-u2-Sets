package controller;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import models.Contacto;

public class ContactoController {
    public ContactoController(){
        runTreeContactoPorApellido();
        runTreeContactoPorApellidoNombreTelefono();
    }

    // Ordena por apellido, luego nombre (NO incluye teléfono)
    private void runTreeContactoPorApellido(){
        System.out.println("Contactos ordenados por apellido, nombre:");
        Set<Contacto> contactos = new TreeSet<>(new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                int comparacionApellido = c1.getApellido().compareTo(c2.getApellido());
                if (comparacionApellido != 0) return comparacionApellido;
                int comparacionNombre = c1.getNombre().compareTo(c2.getNombre());
                return comparacionNombre;
            }
        });
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));

        for (Contacto contacto : contactos) {
            System.out.println(contacto.getNombre() + " " + contacto.getApellido() + " - " + contacto.getTelefono());
        }
        System.out.println();
        
    }

    
    // Ordena por apellido, luego nombre, luego teléfono
    private void runTreeContactoPorApellidoNombreTelefono(){
    
        System.out.println("Contactos ordenados por apellido, nombre, teléfono:");
        Set<Contacto> contactos = new TreeSet<>(new Comparator<Contacto>() {
            @Override
            public int compare(Contacto c1, Contacto c2) {
                int comparacionApellido = c1.getApellido().compareTo(c2.getApellido());
                if (comparacionApellido != 0) return comparacionApellido;
                int comparacionNombre = c1.getNombre().compareTo(c2.getNombre());
                if (comparacionNombre != 0) return comparacionNombre;
                return c1.getTelefono().compareTo(c2.getTelefono());
            }
        });
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));

        for (Contacto contacto : contactos) {
            System.out.println(contacto.getNombre() + " " + contacto.getApellido() + " - " + contacto.getTelefono());
        }
        System.out.println();
    }
}
