package br.edu.infnet.infra.usuario;

import br.edu.infnet.domain.usuario.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
 
    Usuario findByEmail(String email);

    Usuario inserirUsuario(Usuario usuario);
}
