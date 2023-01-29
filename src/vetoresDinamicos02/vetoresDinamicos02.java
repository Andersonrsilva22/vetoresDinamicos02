package vetoresDinamicos02;

/* Faça um programa onde o usuario digite um número indeterminado de nomes e um telefone, como se fosse uma agenda de contatos 
 * simples. Usar 2 vetores dinamicos diferentes para armazenar os dados (um para nome e outro para telefone).
 * O programa deverÃ¡ dar a opçao de incluir, deletar ou buscar um nome na agenda.
 * Caso busque o nome, mostrar o telefone correspondente.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class vetoresDinamicos02 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> telefones = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        char op;
        String nome;
        int indice;
        do{
            System.out.println("Digite o nome do contato: ");
            nomes.add(entrada.nextLine());
            System.out.println("Digite o telefone do contato: ");
            telefones.add(entrada.nextInt());
            System.out.println("Deseja continuar? s/n: ");
            op = entrada.next().charAt(0);
            entrada.nextLine();// entrada 'vazia'
        }while(op == 's' || op == 'S');

        System.out.println(nomes);
        System.out.println(telefones);


        System.out.println("Digite o nome de um contato: ");
        nome = entrada.nextLine();
        if(nomes.contains(nome)){
            indice = nomes.indexOf(nome);
            System.out.println("Telefone de "+nome+": "+telefones.get(indice));
        } else{
            System.out.println("Contato inexistente!");
        }
        
    }
    
}
