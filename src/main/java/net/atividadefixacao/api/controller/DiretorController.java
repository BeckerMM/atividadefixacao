package net.atividadefixacao.api.controller;

import lombok.AllArgsConstructor;
import net.atividadefixacao.api.model.Diretor;

import net.atividadefixacao.api.service.DiretorService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@AllArgsConstructor
@RequestMapping("/diretor")
public class DiretorController {

    private DiretorService diretorService;
    @GetMapping()
    public Collection<Diretor> buscarTodos(){
        return diretorService.buscarTodos();
    }

    @GetMapping("/{id}/{cpf}")
    public Diretor buscarUm(@PathVariable Long id, @RequestParam Long cpf){
        return diretorService.buscarUm(id,cpf);
    }

    @DeleteMapping("/{id}/{cpf}")
    public void remover (@RequestParam Long id, @RequestParam Long cpf){
        diretorService.deletar(id,cpf);
    }
    @PutMapping()
    public void atualizar (@RequestBody Diretor diretor){
        diretorService.salvar(diretor);
    }

    @PostMapping()
    public void inseir (@RequestBody Diretor diretor){
        System.out.println(diretor);
        diretorService.salvar(diretor);
    }
}
