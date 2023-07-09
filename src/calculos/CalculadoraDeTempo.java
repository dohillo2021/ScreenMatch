package calculos;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

public class CalculadoraDeTempo {
      private int tempoTotal;

      public int getTempoTotal() {
            return tempoTotal;
      }

      public void inclui(Titulo titulo) {
            System.out.println("Adicionando duração em minutos de " + titulo);
            tempoTotal += titulo.getDuracaoEmMinutos();
      }

//      public void inclui (Filme f){
//      tempoTotal += f.getDuracaoEmMinutos();
//      }
//
//      public void inclui(Serie s) {
//            this.tempoTotal += s.getDuracaoEmMinutos();
//      }
}
