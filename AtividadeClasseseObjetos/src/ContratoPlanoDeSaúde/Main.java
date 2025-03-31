package ContratoPlanoDeSaúde;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando um titular
        Titular titular = new Titular("Sofia", "Rua A, 123", "24/09/2005", "Feminino", "12345");

        // Criando uma fatura
        Fatura fatura = new Fatura(500.00, "10/04/2025", 2.0, 0.1);

        // Criando um contrato
        Contrato contrato = new Contrato("C001", "01/04/2025", titular, new ArrayList<>(), fatura);
        
        // Criando um dependente e adicionando ao contrato
        Dependente dependente = new Dependente("Pedro", "Rua A, 123", "05/06/2006", "Masculino", "Conjugê");
        contrato.adicionarPessoa(dependente);

        // Criando um profissional de saúde
        ProfissionalSaude oftalmologista = new ProfissionalSaude("Roberto", "Oftalmologista");

        // Criando uma consulta
        Consulta consulta = new Consulta("29/03/2025", "Consulta oftalmológica", oftalmologista);

        // Exibindo informações
        System.out.println("Contrato: " + contrato.getNumero());
        System.out.println("Titular: " + contrato.getTitular().getNome() + "\nData de nascimento: " + contrato.getTitular().getDataDeNascimento());
        System.out.println("Dependente: " + dependente.getNome() + "\nData de nascimento: " + dependente.getDataDeNascimento() + "\nRelação com o titular: " + dependente.getrelacaoComTitular());
        System.out.println("Valor da Fatura: " + contrato.gerarFatura().getValorTotal());
        System.out.println("Histórico de consultas: " + consulta.getData() + "\nDescrição: " + consulta.getDescricao() + "\nProfissional :" + consulta.getProfissional());
    }
}


