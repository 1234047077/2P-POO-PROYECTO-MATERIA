import java.util.ArrayList;
import java.util.List;

public class Main {
    // Lista de usuarios
    private static List<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
// Agregar usuarios
        usuarios.add(new Usuario("Almacen", "almacen123"));
        usuarios.add(new Usuario("Compras", "compras123"));
        usuarios.add(new Usuario("Producción", "produccion123"));

        // Mostrar interfaz de login
        new InterfazLogin(usuarios).setVisible(true);

    }
}