public class Truck extends Vehicle{
    private String cargo;

    public Truck(String name, int wheels, String cargo) {
        super(name, wheels);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void haul() {
        System.out.println("This truck is hauling " + cargo + " right now!");
    }
}
