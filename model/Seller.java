package model;

public class Seller extends Employee {
    private double revenue;

    public Seller(String name, double salary, double revenue) {
        super(name, salary);
        this.revenue = revenue;
    }


    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        System.out.printf(" - Revenue: %s",revenue);
        return "--------------------------";
    }
}

