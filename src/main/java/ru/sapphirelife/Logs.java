package ru.sapphirelife;

import org.bukkit.ChatColor;

public class Logs {

    private static final String prefix = ChatColor.YELLOW + "[LOG] ";

    public static void log(String msg) {
        System.out.println(prefix + ChatColor.RESET + "" + ChatColor.WHITE + msg);
    }

    public static void log(String... msg) {
        for (String message : msg) {
            System.out.println(prefix + ChatColor.RED + message);
        }
    }

    public static void error(String msg) {
        System.out.println(prefix + ChatColor.RED + msg);
    }

    public static void error(StackTraceElement msg) {
        System.out.println(prefix + ChatColor.RED + msg);
    }


    public static void error(String... msg) {
        for (String message : msg) {
            System.out.println(prefix + ChatColor.RED + message);
        }
    }

    public static void success(String msg) {
        System.out.println(prefix + ChatColor.GREEN + msg);
    }

    public static void success(String... msg) {
        for (String message : msg) {
            System.out.println(prefix + ChatColor.RED + message);
        }
    }

    public static void logStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement element : stackTrace) {
            error(element);
        }
    }
}
