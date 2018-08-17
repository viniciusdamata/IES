
package ies.modelo;

/**
 *
 * @author ra172172
 */ 
public class CursoM {
    private int codCurso;
    private String nome;
    private int numSemestre;
    private int CH;
    private char turno;

    public CursoM(int codCurso, String nome, int numSemestre, int CH, char turno) {
        this.codCurso = codCurso;
        this.nome = nome;
        this.numSemestre = numSemestre;
        this.CH = CH;
        this.turno = turno;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumSemestre() {
        return numSemestre;
    }

    public void setNumSemestre(int numSemestre) {
        this.numSemestre = numSemestre;
    }

    public int getCH() {
        return CH;
    }

    public void setCH(int CH) {
        this.CH = CH;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }
    
    public void printCursoM(){

        System.out.println("Codigo do curso: "+this.getCodCurso());
        System.out.println("Nome do curso: "+this.getNome());
        System.out.println("Numero do semestre: "+this.getNumSemestre());
        System.out.println("Horas aula: "+this.getCH());
        System.out.println("Turno: "+this.getTurno());
        System.out.println("_______________________________________________");
    }
    
    
    
    
    
    
}
