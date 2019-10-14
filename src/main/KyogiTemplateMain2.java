package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 標準入力受け取って問題解く系で使われそうなもの その2
 * 1行目でいきなりn個の入力が来るパターン
 * @author cilmesource
 *
 */
public class KyogiTemplateMain2 {

    public static void main(String[] args) {

        // 入力値格納用のリスト
        List<String> array = new ArrayList<>();

        // 入力の受け取り
        try (Scanner sc = new Scanner(System.in);) {
            // 与えられた入力がなくなるまで実行される
            // (キーボードだと中断されるまで)
            while (sc.hasNext()) {
                array.add(sc.next());
            }
        }

        // 入力を入れたものに対して、何らかの処理をする(ここだとコンソール出力)
        doSomething(array);
    }

    public static void doSomething(List<String> array) {

        array.stream().forEach(System.out::println);
    }
}
