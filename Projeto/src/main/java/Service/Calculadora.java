package Service;

import Model.Frete;
import Model.Veiculo;

public class Calculadora {

    private static final double CUSTO_KM_EIXO = 0.13;


    public double custoTotalCombustivel(Frete frete, Veiculo veiculo){
        return (frete.getDistancia() / veiculo.getMediaConsumo()) * frete.getCombustivel();
    }

    public double custoTotalDesgaste(Frete frete, Veiculo veiculo){
        return frete.getDistancia() * CUSTO_KM_EIXO * veiculo.getEixos();
    }

    public double calcularValorBruto(Frete frete, Veiculo veiculo){
        double valorBruto = 0;
        switch (frete.getTipoFrete()) {
            case KM:
                valorBruto = frete.getDistancia() * frete.getPrecoFrete();
                break;
            case TONELADA:
                valorBruto = veiculo.getCapacidadeCarga() * frete.getPrecoFrete();
                break;
            case CARGA:
                valorBruto = frete.getPrecoFrete();
                break;
            default:
                return 0;
        }
        return valorBruto;
    }

    public double valorLiquido(Frete frete, Veiculo veiculo){
        double custoTotal = custoTotalDesgaste(frete, veiculo) + custoTotalCombustivel(frete, veiculo);
        return calcularValorBruto(frete, veiculo) - custoTotal;
    }

    public double margemFrete(Frete frete, Veiculo veiculo){
        double valorBruto = calcularValorBruto(frete, veiculo);
        double valorLiquido = valorLiquido(frete, veiculo);

        if(valorBruto == 0){
            return 0;
        }

        return (valorLiquido / valorBruto) * 100;
    }
}