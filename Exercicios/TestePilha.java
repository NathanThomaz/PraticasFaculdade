public class TestePilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.imprimirPilha();
        
        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Removendo: " + pilha.pop());
        pilha.imprimirPilha();
    }
}