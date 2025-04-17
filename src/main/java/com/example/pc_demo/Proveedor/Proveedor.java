package com.example.pc_demo.Proveedor;


import com.example.pc_demo.Producto.Producto;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String direccion;
    private String correo;
    private TipoProve tipode_provedor;
    private Date fechaRegistro;

    @ManyToMany(mappedBy = "proveedores")
    private List<Producto> productos;
}
