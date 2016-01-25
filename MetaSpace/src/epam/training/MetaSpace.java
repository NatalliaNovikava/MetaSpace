package epam.training;

public class MetaSpace {
	static javassist.ClassPool cp = javassist.ClassPool.getDefault();
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		 for (int i = 0; ; i++)
		 {
			 Class c = cp.makeClass("epam.training.Generated" + i).toClass();
			 System.out.println("Generated class is -" + c);
		 }
	 }

}
