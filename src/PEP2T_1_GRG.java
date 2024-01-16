import java.util.Scanner;

public class PEP2T_1_GRG {
    // Creacion de los atributos para el metodo constructor
    float saldo;
    float tope;

    // Creacion de metodo constructor
    private PEP2T_1_GRG(float saldo1, float tope1){
        saldo = saldo1;
        tope = tope1;
    }

    // Creacion de metodos para la verificacion de los limites y pedir los datos al cliente
    private void verificacionTope (float retirar){
        System.out.printf("\t\tIntenta retirar %s € \n", retirar);
        System.out.printf("\t\tTiene establecido ahora un tope de %3.0f€ \n", tope);

    }

    // Creacion de un objeto de Scanner para que el cliente pueda introducir datos
    Scanner input = new Scanner(System.in);

    // Metodo main (metodo inicial, contiene el menu de inicio
    public static void main (String[] args) {
        // Creacion de un objeto de Scanner para que el cliente pueda introducir datos
        Scanner input = new Scanner(System.in);
        // Creacion de objeto cuyo nombre va a ser datos1
        PEP2T_1_GRG datos1 = new PEP2T_1_GRG(Float.parseFloat(args[0]), Float.parseFloat(args[1]));

        boolean salir = false;
        while (!salir) {
            // Menu de inicio
            System.out.println("\n\n\t\t\t\t" + "Menú de opciones");
            System.out.println("\t\t\t\t" + "================\n");
            System.out.println("\t" + "1) Retirada de dinero");
            System.out.println("\t" + "2) Ingreso de dinero");
            System.out.println("\t" + "3) Salir");

            // Pedir al cliente que ingrese lo que desea hacer
            System.out.print("\n\t\t\t\t" + "Opción: ");
            int opcion = input.nextInt();
            System.out.println();

            // Eleccion de opciones
            datos1.verificacionDinero();
            switch (opcion) {
                case 1:
                    datos1.retirada();
                    break;
                case 2:
                    datos1.ingresos();
                    break;
                case 3:
                    salir = true;
                    break;
            }

            datos1.verificacionDinero();
        }
    }


    private void verificacionDinero (){System.out.printf("\t\tSu saldo actual es de %s €\n", saldo);}

    // Metodo para hacer la retirada
    private void retirada () {
        System.out.print("\t\tTeclee dinero a retirar:\n\t\t");
        float retirar = input.nextFloat();
        if (retirar <= tope) {
            if (retirar <= saldo){
                saldo -= retirar;
                tope -= retirar;
            }
            else
            {
                System.out.printf("\t\tIntenta retirar %s € \n", retirar);
                System.out.println("No tiene el suficiente dinero en la cuenta, revise sus ingresos");
            }
            System.out.printf("\t\tUsted retiró %s €\n", retirar);
        }
        else
        {
            verificacionTope(retirar);
        }
    }

    // Metodos para hacer el ingreso de dinero
    private void ingresos (){
        System.out.print("\t\tTeclee dinero a ingresar:\n\t\t");
        float ingresar = input.nextFloat();

        saldo += ingresar;
        System.out.printf ("\t\tUsted ingresó %s €\n", ingresar);
    }
}
