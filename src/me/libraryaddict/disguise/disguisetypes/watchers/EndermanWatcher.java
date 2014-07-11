package me.libraryaddict.disguise.disguisetypes.watchers;

import org.bukkit.inventory.ItemStack;

import me.libraryaddict.disguise.disguisetypes.Disguise;

public class EndermanWatcher extends LivingWatcher {

    public EndermanWatcher(Disguise disguise) {
        super(disguise);
    }

    @Override
    public ItemStack getItemInHand() {
        return new ItemStack((Byte) getValue(16, (byte) 0), 1, ((Byte) getValue(17, (byte) 0)));
    }

    public boolean isAgressive() {
        return (Byte) getValue(18, (byte) 0) == 1;
    }

    public void setAgressive(boolean isAgressive) {
        setValue(18, (byte) (isAgressive ? 1 : 0));
        sendData(18);
    }

    @Override
    public void setItemInHand(ItemStack itemstack) {
        setValue(16, (byte) (itemstack.getTypeId() & 255));
        setValue(17, (byte) (itemstack.getDurability() & 255));
    }

}
