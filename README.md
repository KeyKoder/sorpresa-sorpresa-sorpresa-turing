# sorpresa-sorpresa-sorpresa-turing

## Previo
Nos hemos repartido el trabajo entre los dos, Víctor (KeyKoder) es el encargado hacer el Abstract Factory y la interfaz gráfica,
mientras que Rodri (DonRodrigo04) es el encargado de hacer el Builder y el Prototype.

Hemos tenido cada uno varios problemas al gestionar el tiempo y varias resposabilidades en nuestros respectivos entornos personales
que nos han impedido llevar a cabo el proyecto como queríamos.

La finalidad original del proyecto, comprobar que patrón creacional sería el más apropiado en este caso, probando cada uno por separado
se ha completado con éxito. Pero por faltas de tiempo, la interfaz gráfica no ha podido ser integrada en la aplicación.


## Análisis de los patrones creacionales
Para este proyecto se han probado tres patrones creacionales distintos, el Abstract Factory, el Builder y el Prototype.

Al probar los varios patrones, hemos visto que, en este caso, es más cómodo de crear estos "Programas" con el Abstract Factory
que con cualquier otro.

El patrón builder está bien, pero los objetos, tal y como los hemos definido, son demasiado poco complejos para poder beneficiarse
de las ventajas que aporta este patrón.

El patrón prototype no encaja bien a la hora de crear estos objetos.
Hay mejores patrones para ello que hacen más cómodo el mantenimiento del código.

El código para cada uno de los patrones se encuentra en la rama con su nombre correspondiente (``factory``, ``builder`` y ``Prototype``).

Además, el código del Abstract Factory, que hemos determinado que es el más cómodo para este caso, se encuentra en la rama main junto con este README.


## Problemas encontrados a la hora de resolver un problema indecidible
El Problema de la Parada o Halting Problem es un problema irresoluble.

Cómo explicó Alan Turing, al igual que muchos otros depués, es imposible hacer una máquina o programa que 
determine con un 100% de acierto si una máquina o programa se va a detener dándole cierto conjunto de entradas.

Lo que hemos hecho para simularlo es lo siguiente:

En el caso del Abstract Factory, se ha optado por ejecutar los programas de turno durante 20 segundos cómo máximo.
Si el programa no ha terminado antes de que pasen esos 20 segundos, se considera que el programa no va a terminar nunca.

Ese tiempo de 20 segundos es configurable según se necesite modificando el código del programa.

Por otro lado, en el caso del Builder y del Prototype, se ha optado por predefinir que tipo de programa debería de terminar y 
comprobar eso a la hora de simularlo. Ya sea mediante un booleano en el caso del Builder o mediante un checkeo con ``instanceof`` en el caso
del Prototype.


## Enlace al repositorio

``https://github.com/KeyKoder/sorpresa-sorpresa-sorpresa-turing.git``
