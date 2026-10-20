import org.w3c.dom.ls.LSOutput;

public class Main {
    static void main() {
        System.out.println("Alertas totales: " +AlertaSistema.getContador());

        AlertaSistema a1= new AlertaSistema(001,"Error de conexion");
        a1.setProridad(1);
        AlertaSistema a2= new AlertaSistema(002,"No tiene conexión");
        a2.setProridad(1);

        System.out.println("\nAlerta 1");
        a1.mostrarInfo();
        System.out.println("\nAlerta 2");
        a2.mostrarInfo();

        System.out.println("\nAlertas totales: " +AlertaSistema.getContador());

        System.out.println("\nAuemntar prioridad a 4 en alerta 1 y 10 en Alerta 2");
        a1.aumentarPrioridad(4);
        a2.aumentarPrioridad(10);

        System.out.println("\nAlerta 1");
        a1.mostrarInfo();
        System.out.println("\nAlerta 2");
        a2.mostrarInfo();

        System.out.println("\nAlertas totales: " +AlertaSistema.getContador());

        System.out.println("\nAlerta 1");
        a1.esUrgente();
        System.out.println("\nAlerta 2");
        a2.esUrgente();

        System.out.println("\nAumentar prioridad a 4 en alerta 2");
        a2.aumentarPrioridad(4);

        a2.mostrarInfo();
        a2.esUrgente();

    }
}
