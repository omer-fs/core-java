package follows;

public interface HardcoverAction extends BookAction{
    void searchSecondhand();
    // HardcoverAction interface follows ISP principle since its sole responsibility is to search for secondhand book
}
