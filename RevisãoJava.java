import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.*;


public class RevisãoJava {



    public static void main(String[] args) {


     String nomePessoa;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double totalnota;
    double media;

    int cont = 1, tab;


    // exercicio 1 e 2

        System.out.println("Iniciando aplicação");
        System.out.println("Digite seu nome: ");

        Scanner teclado = new Scanner(System.in);

        nomePessoa = teclado.next();

        System.out.println("Olá "+ nomePessoa);

        System.out.print("Informe sua primeira nota : " );
        nota1 = teclado.nextDouble();

        System.out.print("Informe sua segunda nota : " );
        nota2 = teclado.nextDouble();

        System.out.print("Informe sua terceira nota : " );
        nota3 = teclado.nextDouble();

        System.out.print("Informe sua quarta nota : " );
        nota4 = teclado.nextDouble();



        media = (nota1+nota2+nota3+nota4)/4;

        System.out.println("Sua média em Matemática é: "+media);
        System.out.println("------------------------------------------------------------");

          // exercicio 3 tabuada
        System.out.println("Digite aqui qual tabuada da multiplicação vc gostaria de saber:");
        Scanner n = new Scanner(System.in);
        int var = n.nextInt();

        while (cont <= 10)
        {
            tab = var * cont;

            System.out.println(cont + " x " + var + " = " + tab);
            cont = cont + 1;
        }
        System.out.println("------------------------------------------------------------");

        //exercício 4
        double Area;
        double base;
        double altura1;
        double operacao;

        System.out.println("Para descobrir a Area de um triangulo, coloque as informaçôes do triangulo");
        Scanner calculo = new Scanner(System.in);
        System.out.print("Informe o valor da base: " );
        base = teclado.nextDouble();

        System.out.print("Informe o valor da altura: " );
        altura1 = teclado.nextDouble();

        operacao = (altura1*base)/2;

        System.out.println("A área do triangulo é : "+operacao);

        System.out.println("------------------------------------------------------------");

        //Como Cálcular a área de um quadrado

        double lado;
        double operacao1;

        System.out.println("Quer sabe quanto mede a área do quadrado? ");
        Scanner calculo1 = new Scanner(System.in);

        System.out.println("Informe qunato mede o lado do quadrado: ");
        lado = calculo1.nextDouble();

        operacao1 = (lado*lado);
        System.out.println("A área do quadrado é: "+operacao1);


        System.out.println("------------------------------------------------------------");

        //Índice  de Massa Corporal

       double altura ;
       double peso;
       double operacao2;
       double a;



        System.out.println("Saiba seu IMC");

        Scanner calculo2 = new Scanner(System.in);

        System.out.println("Informe sua altura : ");
        altura = calculo2.nextDouble();

        a = pow(altura,2);

        System.out.println("Informe seu peso: ");
        peso = calculo2.nextDouble();

        operacao2 = (peso/a);

        System.out.println("Seu IMC é : "+operacao2);




        System.out.println("------------------------------------------------------------");

        //Converta KM para Milhas.

        double quantMilhas;
        double quantKm;
        double divisao;


        System.out.println("Informe");

        Scanner calculo3 = new Scanner(System.in);

        System.out.println("Informe a quantidade de Km:");
        quantKm = calculo3.nextDouble();

        divisao = (quantKm/1.60934);

        System.out.println("Quantidade de milhas é : "+divisao);



        System.out.println("------------------------------------------------------------");

        //Converter meses para dias.
        int meses, dias,qtd;

        System.out.println("Digite o numero de meses a serem convertidos em dias :");

        meses =  teclado.nextInt();
        dias= 30;
        qtd = meses *dias ;

        System.out.println("A quantidade de dias que esses meses somados possuem é : " + qtd +" dias");


        System.out.println("------------------------------------------------------------");

        // TAREFA DO VIDEO


        double salario = 876.50;
        double totalImposto = 0;

        System.out.println("Exemplo demostrando controle de fluxo utilizando a variavel double");
        if(salario < 1000){
            totalImposto = salario * 0.05;

        }else if(salario >= 1000 && salario <2000){
            totalImposto = salario * 0.1;

        }else if(salario>=2000 && salario <4000){
            totalImposto = salario * 0.15;

        }else{
            totalImposto = salario * 0.2;
        }
        System.out.println("O total de imposto é :" + totalImposto);


        //1. O double tem mais precisão: pode representar mais casas decimais ou números inteiros maiores;
        //2. O double ocupa 32 bits a mais que o float (o dobro do espaço);
        //3. Dependendo do hardware, o cálculo de um ou outro será mais rápido. Placas de vídeo geralmente operam com floats, as mais novas, com doubles.





















    }
}
