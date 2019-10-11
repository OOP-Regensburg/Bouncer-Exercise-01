import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class BouncerAlsMaler extends BouncerApp {

	@Override
	public void bounce() {
		loadMap("Painter");
	}

	public static void main(String[] args) {
		GraphicsAppLauncher.launch("BouncerAlsMaler");
	}
}
