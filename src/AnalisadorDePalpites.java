import java.util.ArrayList;

public class AnalisadorDePalpites {
    private ArrayList<Palpite> jogos;//resultados Reais dos Jogos
    private ArrayList<Palpiteiro> palpiteiros;

    public void analisaPalpite(int index, Palpiteiro palpiteiro){
        if(jogos.get(index).getTime1().getGols() == palpiteiro.getPalpite(index).getTime1().getGols() &&
                jogos.get(index).getTime2().getGols() == palpiteiro.getPalpite(index).getTime2().getGols()){
            palpiteiro.setPontos(palpiteiro.getPontos() + 10);
        } else if (jogos.get(index).getTimeVencedor() == palpiteiro.getPalpite(index).getTimeVencedor()){
            palpiteiro.setPontos(palpiteiro.getPontos() + 5);
        }
    }

    public void analisaTodosOsPalpitesDeUmPalpiteiro(int posPalpiteiro){
        Palpiteiro palpiteiro = palpiteiros.get(posPalpiteiro);
        for(int i = 0;i < palpiteiro.palpites.size();i++)
            this.analisaPalpite(i, palpiteiro);
    }

    public void analisaTodosOsPalpitesDeTodosOsPalpiteiros(){
        for(int i = 0;i < palpiteiros.size();i++)
            this.analisaTodosOsPalpitesDeUmPalpiteiro(i);

    }

    public ArrayList<Palpite> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Palpite> jogos) {
        this.jogos = jogos;
    }

    public ArrayList<Palpiteiro> getPalpiteiros() {
        return palpiteiros;
    }

    public void setPalpiteiros(ArrayList<Palpiteiro> palpiteiros) {
        this.palpiteiros = palpiteiros;
    }

    public void addPlpiteiro(Palpiteiro palpiteiro){
        this.palpiteiros.add(palpiteiro);
    }

    public void exportarDadosPalpiteiros(){
        for(Palpiteiro p : palpiteiros){
            p.exportarDadosDoPalpiteiro();
        }
    }

    public void importarDadosPalpiteiros(){
        for(Palpiteiro p : palpiteiros){
            p.importarDadosDoPalpiteiro();
        }
    }

    public void importarJogos(){
        ImportadorDeDados importadorDeDados = new ImportadorDeDados("JogosReais.txt");
        this.jogos = importadorDeDados.LerDadosDoArquivo();
    }
}
