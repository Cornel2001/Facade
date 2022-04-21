package GUI;

public class MAIN {

	public static void main(String[] args) {
		
		
		
		/* CreateFactory CreateFactory = new CreateFactory();

	      facadeInterface cr1 = CreateFactory.getCreate("PISTAsingletonClass");

	      cr1.Create();

	      facadeInterface cr2 = CreateFactory.getCreate("ReadWriteObject");

	      cr2.Create();

	      facadeInterface cr3 = CreateFactory.getCreate("Window");

	      cr3.Create();
		//----------------------------------------------------------------
	      NamesCarsITERATOR NamesCars = new NamesCarsITERATOR();
	         System.out.println("Bine ati venit la cursa!:");

	         System.out.println("Masinile care participa la cursa sunt de marca:");

	      for(Iterator iter = NamesCars.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Marca: " + name);
	         //-------------------------------------------------------------*/
	         FacadeClass facadeclass = new FacadeClass();

	         facadeclass.CreatePISTAsingletonClass();
	         facadeclass.CreateReadWriteObject();
	         facadeclass.CreateeWindow();	
	         
	        
		
	}

}

