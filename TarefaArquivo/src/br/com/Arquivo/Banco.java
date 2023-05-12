package br.com.Arquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    static List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;

    }
    public double getSaldoTotal() {
        double saldoTotal = 0.0;
        for (Conta conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }

    public static void leitor(String path)  throws IOException{
    BufferedReader buffRead = new BufferedReader(new FileReader(path));
    String linha = "";
    while (true){
        if(linha!= null){
            String[] campos = linha.split(",");
            String agencia = campos[0];
            String numero = campos[1];
            double saldo = Double.parseDouble(campos[2]);
            Conta conta = new Conta(agencia, numero, saldo);
            contas.add(conta);
        }else break;
        linha = buffRead.readLine();
    }
    buffRead.close();
}



}
