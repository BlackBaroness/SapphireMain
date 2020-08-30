package ru.sapphirelife;

import org.bukkit.ChatColor;

public class Logs {

    private static final String prefix = ChatColor.YELLOW + "[LOG] ";

    public static void log(String msg) {
        System.out.println(prefix + ChatColor.RESET + "" + ChatColor.WHITE + msg);
    }

    public static void error(String msg) {
        System.out.println(prefix + ChatColor.RED + msg);
    }

    public static void success(String msg) {
        System.out.println(prefix + ChatColor.GREEN + msg);
    }
}
