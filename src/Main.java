/**
 * 输入一行字符串，计算其中A-Z大写字母出现的次数
 *
 * 输入描述:
 * 案例可能有多组，每个案例输入为一行字符串。
 *
 *
 * 输出描述:
 * 对每个案例按A-Z的顺序输出其中大写字母出现的次数。
 * 示例1
 * 输入
 * DFJEIWFNQLEF0395823048+_+JDLSFJDLSJFKK
 * 输出
 * A:0
 * B:0
 * C:0
 * D:3
 * E:2
 * F:5
 * G:0
 * H:0
 * I:1
 * J:4
 * K:2
 * L:3
 * M:0
 * N:1
 * O:0
 * P:0
 * Q:1
 * R:0
 * S:2
 * T:0
 * U:0
 * V:0
 * W:1
 * X:0
 * Y:0
 * Z:0
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = scanner.nextLine().toCharArray();
        int[] record = new int[256];
        for (char c : array) {
            record[c]++;
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char) i+":"+record[i]);
        }
    }
}
