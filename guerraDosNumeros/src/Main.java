/* Guerra dos Números
Crie uma função que receba uma matriz de números inteiros,
some os números pares e ímpares separadamente e retorne a diferença entre a soma dos números pares e ímpares.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("a diferença entre a soma dos números pares e ímpares é: " + guerraDosNumeros());
    }

    public static int guerraDosNumeros(){

        //int [] numeros = {2, 8, 7, 5};
        //int [] numeros = {12, 90, 75};
        int [] numeros = {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243};

        int pares = 0, impares = 0, diferenca;

        for ( int i = 0; i < numeros.length; i++ ){
            if (numeros[i] % 2 == 0){
                pares += numeros[i];
            }
            else{
                impares += numeros[i];
            }
        }

        if (pares > impares){
            diferenca = pares - impares;
        }
        else {
            diferenca = impares - pares;
        }

        return diferenca;
    }
}