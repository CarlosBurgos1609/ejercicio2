/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;

/**
 *
 * @author carlos burgos
 */
public class ListaEstudiantes {
    private final ArrayList<Estudiante> estudiantes;

    public ListaEstudiantes() {
        this.estudiantes = new ArrayList<>();
        
    }

    Estudiante addEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
        return estudiante;
    }

    
   

    private Estudiante getEstudiante(int index) {
        if (index < 0 || index >= this.estudiantes.size())
            return null;
        return this.estudiantes.get(index);
    }
    
    public ArrayList<Estudiante> getListaEstudiantes(){ 
        return this.estudiantes;
    }
    
}
