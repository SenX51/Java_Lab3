package com.company;

import java.util.List;

public class Test
{
    /**
     * Количество вызовов
     */
    private Integer operations;

    /**
     * Конструктор по-умолчанию
     */
    public Test()
    {
        operations = 1000;
    }

    /**
     * Конструктор с заданным количеством вызовов
     * @param _operations количество вызовов
     */
    public Test(Integer _operations)
    {
        operations = _operations;
    }

    /**
     * Установка количества вызовов
     * @param _operations количество вызовов
     */
    public void SetOperations(Integer _operations)
    {
        operations = _operations;
    }

    /**
     * Тестирование добавления в середину списка
     * @param list тестируемый список
     * @return время выполнения
     */
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

    /**
     * Тестирование добавления в начало списка
     * @param list тестируемый список
     * @return время выполнения
     */
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

    /**
     * Тестирование добавления в конец списка
     * @param list тестируемый список
     * @return время выполнения
     */
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

    /**
     * Тестирование удаления первого элемента списка
     * @param list тестируемый список
     * @return время выполнения
     */
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

    /**
     * Тестирование удаления последнего элемента списка
     * @param list тестируемый список
     * @return время выполнения
     */
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

    /**
     * Тестирование получения элемента из середины списка
     * @param list тестируемый список
     * @return время выполнения
     */
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
    // При получении первого/последнего элемента время выполнения всегда 1мс, независимо от списка
}
