package definition;

public class Person {
    private String firstName;
    private String lastName;
    private String[] contactNo;
    private String email;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("-------- * -------- * -------- * --------\n");
        sb.append("First Name: ").append(firstName).append('\n');
        sb.append("Last Name: ").append(lastName).append('\n');
        sb.append("Contact No: ");
        for (int i = 0; i < contactNo.length; i++) {
            sb.append(contactNo[i] + (contactNo[i] != null && i < contactNo.length - 1 ? ", " : ""));
        }
        sb.append("\nEmail: ").append(email).append('\n');
        sb.append("-------- * -------- * -------- * --------\n");
        return sb.toString();
    }

    public Person(String firstName, String lastName, String[] contactNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNo = contactNo;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getContactNo() {
        return contactNo;
    }

    public void setContactNo(String[] contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
