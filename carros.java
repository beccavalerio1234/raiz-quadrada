package Aulas;

import java.util.HashMap;
import java.util.Map;

public class carros {

    public static void main(String[] args) {
        double valorCarro = 25000.0; // Você pode modificar esse valor conforme necessário

        // Calcula o preço final com desconto de 20% para compra à vista
        double precoFinalAvista = valorCarro * 0.8;

        // Define as quantidades de parcelas disponíveis
        int[] quantidadesParcelas = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60};

        // Define os percentuais de acréscimo para cada quantidade de parcelas
        Map<Integer, Integer> percentuaisAcrescimo = new HashMap<>();
        percentuaisAcrescimo.put(6, 3);
        percentuaisAcrescimo.put(12, 5);
        percentuaisAcrescimo.put(18, 7);
        percentuaisAcrescimo.put(24, 9);
        percentuaisAcrescimo.put(30, 11);
        percentuaisAcrescimo.put(36, 13);
        percentuaisAcrescimo.put(42, 15);
        percentuaisAcrescimo.put(48, 17);
        percentuaisAcrescimo.put(54, 19);
        percentuaisAcrescimo.put(60, 21);

        System.out.println("Tabela de Parcelamento:");
        System.out.println("=======================");
        System.out.println("Preço Final | Parcelas | Valor Parcela");
        System.out.println("-------------------------------------");

        // Calcula e imprime os valores para cada quantidade de parcelas
        for (int parcelas : quantidadesParcelas) {
            int acrescimo = percentuaisAcrescimo.get(parcelas);
            double valorParcela = calcularValorParcela(valorCarro, parcelas, acrescimo);
            System.out.printf("%.2f         | %d        | %.2f%n", precoFinalAvista, parcelas, valorParcela);
        }
    }

    public static double calcularValorParcela(double valorCarro, int parcelas, int acrescimo) {
        // Calcula o valor da parcela com acréscimo
        double valorParcela = valorCarro * (1 + acrescimo / 100.0) / parcelas;
        return valorParcela;
    }
}