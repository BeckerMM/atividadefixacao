package net.atividadefixacao.api.service;

import lombok.AllArgsConstructor;
import net.atividadefixacao.api.model.Professor;
import net.atividadefixacao.api.model.UsuarioId;
import net.atividadefixacao.api.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public Professor buscarUm(Long id, long cpf) {
        Optional<Professor> usuarios = professorRepository.findById(new UsuarioId(id, cpf));
        return usuarios.get();
    }

    public Collection<Professor> buscarTodos() {
        return professorRepository.findAll();
    }

    public void deletar(Long id, Long cpf ){
        professorRepository.deleteById(new UsuarioId(id,cpf));
    }

    public void salvar(Professor usuario) {
        professorRepository.save(usuario);
    }

}
