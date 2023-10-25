package net.atividadefixacao.api.service;

import lombok.AllArgsConstructor;
import net.atividadefixacao.api.model.Diretor;
import net.atividadefixacao.api.model.UsuarioId;
import net.atividadefixacao.api.repository.DiretorRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@AllArgsConstructor
@Service
public class DiretorService {

    private final DiretorRepository diretorRepository;

    public Diretor buscarUm(Long id, long cpf) {
        Optional<Diretor> usuarios = diretorRepository.findById(new UsuarioId(id,cpf));
        return usuarios.get();
    }

    public Collection<Diretor> buscarTodos() {
        return diretorRepository.findAll();
    }

    public void deletar(Long id ,long cpf){
        diretorRepository.deleteById(new UsuarioId(id,cpf));
    }

    public void salvar(Diretor usuario) {
        diretorRepository.save(usuario);
    }

}
