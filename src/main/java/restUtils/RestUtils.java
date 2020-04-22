package restUtils;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	public static String getFirstname() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Ash" + generatedString);
	}

	public static String getLastname() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("Samurai" + generatedString);
	}

	public static String getUsername() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Ash" + generatedString);
	}

	public static String getPassword() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("123" + generatedString);
	}

	public static String getEmail() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return (generatedString+"gmail.com");
	}

	public static String getEmpName() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return ("Chan" + generatedString);
	}
	
	public static String getEmpSalary() {
		String generatedString = RandomStringUtils.randomNumeric(6);
		return (generatedString);
	}
	
	public static String getEmpAge() {
		String generatedString = RandomStringUtils.randomNumeric(1);
		return ("2" + generatedString);
	}
}
