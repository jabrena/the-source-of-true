package org.jab.thesourceoftruth;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MainApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void applicationStarts() {
		MainApplication.main(new String[] {});
	}

}
