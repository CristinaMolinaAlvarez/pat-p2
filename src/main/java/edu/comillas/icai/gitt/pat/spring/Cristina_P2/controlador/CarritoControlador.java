package edu.comillas.icai.gitt.pat.spring.Cristina_P2.controlador;

import edu.comillas.icai.gitt.pat.spring.Cristina_P2.modelo.Carrito;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CarritoControlador {
    private final Map<Integer, Carrito> carritos = new HashMap<>();

    @PostMapping("/api/carrito")
    @ResponseStatus(HttpStatus.CREATED)
    // hay que añadir la anotación de la validation e importarla
    public Carrito creaCarrito(@RequestBody Carrito carrito) {
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
                                   @RequestBody Carrito carrito) {
        carritos.put(idCarrito, carrito);
        return carrito;
    }
    //Borrar carrito
    @DeleteMapping("/api/carrito/{idCarrito}")
    public void borrarCarrito(@PathVariable int idCarrito) {
        carritos.remove(idCarrito);
    }


}