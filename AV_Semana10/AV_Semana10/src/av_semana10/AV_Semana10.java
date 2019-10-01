package av_semana10;

import av_semana10.pojo.Aluno;
import av_semana10.pojo.Professor;

public class AV_Semana10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Professor pessoa1 = new Professor();
        pessoa1.setNome("Amanda Souza");
        pessoa1.setCpf(16409504942L);
        pessoa1.setFormacao("Doutorado");
        pessoa1.setSalario(6800.00);
        
        Aluno pessoa2 = new Aluno();
        pessoa2.setNome("Marcos Silva");
        pessoa2.setCpf(16409504942L);
        pessoa2.setRa(175689458);
        pessoa2.setPeriodo(3);
        
        pessoa1.estadoAtual();
        pessoa2.estadoAtual();
        
    }
    
}
