// Семенов Арсений, 3 курс, 62 группа, 3 лабораторная
// Сравнить производительность ArrayList и LinkedList

package com.company;

import java.util.Scanner;
import  java.util.LinkedList;
import java.util.ArrayList;

public class Main
{
    static Test test = new Test();
    static ArrayList<Integer> arrayList = new ArrayList<Integer>();
    static LinkedList<Integer> linkedList = new LinkedList<Integer>();
    static Integer start = 0, end = 0, step = 0;

    private static void Init()
    {
        Scanner in = new Scanner(System.in);
        Integer userInput = -1,
                mode = -1;

        System.out.println("Выберите режим проверки:\n" +
                "[1] - Проверка метода заданное число раз\n" +
                "[2] - Проверка метода в заданном диапазоне с заданным шагом\n");
        while (userInput < 1 || userInput > 2)
            userInput = in.nextInt();
        mode = userInput; userInput = -1;

        if (mode == 1)
        {
            System.out.println("Выберите количество вызовов");
            while (userInput < 1)
                userInput = in.nextInt();
            start = userInput;
            end = userInput;
            step = userInput;
        }
        else
        {
            System.out.println("Начальное значение: ");
            while (userInput < 1)
                userInput = in.nextInt();
            start = userInput; userInput = -1;
            System.out.println("Конечное значение: ");
            while (userInput < start)
                userInput = in.nextInt();
            end = userInput; userInput = -1;
            System.out.println("Шаг: ");
            while (userInput < 1)
                userInput = in.nextInt();
            step = userInput; userInput = -1;
        }
    }

    private static void Populate(Integer size)
    {
        for (int i = 0; i <= size; i++)
        {
            linkedList.add(i);
            arrayList.add(i);
        }
    }

    private static void CompareAdd()
    {
        System.out.println("        Добавление в середину");
        for (int i = start; i <= end; i += step)
        {
            linkedList.clear(); arrayList.clear();
            test.SetOperations(i);
            long arrayResult = test.Add(arrayList);
            long linkedResult = test.Add(linkedList);
            System.out.println("    Количество вызовов: " + i);
            System.out.println("ArrayList: " + arrayResult + "мс | LinkedList: " + linkedResult + "мс");
            System.out.println("        Разница: " + Math.abs(linkedResult - arrayResult) + "мс\n");
        }
    }

    private static void CompareAddFirst()
    {
        System.out.println("        Добавление в начало");
        for (int i = start; i <= end; i += step)
        {
            linkedList.clear(); arrayList.clear();
            test.SetOperations(i);
            long arrayResult = test.AddFirst(arrayList);
            long linkedResult = test.AddFirst(linkedList);
            System.out.println("    Количество вызовов: " + i);
            System.out.println("ArrayList: " + arrayResult + "мс | LinkedList: " + linkedResult + "мс");
            System.out.println("        Разница: " + Math.abs(linkedResult - arrayResult) + "мс\n");
        }
    }

    private static void CompareAddLast()
    {
        System.out.println("        Добавление в конец");
        for (int i = start; i <= end; i += step)
        {
            linkedList.clear(); arrayList.clear();
            test.SetOperations(i);
            long arrayResult = test.AddLast(arrayList);
            long linkedResult = test.AddLast(linkedList);
            System.out.println("    Количество вызовов: " + i);
            System.out.println("ArrayList: " + arrayResult + "мс | LinkedList: " + linkedResult + "мс");
            System.out.println("        Разница: " + Math.abs(linkedResult - arrayResult) + "мс\n");
        }
    }

    private static void CompareRemoveFirst()
    {
        System.out.println("        Удаление из начала");
        for (int i = start; i <= end; i += step)
        {
            linkedList.clear(); arrayList.clear();
            Populate(i);
            test.SetOperations(i);
            long arrayResult = test.RemoveFirst(arrayList);
            long linkedResult = test.RemoveFirst(linkedList);
            System.out.println("    Количество вызовов: " + i);
            System.out.println("ArrayList: " + arrayResult + "мс | LinkedList: " + linkedResult + "мс");
            System.out.println("        Разница: " + Math.abs(linkedResult - arrayResult) + "мс\n");
        }
    }

    private static void CompareRemoveLast()
    {
        System.out.println("        Удаление из конца");
        for (int i = start; i <= end; i += step)
        {
            linkedList.clear(); arrayList.clear();
            Populate(i);
            test.SetOperations(i);
            long arrayResult = test.RemoveLast(arrayList);
            long linkedResult = test.RemoveLast(linkedList);
            System.out.println("    Количество вызовов: " + i);
            System.out.println("ArrayList: " + arrayResult + "мс | LinkedList: " + linkedResult + "мс");
            System.out.println("        Разница: " + Math.abs(linkedResult - arrayResult) + "мс\n");
        }
    }

    private static void CompareGet()
    {
        System.out.println("        Получение");
        linkedList.clear(); arrayList.clear();
        Populate(start);
        for (int i = start; i <= end; i += step)
        {
            test.SetOperations(i);
            long arrayResult = test.Get(arrayList);
            long linkedResult = test.Get(linkedList);
            System.out.println("    Количество вызовов: " + i);
            System.out.println("ArrayList: " + arrayResult + "мс | LinkedList: " + linkedResult + "мс");
            System.out.println("        Разница: " + Math.abs(linkedResult - arrayResult) + "мс\n");
        }
    }


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Init();
        CompareAdd();
        System.out.println("Press enter..."); in.nextLine();
        CompareAddFirst();
        System.out.println("Press enter..."); in.nextLine();
        CompareAddLast();
        System.out.println("Press enter..."); in.nextLine();
        CompareRemoveFirst();
        System.out.println("Press enter..."); in.nextLine();
        CompareRemoveLast();
        System.out.println("Press enter..."); in.nextLine();
        CompareGet();
        System.out.println("Press enter..."); in.nextLine();
    }
}
