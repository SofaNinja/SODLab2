package org.example;

public class Queue {
    private final int[] arr;
    private int start;
    private int end;
    private final int size;

    Queue(int size) {
        arr = new int[size];
        start = -1;
        end = -1;
        this.size = size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Черга пуста");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public void addNumber(int number) {
        if (isFull()) {
            System.out.println("Черга заповнена");
        } else {
            if (isEmpty()) {
                start = 0;
            }
            end++;
            arr[end] = number;
        }
    }

    public int deleteNumber() {
        if (isEmpty()) {
            System.out.println("Черга пуста");
            return -1;
        } else {
            int temp = arr[start];
            if (start == end) {
                start = -1;
                end = -1;
            } else {
                start++;
            }
            return temp;
        }
    }

    public boolean isEmpty() {
        return (start == -1 && end == -1);
    }

    public boolean isFull() {
        return (end == size - 1);
    }
}