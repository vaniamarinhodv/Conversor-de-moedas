/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Stribus
 */
public class conversorMonetario {

    static final double taxaEuro = 0.00;//ponha o valor da taxa aq
    static final double taxaDolar = 0.00;//ponha o valor da taxa aq

    
    public static double calculaValor(double reais, int codigo ){
        double total = 0;
        /*VA FAZER - aqui vc coloca o calculo dos valores, ja fiz a maior parte do
         * seu trabalho acho que aq vc consegue. pois eh "if" e calculos como no C
         * 
         */

        return total ;
    }

    public static void main(String args) {
        
        //primeiramente criamos um objeto teclado que sera pro onde vc vai ler os valores
        Scanner teclado = new Scanner(System.in);
        double reais;
        int codigoMoeda;//boa pratica de programação, sempre defina as variaveis no inicio das funçoes


        System.out.println("Qual o valor em reais?");//primeiramente escreva na tela a pergunta
        reais = teclado.nextDouble();// depois leia a resposta
        System.out.println("Qual o codigo da moeda? 1 = euro, 2 dolar");
        codigoMoeda = teclado.nextInt();
        if (reais == 0) {
            System.out.println("Valor invalido! Digite um valor em reais, diferente de zero");
        }
        
        calculaValor(reais,codigoMoeda);

    }
}