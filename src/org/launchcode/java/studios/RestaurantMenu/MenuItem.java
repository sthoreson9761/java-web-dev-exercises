package org.launchcode.java.studios.RestaurantMenu;

public class MenuItem {
    private Double price;
    private String description;
    private String category;

    public MenuItem(Double price,String description,String category){
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public MenuItem(){

    }
    public boolean validItem(){
        if(this.getCategory() == "N/A"){
            return false;
        }else{
            return true;
        }
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = Math.round(price * 100.0) / 100.0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {

        switch(category){
            case "appetizer":
                this.category = "appetizer";
                break;
            case "main course":
                this.category = "main course";
                break;
            case "dessert":
                this.category = "dessert";
                break;
            default: this.category = "N/A";
        }
    }
    public boolean anotherItem(String input){
        do{
            if (input.toLowerCase() == "n"){
                return true;
            }else if(input.toLowerCase() == "y"){
                return false;
            }else{
                System.out.println("Incorrect input. Try again.");
            }
        }while(true);
    }

}
