## UML Actualizado (Fase 4: Ingeniería Inversa)

A partir del código implementado en las fases anteriores y de la nueva clase `Factura` creada directamente en el código Java, se ha aplicado ingeniería inversa para generar el siguiente diagrama estructurado:

```mermaid
classDiagram
    class Especialista {
        <<interface>>
        +reparar(Reparacion r) void
    }

    class Taller {
        -String cif
        -String nombre
        -List~Mecanico~ mecanicos
        -List~Reparacion~ reparaciones
        +Taller(String cif, String nombre)
        +asignarTarea(Mecanico m, Reparacion r) void
        +addMecanico(Mecanico m) void
        +addReparacion(Reparacion r) void
    }

    class Vehiculo {
        <<abstract>>
        -String matricula
        -String marca
        -String modelo
        +Vehiculo(String matricula, String marca, String modelo)
        +getMatricula() String
    }

    class Coche {
        -int numPuertas
        +Coche(String matricula, String marca, String modelo, int numPuertas)
    }

    class Moto {
        -boolean tieneSidecar
        +Moto(String matricula, String marca, String modelo, boolean tieneSidecar)
    }

    class Cliente {
        -String dni
        -String nombre
        -String telefono
        -List~Vehiculo~ vehiculos
        +Cliente(String dni, String nombre, String telefono)
        +addVehiculo(Vehiculo v) void
    }

    class Mecanico {
        -String idEmpleado
        -String nombre
        -String especialidad
        +Mecanico(String idEmpleado, String nombre, String especialidad)
        +reparar(Reparacion r) void
    }

    class Reparacion {
        -LocalDate fecha
        -String descripcion
        -double costePiezas
        -Vehiculo vehiculo
        +Reparacion(LocalDate fecha, String descripcion, double costePiezas, Vehiculo vehiculo)
        +calcularCosteTotal() double
    }

    class Factura {
        -String idFactura
        -LocalDate fechaEmision
        -Cliente cliente
        -List~Reparacion~ reparaciones
        -double totalImporte
        +Factura(String idFactura, LocalDate fechaEmision, Cliente cliente)
        +addReparacion(Reparacion r) void
        +calcularTotal() double
    }

    %% Relaciones extraídas de las Listas y abstracciones de Java
    Vehiculo <|-- Coche
    Vehiculo <|-- Moto
    Especialista <|.. Mecanico
    
    Cliente "1" o-- "1..*" Vehiculo : Agregación
    Taller "1" *-- "1..*" Mecanico : Composición
    Taller "1" *-- "*" Reparacion : Composición
    Reparacion "*" *-- "1" Vehiculo : Composición
    
    %% Nuevas relaciones agregadas con Factura
    Factura "0..*" -- "1" Cliente : Asociación
    Factura "1" o-- "1..*" Reparacion : Agregación
```
