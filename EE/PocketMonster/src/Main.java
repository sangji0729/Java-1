
public class Main {

	public static void main(String[] args) {

		GameManager gameManager = new GameManager();
		gameManager.init();
		gameManager.updateLoop();
		gameManager.release();		
	}
}