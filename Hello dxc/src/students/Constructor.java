package students;

import objectclass.Util;

public class Constructor {
    String name; //partition
    int age; //
    
    /** 
     * default constructor -- Mansi
     */
    public student() {}

	public Constructor(String name, int age) {
		super();
		this.name = name;
		this.age = Util.incrementByTen(age);
	}
    /**
    * shiny constructor-
    * @param name
    * @param age
    */
    
}
