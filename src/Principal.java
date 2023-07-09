import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

public class Principal {
      public static void main(String[] args) {
            Filme filme1 = new Filme();

            filme1.setNome("O rei leão");
            filme1.setAnoDeLancamento(1995);
            filme1.setDuracaoEmMinutos(180);

            filme1.exibeFichaTecnica();
            System.out.println("Duração do Filme: " + filme1.getDuracaoEmMinutos());
            filme1.avalia(8);
            filme1.avalia(5);
            filme1.avalia(10);
            System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
            System.out.println(filme1.pegaMedia());

            System.out.println("----------------------------------------------------------");

            Serie lost = new Serie();
            lost.setNome("Lost");
            lost.setAnoDeLancamento(2000);
            lost.exibeFichaTecnica();
            lost.setTemporadas(10);
            lost.setEpisodiosPortemporada(10);
            lost.setMinutosPorEpisodio(50);

            System.out.println("Duração para marotonar Lost: " + lost.getDuracaoEmMinutos());

            Filme filme2 = new Filme();
            filme2.setNome("Avatar");
            filme2.setAnoDeLancamento(2023);
            filme2.setDuracaoEmMinutos(200);


            CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
            calculadora.inclui(filme1);
            calculadora.inclui(filme2);
            calculadora.inclui(lost);


            System.out.println(calculadora.getTempoTotal());

            FiltroRecomendacao filtro = new FiltroRecomendacao();
            filtro.filtra(filme1);
            filtro.filtra(filme2);

            Episodio episodio = new Episodio();
            episodio.setNumero(1);
            episodio.setSerie(lost);
            episodio.setTotalVisualizacoes(300);

            FiltroRecomendacao filtro = new FiltroRecomendacao();
            filtro.filtrar(favorito);
            filtro.filtrar(outro);
            filtro.filtrar(primeiro);

      }
}
