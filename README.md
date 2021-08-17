# Ordenamiento-Countingsort
Algoritmo de ordenamiento Countingsort

Este algoritmo de ordenamiento (al menos esta iomplementación) funciona de la siguiente amnera:
  Se crea un arreglo que tiene como elementos a los posibles valores que puede tomar una variable, para el código el rango es de 20 a 29. El usuario ingresa 15 números (los cuales   deben respetar dicho rango) y se hace un registro de cuantas veces aparece cada posible valor, dicha cantidad de aparaciones indicara la posición que tomará cada elemento en       un nuevo arreglo donde se ordenaran todos los números ingresados por el usuario; si un elemento ya está en dicha posición del arreglo, se hace un recorrido a las posiciones       anteriores hasta encontrar una casilla vacia donde se pueda ingresar un nuevo elemento.
  
NOTAS ADICIONALES DE COUNTINGSORT
  La complejidad temporal del algoritmo es O(n)
  El alto costo en memoria limita las condicion de ejecución

NOTAS DEL CODIGO
  El arreglo en el cual estaran todos los elementos ordenados cuenta con 16 casillas y no 15, esto debido a que al momento de ordenar todos los elenmentos el primer elemento (se     cual sea) se convertira en un valor 'basura'.
  
  Se hicieron dos implementaciones, una en lenguaje Java y otra en C, aunque ambas son correctas, considero que la versión en Java es mejor debido a todas las herramientas que       existen dentro del lenguaje, aunque no se explotaron tanto.
  
  Existen todavia mejoras que se le pueden hacer al código y que en un futuro se agregaran para hacer un código más eficiente y corto.
  
  En el caso de la versión en Java, si se quiere probar se tiene que quitar la primer linea (la de 'package').
