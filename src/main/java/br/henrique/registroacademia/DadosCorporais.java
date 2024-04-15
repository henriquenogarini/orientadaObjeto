package br.henrique.registroacademia;

//Nome: Henrique Cesar Nogarini de Carvalho  RA: 2102374


public class DadosCorporais {

    private float Peso;
    private float Altura;
    private float Gordura;
    private String Tipodeteste;

    public DadosCorporais() {
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) throws NegativeException {
        if(peso < 0){
            throw new NegativeException();
        }
        else {
            Peso = peso;
        }
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float altura) throws NegativeException {
        if(altura < 0) {
            throw new NegativeException();
        }
        else {
            Altura = altura;
        }
        }

    public float getGordura() {
        return Gordura;
    }

    public void setGordura(float gordura) throws NegativeException {
        if(gordura < 0) {
            throw new NegativeException();
        }
        else{
            Gordura = gordura;
        }
    }

    public String getTipodeteste() {
        return Tipodeteste;
    }

    public void setTipodeteste(String tipodeteste) {
        Tipodeteste = tipodeteste;
    }
}
