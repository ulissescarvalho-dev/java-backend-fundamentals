package com.ulisses.conditionals;

import java.util.Locale;
import java.util.Scanner;

/*
Ex08:
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
 */

public class IncomeTaxCalculator {

    public static void main(String[] args) {

        // Configura o ponto decimal como padrão
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double wage = sc.nextDouble();
        double tax = 0.0; // Inicializamos com 0

        // 1. BLOCO DE CÁLCULO (Apenas lógica matemática)
        if (wage <= 2000.0) {
            tax = 0.0;
        } else if (wage <= 3000.0) {
            tax = (wage - 2000.0) * 0.08;
        } else if (wage <= 4500.0) {
            tax = (1000.0 * 0.08) + (wage - 3000.0) * 0.18;
        } else {
            tax = (1000.0 * 0.08) + (1500.0 * 0.18) + (wage - 4500.0) * 0.28;
        }

        // 2. BLOCO DE SAÍDA (Apenas exibição do resultado)
        if (tax == 0.0) {
            System.out.println("free");
        } else {
            System.out.printf("R$ %.2f%n", tax);
        }

        sc.close();
    }

}
