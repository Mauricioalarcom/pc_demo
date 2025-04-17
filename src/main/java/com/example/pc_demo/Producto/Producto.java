package com.example.pc_demo.Producto;


import com.example.pc_demo.Proveedor.Proveedor;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Integer precio;

    private Integer stock;

    private Tipo categoria;

    private Date fechaVencimiento;

    @ManyToMany
    private List<Proveedor> proveedores;


}
