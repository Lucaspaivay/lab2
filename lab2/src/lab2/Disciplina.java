package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudadas;
    private double[] notas;
    private int[] pesos;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudadas = 0;
        this.notas = new double[4];
        this.pesos = null; // média aritmética
    }

    public Disciplina(String nomeDisciplina, int numeroNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudadas = 0;
        this.notas = new double[numeroNotas];
        this.pesos = null; // média aritmética
    }

    public Disciplina(String nomeDisciplina, int numeroNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudadas = 0;
        this.notas = new double[numeroNotas];
        this.pesos = pesos;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudadas += horas;
    }

    public void cadastraNota(int nota, double valor) {
        this.notas[nota - 1] = valor;
    }

    private double calculaMedia() {
        double soma = 0;
        if (pesos != null) {
            int somaPesos = 0;
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i] * pesos[i];
                somaPesos += pesos[i];
            }
            return somaPesos > 0 ? soma / somaPesos : 0;
        }
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }

    public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }

    @Override
    public String toString() {
        double media = calculaMedia();
        return this.nomeDisciplina
                + " " + this.horasEstudadas
                + " " + this.notas.length
                + " " + media
                + " " + java.util.Arrays.toString(this.notas);
    }
}
