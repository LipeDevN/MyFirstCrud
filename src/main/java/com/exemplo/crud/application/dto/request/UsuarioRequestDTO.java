package com.exemplo.crud.application.dto.request;

import com.exemplo.crud.shared.entity.Usuario;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequestDTO {
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("email")
    private String email;
}