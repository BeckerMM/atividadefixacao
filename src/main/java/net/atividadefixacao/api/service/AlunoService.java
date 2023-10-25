package net.atividadefixacao.api.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.atividadefixacao.api.model.Aluno;
import net.atividadefixacao.api.model.UsuarioId;
import net.atividadefixacao.api.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;



@Service
@AllArgsConstructor
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public Aluno buscarUm(Long id, Long cpf) {
        Optional<Aluno> usuarios = alunoRepository.findById(new UsuarioId(id,cpf));
        return usuarios.get();
    }

    public Collection<Aluno> buscarTodos() {
        return alunoRepository.findAll();
    }

    public void deletar(Long id , Long cpf){
        alunoRepository.deleteById(new UsuarioId(id,cpf));
    }

    public void salvar(Aluno usuario) {
        alunoRepository.save(usuario);
    }
}
