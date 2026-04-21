import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MenuColas {
     public void Menucolas() {
         

        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Queue<ObjCliente> c = new LinkedList<>();
        boolean seguir = true;
        int opt = 0;
        while (seguir) {
            System.out.println("Que desea realizar");
            System.out.println("1) Agregar un cliente");
            System.out.println("2) Atender un cliente");
            System.out.println("3) Ver el siguiente cliente");
            System.out.println("4) Mostrar la cola");
            System.out.println("5) Mostrar los atendidos y los faltantes");
            System.out.println("6) Salir");

            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    c= m.LLenarCola(c);
                    break;
                case 2:
                    c = m.Atendidos(c);
                    break;
                case 3:
                    m.Siguiente(c);
                    break;
                    case 4:
                    m.MostrarCola(c);
                    break;
                    case 5:
                    m.MostrarTurnos(c, c);
                    break;
                case 6:
                    System.out.println("Muchas gracias, hasta luego");
                    seguir = false;
                    break;
                default:
                    System.out.println("del 1 al 5 porfa");
                    break;
            }
        }
    }
    
}
