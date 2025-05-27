# README
Proyecto realizado por CHALLENGE "CONVERSOR DE MONEDAS" de ALURA.


### CLASES

Este proyecto consta de dos clases y dos Record. 
En una clase se hizo el trabajo de realizar todo el código 
de HttpCliente, HttpRequiest y HttpResponse:

![image](https://github.com/user-attachments/assets/832f2040-165f-4051-9257-c36805108412)


Y en la 2da clase se realizó el trabajo del código que hace posible las conversiones
y respuestas a través de los valores traídos por la API en la primera clase.

![image](https://github.com/user-attachments/assets/67fa28f5-27ce-46b3-8837-2216a488d1a4)


### RECORD

Los Record son necesarios para manejar la información en formato Json que nos envía la API.
El primero es para localizar en el Json donde se encuentra el listado de monedas:

![image](https://github.com/user-attachments/assets/a899c837-b625-43d2-ba65-2042695c0800)


El segundo es para seleccionar, dentro del listado de monedas del Json, las monedas disponibles en nuestro programa

![image](https://github.com/user-attachments/assets/500ea566-3c14-4ff8-b2c5-0dbea48dcfdd)



### MAIN

En nuestro Principal primero declaramos las diferentes variables que usaremos en nuestro programa
e instanciamos lo necesario para su uso de las otras clases y poder usar sus métodos:

![image](https://github.com/user-attachments/assets/208c1fa9-d550-4e73-849a-b4dcee86b7a2)


Luego preparamos el MENU con el que el usuario va a interactuar dándole a elegir 6 opciones,
2 por cada moneda disponible y al final abrimos el scanner para obtener la opción del usuario:

![image](https://github.com/user-attachments/assets/23dfccc5-4f75-434b-94e8-fbfabc060840)


Antes de continuar con las opciones de nuestro bucle creamos una serie de condicionales 
que nos ayudarán a que nuestro código sea un poco más  reutilizable y escalable.
Lo que se quiso lograr es que al final solo hay 2 opciones en nuestro programa:
pasar de USD a una moneda nacional y viceversa. Por lo cual con solo dos métodos
podemos realizar todo el trabajo aunque haya 6 opciones para el usuario. 
Logramos esto al identificar que si escogen las opciones 1 y 2, pues se estaría trabajando con
la moneda ARS y si fuesen 3 y 4 pues con la moneda CLP. Allí definomos un String con con el 
nombre de la moneda y seleccionamos la moneda a usar de nuestro Json. Aparte como solo tenemos 
2 opciones en nuestro menú, 1 para pasar USD a moneda Nacional y la opción 2 para pasar
moneda Nacional a USD, lo que hacemos es convertir la selecciones impares a 1 y las pares a 2.

![image](https://github.com/user-attachments/assets/db291f13-bdda-4fe4-88c2-6bcfedee244f)


En la parte final de nuestro código podemos dar el cálculo y la respuesta ya construida a través
de los argumentos ya definidos en las condicones de la imagen anterior.

![image](https://github.com/user-attachments/assets/3ff26b8f-5005-4eaf-ae06-bacb218af722)


### DATE
Manuel Bravo
05/2025

