package day19;

public class AppConfigTest {
	public static void main(String[] args) {
		AppConfig appConfig = new AppConfig();
		appConfig.getParamA();
		
		for (int i = 0; i < 10; i++) {
			AppConfig appConfig1 = new AppConfig();
			appConfig1.getParamA();
		}
	}
}
