package codecheck;

public class App {
	public static void main(String[] args) {

try {
		for (int i = 0, l = args.length; i < l; i++) {
			String request = args[i];
			int kazu = Integer.parseInt(request);
			int waru3noamari = kazu % 3;

			if (waru3noamari == 0 && kazu <= 1000 && kazu > 0 && request.contains("3")) {
				System.out.println("dumb");
			}else if (waru3noamari == 0 && kazu <= 1000 && kazu > 0) {
					System.out.println("idiot");
			}else if (request.contains("3") && kazu <= 1000 && kazu > 0) {
					System.out.println("stupid");
			}else if ( kazu <= 1000 && kazu > 0) {
				System.out.println("smart");
			}else {
				System.out.println("invalid");
			}
		}
	}catch(NumberFormatException e) {
		System.out.println("invalid");
	}

}

