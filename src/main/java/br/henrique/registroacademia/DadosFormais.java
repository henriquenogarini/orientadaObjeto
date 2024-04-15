package br.henrique.registroacademia;

//Nome: Henrique Cesar Nogarini de Carvalho  RA: 2102374

public abstract class DadosFormais implements IDados {
    private String Nome;
    private long Telefone;
    private long RG;

    private final Endereco endereco = new Endereco();

    public DadosFormais() {
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public long getTelefone() {
        return Telefone;
    }

    public void setTelefone(long telefone) throws NegativeException {
        if(telefone < 0){
            throw new NegativeException();
        }
        else{
            Telefone = telefone;
        }
    }

    public long getRG() {
        return RG;
    }

    public void setRG(long RG) throws NegativeException {
        if(RG < 0) {
            throw new NegativeException();
        }
        else{
            this.RG = RG;
        }
    }

    @Override
    public void interfaceDados() {
        System.out.println("Print da Interface");
        if(Nome != null && Telefone != 0 && RG != 0){
            System.out.println(Nome);
            System.out.println(Telefone);
            System.out.println(RG);
        }
        else{
            System.out.println("Algum dos dados não foi preenchido corretamente");
        }
    }
}
