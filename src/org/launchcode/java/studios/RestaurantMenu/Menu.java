package org.launchcode.java.studios.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private ArrayList<MenuItem> originalMenuItems;
    private boolean isNew;
    private Date dateUpdated;

    public Menu(ArrayList<MenuItem> menuItems, ArrayList<MenuItem> originalMenuItems, boolean isNew, Date dateUpdated) {
        this.menuItems = menuItems;
        this.originalMenuItems = originalMenuItems;
        this.isNew = isNew;
        this.dateUpdated = dateUpdated;
    }
    public Menu(){

    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public boolean addMenuItem(MenuItem itemIn){
        if (itemIn.validItem()){
            this.menuItems.add(itemIn);
            this.setNew(true);
            return true;
        }else{
            return false;
        }

    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<MenuItem> getOriginalMenuItems() {
        return originalMenuItems;
    }

    public void setOriginalMenuItems(ArrayList<MenuItem> originalMenuItems) {
        this.originalMenuItems = originalMenuItems;
    }

    public boolean isNew() {
        Date update = new Date();
        for (int i = 0; i< this.menuItems.size();i++){
            if(i > this.getOriginalMenuItems().size()){
                isNew = true;
//                System.out.println(this.menuItems.get(i).getDescription() + " is new.");
                this.setDateUpdated(update);
            }else{
                isNew = false;
            }

        }
//        System.out.println("Last updated: " + this.getDateUpdated().getTime());
        return isNew;
    }

    public void setNew(boolean aNew) {
        Date update = new Date();
        for (int i = 0; i< this.menuItems.size();i++){
            if(i > this.originalMenuItems.size()){
                isNew = aNew;
                this.setDateUpdated(update);
            }else{
                isNew = false;
            }

        }

    }

    public Date getDateUpdated() {
        this.originalMenuItems = this.getMenuItems();
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
//        long dateDay = dateUpdated;
        this.dateUpdated = dateUpdated;
    }
    public void printMenu(ArrayList<MenuItem> currentItems){
        for (MenuItem mi:currentItems) {
            System.out.println("\nDescription: "+ mi.getDescription());
            System.out.println("Category: "+ mi.getCategory());
            System.out.println("Price: "+ mi.getPrice());
            if(isNew){
                System.out.println("New Item");
            }else{
                System.out.println("Original");
            }
        }
        System.out.println("Last updated: " + this.getDateUpdated().getTime());

    }
}
