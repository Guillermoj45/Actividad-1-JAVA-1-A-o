import static utiles.Utilidades.print;
import static utiles.Utilidades.inputfloat;

public class PEP2T_1 {
    public static void main(String[] args) {
        datos datos1 = new datos(Float.parseFloat(args[0]),Float.parseFloat(args[1]));
        boolean salir = false;
        while (!salir) {
            print("\t\t\t\t" + "Menú de opciones");
            print("\t\t\t\t" + "================\n");
            print("\t" + "1) Retirar");
            print("\t" + "2) Ingreso de dinero");
            print("\t" + "3) Salir");

            int opcion = (int) inputfloat("\n\t\t\t\t" + "Opción: ");


            print("Su saldo actuales de %s", datos1.saldo);

            switch (opcion) {
                case 1:
                    Retirada(datos1);
                    break;
                case 2:
                    Ingresos(datos1);
                case 3:
                    salir = true;
                    break;
            }
        }
    }

    public static void Retirada (datos datos){
        float retirar = (float) inputfloat("Itroduzca lo que desea retirar\n");
        print("Intenta retirar %s€", retirar);
        if (retirar < datos.tope ) {
            datos.saldo -= retirar;
        }
        else
        {
            print("Tiene establecido ahora un tope de %s€", datos.tope);
        }
        print("Su saldo actual es de %s \n\n", datos.saldo);
    }

    public static void Ingresos (datos datos){
        float ingresar = (float) inputfloat("Teclee dinero\n");
        print("Usted ingresó %s€", ingresar);
        datos.saldo += ingresar;
        print("Su saldo actual es de %s€", datos.saldo);
    }

}
class datos{
    float saldo;
    float tope;
    public datos(float saldo1, float tope1){
        saldo = saldo1;
        tope = tope1;
    }
}
