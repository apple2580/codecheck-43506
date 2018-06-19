package codecheck;

import java.lang.*;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String output = String.format("argv[%s]: %s", i, args[i]);

			String input = args[i];

			try {

				int num = Integer.parseInt(input);

				if (num > 1000) {
					output = "invalid";
				} else if (input.getBytes().length != input.length()) {
					output = "invalid";
				} else {
					if (input.contains("3")) {
						if (num%3 == 0) {
							output = "dumb";
						} else {
							output = "stupid";
						}
					} else {
						if (num%3 == 0) {
							output = "idiot";
						} else {
							output = "smart";
						}
					}
				}
			} catch (NumberFormatException e) {
				output = "invalid";
			}

			System.out.println(output);

		}
	}
}
