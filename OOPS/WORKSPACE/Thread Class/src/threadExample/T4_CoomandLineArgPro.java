
package threadExample;

public class T4_CoomandLineArgPro  {
	
	public static void main(String[] args) {
		System.out.println("Running main method");
		System.out.println("Total command line Arg : "+args.length);
		System.out.println("Command lines Args");
		for (String str : args) {
			System.out.println(str);
		}
		System.out.println("main method ended");
	
	}

}

