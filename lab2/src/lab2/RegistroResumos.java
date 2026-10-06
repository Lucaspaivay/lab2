package lab2;

public class RegistroResumos {
    private String[] temas;
    private String[] resumos;
    private int posicao;

    public RegistroResumos(int numeroDeResumos) {
        this.temas = new String[numeroDeResumos];
        this.resumos = new String[numeroDeResumos];
        this.posicao = 0;
    }

    public void adiciona(String tema, String resumo) {
        if (posicao < temas.length) {
            temas[posicao] = tema;
            resumos[posicao] = resumo;
            posicao++;
        }
    }

    public String[] pegaResumos() {
        String[] saida = new String[posicao];
        for (int i = 0; i < posicao; i++) {
            saida[i] = temas[i] + ": " + resumos[i];
        }
        return saida;
    }

    public String imprimeResumos() {
        String listaTemas = "";
        for (int i = 0; i < posicao; i++) {
            listaTemas += temas[i];
            if (i < posicao - 1) listaTemas += " | ";
        }
        return "- " + posicao + " resumo(s) cadastrado(s)\n"
                + "- " + listaTemas;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < posicao; i++) {
            if (temas[i].equalsIgnoreCase(tema)) {
                return true;
            }
        }
        return false;
    }

    public int conta() {
        return this.posicao;
    }
}
