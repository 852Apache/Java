public class Filme {
    private String titulo;
    private String genero;
    private short duracaoEmMinutos;
    private short anoDeLancamento;

    public Filme(String titulo, String genero, short duracaaoEmMinutos, short anoDeLancamento) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.anoDeLancamento = anoDeLancamento;
    }

    public float calcularDuracaoEmHoras() {
        float duracaoEmHoras = duracaoEmMinutos / 60;
        return duracaoEmHoras;
    }

    public String toString() {
        return "Titulo: " + titulo + "; Gênero: " + genero + "; Duração em minutos: " + duracaoEmMinutos + "; Ano de laçamento: " + anoDeLancamento ;
    }
}