package filapilha.deck;

public interface VetorI<T> {

    public void adicionar(T elemento);

    public void adicionar(int posicao, T elemento);

    public void remover(int posicao);

    public T buscar(int posicao);

    public int buscas(T elemento);

    public int tamanho();

    public void aumentarCapacidade();
}
