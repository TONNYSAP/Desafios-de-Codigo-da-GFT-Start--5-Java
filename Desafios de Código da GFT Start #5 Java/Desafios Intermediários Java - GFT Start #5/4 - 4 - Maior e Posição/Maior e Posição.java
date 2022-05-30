//Desafios Intermediários Java - GFT Start #5
//4 / 4 - Maior e Posição

/*
Desafio
Você recebeu o desafio de ler 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada
O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída
Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

 
Exemplo de Entrada	Exemplo de Saída
2
113
45
34565
6
...
8
 

34565
4
*/

import java.util.*;

public class MaiorPosicao {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<>();
    for(int i = 0; i < 100; i++){
      int numero = scan.nextInt();
      numeros.add(numero);
    }

    Integer max = Collections.max(numeros);
    System.out.println(max);
    int position = numeros.indexOf(max) +1;
    System.out.println(position);
  }
}