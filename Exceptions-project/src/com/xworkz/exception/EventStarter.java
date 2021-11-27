package com.xworkz.exception;
import com.xworkz.exception.event.EventCreator;

public class EventStarter {

	public static void main(String[] args) {
		
		EventCreator creator=new EventCreator();
		creator.createRunTimeException(false);
		
		
		creator.createNullPointerException();
		
		creator.createArrayStoreException();
		
		creator.createClassCastException();
		
		creator.createNoSuchElementException();
		creator.createIndexOutOfBoundsException();
		
		creator.createImagingOpException();
		
		creator.createUndeclaredThrowableException();
		
		creator.createIncompleteAnnotationException();
		
		creator.createIllegalArgumentException();
		
		creator.createAnnotationFormatError();
		
		creator.createAssertionError();
		
		creator.createAWTError();
		
		creator.createCoderMalfunctionError();
		
	    creator.createFactoryConfigurationError();
		
        creator.createIOError();
         
		creator.createLinkageError();
		
		creator.createServiceConfigurationError();
		
	    creator.createThreadDeath();
		
       creator.createTransformerFactoryConfigurationError();
         
        
         
         
	
	}
}
