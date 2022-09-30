import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBillboardManager {
    String film1 = "film1";
    String film2 = "film2";
    String film3 = "film3";
    String film4 = "film4";
    String film5 = "film5";
    String film6 = "film6";
    String film7 = "film7";
    String film8 = "film8";
    String film9 = "film9";
    String film10 = "film10";

    @Test
    public void showedTenPosters() {

        BillboardManager manager = new BillboardManager(10);
        manager.addPoster(film1);
        manager.addPoster(film2);
        manager.addPoster(film3);
        manager.addPoster(film4);
        manager.addPoster(film5);
        manager.addPoster(film6);
        manager.addPoster(film7);
        manager.addPoster(film8);
        manager.addPoster(film9);
        manager.addPoster(film10);

        Assertions.assertArrayEquals(new String[]{film1, film2, film3, film4, film5, film6, film7, film8, film9, film10}, manager.findAll());
    }

    @Test
    public void ShowedElevenPosters() {

        BillboardManager manager = new BillboardManager(11);
        manager.addPoster(film1);
        manager.addPoster(film2);
        manager.addPoster(film3);
        manager.addPoster(film4);
        manager.addPoster(film5);
        manager.addPoster(film6);
        manager.addPoster(film7);
        manager.addPoster(film8);
        manager.addPoster(film9);
        manager.addPoster(film10);
        String film11 = "film11";
        manager.addPoster(film11);

        Assertions.assertArrayEquals(new String[]{film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11}, manager.findAll());
    }

    @Test
    public void lackOfPosters() {

        BillboardManager manager = new BillboardManager(0);
        Assertions.assertArrayEquals(new String[0], manager.findAll());
    }

    @Test
    public void showFivePostersFromEnd() {

        BillboardManager manager = new BillboardManager(5);
        manager.addPoster(film1);
        manager.addPoster(film2);
        manager.addPoster(film3);
        manager.addPoster(film4);
        manager.addPoster(film5);
        manager.addPoster(film6);
        manager.addPoster(film7);
        manager.addPoster(film8);
        manager.addPoster(film9);
        manager.addPoster(film10);

        Assertions.assertArrayEquals(new String[]{film10, film9, film8, film7, film6}, manager.findLast());
    }

    @Test
    public void showTwoPostersFromEnd() {

        BillboardManager manager = new BillboardManager(2);
        manager.addPoster(film1);
        manager.addPoster(film2);
        manager.addPoster(film3);
        manager.addPoster(film4);
        manager.addPoster(film5);
        manager.addPoster(film6);
        manager.addPoster(film7);
        manager.addPoster(film8);
        manager.addPoster(film9);
        manager.addPoster(film10);

        Assertions.assertArrayEquals(new String[]{film10, film9}, manager.findLast());
    }
}
