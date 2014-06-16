public class Time {
    private String nome;
    private int gols;
    private boolean atHome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public boolean isAtHome() {
        return atHome;
    }

    public void setAtHome(boolean atHome) {
        this.atHome = atHome;
    }

    public String toString(){
        String tostring = "";
        if(atHome = true){
            tostring = this.getNome() + this.getGols();
        }else {
            tostring = this.getGols() + this.getNome();
        }

        return tostring;
    }
}
