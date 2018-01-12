package ca.midnight.osrs.boosts;

public enum Armour implements Boost {
	
	VOID(1.10, 1.10D), BLACK_MASK(7/6, 7/6), SALVE_AMULET(7/6, 7/6), SALVE_AMULET_ENCHANTED(1.20, 1.20);

	private double attackMultiplier, damageMultiplier, defenceMultiplier;
	
	Armour(double attackMultiplier, double damageMultiplier, double defenceMultiplier) {
		this.attackMultiplier = attackMultiplier;
		this.damageMultiplier = damageMultiplier;
		this.defenceMultiplier = defenceMultiplier;
	}
	
	Armour(double attackMultiplier, double damageMultiplier) {
		this(attackMultiplier, damageMultiplier, 1D);
	}
	
	@Override
	public double attackMultiplier() {
		return attackMultiplier;
	}

	@Override
	public double damageMultiplier() {
		return damageMultiplier;
	}

	@Override
	public double defenceMultiplier() {
		return defenceMultiplier;
	}
}
