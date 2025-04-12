package day12;

public class Account {
    private int accno;
    private String name;
    private double bal;

    /**
     * @return int return the accno
     */
    public int getAccno() {
        return accno;
    }

    /**
     * @param accno the accno to set
     */
    public void setAccno(final int accno) {
        this.accno = accno;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return double return the bal
     */
    public double getBal() {
        return bal;
    }

    /**
     * @param bal the bal to set
     */
    public void setBal(final double bal) {
        this.bal = bal;
    }

}
