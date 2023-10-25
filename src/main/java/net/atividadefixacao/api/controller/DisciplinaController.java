package net.atividadefixacao.api.controller;

import lombok.AllArgsConstructor;
import net.atividadefixacao.api.model.Disciplina;
import net.atividadefixacao.api.service.DisciplinaService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/disciplina")
@AllArgsConstructor
public class DisciplinaController {

    private DisciplinaService disciplinaService;
    @GetMapping()
    public Collection<Disciplina> buscarTodos(){
        return disciplinaService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Disciplina buscarUm(@PathVariable Long id){
        return disciplinaService.buscarUm(id);
    }

    @DeleteMapping("/{id}")
    public void remover (@RequestParam Long id){
        disciplinaService.deletar(id);
    }
    @PutMapping()
    public void atualizar (@RequestBody Disciplina disciplina){
        disciplinaService.salvar(disciplina);
    }

    @PostMapping()
    public void inseir (@RequestBody Disciplina disciplina){
        disciplinaService.salvar(disciplina);
    }

}
