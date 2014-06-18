import java.util.ArrayList;

public class Palpiteiro {

    private String NomeDoPalpiteiro;

    private int pontos;
    public ArrayList<Palpite> palpites;

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }


    public int getNumerodePalpites() {
        return 0;
    }

    public void adicionaNovoPalpite(Palpite palpite){
        palpites.add(palpite);
    }

    public Palpite getPalpite(int index){
        return palpites.get(index);
    }

    public String getNomeDoPalpiteiro() {
        return NomeDoPalpiteiro;
    }

    public void setNomeDoPalpiteiro(String nomeDoPalpiteiro) {
        NomeDoPalpiteiro = nomeDoPalpiteiro;
    }

    public void importarDadosDoPalpiteiro(){
        ImportadorDeDados importadorDeDados = new ImportadorDeDados("Dados" + NomeDoPalpiteiro);
        this.palpites = importadorDeDados.LerDadosDoArquivo();
    }

    public void exportarDadosDoPalpiteiro(){
        ExportadorDeDados exportadorDeDados = new ExportadorDeDados("Dados" + NomeDoPalpiteiro);
    }
}
