package br.com.fiapride.model;

public class Iphone extends Celular {
    private double armazenamento;
    private boolean siriAtivada;

    public Iphone(String marca, int bateria, double armazenamento, boolean siriAtivada) {
        super(marca, bateria);
        this.setArmazenamento(armazenamento);
        this.siriAtivada = siriAtivada;
    }

    @Override
    public void statusCelular(){
        System.out.println("--- STATUS ---");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Bateria atual: " + this.getBateria() + "%");
        System.out.println("Armazenamento atual: "+ this.armazenamento + "gb");
        System.out.println("Siri Ativada: "+ this.siriAtivada);
    }

    public void usarSiri() {
        if (isLigado()) {
            System.out.println("E aí Siri...");
        } else {
            System.out.println("Iphone desligado");
        }
    }

    public void baixarAplicativo(String nome,double memoria){
        if (isLigado()){
            armazenamento -= memoria;
            System.out.println("Voce baixou o aplicativo "+ nome + " de " + memoria + "GB");
        }
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        if(armazenamento > 0 ){
            this.armazenamento = armazenamento;
        }else {
            System.out.println("Armazenamento invalido");
        }
    }

    public boolean isSiriAtivada() {
        return siriAtivada;
    }

    public void setSiriAtivada(boolean siriAtivada) {
        this.siriAtivada = siriAtivada;
    }
}
