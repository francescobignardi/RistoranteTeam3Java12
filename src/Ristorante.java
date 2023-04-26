import java.util.List;

public class Ristorante {
    private String name;
    private List<Menu> menuList;

    public Ristorante(String name, List<Menu>menuList){
        this.name=name;
        this.menuList=menuList;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Menu> getMenuList() {
        return menuList;
    }
    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}
