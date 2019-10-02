## Práctica DOO - IWVG

### Modificación de herencia en CardStack
Se intenta priorizar la composición frente a la herencia. La herencia de la clase CardStack no es una herencia limpia. Crea una clase hija sin niguna funcionalidad añadida.
Se modifica la herencia por composición.
> Problema: código repetido


### Unificación de formato
Modificación de algunos saltos de linea para mantener el estilo único del formato


### Limpieza de código
Se eliminan dos métodos que no estaban siendo usados. YAGNI
> método getSuit() de la clase Foundation \
> método clean() de la calse IO


### Modificación del método flip() de la clase Card
Los métodos solo deberían hacer una cosa, en el caso del método flip(), cambia el estado de facedUp y además se devuelve a si mismo
> El método flip pasa a no devolver nada.
