package Day0702;

import java.util.Random;

public class Main7 {
    public static void main(String[] args) {
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace" };

        Random random = new Random();

        int suitIndex = random.nextInt(suits.length);
        int rankIndex = random.nextInt(ranks.length);

        System.out.println(suits[suitIndex] + "의 " + ranks[rankIndex]);
    }
}
