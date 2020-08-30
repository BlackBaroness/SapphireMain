package ru.sapphirelife;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class SapphireMain extends JavaPlugin {

    private static SapphireMain instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    public static SapphireMain getInstance() {
        return instance;
    }

    public ItemStack getReturnStone() {
        return new ItemStack(Material.getMaterial("SAPPHIREITEMS_RETURNSTONE"));
    }

    public ItemStack getEconomyPack() {
        return new ItemStack(Material.getMaterial("SAPPHIREDONATE_ECONOMY"));
    }

    public ItemStack getMagicPack() {
        return new ItemStack(Material.getMaterial("SAPPHIREDONATE_MAGIC"));
    }

    public ItemStack getTechnoPack() {
        return new ItemStack(Material.getMaterial("SAPPHIREDONATE_TECHNO"));
    }

    public ItemStack getAdvancedMagicPack() {
        return new ItemStack(Material.getMaterial("SAPPHIREDONATE_ADVANCED"));
    }

    public ItemStack getScrollNearnessPack10() {
        return new ItemStack(Material.getMaterial("SAPPHIREDONATE_SCROLL_10"));
    }

    public ItemStack getScrollNearnessPack25() {
        return new ItemStack(Material.getMaterial("SAPPHIREDONATE_SCROLL_25"));
    }

    public ItemStack getScrollNearnessPack50() {
        return new ItemStack(Material.getMaterial("SAPPHIREDONATE_SCROLL_50"));
    }

    public ItemStack getDough() {
        return new ItemStack(Material.getMaterial("SAPPHIREBREAD_TIESTO"));
    }

    public ItemStack getSecretSword() {
        ItemStack secretSword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta3 = secretSword.getItemMeta();
        meta3.setDisplayName(ChatColor.MAGIC + "прозреть");
        List<String> lore3 = new ArrayList<>();
        lore3.add(ChatColor.GRAY + "Время открыть глаза на мир");
        meta3.setLore(lore3);
        secretSword.setItemMeta(meta3);
        return secretSword;
    }

    public ItemStack getColdBow() {
        ItemStack coldBow = new ItemStack(Material.BOW);
        ItemMeta meta2 = coldBow.getItemMeta();
        meta2.setDisplayName(ChatColor.GRAY + "Ледяной лук");
        List<String> lore2 = new ArrayList<>();
        lore2.add(ChatColor.GRAY + "Замораживайте врагов");
        lore2.add(ChatColor.GRAY + "            и обрывайте их полёт.");
        meta2.setLore(lore2);
        coldBow.setItemMeta(meta2);
        return coldBow;
    }


    public ItemStack getScrollNearness() {
        ItemStack scrollNearness = new ItemStack(Material.PAPER);
        ItemMeta meta1 = scrollNearness.getItemMeta();
        meta1.setDisplayName(ChatColor.YELLOW + "Свиток Близости");
        List<String> lore1 = new ArrayList<>();
        lore1.add(ChatColor.GREEN + "В этом невзрачном свитке заключена магия телепортации.");
        lore1.add(ChatColor.GREEN + "Учтите, перезарядка подобных действий: " + ChatColor.YELLOW + "20 минут" + ChatColor.GREEN + ".");
        meta1.setLore(lore1);
        scrollNearness.setItemMeta(meta1);
        return scrollNearness;
    }
}
