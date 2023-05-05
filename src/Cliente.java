import enumaration.TypeEnum;

public class Cliente {

    private String name;
    private String address;
    private String telephoneNumber;
    private String eMail;
    private int age;
    private TypeEnum alimentazione;

    public Cliente(String name, String address, String telephoneNumber, String eMail, int age, TypeEnum alimentazione) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.eMail = eMail;
        this.age = age;
        this.alimentazione = alimentazione;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public TypeEnum getAlimentazione() {
        return alimentazione;
    }
    public void setAlimentazione(TypeEnum alimentazione) {
        this.alimentazione = alimentazione;
    }
}
