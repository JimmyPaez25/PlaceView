package com.PlaceView.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario") // Mapea explícitamente el nombre de la columna
    private Long idUsuario;

    @Column(name = "username") // Puedes agregar explícitamente el mapeo para consistencia
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "contraseña")
    private String contraseña;

    @Column(name = "fotoPerfil")
    private String fotoPerfil;

    @Column(name = "fotoPortada")
    private String fotoPortada;

    @Column(name = "descripcion")
    private String descripcion;
}

