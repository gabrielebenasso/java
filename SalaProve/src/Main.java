import Controller.StudioManager;
import View.MainView;

public class Main {

    public static void main(String[] args) {
        StudioManager studioManager = new StudioManager();

        MainView mainView = new MainView(studioManager);

        studioManager.setMainView(mainView);
    }
}
