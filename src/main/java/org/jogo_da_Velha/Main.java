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
        while (verificaTabuleiro.temVelha(tabuleiroDaVelha)){

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

            if(verificaTabuleiro.naHorizontal("X", tabuleiroDaVelha) ||
            verificaTabuleiro.naVertical("X", tabuleiroDaVelha) ||
            verificaTabuleiro.naSemiCruzDirEsq("X", tabuleiroDaVelha) ||
            verificaTabuleiro.naSemiCruzEsqDir("X", tabuleiroDaVelha)) break;


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


            if(verificaTabuleiro.naHorizontal("Y", tabuleiroDaVelha) ||
                    verificaTabuleiro.naVertical("Y", tabuleiroDaVelha) ||
                    verificaTabuleiro.naSemiCruzDirEsq("Y", tabuleiroDaVelha) ||
                    verificaTabuleiro.naSemiCruzEsqDir("Y", tabuleiroDaVelha)) break;



        }

    }

}
