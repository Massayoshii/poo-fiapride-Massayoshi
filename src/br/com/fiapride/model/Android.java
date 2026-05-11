package br.com.fiapride.model;

public class Android extends Celular{
    private String versaoAndroid;
    private double armazenamento;

    public Android(String marca, int bateria, String versaoAndroid, double armazenamento) {
        super(marca, bateria);
        this.setVersaoAndroid(versaoAndroid);
        this.setArmazenamento(armazenamento);

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

    public void statusCelular(){
        System.out.println("--- STATUS ---");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Bateria atual: " + this.getBateria() + "%");
        System.out.println("Versao Atual:"+this.versaoAndroid);
        System.out.println("Armazenamento:"+this.armazenamento);
    }

    public String getVersaoAndroid() {
        return versaoAndroid;
    }

    public void setVersaoAndroid(String versaoAndroid) {
        if(versaoAndroid != null && !versaoAndroid.isEmpty()){
            this.versaoAndroid = versaoAndroid;
        }
    }


    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        if(armazenamento > 0 ){
            this.armazenamento = armazenamento;
        }
    }
}

