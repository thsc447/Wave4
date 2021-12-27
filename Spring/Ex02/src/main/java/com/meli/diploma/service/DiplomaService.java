package com.meli.diploma.service;

import org.springframework.stereotype.Service;

@Service
public class DiplomaService {

    public static double media(Diploma payload){
        Double v1 = Double.parseDouble(payload.getPortugues());
        Double v2 = Double.parseDouble(payload.getFisica());
        Double v3 = Double.parseDouble(payload.getQuimica());
        Double v4 = Double.parseDouble(payload.getMatematica());
        return (v1+v2+v3+v4)/4;
    }

    public static boolean aprovado(Diploma payload){
        return media(payload) > 7;
    }

    public static boolean merito(Diploma payload){
        return media(payload) >= 9;
    }

    public static String obterDiploma(Diploma payload){
        String aprovado = DiplomaService.aprovado(payload) ? "Aprovado" : "Reprovado";
        String merito= DiplomaService.merito(payload) ? "Parabéns!!" : "";

        return "Aluno: " + payload.getNome() + "\n" +
                "Média: " + DiplomaService.media(payload) + "\n" +
                "Status: " + aprovado + "\n" +
                merito;


    }
}
