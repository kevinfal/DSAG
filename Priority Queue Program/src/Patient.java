

/**
 * @author kevin
 *
 *Patient class
 */
public class Patient implements Comparable<Patient> {
	private String fName;
	private String lName;
	private int priority;
	
	/**
	 * constructor
	 * @param fName - first name
	 * @param lName - last name
	 * @param priority
	 */
	public Patient(String fName, String lName, int priority) {
		this.fName = fName;
		this.lName = lName;
		this.priority = priority;
	}

	/**
	 * 
	 * @return fName - First name
	 */
	public String getFirst() {
		return fName;
	}
	
	/**
	 * @return lName - last name
	 */
	public String getLname() {
		return lName;
	}
	
	/**
	 * @return priority
	 */
	public int getPriority() {
		return priority;
	}
	
	/**
	 * 
	 * @param fName - first name to set
	 */
	public void setFname(String fName) {
		this.fName = fName;
	}

	/**
	 * 
	 * @param lName - last name to set
	 */
	public void setLast(String lName) {
		this.lName = lName;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}
	/**
	 * implementation of compareTo
	 */
	public int compareTo(Patient compared) {
		return getPriority() - compared.getPriority();
	}
	
	/**
	 * @return patient in string form
	 */
	public String toString() {
		return fName + " " + lName +", Pain Level: " + priority;
	}
	
}
