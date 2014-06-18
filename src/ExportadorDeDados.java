import java.util.ArrayList;
import java.io.*;

public class ExportadorDeDados {
    private String registroJogos;
    private ArrayList<Palpite> listaDePalpites;
    public String nomeDoArquivo;

    public ExportadorDeDados(String nomeDoArquivo){
        this.setNomeDoArquivo(nomeDoArquivo);
        this.exportar();
    }

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

    public String getNomeDoArquivo() {
        return nomeDoArquivo;
    }

    public void setNomeDoArquivo(String nomeDoArquivo){
        this.nomeDoArquivo = nomeDoArquivo;
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
