/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

import java.util.ArrayList;
import megaferia.Editorial;
import megaferia.personas.Autor;

/**
 *
 * @author examen
 */
public class Impreso extends Libro{
    private int paginas;
    private int numEjemplares; 
    
    public Impreso(String titulo, ArrayList<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, int paginas, int numEjemplares) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.paginas = paginas;
        this.numEjemplares = numEjemplares;
    }
}
