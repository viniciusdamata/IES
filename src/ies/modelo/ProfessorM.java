package ies.modelo;

/**
 *
 * @author ra172172
 */
public class ProfessorM {
    private int codDocente;
    private String Pnome;
    private String Snome;
    private char titulacao;
    private String formacao;

    public ProfessorM(int codDocente, String Pnome, String Snome, char titulacao, String formacao) {
        this.codDocente = codDocente;
        this.Pnome = Pnome;
        this.Snome = Snome;
        this.titulacao = titulacao;
        this.formacao = formacao;
    }

    public int getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(int codDocente) {
        this.codDocente = codDocente;
    }

    public String getPnome() {
        return Pnome;
    }

    public void setPnome(String Pnome) {
        this.Pnome = Pnome;
    }

    public String getSnome() {
        return Snome;
    }

    public void setSnome(String Snome) {
        this.Snome = Snome;
    }

    public char getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(char titulacao) {
        this.titulacao = titulacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public void printProfessor(){
        System.out.println("Codigo do docente: "+this.getCodDocente());
        System.out.println("Nome: "+this.getPnome());
        System.out.println("Sobrenome: "+this.getSnome());
        System.out.println("titulacao: "+this.getTitulacao());
        System.out.println("Formação: "+this.getFormacao());
        System.out.println("___________________________________________");
    }
    
    
    
}
