package br.facilitareabi.com.models;

import java.util.Scanner;

public abstract class Usuario {

    // Atributos
    private String nome;
    private int idade;
    private String cpf;
    private String dataNascimento;
    private String telefone;
    private String email;

    // Getters e Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public String getDataNascimento() {return dataNascimento;}
    public void setDataNascimento(String dataNascimento) {this.dataNascimento = dataNascimento;}
    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    // Métodos

    // Cadastrar usuário
    public void cadastrarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDigite seu nome completo: ");
        this.nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        this.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite seu CPF: ");
        this.cpf = scanner.nextLine();
        System.out.println("Digite sua data de nascimento: ");
        this.dataNascimento = scanner.nextLine();
        System.out.println("Digite seu telefone: ");
        this.telefone = scanner.nextLine();
        System.out.println("Digite seu email: ");
        this.email = scanner.nextLine();
    }

    // Exibir dados do usuário
    public void exibirUsuario() {
        System.out.println(" \n==========================================");
        System.out.println("Seus dados de cadastro são: ");
        System.out.println("Nome completo: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de nascimento: " + getDataNascimento());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
    }

    // Confirmar se os dados estão corretos
    public void dadoscorretos() {
        Scanner leitor = new Scanner(System.in);
        System.out.println(" \n==========================================");
        System.out.println("Seus dados acima estão corretos? (Sim/Não) ");
        String resposta = leitor.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Ok, seu cadastro foi realizado!");
            System.out.println(" \n==========================================");
        } else {
            System.out.println("Tudo bem, digite novamente seus dados.");
            cadastrarUsuario();
            exibirUsuario();
            dadoscorretos();
        }
    }
}
