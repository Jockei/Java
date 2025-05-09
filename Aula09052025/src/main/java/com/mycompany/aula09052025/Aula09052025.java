package com.mycompany.aula09052025;

public class Aula09052025 {

    public static void main(String[] args) {
        Ingresso I1 = new Ingresso(25);
        I1.imprime_valor();
        
        VIP V1 = new VIP(25);
        V1.valor_ingresso_VIP();
        
        Normal n1 = new Normal(25);
        n1.Imprimir_Ingresso_Normal();
    }
}
