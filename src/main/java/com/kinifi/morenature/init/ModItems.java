package com.kinifi.morenature.init;

import java.util.ArrayList;
import java.util.List;

import com.kinifi.morenature.items.ItemBase;

import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//ore types
	public static final Item Ruby = new ItemBase("Ruby");
	public static final Item RubyDust = new ItemBase("RubyDust");
	
	//currency
	public static final Item CoinOne = new ItemBase("CoinOne");
	
}
