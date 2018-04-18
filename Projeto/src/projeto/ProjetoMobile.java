/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Pacote do projeto
package projeto;
//Importando a classe Scanner

import java.util.Scanner;

/**
 *
 * @author brenda
 */
//Criando a classe
public class ProjetoMobile {

    //Criando um método para a classe
    public static void main(String[] args) {
        //Declarando a variável
        int opcao;
        //Declarando as variáveis da opção 4
        double mediageral = 0;
        double mediamasculino = 0;
        double mediafeminina = 0;
        int contadormasculino;
        int contadorfeminina;
        //Declarando a classe Scanner
        Scanner entrada = new Scanner(System.in);
        //Imprimindo as opções
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Divisão");
        System.out.println("4. Faixa Etária");
        System.out.println("5. Números Primos");
        System.out.println("6. Mudança de Base");
        System.out.println("7. Sair");
        //Imprimindo a variável opção
        System.out.println("Digite a opção desejada:");
        opcao = entrada.nextInt();
        //Declarando o comando switch e Verificando as possibilidades de resultados
        switch (opcao) {
            case 1:
                //Declarando as variáveis e Imprimindo as variáveis
                int n1;
                System.out.println("Digite o primeiro número:");
                n1 = entrada.nextInt();
                int n2;
                System.out.println("Digite o segundo número:");
                n2 = entrada.nextInt();
                //Imprimindo a variável soma
                System.out.println("A soma é:" + (n1 + n2));
                //Encerra o caso 1
                break;
            case 2:
                //Declarando as variáveis e Imprimindo as variáveis
                int num1;
                System.out.println("Digite o primeiro número:");
                num1 = entrada.nextInt();
                int num2;
                System.out.println("Digite o segundo número:");
                num2 = entrada.nextInt();
                //Imprimindo a variável subtração
                System.out.println("A subtração é:" + (num1 - num2));
                //Encerra o caso 2
                break;
            case 3:
                //Declarando as variáveis e Imprimindo as variáveis
                double numero1;
                System.out.println("Digite o primeiro número:");
                numero1 = entrada.nextDouble();
                double numero2;
                System.out.println("Digite o segundo número:");
                numero2 = entrada.nextDouble();
                if (numero2 == 0) {
                    //Imprimindo a variável numero2 se for 0
                    System.out.println("Não existe divisão por 0");
                } else {
                    //Imprimndo a variável divisão
                    System.out.println("A divisão é:" + (numero1 / numero2));
                }
                //Encerra o caso 3
                break;
            case 4:
                //Imprimindo a Faixa Etária
                System.out.println("+ + Faixa Etária ++");
                //Declrando as variáveis
                double mediaf = 0;
                double mediam = 0;
                //Declarando a variável e imprimindo a variável
                int quantidadepessoas = 0;
                System.out.println("Digite a quantidade de pessoas:");
                quantidadepessoas = entrada.nextInt();
                //Instrução for inicializa a variável i com valor inicial 0
                //Depois executa a variável até que i seja menor que quantidadepessoas
                //E por último incrementa i++
                for (int i = 0; i < quantidadepessoas; i++) {
                    //Declrando a variável idade e imprimindo a variável
                    int idade;
                    System.out.println("Informe a sua idade:");
                    idade = entrada.nextInt();
                    //Declarando a variável sexo com valor inicial 0 e imprimindo a variável
                    int sexo = 0;
                    System.out.println("Informe o seu sexo: (1) Feminina  (2) Masculino");
                    sexo = entrada.nextInt();
                    //Somar a idade das pessoas
                    mediageral = mediageral + idade;
                    //Se for o numero 1 vai imprimir o sexo feminina
                    if (sexo == 1) {
                        contadorfeminina = entrada.nextInt();
                        contadorfeminina++;
                        mediafeminina = mediafeminina + idade;
                        mediaf = mediafeminina / contadorfeminina;
                    } //Senão vai imprimir o número 2 que é o sexo masculino
                    else if (sexo == 2) {
                        contadormasculino = entrada.nextInt();
                        contadormasculino++;
                        mediamasculino = mediamasculino + idade;
                        mediam = mediamasculino / contadormasculino;
                    }
                    //Imprimir a media geral
                    System.out.println("A média geral é:" + mediageral / quantidadepessoas);
                    //Imprimir a media feminina
                    System.out.println("A média feminina é:" + mediaf);
                    //Imprimir a media masculino
                    System.out.println("A média masculino é:" + mediam);
                }
                //Encerra o caso 4
                break;
            case 5:
                int numprimo;
                int numdivisores = 0;
                System.out.println("Digite um número primo:");
                numprimo = entrada.nextInt();
                //Instrução for inicializa a variável x com valor inicial 1
                //Depois executa a variável até que x seja menor ou igual que numprimo
                //E por último incrementa x++
                for (int x = 1; x <= numprimo; x++) {
                    //Abriu o if para testar o resto da divisão para verificar se x é igual a 0
                    //Depois incrementa numdivisores++
                    if (numprimo % x == 0) {
                        numdivisores++;
                    }
                }
                //Se o numdivisores for igual a 2, imprime que é primo
                if (numdivisores == 2) {
                    System.out.println("O número digitado é primo");
                } //Senão imprime que não é primo
                else {
                    System.out.println("O número digitado não é primo");
                }
                //Declarando as variáveis
                //Sendo que a variável soma tem o valor inicial 0
                int soma = 0;
                int num;
                //Imprimindo a váriavel num
                System.out.println("Digite um número:");
                num = entrada.nextInt();
                //Instrução for inicializa a variável j com valor inicial 1
                //Depois executa a variável até que j seja menor ou igual que num
                //E por último incrementa j++
                for (int j = 1; j <= num; j++) {
                    //Declarando a variável contador com valor inicial 0
                    int contador = 0;
                    //Instrução for inicializa a variável i com valor inicial 1
                    //Depois executa a variável até que i seja menor ou igual que num
                    //E por último incrementa i++
                    for (int i = 1; i <= num; i++) {
                        //Abriu o if para testar o resto da divisão e verificar se é igual a 0
                        //Depois incrementa contador++
                        if (j % i == 0) {
                            contador++;
                        }
                    }
                    if (contador == 2) {
                        soma = soma + j;
                    }
                }
                //Imprimir o resultado
                System.out.println("O resultado da soma dos números primos do 1 até" + numprimo + "é:" + soma);
                //Encerra o caso 5        
                break;
            case 6:
                //Imprime para digitar binário e decimal
                System.out.println(" Digite (1) para número binário e (2) para número decimal");
                //Declarando a variável
                int binedec = entrada.nextInt();
                //Declarando o comando switch e Verificando as possibilidades de resultados
                switch (binedec) {
                    case 1:
                        System.out.println("Digite um número binário:");
                        String e = entrada.next();
                        int potencia = 0;
                        int decimal = 0;
                        for (int i = e.length() - 1; i >= 0; i--) {
                            //Match.pow retorna a base expoente
                            //charAt verifica todos os caracteres
                            decimal += Math.pow(2, potencia) * Character.getNumericValue(e.charAt(i));
                            //Incrementa potencia++ a uma unidade
                            potencia++;
                        }
                        //Imprimir o resultado do número decimal
                        System.out.println("O número em decimal é: " + decimal);
                    //Encerra o caso 1
                    case 2:
                        //Declarando as variáveis
                        int dec;
                        int modulo;
                        String binario = "";
                        //Imprimindo o valor do numero decimal
                        System.out.println("Digite um número decimal");
                        dec = entrada.nextInt();
                        //Executa uma comparação com a variável
                        while (dec > 0) {
                            modulo = (dec % 2);
                            binario = modulo + binario;
                            dec = dec / 2;
                        }
                        //Imprimir o resultado do número binário
                        System.out.println("O número em binário é: " + binario);

                }
                //Encerra o caso 6 
                break;
            case 7:
                //Imprime finalizando programa
                System.out.println("Finalizando o programa");
                //Sair do programa
                System.exit(0);
                //Encerra o caso 7
                break;
        }
    }

}
