package com.mtdream.set_;

public class HashSetStructure {
    public static void main(String[] args) {
        // 模拟HashSet的底层（实际上就是HashMap的底层）
        // 1，创建一个数组，数组的类型是Node[]
        // 2.有些人直接把Node[]数组称为 表
        Node[] table = new Node[16];

        // 3.创建结点
        Node john = new Node("john", null);

        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;// 将jack 结点挂载到john
        Node rose = new Node("Rose", null);
        jack.next = rose;// 将rose 结点挂载到jack
        System.out.println("table=" + table);
    }
}
class Node { // 结点，存储数据，可以指向下一个结点，从而形成链表
    Object item; //存放数据
    Node next; // 指向下一个结点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
