package ca.midnight.osrs;

import ca.midnight.osrs.boosts.Boost;
import ca.midnight.osrs.boosts.Prayer;

public class MaxHitFactory {

	private int strengthLevel = 1, strengthBonus = 0;
	private AttackStyle attackStyle = AttackStyle.AGGRESSIVE;
	private Prayer prayer = Prayer.NONE;
	private double hitMultiplier = 1D;
	
	public MaxHitFactory setStrengthBonus(int strengthBonus) {
		this.strengthBonus = strengthBonus;
		return this;
	}
	
	public MaxHitFactory setStrengthLevel(int strengthLevel) {
		this.strengthLevel = strengthLevel;
		return this;
	}
	
	public MaxHitFactory setPrayer(Prayer prayer) {
		this.prayer = prayer;
		return this;
	}
	
	public MaxHitFactory setAttackStyle(AttackStyle attackStyle) {
		this.attackStyle = attackStyle;
		return this;
	}
	
	public MaxHitFactory applyBoost(Boost boost) {
		return applyBoost(boost.damageMultiplier());
	}
	
	public MaxHitFactory applyBoost(double damageMultiplier) {
		hitMultiplier *= damageMultiplier;
		return this;
	}
	
	public static MaxHitFactory of(Player player) {
		MaxHitFactory factory = new MaxHitFactory();
		factory.setStrengthLevel(player.getStrengthLevel());
		factory.setAttackStyle(player.getAttackStyle());
		factory.setPrayer(player.getPrayer());
		factory.setStrengthBonus(player.getStrengthBonus());
		return factory;
	}
	
	public int getMaxHit() {
		//casting to int rounds down to nearest integer by removing trailing decimals
		int effectiveLevel = (int) ((strengthLevel * prayer.damageMultiplier()) + attackStyle.getStrength()) + 8;
		int maxHit = (int) (0.5 + effectiveLevel * (strengthBonus + 64) / 640);
		return maxHit *= hitMultiplier;
	}
}
