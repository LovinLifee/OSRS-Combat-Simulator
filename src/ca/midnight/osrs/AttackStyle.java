package ca.midnight.osrs;

public enum AttackStyle {
	
	ACCURATE(3, 0, 0), CONTROLLED(1, 1, 1), AGGRESSIVE(0, 3, 0);
	
	private int attackBonus, strengthBonus, defenceBonus;
	
	AttackStyle(int attackBonus, int strengthBonus, int defenceBonus) {
		this.attackBonus = attackBonus;
		this.strengthBonus = strengthBonus;
		this.defenceBonus = defenceBonus;
	}
	
	public int getAttack() {
		return attackBonus;
	}
	
	public int getStrength() {
		return strengthBonus;
	}
	
	public int getDefence() {
		return defenceBonus;
	}
}
