
//Задание
//
//        1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//        2.Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.

//        Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

//Мешканцов Александр Сергеевич
public class Main {
    public static void main(String[] args){
        System.out.println("Развернули > " + Revers(createLinkedList(10,0,99)));
        System.out.println(" ");
        enqueue(createLinkedList(10,0,99), 5);
        System.out.println(" ");
        System.out.println("Первый элемент > " + dequeue(createLinkedList(10,0,99)));
        System.out.println(" ");
        System.out.println("Первый элемент > " + first(createLinkedList(10,0,99)));

    }
    public static Deque<Integer> createLinkedList(int size, int min, int max){
        Deque<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        return list;
    }
    public static Deque<Integer> Revers(Deque<Integer> list){
        System.out.println("Массив > " + list);
        Stack<Integer> list_new = new Stack<>();
        list_new.addAll(list);
        list.clear();
        while (!list_new.isEmpty())
            list.add(list_new.pop());
        return list;
    }
    public static void enqueue(Deque<Integer> list, int a){
        System.out.println("Массив > " + list);
        list.add(a);
        System.out.println("Добавили элемент в конец > " + list);
    }
    public static int dequeue(Deque<Integer> list){
        System.out.println("Массив > " + list);
        int a =  list.getFirst();
        list.removeFirst();
        System.out.println("Удалили первый элемент > " + list);
        return a;
    }
    public static int first(Deque<Integer> list){
        System.out.println("Массив > " + list);
        int a =  list.getFirst();
        return a;
    }
}