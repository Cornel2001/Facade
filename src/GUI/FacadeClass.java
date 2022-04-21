package GUI;

public class FacadeClass {
	
	private facadeInterface PISTAsingletonClass;
	   private facadeInterface ReadWriteObject;
	   private facadeInterface Window;

	   public FacadeClass() {
		   PISTAsingletonClass = new PISTAsingletonClass();
		   ReadWriteObject = new ReadWriteObject();
		   Window = new Window();
	   }

	   public void CreatePISTAsingletonClass(){
		   PISTAsingletonClass.Create();
	   }
	   public void CreateReadWriteObject(){
		   ReadWriteObject.Create();
	   }
	   public void CreateeWindow(){
		   Window.Create();
	   }
	}


