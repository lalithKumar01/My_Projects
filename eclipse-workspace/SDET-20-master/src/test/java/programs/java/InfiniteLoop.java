package programs.java;

import org.testng.annotations.Test;

public class InfiniteLoop {
	
	@Test
	public void test() {
		int count=0;
		System.out.println(++count);
		test();
	}
	
	public static void main(String[] args) {
		
		InfiniteLoop loop = new InfiniteLoop();
		loop.test();

	}

}
