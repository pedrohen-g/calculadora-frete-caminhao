package Apliccation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static int lerInteiroPositivo(Scanner sc, String mensagem){
        while (true) {
            try {
                System.out.println(mensagem);
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
                System.out.println(mensagem);
                double valor = sc.nextDouble();

                if (valor < 0 ){
                    System.out.println("Entrada inválida! Por favor, digite um número inteiro positivo.");
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

    while (true) {
        try {
            System.out.println("Seja bem vindo a calculadora de frete!\nBy Pedro Henrique\n");
            System.out.println("Seu frete é por KM, TONELADA ou por carga? (Digite 1 KM, Tonelada 2 ou Carga 3):");
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
        if(opcao == 1){
            //Calculadora por KM
            calculadora.setPrecoFreteKM(lerDoublePositivo(sc, "Digite qual o valor do frete por KM: "));
        } else if (opcao == 2 ) {
            //Calculadora por Tonelada
            calculadora.setPrecoFreteTonelada(lerDoublePositivo(sc, "Digite qual o valor do frete por Tonelada: "));
        } else if (opcao == 3) {
            //Calculadora por Carga
            calculadora.setPrecoFreteCarga(lerDoublePositivo(sc, "Digite qual o valor do frete: "));

        }

        calculadora.setPrecoCombustivel(lerDoublePositivo(sc,"Digite o preço do combustível por litro: "));

        calculadora.setMediaConsumo(lerDoublePositivo(sc, "Digite a média de consumo do veículo (KM/L): "));

        calculadora.setDistancia(lerInteiroPositivo(sc, "Digite a distância total do frete (KM): "));

        calculadora.setCapacidadeCarga(lerDoublePositivo(sc,"Digite a capacidade de carga do veículo (TONELADAS): "));

        calculadora.setEixos(lerInteiroPositivo(sc, "Digite a quantidade de eixos do veículo: "));



        calculadora.calcular();


        System.out.printf("Custo total com combustível: R$ %.2f\n", calculadora.getCustoTotalCombustivel());
        System.out.printf("Custo total com desgaste: R$ %.2f\n", calculadora.getCustoTotalDesgaste());
        System.out.printf("Custo total da viagem: R$ %.2f\n", calculadora.getCustoTotal());
        System.out.printf("Valor bruto do frete: R$ %.2f\n", calculadora.getValorBruto());
        System.out.printf("Valor líquido do frete: R$ %.2f\n", calculadora.getValorLiquido());

        sc.close();
    }
}
