package net.atividadefixacao.api.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioId {

    private Long cpf;
    private Long id;
}
