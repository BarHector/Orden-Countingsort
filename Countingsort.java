package Ordenamiento.Counting;

import java.util.Scanner;

public class Countingsort {
    public static void main(String[] args) {
        Scanner art = new Scanner(System.in);

        int[] arrayOne = new int[15];
        int arrayTwo[] = {20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
        int[] arrayThree = new int[16];
        int[] suma = new int[15];
        int con=0, pos=0, k=0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Ingresa el numero de la posicion #" + i + ":");
            arrayOne[i] = art.nextInt();
            if(arrayOne[i] < 20 || arrayOne[i] > 29){
                System.out.println("Solo se admiten numeros enteros del 20 al 29");
                i--;
            }
        }

        art.close(); //Se cierra el teclado

        System.out.print("\n\n-------- ARREGLO ORIGINAL --------\n");
        for (int i = 0; i < 15; i++) {
            System.out.print("|  " + arrayOne[i] + "  ");
        }

        System.out.print("\n\nValor\tRepeticiones\tSuma\n");
        for (int j = 0; j < 10; j++){ 
            con=0;
            for (int i = 0; i < 15; i++) { 
                if(arrayTwo[j] == arrayOne[i]){
                    con++; //Saber cuantas veces se encuentra un número
                }
            }
    
            if(k==0){
                suma[k]= 0 + con; //Solo aplica para la priemr iteración
            }else{
                suma[k]= suma[k-1]+con; //Aplica para las demas iteraciones
            }

            System.out.println(arrayTwo[j] + "\t" + con + "\t\t" + suma[k]);
            k++;
        }

        for(int i=14; i>=0; i--){ 
            for (int j = 0; j < 10; j++){  
                if(arrayTwo[j] == arrayOne[i]){ //Buscando el primer elemento a ordenar
                    pos=suma[j]; //Posicion indicada por la cantidad de veces que aparece
                    break;
                }
            }

            if(arrayThree[pos] == 0){ //Si la posición indicada por la cantidad de apariciones del número está libre
                arrayThree[pos]= arrayOne[i];
            }else if(arrayThree[pos] != 0){ //Si la posición indicada por la cantidad de apariciones del número no está libre
                while(arrayThree[pos] != 0 ){ //Buscando una posición libre
                    pos--;
                }
                arrayThree[pos]= arrayOne[i];
            }
        }

        System.out.println("\n-------- ARREGLO ORDENADO --------");
        for(int j = 1; j < 16; j++){
            System.out.print("|  " + arrayThree[j] + "  ");
        }
    }
}
