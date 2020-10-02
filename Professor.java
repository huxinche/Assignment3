package edu.neu.info5100;

class Professor {
    //required parameters
    private String firstName;
    private String lastName;
    private int id;

    public Professor(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void teach() {
//		System.out.println(name + " is teaching something");
    }

    public static class Builder {
        //required parameters
        private String firstName;
        private String lastName;
        private int id;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder serId(int id) {
            this.id = id;
            return this;
        }

        public Professor build() {
            // call the private constructor in the outer class
            return new Professor(firstName, lastName, id);
        }
    }

}
