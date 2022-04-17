package com.company;

//import  java.util.LinkedList;
//import java.util.ArrayList;
import java.util.List;

public class Test
{
    //количество вызовов
    private Integer operations;

    public Test()
    {
        operations = 1000;
    }

    public Test(Integer _operations)
    {
        operations = _operations;
    }

    public void SetOperations(Integer _operations)
    {
        operations = _operations;
    }

    public long Add(List<Integer> list)
    {
        long startTime = System.nanoTime();
        for (int i = 0; i < operations; i++)
        {
            list.add(list.size()/2, i);
        }
        long finalTime = System.nanoTime() - startTime;
        return finalTime / 1000000;
    }

    public long AddFirst(List<Integer> list)
    {
        long startTime = System.nanoTime();
        for (int i = 0; i < operations; i++)
        {
            list.add(0, i);
        }
        long finalTime = System.nanoTime() - startTime;
        return finalTime / 1000000;
    }

    public long AddLast(List<Integer> list)
    {
        long startTime = System.nanoTime();
        for (int i = 0; i < operations; i++)
        {
            list.add(i);
        }
        long finalTime = System.nanoTime() - startTime;
        return finalTime / 1000000;
    }

    public long RemoveFirst(List<Integer> list)
    {
        long startTime = System.nanoTime();
        for (int i = 0; i < operations; i++)
        {
            list.remove(0);
        }
        long finalTime = System.nanoTime() - startTime;
        return finalTime / 1000000;
    }

    public long RemoveLast(List<Integer> list)
    {
        long startTime = System.nanoTime();
        for (int i = 0; i < operations; i++)
        {
            list.remove(list.size()-1);
        }
        long finalTime = System.nanoTime() - startTime;
        return finalTime / 1000000;
    }

    public long Get(List<Integer> list)
    {
        long startTime = System.nanoTime();
        for (int i = 0; i < operations; i++)
        {
            list.get(list.size()/2);
        }
        long finalTime = System.nanoTime() - startTime;
        return finalTime / 1000000;
    }

}
