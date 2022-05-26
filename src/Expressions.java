import java.util.Scanner;

public class Expressions {

    private double x;
    private double y;
    private Stack stack = new Stack();
    private Stack stackResults = new Stack();

    private Stack stackConta = new Stack();

    public void start(){
        zero();
    }

    public void zero(){
        System.out.println(" +-*/ expressao aritmetica /*-+");

        while (!stack.isEmpty()){
            stack.pop();
        }

        try {
            double input = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("    # Digite um número: # ");
            input = sc.nextInt();

            stack.push(" " + input);
            stackConta.push(input);

        }catch (Exception e){
            System.out.println(" ** COMANDO INVALIDO (zero) ** ");
            zero();
        }
    }

    public void sum(){
        try {
            double input = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("    + Digite um número: + ");
            input = sc.nextDouble();
            double x = Double.parseDouble(stackConta.getTop().getElement().toString());
            stackResults.push(x + input);
            stackConta.push(x + input);

            stack.push(" + " + input);

        }catch (NumberFormatException e){
            System.out.println(" ** COMANDO INVALIDO ** ");
            sum();
        }
    }

    public void subtraction(){

        try {
            double input = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("    - Digite um número: - ");
            input = sc.nextDouble();
            double x = Double.parseDouble(stackConta.getTop().getElement().toString());
            stackResults.push(x - input);
            stackConta.push(x - input);

            stack.push(" - " + input);


        }catch (NumberFormatException e){
            System.out.println(" ** COMANDO INVALIDO ** ");
            sum();
        }
    }

    public void division(){

        try {
            double input = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("    / Digite um número: / ");
            input = sc.nextDouble();
            double x = Double.parseDouble(stackConta.getTop().getElement().toString());
            stackResults.push(x / input);
            stackConta.push(x / input);

            stack.push(" / " + input);

        }catch (NumberFormatException e){
            System.out.println(" ** COMANDO INVALIDO ** ");
            sum();
        }
    }

    public void multiplication(){

        try {
            double input = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("    * Digite um número: * ");
            input = sc.nextDouble();
            double x = Double.parseDouble(stackConta.getTop().getElement().toString());
            stackResults.push(x * input);
            stackConta.push(x * input);

            stack.push(" * " + input);

        }catch (NumberFormatException e){
            System.out.println(" ** COMANDO INVALIDO ** ");
            sum();
        }
    }

    public void equal(){
        System.out.println(stackResults.getTop().getElement());
    }

    public void portion(){
        System.out.println(" Portion elements: ");
        System.out.println();
        stackResults.showVI();
        System.out.println();
    }

    public void end(){
        System.out.println("FIM ENCERRANDO!");
        System.out.println("EXPRESSÃO: ");
        stack.showVI();
        System.exit(-1);
    }

    public void menu(int op){
        switch (op){
            case 1:
                start();
                break;

            case 2:
                zero();
                break;

            case 3:
                sum();
                break;

            case 4:
                subtraction();
                break;

            case 5:
                multiplication();
                break;

            case 6:
                division();
                break;

            case 7:
                portion();
                break;

            case 8:
                equal();
                break;

            case 9:
                end();
                break;

            default:
                System.out.println("    ** COMANDO INVÁLIDO **  ");
        }
    }

    public void run(){
        int input = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(
                            "[1] - INICIO               { inicializa o programa }\n" +
                            "[2] - ZERA                 { inicializa a expressão aritmética }\n" +
                            "[3] - SOMA (valor)         { soma valor com o valor da expressão aritmética }\n" +
                            "[4] - SUBTRAI (valor)      { subtrai valor do valor da expressão aritmética }\n" +
                            "[5] - MULTIPLICA (valor)   { multiplica o valor pelo valor da expressão aritmética }\n" +
                            "[6] - DIVIDE (valor)       { divide o valor da expressão aritmética pelo valor}\n" +
                            "[7] - PARCELAS             { exibe os valores de cada parcela da expressão aritmética }\n" +
                            "[8] - IGUAL                { exibe o resultado da avaliação da expressão aritmética }\n" +
                            "[9] - FIM                  { finaliza o programa } \n");

            input = sc.nextInt();
            menu(input);
        }while (input != 9);

    }

    //Faça um programa que, utilizando a classe pilha, implemente um editor onde
    //serão calculadas expressões aritméticas formadas por constantes numéricas (inteiras e/ou reais) e pelos
    //operadores de adição, subtração, multiplicação e divisão.
    //Os comandos disponíveis para calcular as expressões aritméticas são

    //INICIO { inicializa o programa }
    //ZERA { inicializa a expressão aritmética }
    //SOMA (valor) { soma valor com o valor da expressão aritmética }
    //SUBTRAI (valor) { subtrai valor do valor da expressão aritmética }
    //MULTIPLICA (valor) { multiplica o valor pelo valor da expressão aritmética }
    //DIVIDE (valor) { divide o valor da expressão aritmética pelo valor}
    //PARCELAS { exibe os valores de cada parcela da expressão aritmética }
    //IGUAL { exibe o resultado da avaliação da expressão aritmética }
    //FIM { finaliza o programa }


    //Emitir a mensagem ‘** COMANDO INVÁLIDO **’, caso seja digitado algum comando não disponível.
    //Para a expressão aritmética 3 + 5 – 1.00 + 10, tem-se a sequência de comandos
    //INICIO
    //ZERA
    //SOMA (3)
    //SOMA (5)
    //SUBTRAI (1.00)
    //SOMA (10)
    //IGUAL { exibe o valor 17.00 }
    //PARCELAS { exibe os valores 8, 7.00 e 17.00 }
    //FIM
}
