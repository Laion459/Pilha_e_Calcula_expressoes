public class Main {
    public void welcome(){
        System.out.println("\n\n########################################################################");
        System.out.println("#                       WELCOME                                        #");
        System.out.println("#  - Univali: Kobrasol - 05/05/2022                                    #");
        System.out.println("#  - Materia: Estrutura de dados - Trabalho M2 PILHA                   #");
        System.out.println("#  - Prof:    Alessandro Mueller                                       #");
        System.out.println("#  - Aluno:   Leonardo Dario Borges                                    #");
        System.out.println("########################################################################\n\n");
    }


    /**
     * Empilha 12 numeros na pilha
     * @param stack pilha a ser empilhado os numeros
     */
    public void stackUp(Stack stack){
        for (int i = 0; i < 12; i++){
            stack.push(i + 1000);
        }
    }

    /**
     * Desempilha 6
     * @param stack pilha onde será desempilhado 6 vezes
     */
    public void unStack(Stack stack){
        for (int i = 0; i < 6; i++){
            stack.pop();
        }
    }

    /**
     * Exercicio 01 Pilha
     */
    public void exercicio01_PILHA(){
        Main main = new Main();

        System.out.println("\n           * EXERCICIO 01 PILHA * \n");

        // Cria uma pilha
        Stack p = new Stack();
        System.out.println("------------------------------------------------------------------------");

        // verificar se uma pilha está vazia
        System.out.println(" - Verificar se uma pilha está vazia: " + p.isEmpty());
        // Adiciona 1 elemento a pilha para teste
        p.push(100);
        // Imprime também o elemento para teste.
        System.out.println(" - Verificar se uma pilha está vazia: " + p.isEmpty() +
                " [Elemento: " + p.getTop().getElement()+"]");
        System.out.println("------------------------------------------------------------------------");

        // Rrecuperar o número de elementos de uma pilha
        System.out.println(" - Rrecuperar o número de elementos de uma pilha: "  + p.numberOfElements());
        // Adiciona mais elementos para teste
        System.out.println("    * Adiciona mais elementos para teste * ");
        p.push(20);
        p.push(30);
        p.push(40);

        // Rrecuperar o número de elementos de uma pilha
        System.out.println(" - Rrecuperar o número de elementos de uma pilha: "  + p.numberOfElements());
        System.out.println("------------------------------------------------------------------------");


        // Verificar a ocorrência de um determinado elemento
        System.out.println("- Verificar a ocorrência de um determinado elemento: '100' " + p.checkTheOccurrence(100) );
        // Verifica elemento inexistente
        System.out.println("        * Verifica elemento inexistente * ");
        System.out.println("- Verificar a ocorrência de um determinado elemento: '1002' " + p.checkTheOccurrence(1002) );
        System.out.println("------------------------------------------------------------------------");

        // Recuperar o elemento de determinada posição
        System.out.println("- Recuperar o elemento de determinada posição: [2] Elemento: " + p.retrieveTheElement(2));
        System.out.println("    * Tenta recuperar o elemento de determinada posição inexistente para teste * ");
        System.out.println("- Recuperar o elemento de determinada posição: [inexistente] Elemento: " + p.retrieveTheElement(2222));
        System.out.println("------------------------------------------------------------------------");

        // Recupera o elemento do topo
        System.out.println("- Recupera o elemento do topo: " + p.elementTop());
        // Adiciona outro elemento para teste
        p.push(99);
        // Recupera novamento o valor do topo
        System.out.println("    * Insere mais um elemento para teste * ");
        System.out.println("- Recupera o elemento do topo: " + p.elementTop());
        System.out.println("------------------------------------------------------------------------");

        // Imprime a pilha antes das alterações para teste
        System.out.println("- Imprime a pilha antes das alterações para teste: ");
        p.showIII();
        System.out.println("------------------------------------------------------------------------");

        // Empilha 12 numeros
        System.out.println("- Empilha 12 numeros: ");
        main.stackUp(p);
        System.out.println("------------------------------------------------------------------------");

        // Imprime a pilha antes das alterações para teste
        System.out.println("- Imprime os elementos da pilha: ");
        p.showIII();

        // Desempilha 6 vezes
        System.out.println("- Desempilha 6 elementos: ");
        main.unStack(p);
        System.out.println("------------------------------------------------------------------------");

        // Mostra os elementos da pilha
        System.out.println("- Imprime os elementos da pilha: ");
        p.showIII();
        System.out.println("------------------------------------------------------------------------");
    }

    public void exercicio02_CALCULA_EXPRESSOES(){
        System.out.println("\n         * EXERCICIO 02 CALCULA EXPRESSÕES ARITMÉTICAS * \n");

        Expressions expressions = new Expressions();
        expressions.run();
    }

    public static void main(String[] args) {

        Main main = new Main();
        // Boas vindas / intro
        main.welcome();

        // Testes classe Pilha
        main.exercicio01_PILHA();


        // Teste classe expressões
        main.exercicio02_CALCULA_EXPRESSOES();
    }
}
