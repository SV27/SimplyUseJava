package com.sv27.annotation;

import com.sv27.annotation.Author.BookStatus;

@Author(writtenBy="Simplyusejava", status=BookStatus.DRAFT)
public class MyStory {
	
	@UserAccess(canWePrint=true)
	public void printBook() {
		System.out.println(" Printing the book content .... ");
	}

}
