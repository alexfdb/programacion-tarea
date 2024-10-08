package es.ies.puerto;
/**
 * @author alexfdb
 * @version 1.0.0
 * Crea un array que represente los midiclorianos de 10 Jedi. Calcula la media de 
 * midiclorianos en el array. ¿Quién tiene más y quién tiene menos?
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        int[] midiclorianos = {15000, 12000, 20000, 18000, 22000, 17000, 14000, 25000, 16000, 13000};
        int suma = 0;
        int max = midiclorianos[0];
        int min = midiclorianos[0];
        int jediMax = 0;
        int jediMin = 0;
        for (int i = 0; i < midiclorianos.length; i++) {
            suma += midiclorianos[i]; 
            boolean calculaMax = (midiclorianos[i] > max); 
            boolean calculaMin = (midiclorianos[i] < min);
            if (calculaMax) {
                max = midiclorianos[i];
                jediMax = i;
            }
            if (calculaMin) {
                min = midiclorianos[i];
                jediMin = i;
            }
        }
        double media = (double) suma / midiclorianos.length;
        System.out.println("Media de midiclorianos: " + media);
        System.out.println("Jedi con más midiclorianos: Jedi " + (jediMax + 1) + " con " + max);
        System.out.println("Jedi con menos midiclorianos: Jedi " + (jediMin + 1) + " con " + min);
    }
}