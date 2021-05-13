/**
 Universidad del Valle de Guatemala
 Algoritmos y Estructura de Datos
 Hoja de Trabajo 9
 Natanael Girón (20029)
 Ma. Isabel Solano (20504)
 Clase Asociacion
 **/

public class Asociacion implements Comparable<String>{
    private String ingles; //llave
    private String espanol; //valor

    public Asociacion(String i, String e){
        this.ingles = i;
        this.espanol = e;
    }

    public int compareTo(String anotherDef){
        int comparacion = ingles.compareTo(anotherDef);
        return comparacion;
    }
}