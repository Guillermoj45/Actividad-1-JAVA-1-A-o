import java.util.Scanner;

public class PEP2T_1 {
    float saldo;
    float tope;
    PEP2T_1(float saldo1, float tope1){
        saldo = saldo1;
        tope = tope1;
    }
    public static void main(String[] args) {
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
            int opcion = Integer.parseInt(input.nextLine());
            
            System.out.printf("Su saldo actuales de %s\n", datos1.saldo);

            switch (opcion) {
                case 1:
                    datos1.Retirada();
                    break;
                case 2:
                    datos1.Ingresos();
                    break;
                case 3:
                    salir = true;
                    break;
            }
        }
    }

    void Retirada (){
        Scanner input =new Scanner(System.in);
        System.out.print("Itroduzca lo que desea retirar:\n");
        float retirar = Float.parseFloat(input.nextLine());
        System.out.println();
        System.out.printf("Intenta retirar %s€ \n", retirar);
        if (retirar < tope ) {
            saldo -= retirar;
        }
        else
        {
            System.out.printf("Tiene establecido ahora un tope de %s€\n", saldo);
        }
        System.out.printf("Su saldo actual es de %s€ \n\n", saldo);
    }

    void Ingresos (){
        Scanner input = new Scanner(System.in);
        System.out.println("Teclee dinero");
        float ingresar = Float.parseFloat(input.nextLine());
        System.out.printf ("Usted ingresó %s€\n", ingresar);
        saldo += ingresar;
        System.out.printf("Su saldo actual es de %s€\n", saldo);
    }

}
