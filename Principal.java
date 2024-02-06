import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de usuarios
        System.out.print("Ingrese el número de usuarios: ");
        int numUsuarios = scanner.nextInt();

        // Crear el array de usuarios
        Usuario[] usuarios = crearUsuarios(numUsuarios);

        // Mostrar la información de cada usuario
        mostrarUsuarios(usuarios);
    }

    public static Usuario[] crearUsuarios(int numUsuarios) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[numUsuarios];

        for (int i = 0; i < numUsuarios; i++) {
            System.out.println("\nUsuario " + (i + 1) + ":");
            usuarios[i] = new Usuario();

            System.out.print("Nombre: ");
            usuarios[i].nombre = scanner.next();

            System.out.print("Apellidos: ");
            usuarios[i].apellidos = scanner.next();

            System.out.print("Email: ");
            usuarios[i].email = scanner.next();
        }

        return usuarios;
    }

    public static void mostrarUsuarios(Usuario[] usuarios) {
        System.out.println("\nInformación de Usuarios:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);
            System.out.println();
        }
    }

}