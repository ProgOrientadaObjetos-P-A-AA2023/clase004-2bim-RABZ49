/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private ArrayList<Ciudad> ciudad;
    private String ciudades;
    private int promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;

    public String obtenerCiudades() {
        return ciudades;
    }

    public void establecerCiudades() {
        String x = "";
        for (Ciudad c : obtenerCiudad()) {
         x = String.format("%s\n",c.obtenerCiudad());
            
        }
        ciudades = x;
    }

    public ArrayList<Ciudad> obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(ArrayList<Ciudad> lista) {
        
        ciudad = lista;
    }

    

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        int suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma += e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

    public double obtenerEdadminima() {
        return edadminima;
    }

    public void establecerEdadminima() {
        int aux = 100;
        int min = 0;

        for (Persona e : obtenerEstudiante()) {
            if (min < aux) {
                aux = min;
                min = e.obtenerEdad();

                edadminima = min;
            }

        }

    }
}
