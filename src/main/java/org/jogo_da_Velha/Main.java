package org.jogo_da_Velha;


public class Main {
    public static void main(String[] args) {
        String[][] tabuleiroDaVelha = new String[3][3];
        VerificaTabuleiro verificaTabuleiro = new VerificaTabuleiro(tabuleiroDaVelha);
        for(int i = 0; i < tabuleiroDaVelha.length; i++){
            for (int j = 0; j < tabuleiroDaVelha.length; j++){
                tabuleiroDaVelha[i][j] = "Velha";
            }
        }
        while(verificaTabuleiro.temVelha()){

        }

    }

}
