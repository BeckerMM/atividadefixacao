package net.atividadefixacao.api.service;

import lombok.AllArgsConstructor;
import net.atividadefixacao.api.model.Curso;
import net.atividadefixacao.api.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public Curso buscarUm(Long id) {
        Optional<Curso> usuarios = cursoRepository.findById(id);
        return usuarios.get();
    }

    public Collection<Curso> buscarTodos() {
        return cursoRepository.findAll();
    }

    public void deletar(Long id ){
        cursoRepository.deleteById(id);
    }

    public void salvar(Curso curso) {
        cursoRepository.save(curso);
    }
}
