
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    Scanner sc = new Scanner(System.in);

     public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }

     public Stack<ObjPaginaweb> LLenarPila(Stack<ObjPaginaweb> p) {
        Metodos m = new Metodos();
        boolean pedir = true;
        int opt = 0;
        while (pedir) {
            ObjPaginaweb o = new ObjPaginaweb();
            System.out.println("Ingrese la Url: ");
            o.setUrl(sc.next());
            
            System.out.println("Ingrese el titulo de la pagina: ");
            o.setTitulo(sc.next());
            
            System.out.println("Ingrese la fecha en la que visito la pagina web");
            o.setFechaAcceso(sc.nextInt());

            p.push(o);
            System.out.println("desea Agregar otra pagina 1) si , 2) no");
            opt = m.ValidarEntero(sc);
            if (opt == 2) {
                pedir = false;
            }
        }
        return p;
    }


   
     public Queue<ObjCliente> LLenarCola(Queue<ObjCliente> c) {
        Metodos m = new Metodos();
        boolean pedir = true;
        int opt = 0;
        while (pedir) {
            ObjCliente o = new ObjCliente();
            System.out.println("Ingrese el ID");
            o.setId(sc.nextInt());

            System.out.println("Ingrese el nombre");
            o.setNombre(sc.next());

            System.out.println("Ingrese el tipo de servicio");
            o.setTipoServicio(sc.next());

            System.out.println("ingrese la hora de llegada");
            o.setHoraLlegada(sc.nextInt());

            c.offer(o);
            System.out.println("desea encolar otro usuario? 1) si , 2) no");
            opt = m.ValidarEntero(sc);
            if (opt == 2) {
                pedir = false;
            }
        }
        return c;
    }

 public Stack<ObjPaginaweb> retroceder(Stack<ObjPaginaweb> p) {

        if (!p.isEmpty()) {
            System.out.println("Regresando de: " + p.peek().getTitulo());
            p.pop();

         } else {
                System.out.println("Ya no hay paginas en el historial");
            }

        return p;
    }

     public Queue<ObjCliente> Atendidos(Queue<ObjCliente> c) {

        if (!c.isEmpty()) {
            System.out.println("CLiente Atendido: " + c.peek().getNombre()+c.peek().getId());
            c.remove();

         } else {
                System.out.println("Ya no hay paginas en el historial");
            }

        return c;
    }

    public void Siguiente(Queue<ObjCliente> c) {
        if (!c.isEmpty()) {
            System.out.println("Siguiente cliente: " + c.peek().getNombre()+c.peek().getId());
        } else {
            System.out.println("No hay clientes");
        }
    }

    public void MostrarHistorial(Stack<ObjPaginaweb> p) {

        if (p.isEmpty()) {
            System.out.println("No hay historial");
        } else {
            for (ObjPaginaweb o : p) {
                System.out.println("Titulo: " + o.getTitulo());
                System.out.println("URL: " + o.getUrl());
                System.out.println("Fecha: " + o.getFechaAcceso());
                System.out.println("--------------------");
            }
        }
    }
    public void MostrarCola(Queue<ObjCliente> c) {

        if (c.isEmpty()) {
            System.out.println("No hay historial");
        } else {
            for (ObjCliente o : c) {
                System.out.println("ID: " + o.getId());
                System.out.println("Nombre: " + o.getNombre());
                System.out.println("Tipo del servicio: " + o.getTipoServicio());
                System.out.println("Hora de llegada " + o.getHoraLlegada());
                System.out.println("--------------------");
            }
        }
    }
    public void MostrarTurnos(Queue<ObjCliente> c, Queue<ObjCliente> atendidos) {

    System.out.println("---- CLIENTES PENDIENTES ----");

    if (c.isEmpty()) {
        System.out.println("No hay clientes en espera");
    } else {
        for (ObjCliente o : c) {
            System.out.println("Turno: " + o.getId() + 
                               " Nombre: " + o.getNombre() + 
                               " Servicio: " + o.getTipoServicio());
        }
    }

    System.out.println("---- CLIENTES ATENDIDOS ----");

    if (atendidos.isEmpty()) {
        System.out.println("No hay clientes atendidos");
    } else {
        for (ObjCliente o : atendidos) {
            System.out.println("Turno: " + o.getId() + 
                               " Nombre: " + o.getNombre() + 
                               " Servicio: " + o.getTipoServicio());
        }
    }
}
}


