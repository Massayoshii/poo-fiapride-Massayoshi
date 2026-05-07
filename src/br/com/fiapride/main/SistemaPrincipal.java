package br.com.fiapride.main;

import br.com.fiapride.model.Celular;
import br.com.fiapride.model.Dono;

public class SistemaPrincipal {
    static void main() {
        Dono dono1 = new Dono("Massayoshi", 19);
        Celular meuCelular = new Celular("Iphone",100,dono1);
        meuCelular.ligar();
        meuCelular.carregarCelular(15);
        meuCelular.statusCelular();
        meuCelular.desligar();

        System.out.println("----------------------------------------");
        Dono dono2 = new Dono("Ygor", 36);
        Celular celularDoProfessor = new Celular("Samsung",75,dono2);
        celularDoProfessor.ligar();
        celularDoProfessor.carregarCelular(30);
        celularDoProfessor.statusCelular();
        celularDoProfessor.desligar();
    }
}
