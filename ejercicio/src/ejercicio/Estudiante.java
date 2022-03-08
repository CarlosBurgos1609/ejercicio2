/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;



/**
 *
 * @author carlos burgos
 */
public class Estudiante {
    

    private String nombre;
    private double nota_1;
    private double nota_2;
    private double nota_3;
    private double promedio;

        public Estudiante(String nombre, double nota_1, double nota_2, double nota_3, double promedio) {
            this.nombre = nombre;
            this.nota_1 = nota_1;
            this.nota_2 = nota_2;
            this.nota_3 = nota_3;
            this.promedio = promedio;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getNota_1() {
            return nota_1;
        }

        public void setNota_1(double nota_1) {
            this.nota_1 = nota_1;
        }

        public double getNota_2() {
            return nota_2;
        }

        public void setNota_2(double nota_2) {
            this.nota_2 = nota_2;
        }

        public double getNota_3() {
            return nota_3;
        }

        public void setNota_3(double nota_3) {
            this.nota_3 = nota_3;
        }

        public double getPromedio() {
            return promedio;
        }

        public void setPromedio(double promedio) {
            this.promedio = promedio;
        }
        
        boolean equals(Estudiante estudiante) {
        return  this.nombre.equals(estudiante.nombre) &&
                this.nota_1 == estudiante.nota_1 &&
                this.nota_2 == estudiante.nota_2 &&
                this.nota_3 == estudiante.nota_3 &&
                this.promedio == estudiante.promedio;
        }
        
         
    
}
