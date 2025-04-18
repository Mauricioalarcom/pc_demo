package com.example.pc_demo.Producto;


import com.example.pc_demo.DTO.ProductoRequest;
import com.example.pc_demo.Exceptions.BadRequestHandler;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/producto")
@RestController
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<Producto> createProducto(@Valid @RequestBody ProductoRequest createProducto) {
        Producto producto = new Producto();
        modelMapper.map(createProducto, producto);
        if(createProducto.getPrecio() < 0) {
            throw new BadRequestHandler("El precio no puede ser negativo.");
        }
        if(createProducto.getNombre().isEmpty()) {
            throw new BadRequestHandler("No puede no existir un nombre...");
        }
        if(createProducto.getStock() <= 0) {
            throw new BadRequestHandler("1. El stock no puede ser negativo\n No hay stock en el producto.");
        }
        return ResponseEntity.ok(productoService.createProducto(producto));
    }


    @GetMapping
    public ResponseEntity<List<Producto>> getAllProductos() {
        List<Producto> productos = productoService.getAllProductos();
        return ResponseEntity.ok(productos);
    }

    @GetMapping
    public ResponseEntity<Producto> getProducto(@RequestParam Integer id) {
        return ResponseEntity.ok()
    }



}
