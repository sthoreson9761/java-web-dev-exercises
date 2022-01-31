package org.launchcode.java.studios.RestaurantMenu;
import java.util.*;
public class Main {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        ArrayList<MenuItem> initMenuList = new ArrayList<>();
        boolean validCategory = false;

        while (true){
            MenuItem menuItem = new MenuItem();
            do{
                Double itemPrice = input.nextDouble();
                String itemDescription = input.nextLine();
                String itemCategory = input.nextLine();
                menuItem.setPrice(itemPrice);
                menuItem.setDescription(itemDescription);
                menuItem.setCategory(itemCategory);
                if(menuItem.validItem()){
                    validCategory = true;
                }
            }while(validCategory == false);
            initMenuList.add(menuItem);
            if(menuItem.anotherItem(input.nextLine())){
                break;
            }
        }
        menu.setMenuItems(initMenuList);
        menu.setOriginalMenuItems(initMenuList);
        ArrayList<MenuItem> currentMenuList = menu.getMenuItems();
        menu.printMenu(currentMenuList);
        do{
            int in = input.nextInt();
            switch (in){
                case 0:
                    MenuItem menuItem2 = new MenuItem();
                    Double itemPrice = input.nextDouble();
                    String itemDescription = input.nextLine();
                    String itemCategory = input.nextLine();
                    menuItem2.setPrice(itemPrice);
                    menuItem2.setDescription(itemDescription);
                    menuItem2.setCategory(itemCategory);
                    if(menuItem2.validItem()){
                        validCategory = currentMenuList.add(menuItem2);
                    }
                    break;
                case 1:
                    menu.printMenu(currentMenuList);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid input.");
            }
            if(in == 2){
                break;
            }
        }while (true);

    }
}
