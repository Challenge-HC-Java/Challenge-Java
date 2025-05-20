package br.facilitareabi.com.tests;

import br.facilitareabi.com.models.*;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);



        Consulta consulta = new Consulta();
        System.out.print("Deseja confirmar presença?: ");
        String resposta = leitor.nextLine();

        boolean confirmacao = resposta.equalsIgnoreCase("Sim");
        consulta.confirmarPresenca(confirmacao);
        consulta.atualizarStatusConsulta();


    }
}
