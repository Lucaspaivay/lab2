package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public void defineHorasDescanso(int horas) {
        this.horasDescanso = horas;
    }

    public void defineNumeroSemanas(int semanas) {
        this.numeroSemanas = semanas;
    }

    public String getStatusGeral() {
        if (this.numeroSemanas == 0) {
            return "cansado";
        }

        int media = this.horasDescanso / this.numeroSemanas;

        if (media >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
}}

