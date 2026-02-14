package Model;

public class Veiculo {
    private double mediaConsumo;
    private double capacidadeCarga;
    private int eixos;

    public Veiculo(double mediaConsumo, double capacidadeCarga, int eixos) {
        this.mediaConsumo = mediaConsumo;
        this.capacidadeCarga = capacidadeCarga;
        this.eixos = eixos;
    }

    public Veiculo() {
    }

    //Getters and Setters

    public double getMediaConsumo() {
        return mediaConsumo;
    }

    public void setMediaConsumo(double mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
}
