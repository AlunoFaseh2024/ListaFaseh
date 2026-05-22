package br.edu.faseh.lista;


public class Main {
    public static void main(String[] args) {
        FasehList<Integer> myList = new FasehList<>();

        for (int i = 0; i < 10; i++) {
            myList.insertAtBeginning(i + 1);
            System.out.println(myList);
        }

        System.out.println(myList);

        Node<Integer> val = myList.removeAtBeginning();

        System.out.println(myList);

        System.out.println();

        System.out.println("Inserting data at the end");

        myList.insertAtTheEnd(2026);

        System.out.println(myList);

        System.out.println("\nA PARTIR DAQUI, O TERROR:");

        System.out.println("último Node: ");
        System.out.println(myList.seeTheLast());

        System.out.println("\nLista com item inserido a partir do último Node:");
        myList.lastNodeInsert(3030);

        System.out.println(myList);

        // Novos métodos
        // Inserindo elementos no fim
        myList.inserirNoFim(10);
        myList.inserirNoFim(20);
        myList.inserirNoFim(30);
        myList.inserirNoFim(40);

        System.out.println("Lista após inserir 10, 20, 30, 40:");
        System.out.println(myList);

        // Removendo elemento pela chave/valor
        myList.removerElemento(2026);

        System.out.println("\nLista após remover 2026:");
        System.out.println(myList);

        // Removendo outro elemento
        myList.removerElemento(3030);

        System.out.println("\nLista após remover 3030:");
        System.out.println(myList);
    }
}