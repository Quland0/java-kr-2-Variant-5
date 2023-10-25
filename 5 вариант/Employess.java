public class Employess {
    private int Eid;
    private String ename;
    private int age;
    private boolean isMan;
    private String shop;
    public Employess(int Eid, String ename, int age, boolean isMan, String shop) {
        this.Eid = Eid;
        this.ename = ename;
        this.age = age;
        this.isMan = isMan;
        this.shop = shop;
    }
    public int getEid() {
        return Eid;
    }
    public void setEid(int eid) {
        Eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isMan() {
        return isMan;
    }
    public void setMan(boolean man) {
        isMan = man;
    }
    public String getShop() {
        return shop;
    }
    public void setShop(String shop) {
        this.shop = shop;
    }
    public void print() {
        System.out.println("Employee id: " + this.Eid);
        System.out.println("Ename: " + this.ename);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + (isMan ? "Мужской" : "Женский"));
        System.out.println("shop: " + this.shop);
    }
}
