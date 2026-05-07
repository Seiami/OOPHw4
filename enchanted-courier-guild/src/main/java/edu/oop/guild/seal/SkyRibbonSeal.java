package edu.oop.guild.seal;

public class SkyRibbonSeal implements PackageSeal {

	@Override
	public String apply(String s) {
		if(s == null) throw new NullPointerException();
		return "☁ " + s + " ☁";
	}

	@Override
	public int durability() {
		return 7;
	}

}
