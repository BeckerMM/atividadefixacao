package net.atividadefixacao.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Aluno extends Usuario{
    @ManyToOne
    private Turma turma;
}
