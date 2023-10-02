package com.alura.foro.dto.usuario;

import com.alura.foro.modelo.Tipo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String contrasena, Tipo tipo) {
}
