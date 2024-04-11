package org.jogo_da_Velha;

import java.util.Objects;

public class VerificaTabuleiro{
    //String[][] tabuleiro;

    //VerificaTabuleiro(String[][] tabuleiro){
//        this.tabuleiro = tabuleiro;
//    }
    boolean naVertical(String player, String[][] tabuleiro){
        for(int i = 0; i <= 2; i++){
            if(Objects.equals(player, tabuleiro[i][0])){
                if(Objects.equals(player, tabuleiro[i][1])){
                    return Objects.equals(player, tabuleiro[i][2]);
                }
            }
        }
        return false;
    }
    boolean naHorizontal(String player, String[][] tabuleiro){
        for(int i = 0; i <= 2; i++){
            if(Objects.equals(player, tabuleiro[0][i])){
                if(Objects.equals(player, tabuleiro[1][i])){
                    return Objects.equals(player, tabuleiro[2][i]);
                }
            }
        }
        return false;
    }
    boolean naSemiCruzEsqDir(String player, String[][] tabuleiro){
        if(Objects.equals(player, tabuleiro[0][0])){
            if(Objects.equals(player, tabuleiro[1][1])){
                return Objects.equals(player, tabuleiro[2][2]);
            }
        }
        return false;
    }
    boolean naSemiCruzDirEsq(String player, String[][] tabuleiro){
        if(Objects.equals(player, tabuleiro[0][2])){
            if(Objects.equals(player, tabuleiro[1][1])){
                return Objects.equals(player, tabuleiro[2][0]);
            }
        }
        return false;
    }
    boolean temVelha(String[][] tabuleiro){
        int counter = 0;
        for (String[] strings : tabuleiro) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (Objects.equals(String.valueOf(counter++), strings[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void exibeTabuleiroVazio(String[][] tabuleiro) {
        for (int i = 0; i < tabuleiro.length; i++){
           if(i == 0){
               System.out.printf(String.format("""
                  %s  |  %s  |  %s

                  """, i,i+1, i+2 ));
           }
           else{
                System.out.printf(String.format("""
                  %s  |  %s  |  %s

                  """, i+2,i+3, i+4 ));
            }
        }
    }
    public void exibeTabuleiro(String[][] tabuleiro) {
        for (String[] strings : tabuleiro) {
            System.out.printf(String.format("""
                    %s  |  %s  |  %s

                    """, strings[0], strings[1], strings[2]));
        }
    }
}
