
package onibus;

public class passageiros {
 
    private String Nome;
    private String Cpf;

    public passageiros(){
        this("","");
    }
    
    public passageiros(String Nome){
        this(Nome,"");
    }
    
    public passageiros(String Nome, String Cpf) {
        setNome(Nome);
        setCpf(Cpf);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    @Override
    public String toString() {
        return "\nNome : " + Nome + "\nCPF : " + Cpf ;
    }
    
}
