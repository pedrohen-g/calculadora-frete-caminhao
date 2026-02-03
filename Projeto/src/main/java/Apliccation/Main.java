package Apliccation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Seja bem vindo a calculadora de frete!\nBy Pedro Henrique\n");
        System.out.println("Seu frete é por KM, TONELADA ou por carga? (Digite 1 KM, Tonelada 2 ou Carga 3):");
        int opcao = sc.nextInt();

        if(opcao == 1){
            //Calculadora por KM
            System.out.println("Digite qual o valor do frete por KM: ");
            calculadora.setPrecoFreteKM(sc.nextDouble());
        } else if (opcao == 2 ) {
            //Calculadora por Tonelada
            System.out.println("Digite qual o valor do frete por Tonelada: ");
            calculadora.setPrecoFreteTonelada(sc.nextDouble());
        } else if (opcao == 3) {
            //Calculadora por Carga
            System.out.println("Digite qual o valor do frete: ");
            calculadora.setPrecoFreteCarga(sc.nextDouble());
        }else{
            System.out.println("Opção inválida!");
            return;
        }

        System.out.println("Digite o preço do combustível por litro: ");
        calculadora.setPrecoCombustivel(sc.nextDouble());

        System.out.println("Digite a média de consumo do veículo (KM/L): ");
        calculadora.setMediaConsumo(sc.nextDouble());

        System.out.println("Digite a distância total do frete (KM): ");
        calculadora.setDistancia(sc.nextDouble());

        System.out.println("Digite a capacidade de carga do veículo (TONELADAS): ");
        calculadora.setCapacidadeCarga(sc.nextDouble());

        System.out.println("Digite a quantidade de eixos do veículo: ");
        calculadora.setEixos(sc.nextInt());



        calculadora.calcular();
        sc.close();
    }
}
