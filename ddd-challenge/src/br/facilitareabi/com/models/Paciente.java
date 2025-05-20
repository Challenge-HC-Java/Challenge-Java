package br.facilitareabi.com.models;

import java.util.Scanner;

public class Paciente extends Usuario {

    // Métodos

    // Método que agrupa os outros
    public void realizarCadastro() {
        cadastrarUsuario();
        exibirUsuario();
        dadoscorretos();
    }
}