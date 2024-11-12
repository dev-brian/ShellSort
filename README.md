# Shell Sort en Java

## Descripción

Este proyecto implementa el algoritmo de ordenamiento **Shell Sort** en Java. Los datos se leen desde un archivo de texto (`numeros.txt`) y se ordenan utilizando el algoritmo Shell Sort, con mensajes de depuración impresos para ilustrar el proceso de ordenamiento.

## Requisitos

- Un archivo de texto (`numeros.txt`) con números enteros, uno por línea

## Uso

1. **Asegúrate de que `numeros.txt` esté en el mismo directorio que el código fuente**.
2. **Ejecuta el programa**:

## Estructura del Código

### Clase principal `ShellSort`

La clase `ShellSort` contiene todos los métodos necesarios para leer los datos, ordenarlos y mostrar mensajes de depuración.

### Método `shellSort`

Este método implementa el algoritmo Shell Sort y muestra mensajes de depuración para cada paso del proceso de ordenamiento.

### Método `imprimirMatriz`

Este método imprime el arreglo después de cada iteración de ordenamiento.

### Método `leerArreglo`

Este método lee los datos del archivo especificado y los convierte en un arreglo de enteros.

### Método `main`

Este método principal especifica la ruta del archivo y llama a los métodos para leer y ordenar los datos.

## Notas

- La ruta del archivo es modificable dependiendo de la ubicación del archivo a leer, adaptalo según tus necesidades.
- Los mensajes impresos de depuración se pueden omitir si no son necesarios. Su objetivo principal es ilustrativo.

## Ejemplo de Archivo `numeros.txt`

1
10
13
8
3
4
18
5

## Licencia

Este proyecto está bajo la licencia MIT. Consulta el archivo `LICENSE` para más detalles.
