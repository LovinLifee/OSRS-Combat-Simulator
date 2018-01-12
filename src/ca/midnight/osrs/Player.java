package ca.midnight.osrs;

import ca.midnight.osrs.boosts.Armour;
import ca.midnight.osrs.boosts.Prayer;
import ca.midnight.osrs.boosts.SetEffect;

public class Player {

	private Prayer prayer;
	private AttackStyle attackStyle;
	private int attackLevel, strengthLevel, defenceLevel, hitpointsLevel, totalHitpoints, strengthBonus;

	public Prayer getPrayer() {
		return prayer;
	}

	public void setPrayer(Prayer prayer) {
		this.prayer = prayer;
	}

	public AttackStyle getAttackStyle() {
		return attackStyle;
	}

	public void setAttackStyle(AttackStyle attackStyle) {
		this.attackStyle = attackStyle;
	}

	public int getAttackLevel() {
		return attackLevel;
	}

	public void setAttackLevel(int attackLevel) {
		this.attackLevel = attackLevel;
	}

	public int getStrengthLevel() {
		return strengthLevel;
	}

	public void setStrengthLevel(int strengthLevel) {
		this.strengthLevel = strengthLevel;
	}

	public int getDefenceLevel() {
		return defenceLevel;
	}

	public void setDefenceLevel(int defenceLevel) {
		this.defenceLevel = defenceLevel;
	}

	public int getHitpointsLevel() {
		return hitpointsLevel;
	}

	public void setHitpointsLevel(int hitpointsLevel) {
		this.hitpointsLevel = hitpointsLevel;
	}
	
	public int getHitpoints() {
		return totalHitpoints;
	}
	
	public void setHitpoints(int hitpoints) {
		this.totalHitpoints = hitpoints;
	}

	public int getStrengthBonus() {
		return strengthBonus;
	}

	public void setStrengthBonus(int strengthBonus) {
		this.strengthBonus = strengthBonus;
	}
	
	public MaxHitFactory getMaxHitFactory() {
		return MaxHitFactory.of(this);
	}
	
	public static void test1() {
		Player player = new Player();
		player.setAttackStyle(AttackStyle.AGGRESSIVE);
		player.setStrengthLevel(99);
		player.setStrengthBonus(130);
		player.setPrayer(Prayer.PIETY);
		player.setHitpointsLevel(99);
		player.setHitpoints(66);
		System.out.println("Players max hit with dharok is: " + player.getMaxHitFactory().applyBoost(SetEffect.DHAROK(1, 99)).applyBoost(Armour.SALVE_AMULET_ENCHANTED).getMaxHit());
	}
	
	public static void test2() {
		int maxHit = new MaxHitFactory().setStrengthLevel(77).setAttackStyle(AttackStyle.AGGRESSIVE).setPrayer(Prayer.ULTIMATE_STRENGTH).setStrengthBonus(90).applyBoost(Armour.SALVE_AMULET).getMaxHit();
		System.out.println("Players max hit with random is: " + maxHit);
	}
	
	public static void main(String[] args) {
		test1();
		test2();
	}
}
