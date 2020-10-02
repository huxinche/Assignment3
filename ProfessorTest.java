package edu.neu.info5100;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor.Builder("Jike", "Peter")
                .serId(1234556)
                .build();

        System.out.println("Professor's first name is: "+professor.getFirstName());
        System.out.println("Professor's last name is: "+professor.getLastName());
        System.out.println("Professor's id is: "+professor.getId());

    }
}
