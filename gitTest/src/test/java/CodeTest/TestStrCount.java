package CodeTest;

import org.junit.Test;

public class TestStrCount {

	@Test
	public void countTest() {
		String str="ÀÌ       ±ÛÀÚ";
		System.out.println(str.replaceAll(" ","").length());
		String str1=str.replaceAll(" ","");
		System.out.println(str1.length()); //3
	}
}
