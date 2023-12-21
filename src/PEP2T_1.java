import static utiles.Utilidades.*;

public class PEP2T_1 {
    public static void main(String[] args) {
        boolean salir = false;
        while (salir == false) {
            print("\t\t\t\t" + "Menú de opciones");
            print("\t\t\t\t" + "================\n");
            print("\t" + "1) Retirar");
            print("\t" + "2) Ingreso de dinero");
            print("\t" + "3) Salir");

            int opcion = (int) inputfloat("\n\t\t\t\t" + "Opción: ");

            float saldo = Float.parseFloat(args[0]);
            print("Su saldo actuales de %s", saldo);

            switch (opcion) {
                case 1:

                    Retirada(saldo, Integer.parseInt(args[1]));
                case 2:

                case 3:
            }
        }
    }
    public static int Retirada (float saldo, int tope){
        float retirar = (float) inputfloat("Itroduzca lo que desea retirar\n");
        print("Intenta retirar %s€", retirar);
        if (retirar < tope) {
            saldo = saldo - retirar;
        }
        else
        {
            print("Tiene establecido ahora un tope de %s€", tope);
        }
        print("Su saldo actual es de %s \n\n", saldo);
        return 10;
    }
}
