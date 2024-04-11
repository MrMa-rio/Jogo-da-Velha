package org.jogo_da_Velha;

import java.util.Objects;

public class VerificaTabuleiro{
    String[][] tabuleiro;

    VerificaTabuleiro(String[][] tabuleiro){
        this.tabuleiro = tabuleiro;
    }
    boolean naVertical(String player){
        for(int i = 0; i <= 2; i++){
            if(Objects.equals(player, tabuleiro[i][0])){
                if(Objects.equals(player, tabuleiro[i][1])){
                    return Objects.equals(player, tabuleiro[i][2]);
                }
            }
        }
        return false;
    }
    boolean naHorizontal(String player){
        for(int i = 0; i <= 2; i++){
            if(Objects.equals(player, tabuleiro[0][i])){
                if(Objects.equals(player, tabuleiro[1][i])){
                    return Objects.equals(player, tabuleiro[2][i]);
                }
            }
        }
        return false;
    }
    boolean naSemiCruzEsqDir(String player){
        if(Objects.equals(player, tabuleiro[0][0])){
            if(Objects.equals(player, tabuleiro[1][1])){
                return Objects.equals(player, tabuleiro[2][2]);
            }
        }
        return false;
    }
    boolean naSemiCruzDirEsq(String player){
        if(Objects.equals(player, tabuleiro[0][2])){
            if(Objects.equals(player, tabuleiro[1][1])){
                return Objects.equals(player, tabuleiro[2][0]);
            }
        }
        return false;
    }
    boolean temVelha(){
        for (String[] strings : tabuleiro) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (Objects.equals("Velha", strings[j])) {
                    return true;
                }
            }
        }
        return false;
    }

}
