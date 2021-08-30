package org.launchcode.java.studios.restaurant;

import java.util.Date;
import java.util.ArrayList;
import java.util.Map;

public class Menu {
    Date lastUpdate = new Date();
    ArrayList<MenuItem> menuOfItems = new ArrayList<>();

    public Menu() {
    }

    public void addMenuItem(MenuItem aMenuItem) {
        if (checkDuplicateItem(aMenuItem)) {
            System.out.println("Item \"" + aMenuItem.getItem() + "\" already on the menu.");
        } else {
            setNewItemToFalse();
            menuOfItems.add(aMenuItem);
            this.setLastUpdate();
            System.out.println("New item \"" + aMenuItem.getItem() + "\" successfully added to the menu.");
        }
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

    private boolean checkDuplicateItem(MenuItem newItem) {
        for (MenuItem item : menuOfItems) {
            if (item.equals(newItem)) {
                return true;
            }
        }
        return false;
    }

    public void setLastUpdate() {
        lastUpdate = new Date();
    }

    public void setMenuOfItems(ArrayList<MenuItem> aMenuOfItems) {
        menuOfItems = (ArrayList<MenuItem>) aMenuOfItems.clone();
        this.setLastUpdate();
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
