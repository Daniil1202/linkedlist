//  Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет 
//  “перевернутый” список.

import java.lang.reflect.Array;
import java.util.LinkedList;

public class program4 {

       public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>(Array.aslist(1,3,4,6,8));
        System.out.println(reverse(ls));
    }


    public static LinkedList<Integer> reverse(LinkedList<Integer> ls) {
        LinkedList<Integer>rev_ls = new LinkedList<>();
        for (int i = ls.size()-1; i>0 ; i--) {
            rev_ls.add(ls.get(i));
            
        }
        return rev_ls;
    }
}

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

// public class program4 {

//     public static void main(String[] args) {

//         int[] list = { 3, 5, 7, 2, 4, 6 };

//         LinkedList<Integer> linkList = new LinkedList<>();
//         for (Integer temp : list) {
//             linkList.add(temp);
//         }

//         System.out.println(linkList);

//         enqueue(linkList, 9);
//         System.out.println(linkList);

//         System.out.println(dequeue(linkList));
//         System.out.println(linkList);

//         System.out.println(first(linkList));
//     }

//     public static void enqueue(LinkedList<Integer> list, int num) {
//         list.addLast(num);
//     }

//     public static int dequeue(LinkedList<Integer> list) {
//         int num = 0;
//         num = list.get(0);
//         list.remove(0);
//         return num;
//     }

//     public static int first(LinkedList<Integer> list) {
//         int num = 0;
//         num = list.get(0);
//         return num;
//     }
// }