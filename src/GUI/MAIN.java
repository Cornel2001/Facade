package GUI;

public class MAIN {

	public static void main(String[] args) {
		
		
		
		 CreateFactory CreateFactory = new CreateFactory();

	      Factory cr1 = CreateFactory.getCreate("PISTAsingletonClass");

	      cr1.Create();

	      Factory cr2 = CreateFactory.getCreate("ReadWriteObject");

	      cr2.Create();

	      Factory cr3 = CreateFactory.getCreate("Window");

	      cr3.Create();
		//----------------------------------------------------------------
	      NamesCarsITERATOR NamesCars = new NamesCarsITERATOR();
	         System.out.println("Bine ati venit la cursa!:");

	         System.out.println("Masinile care participa la cursa sunt de marca:");

	      for(Iterator iter = NamesCars.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Marca: " + name);
		
	}

}
}
