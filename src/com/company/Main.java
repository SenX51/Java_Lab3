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

    public static void Init()
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
            end = userInput + 1;
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

    public static void CompareAdd()
    {
        for (int i = start; i < end; i += step)
        {
        linkedList.clear();
        arrayList.clear();
        test.SetOperations(i);
        System.out.println("Количество вызовов: " + i);
        System.out.print("ArrayList: " + test.Add(arrayList) + "мс | ");
        System.out.println("LinkedList: " + test.Add(linkedList) + "мс\n");
        }
    }

    public static void main(String[] args)
    {
        Init();
        CompareAdd();
    }
}
