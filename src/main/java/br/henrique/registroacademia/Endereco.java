package br.henrique.registroacademia;

//Nome: Henrique Cesar Nogarini de Carvalho  RA: 2102374

public class Endereco {
    private String Cidade;
    private String Rua;
    private String Bairro;
    private int Numero;

    public Endereco() {
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) throws NegativeException {
        if(numero < 0){
            throw new NegativeException();
        }
        else{
            Numero = numero;
        }
    }
}
