package edu.comillas.icai.gitt.pat.spring.Cristina_P2.controlador;

import edu.comillas.icai.gitt.pat.spring.Cristina_P2.modelo.Carrito;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CarritoControlador {
    //private final Map<Integer, Carrito> carritos = new HashMap<>();

    //recomendación Álvaro:  HM hardcodeado para no tener que meterlo cada vez en PostMan
    private final Map<Integer, Carrito> carritos = new HashMap<>(Map.of(
            1, new Carrito(1, 100, "Libro", 2, 30.0),
            2, new Carrito(2, 200, "Cuaderno", 5, 12.5),
            3, new Carrito(3, 300, "Bolígrafo", 10, 8.0)
    ));

    @PostMapping("/api/carrito")
    @ResponseStatus(HttpStatus.CREATED)
    // hay que añadir la anotación de la validation e importarla
    public Carrito creaCarrito(@Valid @RequestBody Carrito carrito) {
        // se implementar con persistencia en base de datos
        carritos.put(carrito.getIdCarrito(), carrito);
        return carrito;
    }
    // Devuelve lista carritos
    @GetMapping("/api/carrito")
    public Collection<Carrito> getCarritos() {
        //Carrito demo = new Carrito("idCarrito");
        return carritos.values();
    }
    // Devuelve descripción del carrito
    @GetMapping("/api/carrito/{idCarrito}")
    public Carrito getCarrito(@PathVariable int idCarrito) {
        return carritos.get(idCarrito);
    }

    //Modificar Carrito (Update de cualquier elemento de manera dinamica)
    @PutMapping("/api/carrito/{idCarrito}")
    public Carrito modificaCarrito(@PathVariable int idCarrito,
                                   @Valid @RequestBody Carrito carrito) {
        carritos.put(idCarrito, carrito);
        return carrito;
    }
    //Borrar carrito
    @DeleteMapping("/api/carrito/{idCarrito}")
    public void borrarCarrito(@PathVariable int idCarrito) {
        carritos.remove(idCarrito);
    }


}