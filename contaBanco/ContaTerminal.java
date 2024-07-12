package edu.henrique.segundasemana.contaBanco;

import java.util.Scanner;

/**
 * <h1>ContaTerminal</h1>
 * Conta terminal é uma classe criada por meio de um projeto da DIO com objetivo de exercitar o conteúdo apresentado no módulo de Sintaxe da formação em JAVA da plataforma
 *
 * @author Henrique Rea
 * @version 1.0
 * @since 12/07/2024
 */

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String NomeCliente = sc.nextLine();
        System.out.println("Digite sua Agencia: ");
        String Agencia = sc.nextLine();
        System.out.println("Digite o número da Conta: ");
        int Numero = sc.nextInt();
        System.out.println("Digite o seu saldo: ");
        double Saldo = sc.nextDouble();

    System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");
    }
}
