package test.launcher;

public class TC_002 extends BaseTestPractice {

	public static void main(String[] args) throws Exception {
		
		init();
		launch("firefoxbrowser");
		navigateUrl("amazonurl");
		
	}

}
