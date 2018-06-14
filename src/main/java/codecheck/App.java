package codecheck;

public class App {
	public static void main(String[] args) {
		String request = args[0];
		int kazu = Integer.parseInt(request);
		int waru3noamari = kazu % 3;

		if (waru3noamari == 0 && kazu <= 1000 && kazu > 0 && request.contains("3")) {
			System.out.println("dumb");
		}else if (waru3noamari == 0 && kazu <= 1000 && kazu > 0) {
				System.out.println("idiot");
		}else if (request.contains("3") && kazu <= 1000 && kazu > 0) {
				System.out.println("stupid");
		}else {
			System.out.println("invalid");
		}
	}
}

