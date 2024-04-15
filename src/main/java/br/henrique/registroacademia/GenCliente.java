package br.henrique.registroacademia;

//Nome: Henrique Cesar Nogarini de Carvalho  RA: 2102374

import java.util.ArrayList;
import java.util.List;

public class GenCliente {

    Leitura read = new Leitura();
    private final List<Cliente> listaCliente = new ArrayList<>();

    public void addCliente(Cliente cliente) {
        int j = 1;
        while (j == 1) {
            try {            
                if (getCliente(cliente.getRG()) == null) {
                    listaCliente.add(cliente);
                    j = 0;
                } else {
                    System.out.println("Já existe esse cliente no sistema !!!");
                }

            } catch (NumberFormatException exception) {
                System.out.println("Número Inválido");
            }
        }
    }

    public Cliente getCliente(long rgCliente) {

        if (!listaCliente.isEmpty()) {
            for (int i = 0; i < listaCliente.size(); i++) {
                if (rgCliente == listaCliente.get(i).getRG()) {
                    return listaCliente.get(i);
                }
            }
        }
        return null;
    }

    public void removeCliente(long rg) {

        Cliente clienteA = getCliente(rg);

        if (clienteA == null) {
            System.out.println("Cliente não encontrado ! ");
        } else {
            listaCliente.remove(clienteA);
            System.out.println("O cliente " + clienteA.getNome() + " foi removido !");
        }
    }

    public void updateCliente(Cliente clienteB) {

        int j = 1;
        boolean teste = true;

        if (!listaCliente.isEmpty()) {
            for (int i = 0; i < listaCliente.size(); i++) {
                if (clienteB.getRG() == listaCliente.get(i).getRG()) {
                   
                    teste = false;
                    listaCliente.set(i,clienteB);
                }
            }
        }
        if(teste){
            System.out.println("Cliente não encontrado! ");
        }
    }

    public void imprimeCliente(){

        long RG = setRG();
        Cliente clienteC = getCliente(RG);

        if(clienteC != null){
            //Prints
            //Cliente
            System.out.println(("Tipo de Plano do Cliente : ") + clienteC.getTipodeplano());
            //Dados Formais
            System.out.println(("O Nome do Cliente é :  ") + clienteC.getNome());
            System.out.println(("O telefone é : ") + clienteC.getTelefone());
            System.out.println(("O RG é : : ") + clienteC.getRG());
            //Endereço
            System.out.println(("Cidade :  ") + clienteC.getEndereco().getCidade());
            System.out.println(("Rua :  ") + clienteC.getEndereco().getRua());
            System.out.println(("Bairro :  ") + clienteC.getEndereco().getBairro());
            System.out.println(("Número da Residência :  ") + clienteC.getEndereco().getNumero());
            //Meta
            System.out.println(("Objetivo :  ") + clienteC.getMeta().getObjetivo());
            System.out.println(("Tempo Disponível para treinar :  ") + clienteC.getMeta().getTempodetreino());
            System.out.println(("Personal ? :  ") + ((clienteC.getMeta()).isPersonal() ? "Sim" : "Não"));
            //Dados Corporais
            System.out.println(("Peso :  ") + clienteC.getDadosCorporais().getPeso());
            System.out.println(("Altura :  ") + clienteC.getDadosCorporais().getAltura());
            System.out.println(("Porcentagem de Gordura :  ") + clienteC.getDadosCorporais().getGordura());
            System.out.println(("Tipo de teste realizado :  ") + clienteC.getDadosCorporais().getTipodeteste());
            clienteC.interfaceDados();
        }
        else{
            System.out.println("Cliente de RG"+RG+" não encontrado");
        }
    }

    public void todosClientes(){

        int i = 1;

        System.out.println("Impressão de todos os Clientes ");
        for(i=0;i < listaCliente.size();i++){
            Cliente clientenumber = listaCliente.get(i);
            //Prints
            //Cliente
            System.out.println(("Tipo de Plano do Cliente : ") + clientenumber.getTipodeplano());
            //Dados Formais
            System.out.println(("O Nome do Cliente é :  ") + clientenumber.getNome());
            System.out.println(("O telefone é : ") + clientenumber.getTelefone());
            System.out.println(("O RG é : : ") + clientenumber.getRG());
            //Endereço
            System.out.println(("Cidade :  ") + clientenumber.getEndereco().getCidade());
            System.out.println(("Rua :  ") + clientenumber.getEndereco().getRua());
            System.out.println(("Bairro :  ") + clientenumber.getEndereco().getBairro());
            System.out.println(("Número da Residência :  ") + clientenumber.getEndereco().getNumero());
            //Meta
            System.out.println(("Objetivo :  ") + clientenumber.getMeta().getObjetivo());
            System.out.println(("Tempo Disponível para treinar :  ") + clientenumber.getMeta().getTempodetreino());
            System.out.println(("Personal ? :  ") + ((clientenumber.getMeta()).isPersonal() ? "Sim" : "Não"));
            //Dados Corporais
            System.out.println(("Peso :  ") + clientenumber.getDadosCorporais().getPeso());
            System.out.println(("Altura :  ") + clientenumber.getDadosCorporais().getAltura());
            System.out.println(("Porcentagem de Gordura :  ") + clientenumber.getDadosCorporais().getGordura());
            System.out.println(("Tipo de teste realizado :  ") + clientenumber.getDadosCorporais().getTipodeteste());
            clientenumber.interfaceDados();
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

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }
    
}
