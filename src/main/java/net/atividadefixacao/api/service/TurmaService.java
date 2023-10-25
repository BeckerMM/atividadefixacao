package net.atividadefixacao.api.service;

import lombok.AllArgsConstructor;
import net.atividadefixacao.api.model.Turma;
import net.atividadefixacao.api.repository.TurmaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TurmaService {
    private final TurmaRepository turmaRepository;

    public Turma buscarUm(Long id) {
        Optional<Turma> usuarios = turmaRepository.findById(id);
        return usuarios.get();
    }

    public Collection<Turma> buscarTodos() {
        return turmaRepository.findAll();
    }

    public void deletar(Long id ){
        turmaRepository.deleteById(id);
    }

    public void salvar(Turma usuario) {
        turmaRepository.save(usuario);
    }
}
