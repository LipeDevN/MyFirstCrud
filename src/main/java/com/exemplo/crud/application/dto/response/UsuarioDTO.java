package com.exemplo.crud.application.dto.response;

import com.exemplo.crud.shared.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private String nome;
    private String email;

}
