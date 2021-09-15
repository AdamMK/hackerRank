//import org.jetbrains.annotations.NotNull;
//
//import java.util.*;
//
//class Player implements Comparable {
//    String name;
//    int score;
//
//    Player(String name, int score) {
//        this.name = name;
//        this.score = score;
//    }
//
//    @Override
//    public String toString() {
//        return "Player{" +
//                "name='" + name + '\'' +
//                ", score=" + score +
//                '}';
//    }
//
//    public static Comparator<Player> comparator() {
//        return Comparator
//                .comparingInt((Player p) -> p.score).reversed()
//                .thenComparing(p -> p.name);
//    }
//
//    @Override
//    public int compareTo(@NotNull Object o) {
//        if (o instanceof Player) {
//            var other = (Player) o;
//            // -1 = a is lower
//            // 0 = same
//            // +1 = b is lower
//            if (this.score < other.score) {
//                return 1;
//            } else if (this.score == other.score) {
//                return this.name.compareTo(other.name);
//            } else {
//                return -1;
//            }
//        } else {
//            return 1;
//        }
//    }
//}
//
//// Two ways to sort in Java:
//// 1. Implement Comparable in the class
//// 2. Create a implemation of Comparator<T>
//class Checker implements Comparator<Player> {
//    // complete this method
//    public int compare(Player a, Player b) {
//        // -1 = a is lower
//        // 0 = same
//        // +1 = b is lower
//        if (a.score < b.score) {
//            return -1;
//        } else if (a.score == b.score) {
//            return b.name.compareTo(a.name);
//        } else {
//            return 1;
//        }
//    }
//}
//
//
//public class ComparePlayers {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//
//        Player[] player = new Player[n];
//        Checker checker = new Checker();
//
//        for (int i = 0; i < n; i++) {
//            player[i] = new Player(scan.next(), scan.nextInt());
//        }
//        scan.close();
//
//        Arrays.sort(player, checker);
//        for (int i = 0; i < player.length; i++) {
//            System.out.printf("%s %s\n", player[i].name, player[i].score);
//        }
//    }
//
//}