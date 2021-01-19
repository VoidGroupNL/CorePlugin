package nl.voidgroup.minecraft.server.coreplugin.v0_0_1_dev_3.util;

import java.util.regex.Pattern;

public abstract class Version {
  private static String validVersion = "/[^0-9.]|^\\.|\\.$|\\.\\./g";
  private final String M_Version;
  
  public Version(String M_MainVersion, int M_VersionPriority, int M_SubVersion) {
    if(Pattern.matches(validVersion, M_MainVersion)) {
      throw new IllegalArgumentException("M_MainVersion is invalid");
    }
    M_Version = M_MainVersion + '.' + M_VersionPriority + '.' + M_SubVersion;
  }
  @Override
  public String toString() {
    return M_Version;
  }

}
