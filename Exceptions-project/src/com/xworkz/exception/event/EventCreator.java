package com.xworkz.exception.event;


import java.awt.AWTError;
import java.awt.image.ImagingOpException;
import java.io.IOError;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.charset.CoderMalfunctionError;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class EventCreator {
	


	public EventCreator()
	{
		System.out.println("invoked no-arg constructor");
	}

	
	public void createRunTimeException(boolean create)
	{
		if(create==true) {
		RuntimeException runtimeException=new RuntimeException();
		throw runtimeException;
		}
		else
		{
			System.out.println("event created");
		}
	}
	
	public void createNullPointerException()
	{
		NullPointerException nullPointerException=new NullPointerException();
		throw nullPointerException;
	}
	
	public void  createArrayStoreException()
	{
		ArrayStoreException array=new ArrayStoreException();
		throw array;
		
	 
	}
	
	public void createClassCastException()
	{
	ClassCastException cast=new	ClassCastException();
	throw cast;
	}
	
	public void createNoSuchElementException()
	{
		NoSuchElementException element=new NoSuchElementException();
		throw element;
	}
	 
	public void createIndexOutOfBoundsException() 
	{
		IndexOutOfBoundsException index=new IndexOutOfBoundsException();
		throw index;
		
	}
	
	public void createImagingOpException()
	{
		ImagingOpException image=new ImagingOpException("table");
		throw image;
		
	}
	
	public void createUndeclaredThrowableException()
	{
		UndeclaredThrowableException undeclared=new UndeclaredThrowableException(null);
		throw undeclared;
	}

	public void createIncompleteAnnotationException()
	{
		IncompleteAnnotationException incomplete=new IncompleteAnnotationException(null,null);
		throw incomplete;
	}
	
	public void createIllegalArgumentException()
	{
		 IllegalArgumentException illegal=new  IllegalArgumentException();
		 throw illegal;
	}
public void createAnnotationFormatError()
{
	AnnotationFormatError error=new AnnotationFormatError(null, null);
	throw error;	
}

public void createAssertionError()
{
	AssertionError assertion=new AssertionError();
	throw assertion;
}

public void createAWTError()
{
	AWTError awt= new AWTError("food");
	throw awt;
}

public void createCoderMalfunctionError()
{
	CoderMalfunctionError coder=new CoderMalfunctionError(null);
	throw coder;	
}

public void createFactoryConfigurationError()
{
	FactoryConfigurationError factory=new FactoryConfigurationError();
	throw factory;
}

public void createIOError()
{
	IOError io=new IOError(null);
	throw io;
}

public void createLinkageError()
{
	LinkageError link=new LinkageError();
	throw link;
}

public void createServiceConfigurationError()
{
	ServiceConfigurationError service=new ServiceConfigurationError(null);
	throw service;
	
}

public void createThreadDeath()
{
	ThreadDeath thread=new ThreadDeath();
	throw thread;
}

public void createTransformerFactoryConfigurationError()
{
	TransformerFactoryConfigurationError trans=new TransformerFactoryConfigurationError();
	throw trans;
}



}
