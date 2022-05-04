
package onibus;

public class cidades {
    
    private String NomeCidade;
    private String Estado;
    
    public cidades(){
        this("","");
    }
    
    public cidades(String NomeCidade){
        this(NomeCidade,"");
    }
    
    public cidades(String NomeCidade, String Estado) {
        setNomeCidade(NomeCidade);
        setEstado(Estado);
    }
    
    public String getNomeCidade() {
        return NomeCidade;
    }

    public void setNomeCidade(String NomeCidade) {
        this.NomeCidade = NomeCidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "\n Nome Cidade : " + NomeCidade + "\n Estado : " + Estado ;
    }
    
}
