import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ImportadorDeDados {

    private ArrayList<Palpite> palpitesImportados;
    private String nomeDoArquivo;
    private BufferedReader bufferedReader;
    private String linhaAtual;


    public ImportadorDeDados(String nomeDoArquivo) {
        this.setNomeDoArquivo(nomeDoArquivo);
        LerDadosDoArquivo();
    }

    public ArrayList<Palpite> LerDadosDoArquivo(){
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Palpite> palpites = new ArrayList<Palpite>();
        bufferedReader = null;
        try{
            bufferedReader = new BufferedReader(new FileReader(nomeDoArquivo));
            while((linhaAtual = bufferedReader.readLine()) != null){
                stringBuilder.append(bufferedReader.readLine());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        palpites = extraiListaDePalpitesDoTrechoDeString(stringBuilder.toString());
        return palpites;
    }

    public Time extraiTimeDeTrechoDeString(String string) {
        int gols;
        String nome;
        Time time =null;

        for(int i = 0; i<string.length();i++){
            String aux = null;

            if(Character.isDigit(string.charAt(i))){
                time = new Time(Integer.parseInt(string.substring(i,i)),aux);
            }else{
                aux.concat(Character.toString(string.charAt(i)));
            }
        }
        return time;
    }


    public Palpite extraiPalpiteDeTrechoDeString(String string){
        Time time1,time2 = null;

        Palpite palpite=null;
        String aux = "";
        for(int i = 0;i<string.length();i++){
            if(string.substring(i) == "X"){
                time1 = extraiTimeDeTrechoDeString(aux);
                time2 = extraiTimeDeTrechoDeString(string.substring(i+1,string.length()));
                palpite = new Palpite(time1,time2);
            }else{
                aux.concat(Character.toString(string.charAt(i)));
            }

        }
        return palpite;
    }

    public ArrayList<Palpite> extraiListaDePalpitesDoTrechoDeString(String string){
        ArrayList<Palpite> palpites = null;
        String aux ="";
        for(int i = 0;i<string.length();i++){
            if(string.substring(i) == "\n"){
                Palpite palpite = extraiPalpiteDeTrechoDeString(aux);
                palpites.add(palpite);
                aux = "";
            }else{
                aux.concat(Character.toString(string.charAt(i)));
            }
        }
        return palpites;
    }


    public void setNomeDoArquivo(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }
}
