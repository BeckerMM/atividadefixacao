package net.atividadefixacao.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne
    private Escola escola;
    @OneToMany(mappedBy = "turma")
    private List<Aluno> listaDeAlunos;
}
