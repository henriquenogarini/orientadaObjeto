package br.henrique.registroacademia;

//Nome: Henrique Cesar Nogarini de Carvalho  RA: 2102374

public class Meta {

    private String Objetivo;
    private float Tempodetreino;
    private boolean Personal;

    public Meta() {
    }

    public String getObjetivo() {
        return Objetivo;
    }

    public void setObjetivo(String objetivo) {
        Objetivo = objetivo;
    }

    public float getTempodetreino() {
        return Tempodetreino;
    }

    public void setTempodetreino(float tempodetreino) throws NegativeException {
        if(Tempodetreino < 0) {
            throw new NegativeException();
        }
        else{
            Tempodetreino = tempodetreino;
        }
    }

    public boolean isPersonal() {
        return Personal;
    }

    public void setPersonal(boolean personal) {
        Personal = personal;
    }
}
