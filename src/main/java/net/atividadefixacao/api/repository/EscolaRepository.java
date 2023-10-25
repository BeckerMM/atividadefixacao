package net.atividadefixacao.api.repository;

import net.atividadefixacao.api.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EscolaRepository extends JpaRepository<Escola, Long> {
}
