package org.launchcode.java.studios.restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem mapoTofu = new MenuItem("Mapo Tofu", 10.78, "Spicy tofu with ground pork", "main course");
        MenuItem vindaloo = new MenuItem("Vindaloo", 12.85, "Marinated pork in very spicy curry", "main course");
        MenuItem buffaloWings = new MenuItem("Buffalo Wings", 6.53, "Spicy mouth-watering chicken wings", "appetizer");
        MenuItem daifuku = new MenuItem("Daifuku", 3.75, "Sweet red bean paste wrapped in chewy mochi", "dessert");

        Menu newMenu = new Menu();
        newMenu.addMenuItem(mapoTofu);
        newMenu.addMenuItem(vindaloo);
        newMenu.addMenuItem(buffaloWings);
        newMenu.addMenuItem(daifuku);

        System.out.println("*** Print Menu ***");
        newMenu.printMenu();

        newMenu.removeMenuItem(mapoTofu);
        System.out.println();
        newMenu.printMenu();
    }
}
