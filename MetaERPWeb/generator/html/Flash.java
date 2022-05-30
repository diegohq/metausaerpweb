package generator.html;

import configuration.FlashLoader;

public class Flash
{
  protected static String nl;
  public static synchronized Flash create(String lineSeparator)
  {
    nl = lineSeparator;
    Flash result = new Flash();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "<?php" + NL + "" + NL + "$class = str_replace('success', '";
  protected final String TEXT_3 = "', $class);" + NL + "$class = str_replace('error', '";
  protected final String TEXT_4 = "', $class);" + NL + "$class = str_replace('info', '";
  protected final String TEXT_5 = "', $class);" + NL + "" + NL + "?>" + NL + "" + NL + "{BEFORE_FLASH}" + NL + "        <div class=\"<?php echo $class ?>\">" + NL + "            <?php echo (isset($message)? $message : 'Something happen, please contact us' ) ?>" + NL + "            {AFTER_FLASH_MESSAGE}" + NL + "        </div>" + NL + "{AFTER_FLASH}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
     FlashLoader flash = (FlashLoader) argument; 
    stringBuffer.append(TEXT_2);
    stringBuffer.append( flash.getSucessClass() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( flash.getErrorClass() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( flash.getInfoClass() );
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
