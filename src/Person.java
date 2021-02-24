public class Person implements Precedable<Person>{
    private String name;
    private int dni;

    public Person(String name, int dni) {
        this.name = name;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public int precedeTo(Person p) {
        return p.dni - this.dni;
    }

    @Override
    public String toString() {
        return "Name: "
                + this.name
                + ", DNI: "
                + this.dni;
    }
}
