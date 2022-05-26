import java.util.Objects;

public class Stack {

    private Node top;
    private int counter;

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stack)) return false;
        Stack stack = (Stack) o;
        return getCounter() == stack.getCounter() && Objects.equals(getTop(), stack.getTop());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTop(), getCounter());
    }

    @Override
    public String toString() {
        return "Pile{" +
                "top=" + top +
                ", counter=" + counter +
                '}';
    }


    // Metodos públicos

    /**
     * Insere objetos a pilha
     * @param element elemento a ser inserido a pilha
     */
    public void push(Object element){
        Node node = new Node();
        node.setElement(element);
        node.setNext(top);
        setTop(node);
        counter++;
    }

    /**
     * Retira elementos da pilha
     * @return retorna o elemento que foi removido da pilha
     */
    public Object pop(){
        if (isEmpty()){
            return null;
        }
        Object aux = top.getElement();
        setTop(top.getNext());
        counter--;
        return aux;
    }

    /**
     * Verificar se uma pilha está vazia,
     * @return true se vazia ou false caso contrário
     */
    public boolean isEmpty(){
        return getCounter() == 0;
    }

    /**
     * Recuperar o número de elementos de uma pilha
     * @return retorna número de elementos da pilha
     */
    public int numberOfElements(){
        return getCounter();
    }


    /**
     * Recuperar o elemento do topo
     * @return retorna o elemento que esta no topo caso exista
     */
    public Object elementTop(){
        if (isEmpty()){
            return null;
        }
        return top.getElement();
    }

    /**
     * Apresenta a pilha e sua posição
     * @param stack pilha para mostrar seus elementos
     */
    public void show(Stack stack){
        	while (!stack.isEmpty()) {
          	System.out.println("[" +
                            stack.counter +
            		"] " +
                           stack.pop() );
          	}
    }

    /**
     * Apresenta os elementos da pilha
     * @param stack pilha para mostrar seus elementos
     */
    public void showII(Stack stack){
        while (!stack.isEmpty()) {
            System.out.println("[" + stack.pop() + "]");
        }
    }

    /**
     * Apresenta a pilha e sua posição
     */
    public void showIII(){
        Node aux = getTop();
        int i = 1;
        while (aux != null){
            System.out.println("[" + i + "]" + " Elemento: " + aux.getElement());
            i++;
            aux = aux.getNext();
        }
    }

    /**
     * Apresenta os elementos da pilha
     */
    public void showIV(){
        Node aux = getTop();
        while (aux != null){
            System.out.print(aux.getElement());
            aux = aux.getNext();
        }
    }

    /**
     * Apresenta a pilha e sua posição
     */
    public void showV(){
        Node aux = getTop();
        int i = 1;
        while (aux != null){
            System.out.print(aux.getElement() + ",");
            i++;
            aux = aux.getNext();
        }
    }

    /**
     * Apresenta a pilha e sua posição
     */
    public void showVI(){
        Node aux = getTop();
        int i = 1;
        Stack auxStack = new Stack();
        while (aux != null){
            i++;
            auxStack.push(aux.getElement());
            aux = aux.getNext();
        }
        auxStack.showVII();
    }

    /**
     * Apresenta a pilha e sua posição
     */
    public void showVII(){
        Node aux = getTop();
        int i = 1;
        while (aux != null){
            System.out.print(aux.getElement());
            i++;
            aux = aux.getNext();
        }
    }

    /**
     * Verificar a ocorrência de um determinado elemento
     * @param element elemento a ser verificado ocorrência na pilha
     * @return retorna true caso elento se encontre na pilha
     */
    public boolean checkTheOccurrence(Object element){
        Node aux = getTop();
        while (aux != null){
            if (aux.getElement().equals(element)){
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    /**
     * Recuperar o elemento de determinada posição
     * @param position posição do elemento que sera retornado
     * @return retorna o elemnto da posição indicada, caso não exista menssagem de erro e retorna -1.
     */
    public Object retrieveTheElement(int position){
        Node aux = getTop();
        int posAux = 1;
        while (aux != null){
            if (posAux == position){
                return aux.getElement();
            }
            posAux++;
            aux = aux.getNext();
        }
        System.out.println("ERROR! Posição não existe na pilha!");
        return -1;
    }
}