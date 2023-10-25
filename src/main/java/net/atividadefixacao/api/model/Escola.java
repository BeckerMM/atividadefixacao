package net.atividadefixacao.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToOne
    @Cascade(value = CascadeType.PERSIST)
    private Endereco endereco;

    private String email;

    @OneToMany(mappedBy = "escola")
    private List<Professor> listaDeProfessores;

    @OneToMany
    private List<Curso>listaDeCurso;

    @OneToOne(mappedBy = "escola")
    private Diretor diretor;
}
