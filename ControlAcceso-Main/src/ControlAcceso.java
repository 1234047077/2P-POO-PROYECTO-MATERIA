
import java.util.List;
public class ControlAcceso {
    // Metodo para autenticar al usuario
    public static boolean autenticar(String usuario, String contraseña, List<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) && u.getContrasena().equals(contraseña)) {
                return true; // Credenciales válidas
            }
        }
        return false; // Credenciales inválidas
    }

}
