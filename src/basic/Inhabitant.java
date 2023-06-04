package basic;

public abstract class Inhabitant {
    //Для типов обитателей: рыбки, амфибии, моллюски.
    protected String breed;

    public Inhabitant(String breed) {
        this.breed = breed;
    }

    public abstract String food();
    public abstract String type();

    @Override
    public String toString() {
        return String.format("%sВид: %s. Корм: %s", type(), breed, food());
    }
}
