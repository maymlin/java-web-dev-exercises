package org.launchcode.java.studios.restaurant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem mapoTofu = new MenuItem("Mapo Tofu", 10.78, "Spicy tofu with ground pork", "main course");
        MenuItem vindaloo = new MenuItem("Vindaloo", 12.85, "Marinated pork in very spicy curry", "main course");
        MenuItem buffaloWings = new MenuItem("Buffalo Wings", 6.53, "Spicy mouth-watering chicken wings", "appetizer");
        MenuItem daifuku = new MenuItem("Daifuku", 3.75, "Sweet red bean paste wrapped in chewy mochi", "dessert");
        MenuItem calamari = new MenuItem("Calamari", 7.25, "Batter-coated fried squid rings", "appetizer");

        Menu newMenu = new Menu();
        newMenu.addMenuItem(mapoTofu);
        newMenu.addMenuItem(vindaloo);
        newMenu.addMenuItem(buffaloWings);
        newMenu.addMenuItem(calamari);
        newMenu.addMenuItem(daifuku);
        System.out.println();

        System.out.println("*** Print Menu ***");
        newMenu.printMenu();

        newMenu.removeMenuItem(mapoTofu);
        System.out.println();
        System.out.println("*** Updated Menu - Removed Mapo Tofu");
        newMenu.printMenu();
        System.out.println();

        System.out.println("*** Attempt to add duplicate item to menu - Add buffalo wings");
        newMenu.addMenuItem(buffaloWings);



    }
}
