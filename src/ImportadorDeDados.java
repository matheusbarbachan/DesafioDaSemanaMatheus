import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

public class ImportadorDeDados {

    private ArrayList<Palpite> palpitesImportados;
    private String nomeDoArquivo;
    private BufferedReader bufferedReader;
    private String linhaAtual
//    private FileReader fileReader;

    public void LerUmPalpiteDoArquivo(){
        bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new FileReader(nomeDoArquivo));
            if((linhaAtual = bufferedReader.readLine()) != null){
                linhaAtual = bufferedReader.readLine();
                CriaPalpiteAPartirDeLinhaDoArquivo(linhaAtual);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void CriaPalpiteAPartirDeLinhaDoArquivo(String linhaAtual) {
        for(int i = 0; i<linhaAtual.length();i++){
            
        }
    }


}
