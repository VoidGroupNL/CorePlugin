package nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_3.util;

import org.jetbrains.annotations.Nullable;

public enum Color {
    BLACK("§0", "\u001b[30"),
    BLUE("§1", "\u001b[34"),
    GREEN("§2", "\u001b[32"),
    CYAN("§3", "\u001b[36"),
    RED("§4", "\u001b[31"),
    MAGENTA("§5", "\u001b[35"),
    YELLOW("§6", "\u001b[33"),
    WHITE("§7", "\u001b[37"),

    LIGHT_BLACK("§0", "\u001b[30;1m"),
    LIGHT_BLUE("§1", "\u001b[34;1m"),
    LIGHT_GREEN("§2", "\u001b[32;1m"),
    LIGHT_CYAN("§3", "\u001b[36;1m"),
    LIGHT_RED("§4", "\u001b[31;1m"),
    LIGHT_MAGENTA("§5", "\u001b[35;1m"),
    LIGHT_YELLOW("§6", "\u001b[33;1m"),
    LIGHT_WHITE("§7", "\u001b[37;1m"),

    BOLD("§l", "\u001b[1m"),
    UNDERLINE("§n", "\u001b[4m"),
    /**
     * <h3>WARNING: NOT SUPPORTED IN CONSOLE</H3>
     */
    ITALIC("§o", null),
    /**
     * <h3>WARNING: NOT SUPPORTED IN CONSOLE</H3>
     */
    MAGIC("§k", null),
    /**
     * <h3>WARNING: NOT SUPPORTED IN CONSOLE</H3>
     */
    STRIKE("§m", null),
    RESET("§r", "\u001b[0m");

    private String _MC_CODE;
    private String _ANSI_CODE;

    private Color(String MC_CODE, String ANSI_CODE) {
        this._MC_CODE = MC_CODE;
        this._ANSI_CODE = ANSI_CODE;
    }

    public String getMCCode() {
        return _MC_CODE;
    }
    @Nullable
    public String getANSICode() {
        return _ANSI_CODE;
    }
}
