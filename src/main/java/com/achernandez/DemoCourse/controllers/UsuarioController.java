package com.achernandez.DemoCourse.controllers;

import com.achernandez.DemoCourse.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario us = new Usuario();
        us.setId(id);
        us.setNombre("Camilo");
        us.setApellido("Hernandez");
        us.setEmail("achernandeza@asesoftware.com");
        us.setTelefono("3224688975");
        us.setPassword("123");
        return us;
    }

    @RequestMapping(value = "prueba")
    public Usuario editar() {
        Usuario us = new Usuario();
        us.setNombre("Camilo");
        us.setApellido("Hernandez");
        us.setEmail("achernandeza@asesoftware.com");
        us.setTelefono("3224688975");
        us.setPassword("123");
        return us;
    }

    @RequestMapping(value = "prueba1")
    public Usuario eliminar() {
        Usuario us = new Usuario();
        us.setNombre("Camilo");
        us.setApellido("Hernandez");
        us.setEmail("achernandeza@asesoftware.com");
        us.setTelefono("3224688975");
        us.setPassword("123");
        return us;
    }

    @RequestMapping(value = "prueba2")
    public Usuario buscar() {
        Usuario us = new Usuario();
        us.setNombre("Camilo");
        us.setApellido("Hernandez");
        us.setEmail("achernandeza@asesoftware.com");
        us.setTelefono("3224688975");
        us.setPassword("123");
        return us;
    }
}
