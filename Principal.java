import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        mostrarFechaYHoraActual();
    }

    public static void mostrarFechaYHoraActual() {
        // Obtener la fecha y hora actual
        Date fechaYHoraActual = new Date();

        // Mostrar la fecha y hora actual
        System.out.println("Fecha y hora actual: " + fechaYHoraActual);
    }
}