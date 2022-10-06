public class BillboardManager {
    private String[] poster = new String[0];
    private int amountPosters;

    public BillboardManager() {
        amountPosters = 10;
    }

    public BillboardManager(int amountPosters) {
        this.amountPosters = amountPosters;
    }

    public void addPoster(String post) {

        int length = poster.length + 1;
        String[] tmp = new String[length];
        System.arraycopy(poster, 0, tmp, 0, poster.length);
        int lastPoster = tmp.length - 1;
        tmp[lastPoster] = post;
        poster = tmp;
    }

    public String[] findAll() {
        return poster;
    }

    public String[] findLast() {
        int posterLength = poster.length;
        if (posterLength < amountPosters) {
            amountPosters = posterLength;
        }
        String[] customPoster = new String[amountPosters];
        for (int i = 0; i < customPoster.length; i++) {
            int result = posterLength - i - 1;
            customPoster[i] = poster[result];
        }
        return customPoster;
    }
}
