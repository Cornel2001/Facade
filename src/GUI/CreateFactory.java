package GUI;

public class CreateFactory {
	
	
	 public facadeInterface getCreate(String createType){
	      if(createType == null){
	         return null;
	      }		
	      if(createType.equalsIgnoreCase("PISTAsingletonClass")){
	         return new PISTAsingletonClass();
	         
	      } else if(createType.equalsIgnoreCase("ReadWriteObject")){
	         return new ReadWriteObject();
	         
	      } else if(createType.equalsIgnoreCase("Window")){
	         return new Window();
	      }
	      
	      return null;
	   }

}
