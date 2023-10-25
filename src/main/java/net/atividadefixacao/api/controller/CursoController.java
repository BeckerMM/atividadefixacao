package net.atividadefixacao.api.controller;


import lombok.AllArgsConstructor;
import net.atividadefixacao.api.model.Curso;
import net.atividadefixacao.api.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/curso")
@AllArgsConstructor
public class CursoController {

    private CursoService cursoService;
    @GetMapping()
    public Collection<Curso> buscarTodos(){
        return cursoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Curso buscarUm(@PathVariable Long id){
        return cursoService.buscarUm(id);
    }

    @DeleteMapping("/{id}")
    public void remover (@RequestParam Long id){
        cursoService.deletar(id);
    }
    @PutMapping()
    public void atualizar (@RequestBody Curso curso){
        cursoService.salvar(curso);
    }

    @PostMapping()
    public void inseir (@RequestBody Curso curso){
        cursoService.salvar(curso);
    }

}
