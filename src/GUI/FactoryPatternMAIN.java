package GUI;

public class FactoryPatternMAIN {

	public static void main(String[] args) {
		
		
		
		 CreateFactory CreateFactory = new CreateFactory();

	      Factory cr1 = CreateFactory.getCreate("PISTAsingletonClass");

	      cr1.Create();

	      Factory cr2 = CreateFactory.getCreate("ReadWriteObject");

	      cr2.Create();

	      Factory cr3 = CreateFactory.getCreate("Window");

	      cr3.Create();
		
		
	}

}
