package com.mycompany.ejercicio2;

/**
Crea la superclase Libro, que tenga título, autor y precio y sus métodos habituales. Crea las subclases:
- LibroDeTexto: hereda e incluye además ‘curso’ y 'asignatura'.
- Novela: hereda e incluye además el tipo: romántica, histórica, policiaca, aventuras.
- LibroDivulgativo: incluye área de conocimiento (física, biología, medicina, etc.).
- LibroConsulta: pueden ser diccionarios, enciclopedias y diccionarios de idiomas.
En el main, crea un objeto de cada tipo e imprímelos por consola para comprobar que se han creado correctamente
 */
public class LibroConsulta extends Libro{
    
    private TipoConsulta tipo;
    
    public LibroConsulta (String titulo, String autor, int precio, TipoConsulta t){
        super(titulo, autor, precio);
        this.tipo = t;
    }

    public TipoConsulta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConsulta tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " tipo: " + this.tipo;
    }
}
