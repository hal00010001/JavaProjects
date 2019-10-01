package av_semana10.pojo;

public class Professor extends Pessoa {
    
    private String formacao;
    private double salario;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void estadoAtual(){
        System.out.println("Professor:");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("Formação: "+this.getFormacao());
        System.out.println("Salário: "+this.getSalario());        
    }    
    
}
