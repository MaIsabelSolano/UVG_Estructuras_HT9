import java.util.Map;

/**
 Universidad del Valle de Guatemala
 Algoritmos y Estructura de Datos
 Hoja de Trabajo 9
 Natanael Girón (20029)
 Ma. Isabel Solano (20504)
 Clase Factory
 **/

public class Factory <K,V>{

    public Map<K, V> selectMap(int code){

        //Switch que analisa el codigo ingresado por el usuario
        switch(code){

            // Si el usuario elige la opcion 1
            case 1:{
                return new Hashmap<K,V>();

            }
            // Si el usuario elige la opcion 2
            case 2:{
                return new RBT<K,V>();
            }
            // Si el usuario relige un codigo invalido, retorna null
            default {
                return null;
            }
        }
    }
}
