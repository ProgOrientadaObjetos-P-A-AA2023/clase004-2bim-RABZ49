/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Ciudad ciuada1 = new Ciudad();
        ciuada1.establecerCiudad("loja");
        Ciudad ciuada2 = new Ciudad();
        ciuada1.establecerCiudad("quito");

        Persona persona1 = new Persona("Roberto", 18, ciuada1);
        Persona persona2 = new Persona("Alejandro", 20, ciuada2);

        OperacionesEstudiantes op1 = new OperacionesEstudiantes();
        ArrayList<Persona> miLista = new ArrayList<>();
        ArrayList<Ciudad> miLista2 = new ArrayList<>();
        miLista2.add(ciuada1);
        miLista2.add(ciuada2);
        op1.establecerCiudad(miLista2);
        
        miLista.add(persona1);
        miLista.add(persona2);
        op1.establecerEstudiante(miLista);
        op1.establecerPromedioEdades();
        op1.establecerEdadminima();

        System.out.printf("El promedio de edades es de: %s\n",
                op1.obtenerPromedioEdades());
        System.out.printf("La edad minima es de: %s\n",
                op1.obtenerEdadminima());
        System.out.printf("%s\n",op1.obtenerCiudades());

    }
}
