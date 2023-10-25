package net.atividadefixacao.api.controller;


import lombok.AllArgsConstructor;
import net.atividadefixacao.api.model.Turma;
import net.atividadefixacao.api.service.TurmaService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/turma")
@AllArgsConstructor
public class TurmaController {

    private TurmaService turmaService;
    @GetMapping()
    public Collection<Turma> buscarTodos(){
        return turmaService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Turma buscarUm(@PathVariable Long id){
        return turmaService.buscarUm(id);
    }

    @DeleteMapping("/{id}")
    public void remover (@RequestParam Long id){
        turmaService.deletar(id);
    }
    @PutMapping()
    public void atualizar (@RequestBody Turma turma){
        turmaService.salvar(turma);
    }

    @PostMapping()
    public void inseir (@RequestBody Turma turma){
        turmaService.salvar(turma);
    }


}
