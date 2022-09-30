package br.edu.infnet.infra.usuario;

import br.edu.infnet.domain.usuario.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "http://localhost:8081/usuarios", name = "Usuarios")
public interface UsuarioService {
    
    @GetMapping(path = {"/email/{email}"})
    Usuario obterPorEmail(@PathVariable("email") String email);
    
    @PostMapping
    Usuario inserirUsuario(Usuario usuario);
}
