package br.com.Arquivo;
import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        String path = "C:/Users/12117040/IdeaProjects/TarefaArquivo/Agencia.txt";
        Banco.leitor(path);

        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do Cliente: ");
        Cliente c1  = new Cliente(nomeCliente);
        String nomeBanco = JOptionPane.showInputDialog("Digite o nome do Banco: ");
        Banco b1 = new Banco(nomeBanco);
    }


}