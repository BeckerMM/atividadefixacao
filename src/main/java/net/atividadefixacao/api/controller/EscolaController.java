package net.atividadefixacao.api.controller;


import lombok.AllArgsConstructor;


import net.atividadefixacao.api.model.Escola;
import net.atividadefixacao.api.service.EscolaService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/escola")
@AllArgsConstructor
public class EscolaController {
    private EscolaService escolaService;
    @GetMapping()
    public Collection<Escola> buscarTodos(){
        return escolaService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Escola buscarUm(@PathVariable Long id){
        return escolaService.buscarUm(id);
    }

    @DeleteMapping("/{id}")
    public void remover (@RequestParam Long id){
        escolaService.deletar(id);
    }
    @PutMapping()
    public void atualizar (@RequestBody Escola escola){
        escolaService.salvar(escola);
    }

    @PostMapping()
    public void inseir (@RequestBody Escola escola){
        escolaService.salvar(escola);
    }

}
