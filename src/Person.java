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
        if (this.dni < p.dni){
            return 1;
        }

        if (this.dni > p.dni){
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Name: "
                + this.name
                + ", DNI: "
                + this.dni;
    }
}
