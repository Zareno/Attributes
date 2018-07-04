package nl.marido.attributes;

import org.bukkit.plugin.java.JavaPlugin;

public class Resource extends JavaPlugin {

public static Resource instance;	

public void onEnable() {
System.out.println("Thank you for using the Attributes resource.");
instance = this;
saveDefaultConfig();
// TODO: Add updater.
}

public void onDisable() {
System.out.println("Thank you for using the Attributes resource.");
}

public static Resource getInstance() {
return instance;
}

}