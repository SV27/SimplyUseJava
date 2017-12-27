/**
 * This below statements is the syntax to declare the package.
 * Package is nothing but a folder structure of a java class from the project root.
 */
package com.simplyusejava.intro;


/**
 * This class explains various components of class and how it can be acessed.
 * @author SimplyUseJava
 * @version 1.0
 */
public class ClassExample {
	
	/*
	 * any variable declared with in the class is called instance variable. 
	 * This variable can only be accessed using Object of an class.
	 */
	int instance_variable = 10;
	
	/*
	 * if any instance variable declared with "static" keyword, then it is called "Static Variable".
	 * The static variable can be accessed directly using class name.
	 * No need to create an object of a class to access this variable.
	 */
	static int static_variable = 20;
	
	
	/*
	 * This is a constructor. 
	 * When a method has a same name as a class, then it is considered as "Constructor"
	 * Constructor are used to initialize or assign default values when we create a instance of a class.
	 * It is not necessary for a class to have constructor defined explicitly in them.
	 * 
	 */
	public ClassExample() {
		
		/**
		 * This is the default constructor. 
		 * when ever we create a new instance object of this class, this constructor is called.
		 * Even if we do not declare this constructor, 
		 * 		java implicitly create this constructor and calls when ever we create a instance of that class.
		 */
		
		System.out.println("ClassExample object is instanciated with default constructor");
	}
	
	public ClassExample(int constructor_parameter_var) {
		/**
		 * This constructor is called "Parameterized Constructor".
		 * 	It is because, we are passing parameter values. 
		 *   the passed parameter is then assigned to the variables we want.
		 *   so, if we instantiate a class with this constructor, then the passed value will be assigned to the respective variable.
		 */
		System.out.println("ClassExample object is instanciated with parameterised construtor.");
		
		this.instance_variable = constructor_parameter_var;
	}

	public int getInstance_variable() {
		/**
		 * You can see "int" datatype declared between public and method name. 
		 * 		It means that it will give a result of an "int" type variable, when we call this method.
		 * This method will return the stored value of an instance variable "instance_variable" of an instance. 
		 */
		return instance_variable;
	}


	public void setInstance_variable(int instance_variable) {
		/**
		 * You can see a keyword "void" declared between public and method name. 
		 * 		It means that it will not give you any result back to you, when we call this method.
		 * 		We use this "void" type method either to execute some action and store it an variable already declared in class or just print the result.
		 * This method is used to override the default value of the instance_variable in our example.
		 */
		
		/*
		 *  "local_varaible" is called "Local variable". 
		 *  This variable is visible only with in this method. 
		 *       we can not use this variable outside of this method.
		 *       But, we declare another variable with this  same name again outside of this method.
		 */
		int local_varaible = instance_variable + 10;
		
		this.instance_variable = local_varaible;
	}
	
	public static void whatIsStaticMethod() {
		/**
		 * This is a static method. 
		 * This method can be directly accessed using class name without creating instance of the class.
		 *  The other methods defined in this class are called instance method.
		 *  	We can only access those methods using instance of the class. 
		 *  	
		 */
		System.out.println(" ClassExample class Static method is acessed.");
	}


	/*
	 * This is called main method.
	 * The java program starts its execution from this method. 
	 */
	public static void main(String[] args) {
		
		/**
		 *  create an object of an class ClassExample.
		 *  Object of an class is created with use of keyword "new".
		 *  to create a default constructor object is shown below.
		 *  When we create an object of ClassExample class using the below syntax,
		 *  	JVM creates an object of that class with default constructor. i.e., ClassExample(). 
		 */
		
		ClassExample classExampleObject = new ClassExample();
		
		/**
		 * The below statement object creation creates the object by using the "Parameterized Constructor".
		 *  we are passing int value of 60 as a "constructor_parameter_var" variable value.
		 *  	so, the created object will have the "instance_variable" value as "60" instead of the default value "10".
		 *  	The "Parameterized Constructor" constructor will override the default value of 10 with 60 as we defined in the constructor.
		 */
		
		ClassExample classExampleObj2 = new ClassExample(60);
		
		/*
		 * The following statements show how the variables can be accessed.
		 */
		
		// access instance variable declared in a class.
		int i = classExampleObject.instance_variable;
		int j = classExampleObj2.instance_variable;
		
		//accessing "static" variable of class ClassExample. Please not that we used class name instead of Object name when accessing the "static" variable.
		int k = ClassExample.static_variable; 
		
		/**
		 *  int "i" value should be equal to the default value of "instance_variable" in ClassExample class. i.e., 10.
		 *  int "j" value should be equal to "60". because "classExampleObj2" object was instantiated with "Parameterized Constructor"
		 *      which overrides the default value of the "instance_variable".
		 */
		System.out.println("Integer value of i : "+i);
		System.out.println("Integer value of j : "+j);
		
		/**
		 * int "k" value should be equal to "20". Because we assigned the static variable "static_variable" of the class "ClassExample".
		 */
		
		System.out.println("Integer value of k : "+k);
		
		
		/**
		 * Accessing instance method.
		 * 
		 */
		
		// accessing the method which returns value.
		
		int l = classExampleObject.getInstance_variable();
		
		System.out.println("Integer value returned by getInstance_variable() instance method : "+l);
		
		// accessing "void" instance method.
		classExampleObj2.setInstance_variable(20);
		/**
		 * as this method overrides the instance_variable variable. you can see the modified variable, if you access getInstance_variable() method of this obejct.
		 */
		System.out.println(" New modified value of instance_variable :" +classExampleObj2.getInstance_variable());
		
		/*
		 * Accessing static method.
		 * Static method can be accessed with class name instead of object instance.
		 */
		ClassExample.whatIsStaticMethod();
		
	}

}
