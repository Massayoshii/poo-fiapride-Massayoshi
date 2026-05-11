package br.com.fiapride.main;

import br.com.fiapride.model.Android;
import br.com.fiapride.model.Celular;
import br.com.fiapride.model.Iphone;

public class SistemaPrincipal {
    static void main() {
        Iphone iphone = new Iphone("Iphone15",100,120,false);
        iphone.ligar();
        iphone.usarSiri();
        iphone.baixarAplicativo("Tiktok",3.5);
        iphone.statusCelular();
        iphone.desligar();

        System.out.println("----------------------------------------");

        Android android = new Android("Samsung", 90, "Android 15",  90);
        android.ligar();
        android.usarGoogleAssistente();
        android.baixarAplicativo("WhatsApp" , 2.5);
        android.statusCelular();
        android.desligar();

    }
}
