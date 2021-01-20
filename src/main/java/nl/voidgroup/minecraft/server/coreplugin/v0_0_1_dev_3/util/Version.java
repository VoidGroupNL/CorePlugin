package nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_3.util;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Version {
  private static final Pattern HSC_T_VERSION_PATTERN = Pattern.compile("([^0-9.]|^\\.|\\.$|\\.\\.)+");

  private static final String SC_S_VERSION = "t";

}
