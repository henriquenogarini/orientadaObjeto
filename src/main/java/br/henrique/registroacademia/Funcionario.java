package br.henrique.registroacademia;

//Nome: Henrique Cesar Nogarini de Carvalho  RA: 2102374

public class Funcionario extends DadosFormais{

    private String Atua;
    private int Tempoutil;

    public Funcionario() { }

    public String getAtua() {
        return Atua;
    }

    public void setAtua(String atua) {
        Atua = atua;
    }

    public int getTempoutil() {
        return Tempoutil;
    }

    public void setTempoutil(int tempoutil) throws NegativeException {
        if(tempoutil < 0) {
            throw new NegativeException();
        }
        else {
            Tempoutil = tempoutil;
        }
    }
}
