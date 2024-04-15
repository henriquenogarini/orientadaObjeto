package br.henrique.registroacademia;

//Nome: Henrique Cesar Nogarini de Carvalho  RA: 2102374

public class Cliente extends DadosFormais{
    private String Tipodeplano;

    private final Meta meta = new Meta();
    private final DadosCorporais dadosCorporais = new DadosCorporais();

    public Cliente() {
    }

    public Meta getMeta() {
        return meta;
    }

    public DadosCorporais getDadosCorporais() {
        return dadosCorporais;
    }

    public String getTipodeplano() {
        return Tipodeplano;
    }

    public void setTipodeplano(String tipodeplano) {
        Tipodeplano = tipodeplano;
    }

    @Override
    public void interfaceDados() {
        super.interfaceDados();
        System.out.println(meta.getObjetivo());
        System.out.println(meta.getTempodetreino());
        System.out.println(meta.isPersonal());
        System.out.println(dadosCorporais.getAltura());
        System.out.println(dadosCorporais.getGordura());
        System.out.println(dadosCorporais.getPeso());
        System.out.println(dadosCorporais.getTipodeteste());
        System.out.println(Tipodeplano);
    }
}
