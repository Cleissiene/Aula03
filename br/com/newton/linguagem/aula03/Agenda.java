package br.com.newton.linguagem.aula03;

public class Agenda {

    public static void main(String args[]){

//        criando um objeto telefone utilizando um construtor
//        sem parâmeto padrão
        Telefone telefone1 = new Telefone();
        Contato contato1 = new Contato();
        contato1.nome = "Cleissi";
        contato1.numero = "1111";
        telefone1.marca = "Xiaomi";
        telefone1.cor = "Rosa";

        Telefone telefone2 = new Telefone();
        Contato contato2 = new Contato();
        contato2.nome = "João";
        contato2.numero = "318989952";
        telefone2.marca = "iPhone";
        telefone2.cor = "Preto";

        Telefone telefone3 = new Telefone();
        Contato contato3 = new Contato();
        contato3.nome = "Carmen";
        contato3.numero = "3189871147";
        telefone3.marca = "S20";
        telefone3.cor = "Branco";

        Telefone telefone4 = new Telefone();
        Contato contato4 = new Contato();
        contato4.nome = "Juliana";


        telefone1.contato = contato1;
        telefone2.contato = contato2;
        telefone3.contato = contato3;
        telefone4.contato = contato4;

        //telefone1.Tocar( "Trap");// == sout Tocando + estiloMusical
//        System.out.println(telefone1.contato.nome);
//        System.out.println(telefone1.contato.numero);
//        System.out.println(telefone1.marca);
//        System.out.println(telefone1.cor);

        System.out.println("\n");

//        telefone2.Tocar("Samba");
//        System.out.println(telefone2.contato.nome);
//        System.out.println(telefone2.contato.numero);
//        System.out.println(telefone2.marca);
//        System.out.println(telefone2.cor);

        telefone3.Ligar(telefone2, contato2);

        telefone4.Ligar(contato1);

        telefone3.Tocar("Pagode");





    }

}