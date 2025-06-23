import java.time.LocalDate;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public LocalDate setManufactureDate(LocalDate manufactureDate) {
        return this.manufactureDate = manufactureDate;
    }

    public String priceTag(){
        return getName() + "(used) " + " $ " + getPrice() + " (Manufacture date: " + manufactureDate + ")";
    }

}
