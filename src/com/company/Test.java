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
            //list.add(i%100, i);
            list.add(list.size()/2, i);;
        }
        long finalTime = System.nanoTime() - startTime;
        return finalTime / 1000000;
    }
}
