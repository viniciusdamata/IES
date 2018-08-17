
package ies.controle;

import ies.modelo.CursoM;
import java.util.ArrayList;

/**
 *
 * @author ra172172
 */
public class CursoC {
   private ArrayList<CursoM> cursoArray;
   

   public CursoC(){
       this.cursoArray = new ArrayList<>();
   }
   
    /**
     *
     * @param c
     */
    public void cadastroCurso(CursoM c){
       cursoArray.add(c);
    }

    /**
     *
     * @param codCurso
     */
    public void excluirCurso(int codCurso){
        boolean controle = false;
        
        for (int i = 0; i < cursoArray.size() && !controle; i++) {
            if(codCurso == cursoArray.get(i).getCodCurso()){
                cursoArray.remove(i);
                controle = true;
            }
        }
        System.out.println((!controle) ? "codigo nao encontrado! ": "Curso removido!  ");
    }
    
    public int buscaCurso(int codDocente){
       
        
    }
    
    public void imprimeCurso(int indice){
        
    }
    

}
