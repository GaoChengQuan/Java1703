package day10;

import org.junit.Test;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		
		String str = "   java android      ";
		String result = trim(str);
		System.out.println(result);
	}
	
	
	@Test
	public void test1() {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
	}
	
	
	@Test
	public void test2() {
		String str = "java android 1703";
		int index = str.indexOf('a');
		System.out.println(index);
		System.out.println(str.indexOf('d', 8));
		System.out.println(str.indexOf("android"));
		System.out.println(str.lastIndexOf('d'));
	}
	
	@Test
	public void test3() {
		String str1 = new String("Abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String str = "java android 1703";
		System.out.println(str.contains("android"));
		System.out.println(str.startsWith("java"));
		System.out.println(str.endsWith("1703"));
		System.out.println(str.isEmpty());
	}
	
	@Test
	public void test4() {
		char[] array = {'a', 'b', 'c', 'd', 'e', 'f'};
		String str = new String(array);
		System.out.println(str);
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		String str1 = "java android 1703";
		String str2 = str1.replace("android", "ios");
		System.out.println(str1);
		System.out.println(str2);
	}
	
	@Test
	public void test5() {
		String str = "java android ios,php,python";
		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println(str.substring(5));
		// 
		System.out.println(str.substring(5, 12));
		
		String str1 = "  java android   ";
		System.out.println(str1.trim());
	}
	
	@Test
	public void string() {
		String str1 = "ios";
		String str2 = "java";
		String str3 = "android";
		String str4 = "python";
		String str5 = "python";
		
		String str = str1 + str2 + str3 + str4 + str5;
		System.out.println(str);
	}
	
	@Test
	public void stringBuffer() {
		String str1 = "ios";
		String str2 = "java";
		String str3 = "android";
		String str4 = "python";
		String str5 = "python";
		
		StringBuffer stringBuffer = new StringBuffer(str1);
		stringBuffer.append(str2);
		stringBuffer.append(str3);
		stringBuffer.append(str4);
		stringBuffer.append(str5);
		
		System.out.println(stringBuffer);
	}
	
	@Test
	public void stringBuilder() {
		String str1 = "ios";
		String str2 = "java";
		String str3 = "android";
		String str4 = "python";
		String str5 = "python";
		
		StringBuilder builder = new StringBuilder(str1);
		//链式编程
		builder.append(str2).append(str3).append(str4).append(str5);
		
//		builder.append(str2);
//		builder.append(str3);
//		builder.append(str4);
//		builder.append(str5);
		
		System.out.println(builder);
	}
	
	public static String trim(String str) {
		//String str1 = "---java android------";
		//String string = "Java Android";
		int beginIndex = 0;
		int endIndex = str.length() - 1;
		while ((beginIndex <= endIndex) && (str.charAt(beginIndex) == ' ')) {
			beginIndex++;
		}
		
		while ((beginIndex <= endIndex) && (str.charAt(endIndex) == ' ')) {
			endIndex--;
		}
		
		return str.substring(beginIndex, endIndex + 1);
	}
	
}
