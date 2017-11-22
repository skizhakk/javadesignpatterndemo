package com.designpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Command pattern is a data driven design pattern and falls under 
 * behavioral pattern category. A request is wrapped under an object 
 * as command and passed to invoker object. Invoker object looks for
 *  the appropriate object which can handle this command and passes
 *  the command to the corresponding object which executes the command.
 * 
 * 
 * @author SKIZHAKK
 *
 */
public class CommandPattern {

	public static void main(String[] args) {
		
		BuyStock stockBuy = new BuyStock( new Stock(10, "SurajStock"));

		SellStock stockSell = new SellStock( new Stock(10, "SurajStock"));
		
		Broker broker = new Broker();
		broker.takeOrder(stockBuy);
		broker.takeOrder(stockSell);
		
		broker.executeOrders();
		
		broker.displayOrders();

	}
	
}

/**
 * 
 * 
 */
interface Order {
	
	public void execute();
}

class Stock {
	
	int quantity;
	String name;
	
	public Stock(int lQuantity, String lName) {
		this.quantity = lQuantity;
		this.name = lName;
	}
	
	public void buyStock() {
		System.out.println("Stock buying...");
		System.out.println("Quantity : "+quantity);
		System.out.println("Name : " +name);
		System.out.println("Stock buying...ends..");
		System.out.println("");
	}
	
	public void sellStock() {
		System.out.println("Stock selling...");
		System.out.println("Quantity : "+quantity);
		System.out.println("Name : " +name);
		System.out.println("Stock selling...ends..");
		System.out.println("");
	}
	
}

class BuyStock implements Order {

	private Stock bStock;
	
	public BuyStock(Stock stock) {
		super();
		this.bStock = stock;
	}



	@Override
	public void execute() {
		System.out.println("Execute triggered !! ");
		bStock.buyStock();
		
	}
	
	
	
	
}

class SellStock implements Order {

	private Stock sStock;
	
	public SellStock(Stock stock) {
		super();
		this.sStock = stock;
	}


	@Override
	public void execute() {
		sStock.sellStock();
		
	}
	
}

class Broker {
	
	private List<Order> orderList = new ArrayList<Order>();
	
	public void takeOrder(Order order) {
		orderList.add(order);
	}
	
	public void executeOrders() {
		
		for (Order ordr : orderList) {
			ordr.execute();
		}
		
		orderList.clear();
	}
	
	public void displayOrders() {
		
		for (Order ordr : orderList) {
			System.out.println(ordr.toString());
		}
		
	}
	
}


