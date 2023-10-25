package net.atividadefixacao.api.service;


import lombok.AllArgsConstructor;
import net.atividadefixacao.api.model.Disciplina;
import net.atividadefixacao.api.repository.DisciplinaRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DisciplinaService {

    private final DisciplinaRepository disciplinaRepository;

    public Disciplina buscarUm(Long id) {
        Optional<Disciplina> usuarios = disciplinaRepository.findById(id);
        return usuarios.get();
    }

    public Collection<Disciplina> buscarTodos() {
        return disciplinaRepository.findAll();
    }

    public void deletar(Long id ){
        disciplinaRepository.deleteById(id);
    }

    public void salvar(Disciplina usuario) {
        disciplinaRepository.save(usuario);
    }

}
