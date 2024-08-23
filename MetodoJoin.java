package metodo_join;

public class MetodoJoin {
    public static void main(String[] args) {
        MeuJoin thread1 = new MeuJoin("#1", 500);
        MeuJoin thread2 = new MeuJoin("#2", 800);
        MeuJoin thread3 = new MeuJoin("#3", 100);

        //Criando novos objetos da classe "Thread"
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();

        t2.start();

        t3.start();


        try {//O código "join()" irá esperar a finalização da execução de todos os objetos dentro deste try/catch para poder ou lançar uma exception ou seguir o fluxo do programa
            t1.join();
            t2.join();
            t3.start();
        } catch (InterruptedException erro) {
            erro.printStackTrace(); //  Caso dê algum erro, o printStackTrace() irá informar qual o erro e em qual linha ele foi encontrado
        }
        System.out.println("Programa finalizado!");
        
    }
}