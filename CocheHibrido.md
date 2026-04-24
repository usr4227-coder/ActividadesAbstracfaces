# Coche Híbrido

Un coche híbrido combina un motor de combustión con un motor eléctrico. Para crearlo a partir de la clase de coche de combustión, se añaden nuevos atributos y se define una interfaz para la parte eléctrica.

## Nuevos atributos

- capacidadBateria: cantidad máxima de energía que puede almacenar.
- nivelBateria: energía disponible en cada momento.
- modoElectrico: indica si el coche está usando el motor eléctrico.
- consumoElectrico: energía que gasta al moverse en modo eléctrico.

Estos atributos permiten controlar el funcionamiento eléctrico igual que los litros de combustible controlan el motor de combustión.

## Interfaz eléctrica

La parte eléctrica se organiza mediante una interfaz que define las acciones propias del motor eléctrico:

- cargarBateria(): aumenta el nivel de batería.
- usarMotorElectrico(): activa el modo eléctrico.
- consumoElectrico(): define el gasto al moverse en modo eléctrico.

## Funcionamiento del coche híbrido

El coche híbrido hereda el comportamiento del coche de combustión y añade la lógica eléctrica:

- Si hay batería suficiente y el modo eléctrico está activado, el movimiento se realiza usando energía eléctrica.
- Si la batería está baja, el coche cambia automáticamente al motor de combustión.
- Si no hay batería ni combustible, el coche no puede moverse.
- El arranque del motor de combustión funciona igual que en el coche de combustión.

## Ventajas del diseño

- Reutiliza la clase de combustión mediante herencia.
- Añade la parte eléctrica sin modificar la clase original.
- Mantiene el código organizado gracias a la interfaz.
- Permite ampliar el sistema en el futuro.
