package net.atividadefixacao.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED) //heraça

public class Usuario {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UsuarioId usuarioId;
    private String nome;
    private String telefone;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

}
