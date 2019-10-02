## Práctica DOO - IWVG

### Limpieza de código
Se eliminan dos métodos que no estaban siendo usados. YAGNI
> método getSuit() de la clase Foundation \
> método clean() de la calse IO


### Modificación del método flip() de la clase Card
Los métodos solo deberían hacer una cosa, en el caso del método flip(), cambia el estado de facedUp y además se devuelve a si mismo
> El método flip pasa a no devolver nada.
