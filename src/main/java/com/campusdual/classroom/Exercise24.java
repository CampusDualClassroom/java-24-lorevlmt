package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {

    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Smith");
        queue.offer("Montessori");
        queue.offer("Peralta");
        queue.offer("House");

        return queue;
    }

    public static void printAndEmptyQueue(Queue<String> queue) {

        while (!queue.isEmpty()) {    //cuando la cola no está vacía
            System.out.println(queue.poll());   //esto recupera y elimina la cabeza de la cola
        }
    }

    public static void main(String[] args) {

        printAndEmptyQueue(createQueue());
    }

}
