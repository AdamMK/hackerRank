import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;


class ComparePlayersTest {

    @Test
    void sortPlayersByScore() {
        final var adam = new Player("Adam", 100);
        final var james = new Player("James", 50);
        final var rich = new Player("Rich", 75);

        var list = Arrays.asList(james, adam, rich);

        // IN PLACE SORTING!
        Collections.sort(list, Collections.reverseOrder(new Checker()));

        assertThat(list).containsExactly(adam, rich, james);
    }

    @Test
    void sortPlayersByName() {
        final var adam = new Player("Adam", 100);
        final var james = new Player("James", 100);
        final var andy = new Player("Andy", 100);

        var list = Arrays.asList(james, adam, andy);

        // IN PLACE SORTING!
        Collections.sort(list, Collections.reverseOrder(new Checker()));

        assertThat(list).containsExactly(adam, andy, james);
    }

    @Test
    void testNewComparator() {
        final var adam = new Player("Adam", 100);
        final var andy = new Player("Andy", 100);
        final var james = new Player("James", 50);
        final var rich = new Player("rich", 75);

        var list = Arrays.asList(james, rich, adam, andy);

        // IN PLACE SORTING!
        Collections.sort(list, Player.comparator());

        assertThat(list).containsExactly(adam, andy, rich, james);
    }


    @Test
    void testComparableComparator() {
        final var adam = new Player("Adam", 100);
        final var andy = new Player("Andy", 100);
        final var james = new Player("James", 50);
        final var rich = new Player("rich", 75);

        var list = Arrays.asList(james, rich, adam, andy);

        // IN PLACE SORTING!
        Collections.sort(list);

        assertThat(list).containsExactly(adam, andy, rich, james);
    }


}