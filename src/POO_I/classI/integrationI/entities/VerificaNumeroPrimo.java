package POO_I.classI.integrationI.entities;

public class VerificaNumeroPrimo {
    public static boolean execute(int numero) {
        boolean result = true;
        for (int i = numero - 1; i > 1; i--) {
            if (numero % i == 0) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}