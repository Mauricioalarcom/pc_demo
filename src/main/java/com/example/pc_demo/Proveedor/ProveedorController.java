package com.example.pc_demo.Proveedor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;


}
