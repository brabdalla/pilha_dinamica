public class no {
    
    private int dados;
    private no proximo;

    public no(int dados){
        this.dados = dados;
        this.proximo = null;
    }

    public void setProximo(no enderecoProx){
        this.proximo = enderecoProx;
    }

    public int getDados(){
        return this.dados;
    }

    public no getProximo(){
        return this.proximo;
    }




}
