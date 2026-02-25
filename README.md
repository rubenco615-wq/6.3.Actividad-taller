# 6.3.Actividad-taller

### ¿Por qué has elegido composición o agregación entre Vehiculo y Reparacion?

Básicamente, porque una reparación no existe en el aire, O sea, tú no puedes reparar si no hay un coche o una moto que arreglar.Si metes el coche al taller, le haces reparaciones, pero si el coche va directo al desguace y desaparece, en la base de datos la reparación se suele dejar guardada por temas de facturas y tal . En cualquier caso, el rollo es que necesitas sí o sí el vehículo en el constructor cuando creas la reparación, si no, el programa peta.

### ¿Qué ventaja tiene usar la interfaz Especialista?
1. Es súper flexible: En vez de tener el Taller lleno solo de mecánicos, puedes meter ahí a cualquiera que sea un Especialista. La idea es que mientras todos sepan hacer el método reparar, al sistema le da igual quién sea.
2. Te salva si amplías luego: Imagínate que el mes que viene el jefe contrata a un Electricista o a un Pintor. Si no hubiese interfaz, tendrías que tocar todo el código del Taller para meter listas nuevas de electricistas. Con la interfaz solo creas la clase Electricista, le pones implements Especialista y a correr. Ni tocas la clase Talle.
3. Menos dependencias: Te desenganchas de depender solo de la clase Mecanico. El código queda mucho más limpio y no está todo tan enredado, así que si luego hay algún bug es mil veces más fácil de encontrar.