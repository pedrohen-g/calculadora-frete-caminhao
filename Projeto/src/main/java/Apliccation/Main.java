package Apliccation;

import Model.Frete;
import Model.TipoFrete;
import Model.Veiculo;
import Service.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static int lerInteiroPositivo(Scanner sc, String mensagem){
        while (true) {
            try {
                System.out.print(mensagem);
                int valor = sc.nextInt();

                if (valor < 0 ){
                    System.out.println("Entrada inválida! Por favor, digite um número inteiro positivo.");
                    continue;
                }
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro válido.");
                sc.nextLine(); // Limpa o buffer do scanner
            }
        }
    }

    private static double lerDoublePositivo(Scanner sc, String mensagem){
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = sc.nextDouble();

                if (valor < 0 ){
                    System.out.println("Entrada inválida! Por favor, digite um número positivo.");
                    continue;
                }

                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número válido.");
                sc.nextLine(); // Limpa o buffer do scanner
            }
        }
    }

    public static void main(String[] args) {

        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        TipoFrete tipoFrete;
        Frete frete = new Frete();
        Veiculo veiculo = new Veiculo();

    while (true) {
        try {
            System.out.println("===========================================================");
            System.out.println("           \uD83D\uDE9A Calculadora de frete Rodoviário \uD83D\uDE9A");
            System.out.println("===========================================================\n");
            System.out.println("\uD83D\uDE9A INFORME OS DADOS DO VEÍCULO:\n");
            veiculo.setEixos(lerInteiroPositivo(sc, "Digite a quantidade de eixos do veículo: "));
            veiculo.setMediaConsumo(lerDoublePositivo(sc, "Digite a média de consumo do veículo (KM/L): "));
            veiculo.setCapacidadeCarga(lerDoublePositivo(sc,"Digite a capacidade de carga do veículo (TONELADAS): "));
            System.out.println("------------------------------------------------------------\n");

            System.out.println("\uD83D\uDCE6 INFORME OS DADOS DO FRETE:\n");
            frete.setCombustivel(lerDoublePositivo(sc,"Digite o preço do combustível por litro: "));
            frete.setDistancia(lerInteiroPositivo(sc, "Digite a distância total do frete (KM): "));
            System.out.println("Tipo de frete:\n" + "1 - Frete por KM\n" + "2 - Frete por Tonelada\n" + "3 - Frete por Carga");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida! Por favor, digite 1, 2 ou 3.");
                continue;
            }
            break;

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Por favor, digite um número válido.");
            sc.nextLine();
        }
    }
        switch (opcao) {
            case 1:
                //Calculadora por KM
                tipoFrete = TipoFrete.KM;
                frete.setTipoFrete(tipoFrete);
                frete.setPrecoFrete(lerDoublePositivo(sc, "Digite qual o valor do frete por KM: "));
                break;
            case 2:
                //Calculadora por Tonelada
                tipoFrete = TipoFrete.TONELADA;
                frete.setTipoFrete(tipoFrete);
                frete.setPrecoFrete(lerDoublePositivo(sc, "Digite qual o valor do frete por Tonelada: "));
                break;
            case 3:
                //Calculadora por Carga
                tipoFrete = TipoFrete.CARGA;
                frete.setTipoFrete(tipoFrete);
                frete.setPrecoFrete(lerDoublePositivo(sc, "Digite qual o valor do frete: "));
                break;
        }

        System.out.println("===========================================================");
        System.out.println("                        RESULTADO                        ");
        System.out.println("===========================================================\n");

        System.out.printf("\uD83D\uDCB0 Valor bruto do frete:        R$ %.2f\n", calculadora.calcularValorBruto(frete, veiculo));
        System.out.printf("⛽ Custo total com combustível: R$ %.2f\n", calculadora.custoTotalCombustivel(frete, veiculo));
        System.out.printf("\uD83D\uDD27 Custo total com desgaste:    R$ %.2f\n", calculadora.custoTotalDesgaste(frete, veiculo));
        System.out.printf("\uD83D\uDCC9 Custo total da viagem:       R$ %.2f\n\n", calculadora.custoTotalCombustivel(frete, veiculo) + calculadora.custoTotalDesgaste(frete, veiculo));

        System.out.printf("\uD83D\uDCB5 Valor líquido do frete:      R$ %.2f\n", calculadora.valorLiquido(frete, veiculo));

        System.out.printf("\uD83D\uDCCA Margem de lucro:            %.2f%%\n", calculadora.margemFrete(frete, veiculo));


        sc.close();
    }
}
