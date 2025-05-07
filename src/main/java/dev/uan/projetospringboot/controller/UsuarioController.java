package dev.uan.projetospringboot.controller;

import dev.uan.projetospringboot.dto.UsuarioDTO;
import dev.uan.projetospringboot.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<UsuarioDTO> listarTodos() {
        return usuarioService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody UsuarioDTO usuarioDTO) {
        usuarioService.inserir(usuarioDTO);
    }

    @PutMapping
    public UsuarioDTO alterar(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.alterar(usuarioDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        usuarioService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
