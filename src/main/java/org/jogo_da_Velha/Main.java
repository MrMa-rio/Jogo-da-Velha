package org.jogo_da_Velha;


import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] tabuleiroDaVelha = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        VerificaTabuleiro verificaTabuleiro = new VerificaTabuleiro();
        for(int i = 0; i < tabuleiroDaVelha.length; i++){
            for (int j = 0; j < tabuleiroDaVelha.length; j++){
                tabuleiroDaVelha[i][j] = String.valueOf (counter++);
            }
        }
        do{

            verificaTabuleiro.exibeTabuleiro(tabuleiroDaVelha);
            System.out.println("Escolha uma posição para o 'X': ");
            String playerX = scanner.nextLine();
            for (String[] a : tabuleiroDaVelha) {
                for (int j = 0; j < tabuleiroDaVelha.length; j++) {
                    if (Objects.equals((playerX), a[j])) {
                        a[j] = "X";
                        break;
                    }
                }
            }
            verificaTabuleiro.exibeTabuleiro(tabuleiroDaVelha);

            System.out.println("Escolha uma posição para o 'Y': ");
            String playerY = scanner.nextLine();
            for (String[] a : tabuleiroDaVelha) {
                for (int j = 0; j < tabuleiroDaVelha.length; j++) {
                    if (Objects.equals((playerY), a[j])) {
                        a[j] = "Y";
                        break;
                    }
                }
            }
            verificaTabuleiro.exibeTabuleiro(tabuleiroDaVelha);

//            tabuleiroDaVelha[1][1] = "T";
//            tabuleiroDaVelha[2][2] = "T";
//
//            tabuleiroDaVelha[0][1] = "O";
//            tabuleiroDaVelha[0][2] = "0";
//            tabuleiroDaVelha[1][2] = "0";
//
//            tabuleiroDaVelha[1][0] = "F";
//            tabuleiroDaVelha[2][1] = "F";
//            tabuleiroDaVelha[2][0] = "F";

            //verificaTabuleiro.exibeTabuleiroVazio(tabuleiroDaVelha);


        }while (verificaTabuleiro.temVelha(tabuleiroDaVelha));

    }

}
