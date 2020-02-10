package com.company;

public class Queue
{
    private int length;
    Node head;

    Queue(Task startQueue)
    {
        add(startQueue);
    }

    private int getLength()
    {
        return length;
    }
    public void add(Task newTask)
    {
        Node temp  = new Node();
        temp.singleTask = newTask;
        temp.next = null;
        if(head == null)
        {
            head = temp;
            head.tail = head;
        }
        else{
            head.tail.next = temp;
            head.tail = temp;
        }
        length++;
    }

    public int dequeue()
    {
        if(head == null)
            return -1;

        int deleted = head.singleTask.getTaskID();
        head = head.next;
        length--;
        return deleted; //returns taskID
    }


    class Node {
        Task singleTask;
        Node next;
        Node tail;

    }
}
