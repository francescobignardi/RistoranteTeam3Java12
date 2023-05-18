import enumaration.TypeEnum;

public class Cliente {

    private String name;
    private String surname;
    private String address;
    private String telephoneNumber;
    private String eMail;
    private int age;
    private TypeEnum tipo;

    public Cliente(String name, String surname, String address, String telephoneNumber, String eMail, int age, TypeEnum tipo) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.eMail = eMail;
        this.age = age;
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public TypeEnum getTipo() {
        return tipo;
    }

    public void setTipo(TypeEnum alimentazione) {
        this.tipo = tipo;
    }


}
