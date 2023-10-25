package net.atividadefixacao.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Diretor extends Usuario{
    @OneToOne
    private Escola escola;
}
