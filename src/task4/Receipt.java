package task4;

import java.util.*;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private List<Integer> width = new ArrayList<>(Arrays.asList(15, 5, 10));




    public void setWidth(Integer itemQty, Integer qtyPrice, Integer priceEnd) {
        width.clear();
        width.add(itemQty);
        width.add(qtyPrice);
        width.add(priceEnd);
    }


    public void printTitle() {
        f.format("%-" + width.get(0) + "s %" + width.get(1) + "s %" + width.get(2) + "s\n", "Item", "Qty", "Price");
        f.format("%-" + width.get(0) + "s %" + width.get(1) + "s %" + width.get(2) + "s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format("%-15.15s %5d %10.2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-" + width.get(0) + "s %" + width.get(1) + "s %" + width.get(2) + ".2f\n", "Tax", "", total * 0.06);
        f.format("%-" + width.get(0) + "s %" + width.get(1) + "s %" + width.get(2) + "s\n", "", "", "-----");
        f.format("%-" + width.get(0) + "s %" + width.get(1) + "s %" + width.get(2) + ".2f\n", "Total", "",
                total * 1.06);
    }
}
