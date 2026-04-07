/**

        * File: Lesson 3.3 - else if

        * Author: Benson

        * Date Created: March 29, 2026

        * Date Last Modified: March 29, 2026

        */
import java.util.Scanner;

public class ProblemSet {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	String email;
	System.out.print("Input an email: ");
	email = input.nextLine();

	if (email.indexOf('@') != email.lastIndexOf('@')) {
		System.out.println("Invalid: multiple @s");
		return;
	}

	if (!email.contains("@")) {
		System.out.println("Invalid: missing an @");
	}

	if (email.startsWith(".") || email.endsWith(".")) {
		System.out.println("Invalid: starts or ends with dot");
		return;
	}

	if (email.contains(" ")) {
		System.out.println("Invalid: contains spaces");
		return;
	}

	int index = email.indexOf('@');
	String local;
	String domain;
	local = email.substring(0, index);
	domain = email.substring(index + 1);

	if (local.length() < 1) {
		System.out.println("Invalid: local part is too short");
		return;
	}

	if (local.length() > 64) {
		System.out.println("Invalid: local part is too long");
	
	}
	if (!domain.contains(".")) {
		System.out.println("Invalid: No dot in domain");
		return;
	}

	String extension;
	extension = domain.substring(domain.lastIndexOf('.') + 1);
	if (extension.length() < 2 || extension.length() > 6) {
		System.out.println("Invalid: invalid domain extension length");
		return;
	}

	if (extension.contains("+") || extension.contains("_")) {
		System.out.println("Invalid: Extension contains + or _");
		return;
	}

	if (domain.contains("+") || domain.contains("_")) {
		System.out.println("Invalid: Domain contains + or _");
		return;
	}
	System.out.println("Valid");

	if (email.endsWith("@gmail.com")) {
		System.out.println("Valid" + "Gmail Normalized");
}
}
}