package donotfollow;

public class HardcoverUI implements BookAction{
    @Override
    public void seeReviews() {
        // this method gets the reviews of a book
    }

    @Override
    public void searchSecondhand() {
        // looks for availability of secondhand book
    }

    @Override
    public void listenSample() {
        //Can't be implemented
        // this method is very much specific to audiobook, since we cannot listen to hard-copy of a book
    }
}
