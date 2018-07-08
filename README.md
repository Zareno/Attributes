## Attributes
Attributes is an amazing useful updated stable liberary to modify and add attributes to items that does not bring any issue to your server and the compiled version can be downloaded from the official SpigotMC resource page of Attributes.
> **Note:**  Update the imports (currently set to Spigot 1.8-R3) if you are using a newer version of Spigot.
</br>
 
## Developers
Here is an example with built-in methods for developers that want to use the Attributes to modify and add attributes.
```ruby
# Create the ItemStack object before we can add attributes.
ItemStack item = new ItemStack(Material.COOKIE);

# Add an attribute to the item and for now a hundred damage.
item = Attributes.addAttribute(item, "generic.attackDamage", 100);

# Get a NBTTagList of modifiers on the item by calling this.
String list = Attributes.getAttributes(item);
```
