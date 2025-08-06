package com.exemplo.crud.application.controller;

import com.exemplo.crud.application.service.UsuarioService;
import com.exemplo.crud.shared.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // RECEBE REQUISIÇÕES HTTP
@RequestMapping("/usuarios") // MAPEIA A URL
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;


    public Usuario save(Usuario usuario) {
        return usuarioService.save(usuario);
    };

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    };


    public void delete(Usuario usuario) {
        usuarioService.delete(usuario);
    };

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable("id") Long id) {
        return usuarioService.findById(id);
    };
}
