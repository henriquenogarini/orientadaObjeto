package br.henrique.registroacademia;

//Nome: Henrique Cesar Nogarini de Carvalho  RA: 2102374

import br.henrique.registroacademia.Telas.FormAcademia;


public class Academia {

    public static final GenCliente gerenciaC = new GenCliente();
    public static final GenFuncionario genrenciaF = new GenFuncionario();
            
    public static void main(String[] args) {

      new FormAcademia().setVisible(true);

    }
}