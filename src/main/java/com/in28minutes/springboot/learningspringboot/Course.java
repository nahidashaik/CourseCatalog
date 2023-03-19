package com.in28minutes.springboot.learningspringboot;

/*
 * @author Nahida Shaik
 */
public class Course {
	private long id;
	private String name;
	private String author;

	//Construtor
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	//getters will get get the values of the course whenever we need them
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}

	//toString
	//when an object is printed, toString() would be called and objects would be printed
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
}
