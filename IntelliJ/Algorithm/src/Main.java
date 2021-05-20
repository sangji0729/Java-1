import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        N10809();
    }

    public static void N11720() {
        /* 숫자의 합
        N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
        입력) 첫째 줄에 숫자의 개수 N(1 <= n <= 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
         */
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String input = sc.next();

        int total = 0;
        for (int i = 0; i < count; i++) {
            char value = input.charAt(i);
            total += Character.getNumericValue(value);
        }

        System.out.print(total);
    }

    public static void N10809() {
        /* 알파벳 찾기
        알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
        단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는
        -1을 출력하는 프로그램을 작성하시오.
        입력) 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
        출력) 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치,
        ...z가 처음 등장하는 위치를 공백으로 구분해서 출력한다. 만약 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
        단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
         */

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < input.length(); i++)
        {
            int key = input.charAt(i);
            if (map.containsKey(key) == false)
            {
                map.put(key, i);
            }
        }

        for (int i = 'a'; i < 'z'; i++)
        {
            if (map.containsKey(i))
                System.out.printf("%d ", map.get(i));
            else
                System.out.printf("%d ", -1);
        }
    }
}
