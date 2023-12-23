/*m um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

Renda                           Imposto de Renda
de 0.00 a R$ 2000.00                Isento
de R$ 2000.01 até R$ 3000.00        8%
de R$ 3000.01 até R$ 4500.00        18%
acima de R$ 4500.00                 28%

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salary, incomeTax = 0, incomeTax8 = 0, incomeTax18 = 0, incomeTax28 = 0;

        System.out.print("Informe o salário: ");
        salary = sc.nextFloat();

        if (salary >= 0.0 && salary <= 2000.0)
            System.out.println("Isento");
        else if (salary >= 2000.01 && salary <= 3000.00) {
            incomeTax = salary * 0.08f;
        } else if (salary >= 3000.01 && salary <= 4500.00) {
            incomeTax8 = 1000.00f * 0.08f;
            incomeTax18 = (salary - 3000.00f) * 0.18f;
            incomeTax = incomeTax8 + incomeTax18;
        } else if (salary > 4500.00f) {
            incomeTax8 = 1000.00f * 0.08f;
            incomeTax18 = 1500.00f * 0.18f;
            incomeTax28 = (salary - 4500.00f) * 0.28f;
            incomeTax = incomeTax8 + incomeTax18 + incomeTax28;
        }

        System.out.printf("Imposto de renda: %.2f", incomeTax);
    }
}