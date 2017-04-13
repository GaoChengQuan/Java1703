package day13;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingDemo {
	public void init() {
		JFrame frame = new JFrame();
		//JFrame默认是没有尺寸的
		frame.setSize(500, 300);
		//设置坐标
		frame.setLocation(400, 400);
		//关闭窗口的时候程序退出，不然程序还在执行，按钮还是红色的
		//因为程序大的话可能有多个窗口，如果关闭窗口就退出程序就会出问题
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//获得Panel
		JPanel panel = (JPanel) frame.getContentPane();
		//设置流式布局
		panel.setLayout(new FlowLayout());
		//文本框1
		final JTextField textField1 = new JTextField();
		textField1.setPreferredSize(new Dimension(120, 30));
		panel.add(textField1);
		// +号
		JLabel label = new JLabel("+");
		label.setPreferredSize(new Dimension(30, 30));
		panel.add(label);
		//文本框2
		final JTextField textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(120, 30));
		panel.add(textField2);
		// Button = 号
		JButton button = new JButton("=");
		button.setPreferredSize(new Dimension(60, 30));
		panel.add(button);
		//文本框3，显示结果
		final JTextField textField3 = new JTextField();
		textField3.setPreferredSize(new Dimension(120, 30));
		panel.add(textField3);
		
		//给button添加点击事件
		//匿名内部类
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textField1.getText());
				int num2 = Integer.parseInt(textField2.getText());
				int result = num1 + num2;
				textField3.setText(Integer.toString(result));
//				textField3.setText(result + "");
			}
		});
		
		//必须设置可见
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingDemo swingDemo = new SwingDemo();
		swingDemo.init();
	}
}
