package br.facilitareabi.com.models;

import java.util.Scanner;

public class Paciente extends Usuario {

    //atributos
    private String necessidade;


    public String getDeficiencia() {return necessidade;}

    public void setDeficiencia(String deficiencia) {this.necessidade = deficiencia;}

    //+informarNecessidade():VOID
    public void informarNecessidade() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Você tem algum tipo de condição ou necessidade de apoio específico que gostaria que soubéssemos para melhor te ajudar?");
        String resposta = leitor.nextLine();
        setNecessidadeApoio(resposta);//armazena a resposta do usuário no atributo
        System.out.println("Ok, essa informação foi registrada no seu perfil!");

    }
    // Método que agrupa os outros
    public void realizarCadastro() {
        cadastrarUsuario();
        exibirUsuario();
        dadoscorretos();
    }
}