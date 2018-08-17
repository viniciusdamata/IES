package ies.modelo;

/**
 *
 * @author ra172172
 */
public class DisciplinaM {
    private int codDisciplina;
    private String nomeDisciplina;
    private int semestreDisciplina;
    private int cargaHorariaDisciplina;
  

    public DisciplinaM(int codDisciplina, String nomeDisciplina, int semestreDisciplina, int cargaHorariaDisciplina, int semestre) {
        this.codDisciplina = codDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.semestreDisciplina = semestreDisciplina;
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;

    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getSemestreDisciplina() {
        return semestreDisciplina;
    }

    public void setSemestreDisciplina(int semestreDisciplina) {
        this.semestreDisciplina = semestreDisciplina;
    }

    public int getCargaHorariaDisciplina() {
        return cargaHorariaDisciplina;
    }

    public void setCargaHorariaDisciplina(int cargaHorariaDisciplina) {
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;
    }

    public void printDisciplina(){
        System.out.println("Codigo disciplina: "+this.getCodDisciplina());
        System.out.println("Nome Disciplina: "+this.getNomeDisciplina());
        System.out.println("Semestre: "+this.getSemestreDisciplina());
        System.out.println("Carga horaria: "+this.getCargaHorariaDisciplina());
        System.out.println("_________________________________________________");
    }

    
    
    
    
    
    
}
