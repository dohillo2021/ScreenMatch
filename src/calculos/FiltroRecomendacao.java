package calculos;

public class FiltroRecomendacao {
      private String recomendacao;

      public void filtra(Classificavel classificavel){
            if(classificavel.getClassificacao() >= 4) {
                  System.out.println("Está entre os preferidos do momento");
            } else if () {
                  System.out.println("Muito bem avaliado no momento!");
            }else {
                  System.out.println("Coloque na sua lista para assistir depois");
            }
      }
}
