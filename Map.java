/**
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Hoja de Trabajo 9
Natanael Girón (20029)
Ma. Isabel Solano (20504)
Interface Map
**/

import java.util.ArrayList;

//Interface Map
public interface Map <K,V>{

//Método que retorna las llaves del Map	
public abstract ArrayList<K> getKeys();

//Método que retorna los valores del Map
public abstract ArrayList<V> getValues();

//Método que retorna si el Map contiene una llave
public abstract boolean containsKey(K key);

//Método que retorna si el Map contiene un valor
public abstract boolean containsValue(V value);

//Método que retorna una llave según su índice
public abstract K getKey(int index);

//Método que retorna el tamaño del Map
public abstract int size();

}