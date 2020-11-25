package hello;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class HelloWorldTests {

	private ByteArrayOutputStream baos = new ByteArrayOutputStream();
	private PrintStream ps = new PrintStream(baos);

	@Before
	fun setup() {
		System.setOut(ps);
	}

	@Test
	fun shouldPrintTimeToConsole() {
		HelloWorld.main(new Array<String> { });

		assertThat(output(), containsString("The current local time is"));
	}

	@Test
	fun shouldPrintHelloWorldToConsole() {
		HelloWorld.main(new Array<String> { });

		assertThat(output(), containsString("Hello world!"));
	}

	private String output() {
		return new String(baos.toByteArray(), StandardCharsets.UTF_8);
	}
}