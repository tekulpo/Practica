import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuColas c = new MenuColas();
        MenuPilas p = new MenuPilas();

        boolean seguir = true;
        int opt = 0;

        while (seguir) {
            System.out.println("Que desea realizar");
            System.out.println("1) Ver el menu de pilas");
            System.out.println("2) Ver el menu de colas");
            System.out.println("3) Salir");

            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    p.Menupilas();
                    break;
                case 2:
                    c.Menucolas();
                    break;
                case 3:
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
