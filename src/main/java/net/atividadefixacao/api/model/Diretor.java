package net.atividadefixacao.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Diretor extends Usuario{
    @OneToOne
    private Escola escola;
}
