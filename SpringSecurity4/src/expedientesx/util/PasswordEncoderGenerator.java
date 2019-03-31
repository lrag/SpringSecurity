package expedientesx.util;

import java.util.Scanner;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderGenerator {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la clave:");
		String password = sc.nextLine();
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);

		System.out.println(hashedPassword);

	}
}