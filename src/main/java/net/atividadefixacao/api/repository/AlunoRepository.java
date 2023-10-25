package net.atividadefixacao.api.repository;

import net.atividadefixacao.api.model.Aluno;
import net.atividadefixacao.api.model.UsuarioId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, UsuarioId> {
}
