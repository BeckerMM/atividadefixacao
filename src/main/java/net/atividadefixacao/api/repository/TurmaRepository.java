package net.atividadefixacao.api.repository;

import net.atividadefixacao.api.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma,Long> {
}
