package ca.midnight.osrs.boosts;

public class SetEffect implements Boost {
	
	public static SetEffect DHAROK(int currentHp, int maxHp) {
		SetEffect effect = new SetEffect() {
			@Override
			public double damageMultiplier() {
				return ((maxHp - currentHp) * 0.01) + 1;
			}
		};
		return effect;
	}

	@Override
	public double attackMultiplier() {
		return 1D;
	}

	@Override
	public double damageMultiplier() {
		return 1D;
	}

	@Override
	public double defenceMultiplier() {
		return 1D;
	}
}
