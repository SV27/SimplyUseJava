package com.sv27.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BookStore {
	
	public static void main(String[] args) throws Exception {
		
		Class myStroy = MyStory.class;
		
		Annotation anno;
		
		if(myStroy.isAnnotationPresent(Author.class)) {
			anno = myStroy.getAnnotation(Author.class);
			Author author = (Author) anno;
			
			System.out.println("Written By : " +author.writtenBy());
			System.out.println("Book Status : "+author.status());
		}
		
		for (Method method : myStroy.getDeclaredMethods()) {
			if(method.isAnnotationPresent(UserAccess.class)) {
				anno = method.getAnnotation(UserAccess.class);
				UserAccess access = (UserAccess) anno;
				
				if(access.canWePrint()) {
					
					System.out.println("Print method can be accessed.... ");
					
					Constructor<MyStory> contructor = myStroy.getConstructor();
					
					Object story = contructor.newInstance();
					
					method.invoke(story);
					
				}else {
					System.out.println(" Print method can not be accessed ... ");
				}
			}
		}
	}

}
