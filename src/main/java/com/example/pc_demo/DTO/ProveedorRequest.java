package com.example.pc_demo.DTO;

import com.example.pc_demo.Proveedor.TipoProve;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Data;

import java.util.Date;

@Data
public class ProveedorRequest {

    @NotNull
    private String nombre;

    @NotNull
    private String direccion;

    @NotNull
    @Email
    private String correo;

    @NotNull
    private TipoProve tipode_provedor;

    @NotNull
    @PastOrPresent
    private Date fechaRegistro;

}
