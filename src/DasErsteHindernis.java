import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class DasErsteHindernis extends BouncerApp {

	@Override
	public void bounce() {
		loadMap("Obstacles");
	}

	public static void main(String[] args) {
		GraphicsAppLauncher.launch("DasErsteHindernis");
	}
}
