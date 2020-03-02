package com.company;
import java.lang.Math;

import static java.lang.Math.abs;

public class Queue
{
    private int length;
    Node head;

    Queue()
    {
        head = null;
       // head.tail = null;
       // head.singleTask = null;
    }
    Queue(Task startQueue)
    {
        add(startQueue);
    }

    int getLength()
    {
        return length;
    }

    public void printQueue()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.singleTask.getTaskCreator());
            temp = temp.next;
        }
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
            head.tail = head.tail.next;
            head.tail.next = null;
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
    public int dequeue(Task delete)
    {
        int count = 0;
        if(head == null)
            return -1;
        Node temp = head;
        if(temp.singleTask.getTaskID() == delete.getTaskID())
        {
            if(temp.next == null) {
                head = null;
                return 1;
            }
            head = head.next;
        }
        else {
            while (temp.next != null) {
                if (temp.next.singleTask.getTaskID() == delete.getTaskID()) {
                    if (temp.next == head.tail) {
                        head.tail = temp;
                        head.tail.next = null;
                    } else
                        temp.next = temp.next.next;
                    return count;
                }
                temp = temp.next;
                count++;
            }
        }
        return -1;
    }

    public int move(Task priority, int position)
    {
        Node temp = head;
        int check = dequeue(priority);
        if(check == -1)
            return -1;
        if(head == null) {
            head.singleTask = priority;
            head.next = null;
            head.tail = head;
        }
        else if(position == 0)
        {
            temp.singleTask = priority;
            temp.next = head;
            head = temp;
        }
        else if(position > 0)
        {
            int count = 0;
            Node temp2 = new Node();
            temp2.singleTask = priority;

            while(temp.next != null)
            {
                if(count == position-1)
                {
                    temp2.next = temp.next;
                    temp.next = temp2;
                }
                temp = temp.next;
                count++;
            }
            if(temp.next == null && count == position-1)
            {
                temp.next = temp2;
                head.tail = temp2;
            }

        }
        else if(position < 0)
        {
            int count = 0;
            Node temp2 = new Node();
            temp2.singleTask = priority;
            while(temp.next != null)
            {
                if(count == (check + abs(position)-1))
                {
                    temp2.next = temp.next;
                    temp.next = temp2;
                }
                temp = temp.next;
                count++;
            }
            if(temp.next == null && count == (check + abs(position)-1))
            {
                temp.next = temp2;
                head.tail = temp2;
            }
        }
        return position;
    }
}