package practicexml.parsers;

import java.util.Objects;

public class Bank {
    private Long id;

    private String name;

    private Long bik;

    private String address;

    public Bank() {
    }

    public Bank(Long id, String name, Long bik, String address) {
        this.id = id;
        this.name = name;
        this.bik = bik;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBik() {
        return bik;
    }

    public void setBik(Long bik) {
        this.bik = bik;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(id, bank.id) &&
                Objects.equals(name, bank.name) &&
                Objects.equals(bik, bank.bik) &&
                Objects.equals(address, bank.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, bik, address);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bik=" + bik +
                ", address='" + address + '\'' +
                '}';
    }
}
