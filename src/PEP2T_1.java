import java.util.Scanner;

public class PEP2T_1 {
    float saldo;
    float tope;
    PEP2T_1(float saldo1, float tope1){
        saldo = saldo1;
        tope = tope1;
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        PEP2T_1 datos1 = new PEP2T_1(Float.parseFloat(args[0]),Float.parseFloat(args[1]));
        boolean salir = false;
        while (!salir) {
            System.out.println("\t\t\t\t" + "Menú de opciones");
            System.out.println("\t\t\t\t" + "================\n");
            System.out.println("\t" + "1) Retirar");
            System.out.println("\t" + "2) Ingreso de dinero");
            System.out.println("\t" + "3) Salir");

            System.out.print("\n\t\t\t\t" + "Opción: ");
            int opcion = input.nextInt();
            
            System.out.printf("Su saldo actuales de %s\n", datos1.saldo);

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
            System.out.printf("Su saldo actual es de %s€ \n\n\n", datos1.saldo);
        }
    }

    float retirada (){
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca lo que desea retirar:\n");
        float retirar = input.nextFloat();
        System.out.println();
        System.out.printf("Intenta retirar %s€ \n", retirar);
        if (retirar < tope ) {
            saldo -= retirar;
            tope -= retirar;
        }
        else
        {
            System.out.printf("Tiene establecido ahora un tope de %s€\n", tope);
        }
        return retirar;
    }

    void ingresos (){
        Scanner input = new Scanner(System.in);
        System.out.println("Teclee dinero");
        float ingresar = input.nextFloat();
        System.out.printf ("Usted ingresó %s€\n", ingresar);
        saldo += ingresar;
    }

}
