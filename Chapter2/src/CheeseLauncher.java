import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

/**
 * Created by robertoguazon on 03/07/2016.
 */
public class CheeseLauncher {

    public static void main(String[] args) {
        CheeseGame cheeseGame = new CheeseGame();
        LwjglApplication lwjglApplication = new LwjglApplication(cheeseGame);
    }
}
