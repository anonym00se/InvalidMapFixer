# InvalidMapFixer
Spigot plugin to stop maps with high IDs from depleting the map pool after map reset on 1.12.2.

# Installation

To install and use the plugin, drop it into your plugins folder.  
There are 3 different operating modes that can be changed in the config file (case-sensitive).  
 - Disabled: Disables plugin.  
 - Basic: Deletes null maps from containers when interacted with.  
 - Full: Also deletes null maps when picked up by players (default).

Building needs Spigot API, build it or download from here:  
https://hub.spigotmc.org/nexus/content/repositories/snapshots/org/spigotmc/spigot-api/
