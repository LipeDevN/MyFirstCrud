package com.exemplo.crud.application.service;

import com.exemplo.crud.shared.entity.Usuario;
import com.exemplo.crud.shared.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor //Instancia automaticamente as dependencias
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    };

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    };

    public void delete(Usuario usuario) {
        usuarioRepository.delete(usuario);
    };

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    };
}
