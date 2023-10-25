package net.atividadefixacao.api.service;

import lombok.Data;
import net.atividadefixacao.api.model.Escola;
import net.atividadefixacao.api.repository.EscolaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Data
@Service
public class EscolaService {
    private final EscolaRepository escolaRepository;

    public Escola buscarUm(Long id) {
        Optional<Escola> usuarios = escolaRepository.findById(id);
        return usuarios.get();
    }

    public Collection<Escola> buscarTodos() {
        return escolaRepository.findAll();
    }

    public void deletar(Long id ){
        escolaRepository.deleteById(id);
    }

    public void salvar(Escola usuario) {
        escolaRepository.save(usuario);
    }

}
