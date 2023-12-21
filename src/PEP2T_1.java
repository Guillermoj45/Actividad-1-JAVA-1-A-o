import static utiles.Utilidades.*;

public class PEP2T_1 {
    public static void main(String[] args) {
        print("1) Retirar");
        print("2) Ingreso de dinero");
        print("3) Salir");
        char opcion = (char) input("Opción: ");
        float saldo = Float.parseFloat(args[0]);
        print("Su saldo actuales de %s", saldo);
        int retirar = (int) inputfloat("Itroduzca lo que desea retirar%n");
        Retirada(retirar,saldo,Integer.parseInt(args[1]));
    }
    public static int Retirada (int dineroRet,float disponible, int tope){
        print("Su saldo actual es de %s", disponible);

        print("%s %s %s", dineroRet, disponible, tope);
        return 10;
    }
}
