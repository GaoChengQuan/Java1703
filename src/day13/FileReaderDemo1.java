package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.junit.Test;

public class FileReaderDemo1 {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("demo.txt");
			// read()一次读一个字符，而且会自动往下读，如果已到达流的末尾，则返回 -1
			int ch1 = reader.read();
			System.out.println(ch1);
			int ch2 = reader.read();
			System.out.println(ch2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fileReader3() {
		Reader reader = null;
		try {
			reader = new FileReader("demo.txt");
			char[] buffer = new char[1024];
			int length = 0;// 2048+20
			while ((length = reader.read(buffer)) != -1) {
				System.out.println(length);
				for (char c : buffer) {
					System.out.print(c);
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	@Test
	public void fileReader2() {
		Reader reader = null;
		try {
			reader = new FileReader("demo.txt");
			// read()一次读一个字符，而且会自动往下读，如果已到达流的末尾，则返回 -1
			int ch;
			while ((ch = reader.read()) != -1) {
				System.out.println(ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Test
	public void fileReader1() {
		try {
			Reader reader = new FileReader("demo.txt");
			// read()一次读一个字符，而且会自动往下读，如果已到达流的末尾，则返回 -1
			while (true) {
				int ch = reader.read();
				if (ch == -1) {
					break;
				}
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
