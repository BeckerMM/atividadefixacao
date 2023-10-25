package net.atividadefixacao.api.controller;

import lombok.AllArgsConstructor;
import net.atividadefixacao.api.model.Professor;
import net.atividadefixacao.api.service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RequestMapping("/professor")
@RestController
public class ProfessorController {

    private ProfessorService professorService;
    @GetMapping()
    public Collection<Professor> buscarTodos(){
        return professorService.buscarTodos();
    }

    @GetMapping("/{id}/{cpf}")
    public Professor buscarUm(@PathVariable Long id, @RequestParam Long cpf){
        return professorService.buscarUm(id,cpf);
    }

    @DeleteMapping("/{id}/{cpf}")
    public void remover (@RequestParam Long id, @RequestParam Long cpf){
        professorService.deletar(id,cpf);
    }
    @PutMapping()
    public void atualizar (@RequestBody Professor professor){
        professorService.salvar(professor);
    }

    @PostMapping()
    public void inseir (@RequestBody Professor professor){
        professorService.salvar(professor);
    }

}
