# Práctica 2 – API REST Carrito

## Descripción
Este proyecto implementa una API REST sencilla usando Spring Boot que permite realizar operaciones CRUD (Create, Read, Update, Delete) sobre el recurso **Carrito**, modelando un caso simplificado de e-commerce.

Cada carrito contiene un único producto, tal y como se indica en el enunciado de la práctica.

La persistencia se simula mediante un `HashMap` en memoria.

---

## Modelo de datos

El recurso **Carrito** tiene los siguientes campos:
- `idCarrito`: identificador único del carrito
- `idArticulo`: identificador del artículo
- `descripcion`: descripción del artículo
- `unidades`: número de unidades
- `precioFinal`: importe final del carrito (campo proporcionado y devuelto en las respuestas)

Se han aplicado validaciones básicas usando Bean Validation para evitar valores inválidos.

---
