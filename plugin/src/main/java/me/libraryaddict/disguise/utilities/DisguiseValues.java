package me.libraryaddict.disguise.utilities;

import lombok.Setter;
import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.utilities.reflection.FakeBoundingBox;

import java.util.HashMap;

@Setter
public class DisguiseValues {
    private static final HashMap<DisguiseType, DisguiseValues> values = new HashMap<>();

    public static DisguiseValues getDisguiseValues(DisguiseType type) {
        return values.get(type);
    }

    private FakeBoundingBox adultBox;
    private FakeBoundingBox babyBox;
    private final double maxHealth;

    public DisguiseValues(DisguiseType type, double maxHealth) {
        values.put(type, this);
        this.maxHealth = maxHealth;
    }

    public FakeBoundingBox getAdultBox() {
        return adultBox;
    }

    public FakeBoundingBox getBabyBox() {
        return babyBox;
    }

    public double getMaxHealth() {
        return maxHealth;
    }
}
