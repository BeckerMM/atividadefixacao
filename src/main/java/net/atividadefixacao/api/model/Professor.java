package net.atividadefixacao.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Professor extends Usuario{
    @ManyToOne
    private Escola escola;
    @ManyToMany(mappedBy = "listaDeProfessores")
    private List<Disciplina> listaDeDisciplina;
}
