package com.company;

import java.util.Scanner;

public class DelimiterTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner("На голой ветке\n" +
                "Ворон сидит одиноко.\n" +
                "Осенний вечер.\n\n***" +
                " \n" +
                " \n" +
                "В небе такая луна,\n" +
                "Словно дерево спилено под корень:\n" +
                "Белеет свежий срез.\n\n***" +
                " \n" +
                " \n" +
                "Как разлилась река!\n" +
                "Цапля бредет на коротких ножках,\n" +
                "По колено в воде.");

        //scan.useDelimiter("\n/*/*/*");

        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }

        scan.close();
    }

}
