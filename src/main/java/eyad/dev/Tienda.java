package eyad.dev;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String name;
    private String owner;
    private String storeTaxId;
    private List<Computador> computers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStoreTaxId() {
        return storeTaxId;
    }

    public void setStoreTaxId(String storeTaxId) {
        this.storeTaxId = storeTaxId;
    }

    public List<Computador> getComputers() {
        return computers;
    }

    public void setComputers(List<Computador> computers) {
        this.computers = computers;
    }

    public Tienda(String name, String owner, String storeTaxId, List<Computador> computers) {
        this.name = name;
        this.owner = owner;
        this.storeTaxId = storeTaxId;
        this.computers = new ArrayList<>(computers);
    }

    public void addComputer(Computador computer) {
        computers.add(computer);
    }

    public boolean removeComputer(String brand) {
        return computers.removeIf(c -> c.getBrand().equalsIgnoreCase(brand));
    }

    public Computador findComputer(String brand) {
        return computers.stream()
                .filter(c -> c.getBrand().equalsIgnoreCase(brand))
                .findFirst()
                .orElse(null);
    }

    public List<Computador> listComputers() {
        return new ArrayList<>(computers);
    }
}