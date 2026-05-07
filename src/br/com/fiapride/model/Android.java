package br.com.fiapride.model;

public class Android extends Celular{
    private String versaoAndroid;
    private String fabricante;
    private int armazenamento;

    public Android(String marca, int bateria, String versaoAndroid,  String fabricante, int armazenamento) {
        super(marca, bateria);
        this.setVersaoAndroid(versaoAndroid);
        this.setArmazenamento(armazenamento);
        this.setFabricante(fabricante);
    }

    public void usarGoogleAssistente() {
        if (isLigado()) {
            System.out.println("Ok Google...");
        } else {
            System.out.println("Android desligado");
        }
    }

    public void baixarAplicativo(String nome,double memoria) {
        armazenamento -= memoria;
        System.out.println("Voce baixou o aplicativo " + nome + " de " + memoria + "GB");
    }

    public void statusAndroid() {

        statusCelular();

        System.out.println("Fabricante: " + fabricante);
        System.out.println("Versão Android: " + versaoAndroid);
        System.out.println("-------------------------------");
    }

    public String getVersaoAndroid() {
        return versaoAndroid;
    }

    public void setVersaoAndroid(String versaoAndroid) {
        if(versaoAndroid != null && !versaoAndroid.isEmpty()){
            this.versaoAndroid = versaoAndroid;
        }
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        if(fabricante != null && !fabricante.isEmpty()){
            this.fabricante = fabricante;
        }
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        if(armazenamento > 0 ){
            this.armazenamento = armazenamento;
        }
    }
}

