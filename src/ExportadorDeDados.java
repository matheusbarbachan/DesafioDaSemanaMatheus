import java.util.ArrayList;
import java.io.*;

public class ExportadorDeDados {
    private String registroJogos;
    private ArrayList<Palpite> listaDePalpites;
    final static String nomeDoArquivo = "Files\\ArquivoDeJogos.txt";

    public String PlacarDeUmJogoParaString(int index) {
        return listaDePalpites.get(index).toString();

    }

    public void PlacarDeTodosOsJogosParaString(){
        for(int index = 0; index < listaDePalpites.size(); index++) {
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
