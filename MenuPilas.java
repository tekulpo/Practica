import java.util.Scanner;
import java.util.Stack;

public class MenuPilas {

    public void Menupilas() {
        

        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Stack<ObjPaginaweb> p = new Stack<>();

        boolean seguir = true;
        int opt = 0;

        while (seguir) {
            System.out.println("Que desea realizar");
            System.out.println("1) Ingresar nueva pagina");
            System.out.println("2) Retroceder");
            System.out.println("3) Ver historial");
            System.out.println("4) Salir");

            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    p = m.LLenarPila(p);
                    break;
                case 2:
                    p = m.retroceder(p);
                    break;
                case 3:
                    m.MostrarHistorial(p);
                    break;
                case 4:
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
