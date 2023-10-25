package net.atividadefixacao.api.controller;


import lombok.AllArgsConstructor;
import net.atividadefixacao.api.model.Aluno;
import net.atividadefixacao.api.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/aluno")
@AllArgsConstructor
public class AlunoController {

    private AlunoService alunoService;
    @GetMapping()
    public Collection<Aluno> buscarTodos(){
        return alunoService.buscarTodos();
    }

    @GetMapping("/{id}/{cpf}")
    public Aluno buscarUm(@PathVariable Long id, @RequestParam  Long cpf){
        return alunoService.buscarUm(id,cpf);
    }

    @DeleteMapping("/{id}/{cpf}")
    public void remover (@RequestParam Long id, @RequestParam Long cpf){
        alunoService.deletar(id,cpf);
    }
    @PutMapping()
    public void atualizar (@RequestBody Aluno Aluno){
        alunoService.salvar(Aluno);
    }

    @PostMapping()
    public void inseir (@RequestBody Aluno Aluno){
        alunoService.salvar(Aluno);
    }

}
