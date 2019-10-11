import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class DieStrasse extends BouncerApp {


	@Override
	public void bounce() {
		loadMap("Strasse");
	}

	public static void main(String[] args) {
		GraphicsAppLauncher.launch("DieStrasse");
	}
}
