package Toutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(priority=-1)
	public void testa() {
		Assert.assertEquals(12, 12);
	}
	@Test(priority=1)
	public void testb() {
		Assert.assertEquals(12, 12);
	}
	@Test(priority=0)
	public void testc() {
		Assert.assertEquals(12, 12);
	}
	@Test
	public void testd() {
		Assert.assertEquals(12, 12);
	}
}
