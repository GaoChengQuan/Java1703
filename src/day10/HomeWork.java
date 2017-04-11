package day10;

import java.util.List;

public class HomeWork {

//	获取一个字符串在另一个字符串中出现的次数。
//    "abkkcdkkefkkskk"      "kk"
//public static int getSubCount(String str, String key) ;
	public static void main(String[] args) {
		String str = "abkkcdkkefkkskk";
		String key = "kk";
		int count = getSubCount(str, key);
		System.out.println("count: " + count);
		int count1 = getSubCount1(str, key);
		System.out.println("count1: " + count1);
	}
	
	public static int getSubCount(String str, String key) {
		int index = 0;
		int count = 0;
		while ((index = str.indexOf(key)) != -1) {
			str = str.substring(index + key.length());
			// System.out.println(str);
			count++;
		}
		return count;
	}
	
	public static int getSubCount1(String str, String key) {
		int index = 0;
		int count = 0;
		while ((index = str.indexOf(key, index)) != -1) {
			index = index + key.length();
			count++;
		}
		return count;
	}
	
	/**
	 * 实现函数public String[] toArray(List list)，
	 * 其中参数list中元素类型为String字符串。
	 */
	public String[] toArray(List list) {
		String[] array = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			String str = (String) list.get(i);
			array[i] = str;
		}
		
		return array;
	}

}
