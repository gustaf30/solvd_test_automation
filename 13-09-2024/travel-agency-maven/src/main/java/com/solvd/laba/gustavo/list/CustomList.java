package com.solvd.laba.gustavo.list;

public class CustomList<T> {
    Node<T> head;

    public void remove(int i) {
        if (head == null) return;
        if (i == 0) {
            head = head.next;
        }

        Node<T> current = this.head;
        int currIndex = 1;

        while (current != null) {
            if (currIndex == i) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
            currIndex++;
        }
    }

    public void remove(Object o) {
        if (head == null) return;
        Node<T> current = head;

        while (current != null) {
            if (current.data.equals(o)) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
    }

    public void add(int index, T element) {
        Node<T> newNode = new Node<>(element);
        Node<T> current = head;

        if (index == 0) newNode.next = head;
        int currIndex = 1;

        while (current != null) {
            if (currIndex == (index - 1)) {
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
            currIndex++;
        }
    }

    public void addAtEnd(T element) {
        Node<T> newNode = new Node<>(element);
        Node<T> current = head;

        if (head == null) head = newNode;

        while (current != null) {
            if (current.next == null) {
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public void set(int index, T element) {
        Node<T> newNode = new Node<>(element);
        Node<T> current = head;

        if (index == 0) {
            newNode.next = head.next;
            head = newNode;
        }

        int currIndex = 1;

        while (current != null) {
            if (currIndex == (index - 1)) {
                newNode.next = current.next.next;
                current.next = newNode;
                break;
            }
            current = current.next;
            currIndex++;
        }
    }

    public T get(int index) {
        if (index == 0) return head.data;

        Node<T> current = head;

        int currIndex = 1;

        while (current != null) {
            if (currIndex == index) {
                return current.data;
            }
            current = current.next;
            currIndex++;
        }

        return null;
    }

    public void clear() {
        head = null;
    }
}
