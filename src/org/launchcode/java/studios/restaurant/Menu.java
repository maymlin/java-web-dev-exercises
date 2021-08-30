package org.launchcode.java.studios.restaurant;

import java.util.Date;
import java.util.ArrayList;
import java.util.Map;

public class Menu {
    Date lastUpdate = new Date();
    ArrayList<MenuItem> menuOfItems = new ArrayList<>();

    public Menu() {
    }

    public void setLastUpdate() {
        lastUpdate = new Date();
    }

    public void setMenuOfItems(ArrayList<MenuItem> aMenuOfItems) {
        menuOfItems = (ArrayList<MenuItem>) aMenuOfItems.clone();
        this.setLastUpdate();
    }

    public void addMenuItem(MenuItem aMenuItem) {
        setNewItemToFalse();
        menuOfItems.add(aMenuItem);
        this.setLastUpdate();
    }

    public void removeMenuItem(MenuItem aItem) {
        boolean isRemoved = menuOfItems.remove(aItem);

        if (isRemoved) {
            setNewItemToFalse();
            System.out.println("Success: menu item removed.");
        } else {
            System.out.println("Failed: item not in the menu.");
        }
    }

    private void setNewItemToFalse() {
        for (MenuItem item : menuOfItems) {
            item.setIsNewItem(false);
        }
    }

    public ArrayList<MenuItem> getMenuOfItems() {
        return menuOfItems;
    }

    public String getLastUpdate() {
        return lastUpdate.toString();
    }

    public void printMenu() {
        for (MenuItem item : menuOfItems) {
            item.printMenuItem();
        }
        System.out.println("Last Update: " + this.getLastUpdate());
    }
}
