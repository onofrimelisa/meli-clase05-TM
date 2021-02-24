public class Cellphone implements Precedable<Cellphone>{
    private int number;
    private String owner;

    public Cellphone(int number, String owner) {
        this.number = number;
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public int precedeTo(Cellphone cellphone) {
        return this.owner.compareTo(cellphone.owner);
    }

    @Override
    public String toString() {
        return "Cellphone: "
                + this.number
                + ", Owner: "
                + this.owner;
    }
}
