package nl.marido.attributes.handlers;

import org.bukkit.craftbukkit.v1_8_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

import net.minecraft.server.v1_8_R3.NBTTagCompound;
import net.minecraft.server.v1_8_R3.NBTTagInt;
import net.minecraft.server.v1_8_R3.NBTTagList;
import net.minecraft.server.v1_8_R3.NBTTagString;

public class Attributes {

public static ItemStack addAttribute(ItemStack item, String attribute, int amount) {
net.minecraft.server.v1_8_R3.ItemStack nmsitem = CraftItemStack.asNMSCopy(item);
NBTTagCompound compound = nmsitem.getTag();
if (compound == null) {
compound = new NBTTagCompound();
nmsitem.setTag(compound);
compound = nmsitem.getTag(); 
}
NBTTagList modifiers = new NBTTagList();
NBTTagCompound details = new NBTTagCompound();
details.set("AttributeName", new NBTTagString(attribute));
details.set("Name", new NBTTagString(attribute));
details.set("Amount", new NBTTagInt(amount));
details.set("Operation", new NBTTagInt(0));
details.set("UUIDLeast", new NBTTagInt(894654));
details.set("UUIDMost", new NBTTagInt(2872));
modifiers.add(details);
compound.set("AttributeModifiers", modifiers);
nmsitem.setTag(compound);
item = CraftItemStack.asBukkitCopy(nmsitem);
return item;
}

// Not tested yet.
public static String getAttributes(ItemStack item) {
net.minecraft.server.v1_8_R3.ItemStack nmsitem = CraftItemStack.asNMSCopy(item);
NBTTagCompound compound = nmsitem.getTag();
if (compound == null) {
compound = new NBTTagCompound();
nmsitem.setTag(compound);
compound = nmsitem.getTag(); 
}
NBTTagList modifiers = new NBTTagList();
return modifiers.toString();
}

}