package day19;

import org.junit.Test;

public class RegularDemo {
	@Test
	public void test1() {
		//boolean matches(String regex)
		//根据给定的正则表达式验证当前字符串是否满足指定
		//的格式，要求满足条件返回true，否则返回false
		//    (\.[a-zA-Z0-9_]+)+
		String regex 
		= "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)+";
		String mail = "dfA6f_@qq.com";//dfA6f_@qq.com.cn
		boolean flag = mail.matches(regex);
		if (flag) {
			System.out.println("是邮箱");
		} else {
			System.out.println("不是邮箱");
		}
	}
	
	@Test
	public void test2() {
		//String[] split(String regex)
		//将当前字符串按照满足正则表达式的部分进行拆分
		String regex = "[0-9]+";
		String str = "dfhud234dfhdf4545afdhadf565";
		String[] array = str.split(regex);
		for (String string : array) {
			System.out.println(string);
		}
	}
	
	@Test
	public void test3() {
		//String replaceAll(String regex,String str)
		//将当前字符串中满足正则表达式的部分替换为给的的字符串
		String str = "dfhud234dfhdf4545afdhadf565";
		str = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
	}
}
