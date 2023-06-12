<<<<<<< HEAD
import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 90) + 10; // 10から99の範囲でランダムに数を生成
        int maxGuesses = 5;
        int guessCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("数当てゲームを開始します！2桁の正の整数を予想してください。");

        while (guessCount < maxGuesses) {
            System.out.print("予想を入力してください（残り" + (maxGuesses - guessCount) + "回）: ");
            int userGuess = scanner.nextInt();
            guessCount++;

            if (userGuess == targetNumber) {
                System.out.println("当たり！おめでとうございます！");
                return; // 当たった場合はゲームを終了
            } else {
                if (userGuess > targetNumber) {
                    System.out.println("設定された数より大きいです。");
                } else {
                    System.out.println("設定された数より小さいです。");
                }

                if (Math.abs(userGuess - targetNumber) >= 20) {
                    System.out.println("20以上の差があります。");
                }
            }
        }

        System.out.println("残念！ゲームオーバーです。正解は" + targetNumber + "でした。");
    }
}
=======
import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 90) + 10; // 10から99の範囲でランダムに数を生成
        int maxGuesses = 5;
        int guessCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("数当てゲームを開始します！2桁の正の整数を予想してください。");

        while (guessCount < maxGuesses) {
            System.out.print("予想を入力してください（残り" + (maxGuesses - guessCount) + "回）: ");
            int userGuess = scanner.nextInt();
            guessCount++;

            if (userGuess == targetNumber) {
                System.out.println("当たり！おめでとうございます！");
                return; // 当たった場合はゲームを終了
            } else {
                if (userGuess > targetNumber) {
                    System.out.println("設定された数より大きいです。");
                } else {
                    System.out.println("設定された数より小さいです。");
                }

                if (Math.abs(userGuess - targetNumber) >= 20) {
                    System.out.println("20以上の差があります。");
                }
            }
        }

        System.out.println("残念！ゲームオーバーです。正解は" + targetNumber + "でした。");
    }
}
>>>>>>> f7d1751bd8cae413f23409541e49d2a9db954abb
