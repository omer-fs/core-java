package donotfollow;

public class AudiobookUI implements BookAction{
    @Override
    public void seeReviews() {
        // this method gets the reviews of an audiobook
    }

    @Override
    public void searchSecondhand() {
        //cannot be implemented
        // since an audiobook may not be available as secondhand
    }

    @Override
    public void listenSample() {
        // lets you play the sample of the audiobook
    }
}
