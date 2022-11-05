/*
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
A seguir mostre a variável PROD com mensagem correspondente.   

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. 
Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

Read two integer values. After this, calculate the product between them and store the result in a variable named PROD.
Print the result like the example below. Do not forget to print the end of line after the result, otherwise you will receive “Presentation Error”.

Input
The input file contains 2 integer numbers.

Output
Print the message "PROD" and PROD according to the following example, with a blank space before and after the equal signal.
*/

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int PROD = A * B;

        System.out.print("PROD = " + PROD + '\n');
    }
 
}
