#include <stdio.h>

int main(){
    int arrayOne[15];
    int arrayTwo[10]={20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
    int arrayThree[16]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int suma[15];
    int con, i, j, pos=0, k=0;

    for (i = 0; i < 15; i++){
        printf("Ingresa el numero de la posicion #%i: ", i);
        scanf("%i", &arrayOne[i]);
    }

    printf("\n\n-------- ARREGLO ORIGINAL --------\n");
    for (j = 0; j < 15; j++){
        printf("|  %i  ", arrayOne[j]);
    }

    printf("\n\nValor\tRepeticiones\tSuma\n");

    for (j = 0; j < 10; j++){ //Arreglo de los posibles valores
        con=0;
        for (i = 0; i < 15; i++) { //Arreglo ingresado por el usuario
            if(arrayTwo[j] == arrayOne[i]){
                con++;
            }
        }

        if(k==0) {
            suma[k]= 0 + con;
        }else{
            suma[k]= suma[k-1]+con;
        }

        printf("%i \t %i \t\t %i \n", arrayTwo[j], con, suma[k]);
        k++;
    }

    for(i=14; i>=0; i--){ //Valores del arreglo ingresado
        for (j = 0; j < 10; j++){ //Posibles Valores      
            if(arrayTwo[j] == arrayOne[i]){
                pos=suma[j];
                j=10;
            }
        }

        if(arrayThree[pos] == 0){
            arrayThree[pos]= arrayOne[i];
        }else if(arrayThree[pos] != 0){
            while(arrayThree[pos] != 0 ){
                pos--;
            }
            arrayThree[pos]= arrayOne[i];
        }
    }
        
    printf("\n-------- ARREGLO ORDENADO --------\n");
    for (j = 1; j < 16; j++){
        printf("|  %i  ", arrayThree[j]);
    }

    return 0;
}