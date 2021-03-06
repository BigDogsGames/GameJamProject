import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JApplet;


public class MainApplet extends JApplet {
	
	public static GamePanel panel = null;
	public static AudioClip menuMusic;
	public static AudioClip music1;
	public static AudioClip hitFx;
	
	@Override
	public void init() {
		super.init();
		
		menuMusic = getAudioClip(getCodeBase(), "audio/MenuMusic.wav");
		music1 = getAudioClip(getCodeBase(), "audio/Music1.wav");
		hitFx = getAudioClip(getCodeBase(), "audio/hit.wav");
		
		panel = new GamePanel();

		setSize(GamePanel.PANEL_WIDTH, GamePanel.PANEL_HEIGHT);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(panel, BorderLayout.CENTER);

		setVisible(true);
	}
	
	public void destroy() {
		try {
			this.menuMusic.stop();
			this.music1.stop();
		}
		catch (Exception e) {}

		this.menuMusic = null;
		this.music1 = null;
	}
	
}
