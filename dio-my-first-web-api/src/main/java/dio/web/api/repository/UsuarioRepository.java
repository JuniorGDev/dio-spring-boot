package dio.web.api.repository;

import dio.web.api.handler.BusinessException;
import dio.web.api.handler.CampoObrigatorioException;
import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if (usuario.getLogin() == null)
            throw new CampoObrigatorioException("login");

        if (usuario.getPassword() == null)
            throw new CampoObrigatorioException("password");

        if (usuario.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d na camada de repositório%n", id);
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("admin", "123"));
        usuarios.add(new Usuario("user", "123"));
        return usuarios;
    }

    public Usuario findById(Integer id) {
        System.out.printf("FIND/id - Recebendo o id: %d na camada de repositório%n", id);
        return new Usuario("user", "123");
    }

    public Usuario findByUsername(String login) {
        System.out.printf("FIND/username - Recebendo o username: %s na camada de repositório%n", login);
        return new Usuario("user", "123");
    }
}
