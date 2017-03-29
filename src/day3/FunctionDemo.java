package day3;

public class FunctionDemo {
	public static void main(String[] args) {
		//Math.max(2, 4);
		max(2.4, 4.3);
		max(2, 4);
		
	}
	
	public static double max(double a, double b) {
		return a >= b ? a : b;
	}
	
	public static int max(int a, int b) {
		return a >= b ? a : b;
	}
	
	public static long max(long a, long b) {
		return a >= b ? a : b;
	}
	
	
	
	void show(int a,char b,double c){}
	
	//Duplicate method show(int, char, double) 
	//in type FunctionDemo
	//void show(int x,char y,double z){}
	
	int show(int a,double c,char b){return 0;}
	
	// void show(int a,double c,char b){}

	//double show(int x,char y,double z){}
}
