package vending;

import vending.product.*;

public class OverloadedVendingMachine {

    int softDrinkQty, saltySnacksQty, chocolatesQty;

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
       this.softDrinkQty = softDrinkQty;
       this.saltySnacksQty = saltySnacksQty;
       this.chocolatesQty = chocolatesQty;
    }

    void buy(SoftDrink softdrink) {
        softDrinkQty = softDrinkQty - 1;
    }
    //buy 1 SoftDrink


    void buy(SaltySnack saltySnack) {
        saltySnacksQty = saltySnacksQty - 1 ;
    }
        //buy 1 SaltySnack

    void buy(Chocolate chocolate) {
        chocolatesQty = chocolatesQty - 1;
    }
        // buy 1 Chocolate

    void buy(Product product) {

    }
        //buy 1 of each product

    void addStock(SoftDrink softdrink) {
        softDrinkQty = softDrinkQty + 1;

    }
    //add 1 SoftDrink to stock

    void addStock(SaltySnack saltySnack) {
        saltySnacksQty = saltySnacksQty + 1 ;

    };
    //	add 1 SaltySnack to stock

    void addStock(Chocolate chocolate) {
        chocolatesQty = chocolatesQty + 1;

    };
    //	add 1 Chocolate to stock

    void addStock(Product product) {

    };
    //add 3 stock items for each Product type.

    int getStock(SoftDrink softdrink) {
        return softDrinkQty;
    }

    int getStock(SaltySnack saltySnack) {
        return saltySnacksQty;
    }
    int getStock(Chocolate chocolate) {
        return chocolatesQty;
    }
//    int getStock() {
//
//    }
}
