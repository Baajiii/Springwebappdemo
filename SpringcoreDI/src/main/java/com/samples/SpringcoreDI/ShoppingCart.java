package com.samples.SpringcoreDI;

public class ShoppingCart {
	private item Item;

	public item getItem() {
		return Item;
	}

	public void setItem(item item) {
		Item = item;
	}

	@Override
	public String toString() {
		return "ShoppingCart [Item=" + Item + "]";
	}

}
