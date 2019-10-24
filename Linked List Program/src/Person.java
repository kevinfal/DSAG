
public class Person implements Comparable<Person> {
	private String fName;
	private String lName;
	private String employer;
	
	/**
	 * no argument constructor
	 */
	public Person() {
	}
	
	/**

	 * @param  first name
	 * @param  last name
	 * @param employer
	 */
	public Person(String firstName, String lastName, String employer) {
		fName = firstName;
		lName = lastName;
		this.employer = employer;
	}
	

	/**
	 * @return first name
	 */
	public String getFirstName() {
		return fName;
	}
	/**
	 * 
	 * @return last name
	 */
	public String getLastName() {
		return lName;
	}
	/**
	 * @return employer
	 */
	public String getEmployer() {
		return employer;
	}
	/**
	 * 
	 * @param  first name
	 */
	public void setFirstName(String fName) {
		this.fName = fName;
	}
	/**

	 * @param last name
	 */
	public void setLastName(String lName) {
		this.lName = lName;
	}

	/**
]	 * @param employer new employer
	 */
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	
	/**
	 * @param person
	 * @return positive if greater, negative if less, 0 if same
	 */
	public int compareTo(Person p) {
		int compare = this.getLastName().compareTo(p.getLastName());
		if (compare == 0) {
			return this.getFirstName().compareTo(p.getFirstName());
		} 
		else return compare;
	}
	
	/**
	 * @return person in string form
	 */
	public String toString() {
		return "Name: " + fName + " " + lName +" Employer: "+ employer;
	}
	
}