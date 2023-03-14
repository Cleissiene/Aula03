package br.com.newton.linguagem.aula03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Telefone {
//criar referência Contato que vai instanciar da classe Agenda

    Contato contato;
    //criar atributos
    public String marca;
    public String cor;

    //criar um método "Tocar" recebendo o parâmetro "estiloMusical"
    public void Tocar(String estiloMusical) {
        //System.out.println("Tocando " + estiloMusical);

        System.out.println((estiloMusical.equals("Pagode" )? "Só tocamos pagode"  : " É o que tem pra hoje"));


    }
    //Criar o método “Ligar” na classe Telefone, esse método deverá receber como
    //parâmetro o contato que deverá ser realizada a ligação.
    public void Ligar(Telefone tel, Contato pessoa) {

        System.out.println((tel.cor.equals("Preto")? contato.nome + " Ligando para " + pessoa.nome : " Operação Inválida"));

        //System.out.println("Ligando para " + contato.nome);
        //Modificar o método para ligar somente para o telefone Preto.

//            if(tel.cor.equals("Preto"))
//                System.out.println(this.contato.nome + " Ligando para " + pessoa.nome);
//            else
//                System.out.println("Operação Invalida");
    }

    //Modificar o mét0do "Ligar" para realizar chamada somente para o contato "Juliana"
    public void Ligar(Contato pessoa){
        System.out.println((contato.nome.equals("Juliana") ? contato.nome +  " Ligando para " + pessoa.nome : "Operação Inválida"));
    }


}