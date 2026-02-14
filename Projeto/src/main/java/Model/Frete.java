package Model;

public class Frete {
    private TipoFrete tipoFrete;
    private double precoFrete = 0;
    private double distancia;
    private double combustivel;

    public Frete(TipoFrete tipoFrete, double precoFrete, double distancia) {
        this.tipoFrete = tipoFrete;
        this.precoFrete = precoFrete;
        this.distancia = distancia;
    }

    public Frete() {
    }

    //Getters and Setters


    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public TipoFrete getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(TipoFrete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public void setPrecoFrete(double precoFrete) {
        this.precoFrete = precoFrete;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
