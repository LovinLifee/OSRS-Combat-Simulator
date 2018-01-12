package ca.midnight.osrs.boosts;

public enum Prayer implements Boost {
	
	NONE(1, 1, 1),
	THICK_SKIN(1, 1, 1.05), BURST_OF_STRENGTH(1, 1.05, 1), CLARITY_OF_THOUGHT(1.05, 1, 1),
	ROCK_SKIN(1, 1, 1.10), SUPER_HUMAN_STRENGTH(1, 1.10, 1), IMPROVED_REFLEXES(1.10, 1, 1),
	STEEL_SKIN(1, 1, 1.15), ULTIMATE_STRENGTH(1, 1.15, 1), INCREDIBLE_REFLEXES(1.15, 1, 1),
	CHIVALRY(1.15, 1.18, 1.20), PIETY(1.20, 1.23, 1.25);
	
	private double attackMultiplier, strengthMultiplier, defenceMultiplier;
	
	Prayer(double attackMultiplier, double strengthMultiplier, double defenceMultiplier) {
		this.attackMultiplier = attackMultiplier;
		this.strengthMultiplier = strengthMultiplier;
		this.defenceMultiplier = defenceMultiplier;
	}
	
	public double getDefenceMultiplier() {
		return defenceMultiplier;
	}

	@Override
	public double attackMultiplier() {
		return attackMultiplier;
	}

	@Override
	public double damageMultiplier() {
		return strengthMultiplier;
	}

	@Override
	public double defenceMultiplier() {
		return defenceMultiplier;
	}
}
