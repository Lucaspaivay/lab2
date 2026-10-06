package lab2;

public class RegistroTempoOnline {

    private String nomeDisciplina;
    private int tempoOnline;
    private int metaTempoOnline;
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.metaTempoOnline = 120;
        this.tempoOnline = 0;
    }

    public RegistroTempoOnline(String nomeDisciplina, int metaTempoOnline) {
        this.nomeDisciplina = nomeDisciplina;
        this.metaTempoOnline = metaTempoOnline;
        this.tempoOnline = 0;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        return this.tempoOnline >= this.metaTempoOnline;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoOnline + "/" + metaTempoOnline;
    }
}

