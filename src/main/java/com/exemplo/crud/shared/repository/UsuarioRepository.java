package com.exemplo.crud.shared.repository;

import com.exemplo.crud.shared.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
