public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Testando Pilha");

        pilha novaPilha = new pilha();

        novaPilha.push(10);
        novaPilha.imprimirTodaPilha();
        novaPilha.push(10);
        novaPilha.push(5);
        novaPilha.push(35);
        novaPilha.push(0);
        novaPilha.push(2);
        novaPilha.verTopoPilha();
        novaPilha.pop();
        novaPilha.verTopoPilha();
        novaPilha.pop();
        novaPilha.pop();
        novaPilha.imprimirTodaPilha();






    }
}
