package decorator;

abstract class Pizza {
    // it is an abstract pizza
    String description = "Unknown Pizza";

    // getter for description
    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}
