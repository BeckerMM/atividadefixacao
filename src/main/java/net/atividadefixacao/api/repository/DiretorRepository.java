package net.atividadefixacao.api.repository;

import net.atividadefixacao.api.model.Diretor;
import net.atividadefixacao.api.model.UsuarioId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiretorRepository extends JpaRepository<Diretor, UsuarioId> {
}
