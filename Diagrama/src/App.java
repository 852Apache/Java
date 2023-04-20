public class App {
    public static void main(String[] args) throws Exception {
      Filme filme = new Filme("Iron man", "Aventura", (short) 126, (short) 2008);
      System.out.println(filme.calcularDuracaoEmHoras());

      Data data = new Data((byte) 22, "setembro", (short)1960, "terça");
      System.out.println(data.toString());
    }
}
