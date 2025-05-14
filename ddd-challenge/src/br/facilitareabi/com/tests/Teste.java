package br.facilitareabi.com.tests;

import br.facilitareabi.com.models.FacilitaReabi;
import br.facilitareabi.com.models.Menu;
import br.facilitareabi.com.models.Notificar;
import br.facilitareabi.com.models.Paciente;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Paciente paciente = new Paciente();
        Notificar notificar = new Notificar();
        Menu menu = new Menu();
        Consulta consulta = new Consulta();

        menu.cadastroObrigatorio(paciente);
        consulta.teleconsulta();


        notificar.notificar(consulta);





    }
}
