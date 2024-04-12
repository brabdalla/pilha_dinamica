public class pilha {
    private no topoPilha;

    public pilha(){
        this.topoPilha = null;
    }

    public void push(int dados){
        no novoNo = new no(dados);
        if (this.topoPilha == null) {
            this.topoPilha = novoNo;
        } else {
            novoNo.setProximo(this.topoPilha);
            this.topoPilha = novoNo;
        }
    }

    public void pop(){
        no noAux;
        if (this.topoPilha == null) {
            System.out.println("A pilha está vazia.");
        } else {
            noAux = this.topoPilha;
            this.topoPilha = noAux.getProximo();
            System.out.println("O valor excluido é:"+noAux.getDados());
        }

    }

    public void verTopoPilha(){
        System.out.println("O valor armazenado no topo da pilha é :"+this.topoPilha.getDados());
    }

    public void imprimirTodaPilha(){
        no auxNo = this.topoPilha;
        while (auxNo != null) {
            System.out.println(auxNo.getDados());
            auxNo = auxNo.getProximo();    
        }
    }




    



}
