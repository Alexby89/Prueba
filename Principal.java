import java.util.Scanner;
import java.time.LocalDateTime;

public class Principal {

    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner sc = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario();
            System.out.print("Nombre: ");
            usuarios[i].nombre = sc.nextLine();

            System.out.print("Apellidos: ");
            usuarios[i].apellidos = sc.nextLine();

            System.out.print("Email: ");
            usuarios[i].email = sc.nextLine();
        }
        return usuarios;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de usuarios: ");
        int num = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Usuario[] usuarios = crearUsuarios(num);

        System.out.println("\nListado de usuarios:");
        for (Usuario u : usuarios) {
            System.out.println(u.nombre + " " + u.apellidos + " - " + u.email);
        }
    }
}
