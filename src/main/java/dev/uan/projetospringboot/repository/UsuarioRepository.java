package dev.uan.projetospringboot.repository;

import dev.uan.projetospringboot.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
