package me.javarouka.study.hard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HardApplicationTests {

	@Test
	public void contextLoads() {
		org.junit.Assert.assertEquals(1,1);
	}
}
