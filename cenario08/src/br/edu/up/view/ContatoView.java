package br.edu.up.view;

import br.edu.up.controller.ContatoController;
import br.edu.up.model.Agenda;
import br.edu.up.model.Comercial;
import br.edu.up.model.Pessoal;

import java.util.Scanner;

public class ContatoView {
    private final ContatoController _contatoController;
    private final Scanner _scanner;

    public ContatoView(){
        _contatoController = new ContatoController();
        _scanner = new Scanner(System.in);
    }

    public void NewPessoal(){
        System.out.println("Novo contato pessoal");
        System.out.println("Digite o código:");
        var codigo = _scanner.nextInt();
        _scanner.nextLine();
        System.out.println("Digite o nome:");
        var nome = _scanner.nextLine();
        System.out.println("Digite o telefone:");
        var telefone = _scanner.nextLine();
        System.out.println("Digite a data de aniversário:");
        var aniversario = _scanner.nextLine();

        _contatoController.AdicionarPessoal(codigo, nome, telefone, aniversario);

        System.out.println();
    }

    public void NewComercial(){
        System.out.println("Novo contato comercial");
        System.out.println("Digite o código:");
        var codigo = _scanner.nextInt();
        _scanner.nextLine();
        System.out.println("Digite o nome:");
        var nome = _scanner.nextLine();
        System.out.println("Digite o telefone:");
        var telefone = _scanner.nextLine();
        System.out.println("Digite o CNPJ:");
        var cnpj = _scanner.nextLine();

        _contatoController.AdicionarComercial(codigo, nome, telefone, cnpj);

        System.out.println();
    }

    public void ExcluirContato(){
        System.out.println("Digite o código do contato a ser exluído:");
        var codigo = _scanner.nextInt();
        _scanner.nextLine();

        if(_contatoController.ExcluirContato(codigo))
            System.out.println("Contato excluído!");
        else
            System.out.println("Nenhum contato foi excluído!");

        System.out.println();
    }

    public void BuscarContato(){
        System.out.println("Busca de contato");
        System.out.println("Digite o código do contato:");
        var codigo = _scanner.nextInt();
        _scanner.nextLine();

        var contato = _contatoController.BuscaContato(codigo);
        System.out.println("Código: " + contato.getCodigo());
        System.out.println("Nome: " + contato.getNome());
        System.out.println("Telefone: " + contato.getTelefone());
        if(contato instanceof Pessoal)
            System.out.println("Aniversário: " + ((Pessoal) contato).getAniversario());
        else
            System.out.println("CNPJ: " + ((Comercial) contato).getCnpj());

        System.out.println();
    }

    public void ListarContatos(){
        System.out.println(_contatoController.ListarContatos());
    }
}
