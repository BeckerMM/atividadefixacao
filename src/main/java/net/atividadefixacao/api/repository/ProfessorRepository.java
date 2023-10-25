package net.atividadefixacao.api.repository;

import net.atividadefixacao.api.model.Professor;
import net.atividadefixacao.api.model.UsuarioId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor,UsuarioId> {
}
