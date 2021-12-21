package POO_I.classI.integrationI.entities;

public class StringConverter {
    public static char[] execute(int number){
        String contadorString = String.valueOf(number);
        return contadorString.toCharArray();
    }
}
