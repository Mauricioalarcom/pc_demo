package com.example.pc_demo.DTO;


import com.example.pc_demo.Producto.Producto;
import com.example.pc_demo.Producto.Tipo;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;
import java.util.List;

@Data
public class ProductoRequest {

    @NotNull
    private String nombre;

    @NotNull
    @PositiveOrZero
    private Integer precio;

    @NotNull
    @PositiveOrZero
    private Integer stock;

    @NotNull
    private Tipo categoria;

    @NotNull
    @FutureOrPresent
    private Date fechaVencimiento;

    @ManyToMany
    private List<Producto> productos;
}
