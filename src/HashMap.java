/**
 Universidad del Valle de Guatemala
 Algoritmos y Estructura de Datos
 Hoja de Trabajo 9
 Natanael Girón (20029)
 Ma. Isabel Solano (20504)
 Clase Hashmap
 **/

import java.util.Map;
import java.util.ArrayList;

public class Hashmap<K,V> implements Map <K,V>{

    private ArrayList<K> keys = new ArrayList<K>();
    private ArrayList<V> values = new ArrayList<V>();

    //Método para retornar las llaves del Map
    public ArrayList<K> getKeys(){

        return keys;
    }

    //Método para retornar los valores del Map
    public ArrayList<V> getValues(){

        return values;
    }

    //Método para retornar el tamaño del Map
    public int size(){

        return keys.size();

    }
}