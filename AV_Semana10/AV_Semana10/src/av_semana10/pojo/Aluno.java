package av_semana10.pojo;

public class Aluno extends Pessoa {
    
    private int ra;
    private int periodo;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public void estadoAtual(){
        System.out.println("Aluno:");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("RA: "+this.getRa());
        System.out.println("Período: "+this.getPeriodo());
    }
    
}
