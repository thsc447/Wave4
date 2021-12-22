package POO_II.classII.Ex01.entities;

import java.io.IOException;
import java.util.regex.Pattern;

public class Senha {
    private Pattern regex;

    public Senha(String regex) {
        Pattern matches = Pattern.compile(regex);
        this.regex = matches;
    }

    public void setValue(String pwd) throws IllegalAccessError {
        if(regex.matcher(pwd).find())
            System.out.println("Senha correta");
        else
            throw new IllegalAccessError("Digite uma senha mais forte!");
    }
}
