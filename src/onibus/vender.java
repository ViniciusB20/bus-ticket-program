package onibus;

public class vender extends passageiros {

    private String cidadeOrigem;
    private String CidadeDestino;
    private int poltrona;
    private String data;

    public vender() {

    }

    public vender(String Nome, String Cpf,String cidadeDestino,String cidadeOrigem, int poltrona, String data) {

        super(Nome, Cpf);
        this.poltrona = poltrona;
        this.data = data;
        this.CidadeDestino = cidadeDestino;
        this.cidadeOrigem = cidadeOrigem;

    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return CidadeDestino;
    }

    public void setCidadeDestino(String CidadeDestino) {
        this.CidadeDestino = CidadeDestino;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCidade Origem : " + cidadeOrigem + "\nCidadeDestino : " + 
                CidadeDestino + "\nPoltrona : " + poltrona + "\nData : " + data ;
    }

    

}
