package kr.co.restful;

import lombok.Data;

public class Shop {

    // 기존 코드
//    public void sell(Account account, Product product) {
//        long price = product.getPrice();
//        long mileage = account.getMoney();
//        if(mileage >= price) {
//            account.setMoney(mileage - price);
//            System.out.println(product.getName() + "를 구매했습니다.");
//        } else {
//            System.out.println("잔액이 부족합니다.");
//        }
//    }

    // TDA 원칙을 의거한 코드
    public void sell(Account account, Product product) {
        if(account.canAfford(product.getPrice())) {
            account.withdraw(product.getPrice());
            System.out.println(product.getName() + "를 구매했습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}

@Data
class Account {
    private long money;

    public boolean canAfford(long amount) {
        return money >= amount;
    }

    public void withdraw(long amount) {
        money -= amount;
    }
}

@Data
class Product {
    private String name;
    private long price;
}
