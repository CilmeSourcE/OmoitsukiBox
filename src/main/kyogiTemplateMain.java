package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * 標準入力受け取って問題解く系で使われそうなものを作ってみた
 * @author cilmesource
 *
 */
public class kyogiTemplateMain {

    public static void main(String[] args) {

        // 二行目以降の文字列格納用のリスト
        List<String> array = new ArrayList<>();

        // 入力の受け取り
        try (Scanner sc = new Scanner(System.in);) {
            // 一行目の数字を取得
            int count = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < count; i++) {
                // 一行目の数字分、二行目以降の文字列を格納
                array.add(sc.next());
            }
        } catch (InputMismatchException e) {
            // 数字出ないものが入力された場合、終了
            e.printStackTrace();
            return;
        }

        // 入力値に対して何らかの処理をする(ここだとコンソール出力)
        doSomething(array);
    }

    public static void doSomething(List<String> array) {

        for (String str : array) {
            System.out.println(str);
        }
    }
}
