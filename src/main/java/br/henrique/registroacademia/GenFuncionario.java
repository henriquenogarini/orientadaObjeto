package br.henrique.registroacademia;

//Nome: Henrique Cesar Nogarini de Carvalho  RA: 2102374

import java.util.ArrayList;
import java.util.List;

public class GenFuncionario {

    Leitura read = new Leitura();
    private final List<Funcionario> listaFuncionario = new ArrayList<>();

    public void addFuncionario(Funcionario funcionario) {

        int j = 1;
        while (j == 1) {
            try {
                if (getFuncionario(funcionario.getRG()) == null) {
                    listaFuncionario.add(funcionario);
                    j = 0;
                } else {
                    System.out.println("Já existe esse funcionario no sistema !!!");
                }

            } catch (NumberFormatException exception) {
                System.out.println("Número Inválido");
            }
        }
    }

    public Funcionario getFuncionario(long rgFuncionario) {

        if (!listaFuncionario.isEmpty()) {
            for (int i = 0; i < listaFuncionario.size(); i++) {
                if (rgFuncionario == listaFuncionario.get(i).getRG()) {
                    return listaFuncionario.get(i);
                }
            }
        }
        return null;
    }

    public void removeFuncionario(long rg) {

        Funcionario funcionarioA = getFuncionario(rg);

        if (funcionarioA == null) {
            System.out.println("Funcionário não encontrado ! ");
        } else {
            listaFuncionario.remove(funcionarioA);
            System.out.println("O funcionário " + funcionarioA.getNome() + " foi removido !");
        }
    }

    public void updateFuncionario(Funcionario funcionarioB) {

        
        int j = 1;
        boolean teste = true;

        if (!listaFuncionario.isEmpty()) {
            for (int i = 0; i < listaFuncionario.size(); i++) {
                if (funcionarioB.getRG() == listaFuncionario.get(i).getRG()) {
                    teste = false;   
                    listaFuncionario.set(i,funcionarioB);
                }
            }
        }
        if(teste){
            System.out.println("Funcionário não encontrado ! ");
        }
    }

    public void imprimeFuncionario(){

        long RG = setRG();
        Funcionario funcionarioC = getFuncionario(RG);

        if(funcionarioC != null){
            //Prints
            //Funcionário
            System.out.println(("O funcionário trabalha na área : ") + funcionarioC.getAtua());
            System.out.println(("Tempo de trabalho em horas : ") + funcionarioC.getTempoutil());
            //Dados Formais
            System.out.println(("O Nome do funcionário é :  ") + funcionarioC.getNome());
            System.out.println(("O telefone é : ") + funcionarioC.getTelefone());
            System.out.println(("O RG é : : ") + funcionarioC.getRG());
            //Endereço
            System.out.println(("Cidade :  ") + funcionarioC.getEndereco().getCidade());
            System.out.println(("Rua :  ") + funcionarioC.getEndereco().getRua());
            System.out.println(("Bairro :  ") + funcionarioC.getEndereco().getBairro());
            System.out.println(("Número da Residência :  ") + funcionarioC.getEndereco().getNumero());
            funcionarioC.interfaceDados();
        }
        else{
            System.out.println("Funcionário de RG"+RG+" não encontrado");
        }
    }

    public void todosFuncionario(){

        int i = 1;

        System.out.println("Impressão de todos os Funcionários ");
        for(i=0; i < listaFuncionario.size(); i++){
            Funcionario funcionarionumber = listaFuncionario.get(i);
            //Prints
            //Funcionário
            System.out.println(("O funcionário trabalha na área : ") + funcionarionumber.getAtua());
            System.out.println(("Tempo de trabalho em horas : ") + funcionarionumber.getTempoutil());
            //Dados Formais
            System.out.println(("O Nome do funcionário é :  ") + funcionarionumber.getNome());
            System.out.println(("O telefone é : ") + funcionarionumber.getTelefone());
            System.out.println(("O RG é : : ") + funcionarionumber.getRG());
            //Endereço
            System.out.println(("Cidade :  ") + funcionarionumber.getEndereco().getCidade());
            System.out.println(("Rua :  ") + funcionarionumber.getEndereco().getRua());
            System.out.println(("Bairro :  ") + funcionarionumber.getEndereco().getBairro());
            System.out.println(("Número da Residência :  ") + funcionarionumber.getEndereco().getNumero());
            funcionarionumber.interfaceDados();
        }
    }

    public long setRG() {

        long RG = 1;
        int x = 1;
        while (x == 1) {
            try {
                RG = Long.parseLong(read.entDados("Qual o seu RG  ? "));
                x = 2;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Você digitou um valor inválido !");
            }
        }
        return RG;
    }
    
    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

}
