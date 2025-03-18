public class TesteListaString {
    public static void main(String[] args) {
        ListaArrayString lista = new ListaArrayString(4);
        lista.adicionar("Ana");
        lista.adicionar("Bruno");
        lista.adicionar("Carlos");
        lista.imprimirLista();

        int posicao = lista.buscar("Bruno");
        System.out.println("Posição de Bruno: " + posicao);
    }
}
