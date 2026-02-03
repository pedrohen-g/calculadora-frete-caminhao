package Apliccation;

public class Calculadora {
    private double precoFreteKM = 0, precoFreteTonelada = 0, precoFreteCarga = 0;
    private double precoCombustivel;
    private double mediaConsumo;
    private double distancia;
    private double CapacidadeCarga;
    private double ValorBruto;
    private double ValorLiquido;
    private int eixos;
    private double custoKM = 0.13; //valor medio de desgaste por eixo seria R$ 0,13 com pneu e manuteção


    public void calcular() {
        double custoTotalCombustivel = (distancia / mediaConsumo) * precoCombustivel;
        double custoTotalDesgaste = distancia * custoKM * eixos;
        double custoTotal = custoTotalCombustivel + custoTotalDesgaste;

        //Cálculo do valor bruto do frete
        if (precoFreteKM > 0) {
            ValorBruto = distancia * precoFreteKM;
        } else if (precoFreteTonelada > 0) {
            ValorBruto = CapacidadeCarga * precoFreteTonelada;
        } else if (precoFreteCarga > 0) {
            ValorBruto = precoFreteCarga;
        }

        ValorLiquido = ValorBruto - custoTotal;

        System.out.printf("Custo total com combustível: R$ %.2f\n", custoTotalCombustivel);
        System.out.printf("Custo total com desgaste: R$ %.2f\n", custoTotalDesgaste);
        System.out.printf("Custo total da viagem: R$ %.2f\n", custoTotal);
        System.out.printf("Valor bruto do frete: R$ %.2f\n", ValorBruto);
        System.out.printf("Valor líquido do frete: R$ %.2f\n", ValorLiquido);
    }

    public Calculadora(int eixos, double distancia, double capacidadeCarga, double mediaConsumo, double precoFreteCarga, double precoCombustivel, double precoFreteTonelada, double precoFreteKM) {
        this.eixos = eixos;
        this.distancia = distancia;
        CapacidadeCarga = capacidadeCarga;
        this.mediaConsumo = mediaConsumo;
        this.precoFreteCarga = precoFreteCarga;
        this.precoCombustivel = precoCombustivel;
        this.precoFreteTonelada = precoFreteTonelada;
        this.precoFreteKM = precoFreteKM;
    }

    public Calculadora() {
    }

    public double getPrecoFreteKM() {
        return precoFreteKM;
    }

    public void setPrecoFreteKM(double precoFreteKM) {
        this.precoFreteKM = precoFreteKM;
    }

    public double getCapacidadeCarga() {
        return CapacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        CapacidadeCarga = capacidadeCarga;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getMediaConsumo() {
        return mediaConsumo;
    }

    public void setMediaConsumo(double mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }

    public double getPrecoFreteCarga() {
        return precoFreteCarga;
    }

    public void setPrecoFreteCarga(double precoFreteCarga) {
        this.precoFreteCarga = precoFreteCarga;
    }

    public double getPrecoCombustivel() {
        return precoCombustivel;
    }

    public void setPrecoCombustivel(double precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }

    public double getPrecoFreteTonelada() {
        return precoFreteTonelada;
    }

    public void setPrecoFreteTonelada(double precoFreteTonelada) {
        this.precoFreteTonelada = precoFreteTonelada;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
}