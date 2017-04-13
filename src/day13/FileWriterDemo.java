package day13;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import org.junit.Test;

public class FileWriterDemo {
	@Test
	public void fileWriter1() {
		Writer writer = null;
		try {
//			writer = new FileWriter(new File("ddd"));
			writer = new FileWriter(new File("abc"), true);
//			writer.write('a');
			writer.write("sdhgusgdui");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Test
	public void fileWriter2() {
		Reader reader = null;
		Writer writer = null;
		try {
			reader = new FileReader("demo.txt");
			writer = new FileWriter(new File("demo_bak.txt"));
			char[] buffer = new char[1024];
			int length = 0;//2048+20
			while ((length = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, length);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
