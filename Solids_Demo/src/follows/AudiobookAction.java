package follows;

public interface AudiobookAction extends BookAction{
    void listenSample();
    // AudiobookAction interface follows ISP principle since its sole responsibility is to provide the sample
}
