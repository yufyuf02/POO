
import java.util.Scanner;
public class Main {
    
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese su email: ");
        String email = teclado.nextLine();
        System.out.print("Ingrese la cantidad de boletos: ");
        int boletos = teclado.nextInt();
        System.out.print("Ingrese su presupuesto:  ");
        double presupuesto = teclado.nextInt();

        Cliente cliente1 = new Cliente(nombre, email, boletos, presupuesto);
        Entradas entrada1 = new Entradas();

        while (cliente1.getPresupuesto() < entrada1.precio1){
        System.out.println
                ("Sus fondos son insuficientes.");
                return;
        }

        System.out.println(
            "\n" +
            "La información que ingresó es \n" +
            "Nombre: " + nombre+ "\n" +
            "Email: " + email + "\n" +
            "Boletos: " + boletos + "\n" +
            "Presupuesto: " + presupuesto + "\n");

            Ticket ticket1 = new Ticket();                  // Para llamar a una variable dentro de una clase, hay que hacer una instancia.
            System.out.println
            ("Ticket número: " + ticket1.num
//            "\n" + "Verificación A: " + ticket1.numA +
//            "\n" + "Verificación B: " + ticket1.numB +
//            "\n" + "Estado: " + ticket1.estado
            );

            if (ticket1.estado.equals("APROBADO")) {
                System.out.println
                ("Tu ticket ha sido aprobado."
                // entrada1.local1 +
                // cliente1.getNombre()                        // Usamos el getter ya que solo "cliente1.nombre" accede a algo private.
                );
                
                teclado.nextLine();                         // Limpia el buffer

                if (cliente1.getPresupuesto() >= entrada1.precio10) {
                System.out.println ("Se te ha asignado la " + entrada1.localSelA + ".");
                } else if (cliente1.getPresupuesto() >= entrada1.precio5) {
                System.out.println ("Se te ha asignado la " + entrada1.localSelB + ".");
                } else if (cliente1.getPresupuesto() >= entrada1.precio1) {
                System.out.println ("Se te ha asignado la " + entrada1.localSelC + ".");
                }
                

                // VALIDAR ESPACIOS Y DISPONIBILIDAD
                
                if (entrada1.localSel.equals("Localidad 1")) {
                    if (entrada1.local1 == 0){
                        System.out.println
                        ("Ya no hay espacios disponibles. Desafortunadamente, \n" +
                        "no va a poder realizar su compra en esta ocasión.");
                        return;
                        }
                    else if (cliente1.getBoletos() > entrada1.local1){
                        System.out.println
                        ("La cantidad de espacios disponibles es menor a la que busca.\n" +
                        "¿Gusta continuar con la compra con " + entrada1.local1 + " espacios disponibles?\n(si/no) ");
                        String continuar = teclado.nextLine().trim();
                            if (continuar.equalsIgnoreCase("si")){
                                System.out.println
                                ("\nSe ha realizado la compra de " + entrada1.local1 + " boletos en la " + entrada1.localSel + "." +
                                "\nSu cambio es de " + ((cliente1.getPresupuesto())-(entrada1.local1-(cliente1.getBoletos()*entrada1.precio1))) + "." +
                                "Gracias por su compra. :)");
                            } else if (continuar.equalsIgnoreCase("no")) {
                                System.out.println
                                ("\nGracias por su interes.");
                                return;
                        }
                    }
                } else if (entrada1.localSel.equals("Localidad 5")) {
                    if (entrada1.local5 == 0){
                        System.out.println
                        ("Ya no hay espacios disponibles. Desafortunadamente, \n" +
                        "no va a poder realizar su compra en esta ocasión.");
                        return;
                        }
                    else if (cliente1.getBoletos() > entrada1.local5){
                        System.out.println
                        ("La cantidad de espacios disponibles es menor a la que busca.\n" +
                        "¿Gusta continuar con la compra con " + entrada1.local5 + " espacios disponibles?\n(si/no) ");
                        String continuar = teclado.nextLine().trim();
                            if (continuar.equalsIgnoreCase("si")){
                                System.out.println
                                ("\nSe ha realizado la compra de " + entrada1.local5 + " boletos en la " + entrada1.localSel + "." +
                                "\nSu cambio es de " + ((cliente1.getPresupuesto())-(entrada1.local1-(cliente1.getBoletos()*entrada1.precio1))) + "." +
                                "Gracias por su compra.");
                            } else if (continuar.equalsIgnoreCase("no")) {
                                System.out.println
                                ("\nGracias por su interes. :)");
                                return;
                        }
                    }
                } else if (entrada1.localSel.equals("Localidad 10")) {
                    if (entrada1.local10 == 0){
                        System.out.println
                        ("Ya no hay espacios disponibles. Desafortunadamente, \n" +
                        "no va a poder realizar su compra en esta ocasión.");
                        return;
                        }
                    else if (cliente1.getBoletos() > entrada1.local10){
                        System.out.println
                        ("La cantidad de espacios disponibles es menor a la que busca.\n" +
                        "¿Gusta continuar con la compra con " + entrada1.local10 + " espacios disponibles?\n(si/no) ");
                        String continuar = teclado.nextLine().trim();
                            if (continuar.equalsIgnoreCase("si")){
                                System.out.println
                                ("\nSe ha realizado la compra de " + entrada1.local10 + " boletos en la " + entrada1.localSel + "." +
                                "\nSu cambio es de " + ((cliente1.getPresupuesto())-(entrada1.local1-(cliente1.getBoletos()*entrada1.precio1))) + "." +
                                "Gracias por su compra. :)");
                            } else if (continuar.equalsIgnoreCase("no")) {
                                System.out.println
                                ("\nGracias por su interes.");
                                return;
                        }
                    }
                    
            } else if (ticket1.estado.equals("DENEGADO")) {
                System.out.println
                ("Su ticket ha sido denegado. Desafortunadamente, \n" +
                "no va a poder realizar su compra en esta ocasión.");
            }
        }
    }
}