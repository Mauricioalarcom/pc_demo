package com.example.pc_demo.Producto;


import com.example.pc_demo.Proveedor.Proveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto createProducto(Producto producto) {
        return productoRepository.save(producto);
    }


    public List<Producto> getAllProductos() {
        return productoRepository.findAll();
    }

}


