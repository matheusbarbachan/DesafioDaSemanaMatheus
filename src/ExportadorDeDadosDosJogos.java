import java.util.ArrayList;
import java.io.*;

public class ExportadorDeDadosDosJogos {
    private String registroJogos;
    private ArrayList<Palpite> jogos;
    final static String nomeDoArquivo = "Files\\ArquivoDeJogos.txt";

    public String PlacarDeUmJogoParaString(int index) {
        return jogos.get(index).getTime1().getNome()
                + " " +
               jogos.get(index).getTime1().getGols()
                + "_X_" +
               jogos.get(index).getTime2().getGols()
                + " " +
               jogos.get(index).getTime2().getNome();
    }

    public void PlacarDeTodosOsJogosParaString(){
        for(int index = 0; index < jogos.size(); index++) {
            registroJogos = registroJogos
            + "\n" +
            PlacarDeUmJogoParaString(index);
        }
    }

    public void exportar(){
        FileWriter fileWriter = null;
        this.PlacarDeTodosOsJogosParaString();
        try {

            fileWriter = new FileWriter(nomeDoArquivo);
            fileWriter.write(registroJogos);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
