package readinglist;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import readinglist.ReadingListApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ReadingListApplication.class)
@WebAppConfiguration
public class ReadingListApplicationTests {

	@Test
	@Ignore
	public void contextLoads() {
	}


}
