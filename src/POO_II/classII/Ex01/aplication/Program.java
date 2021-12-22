package POO_II.classII.Ex01.aplication;

import POO_II.classII.Ex01.entities.Senha;
import POO_II.classII.Ex01.entities.SenhaForte;
import POO_II.classII.Ex01.entities.SenhaFraca;
import POO_II.classII.Ex01.entities.SenhaMedia;

import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        Senha senhaFraca = new SenhaFraca("ˆ[0-9]*");
        Senha senhaMedia = new SenhaMedia("^[A-Za-z ]++,[A-Za-z ]++$");
        Senha senhaForte = new SenhaForte("(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$\"");

        try {
            senhaFraca.setValue("334353");
            senhaMedia.setValue("asdfvje.");
            senhaForte.setValue("Tjm$*%9493849");
        }catch (IllegalAccessError e){
            System.out.println(e.getMessage());
        }

    }
}
