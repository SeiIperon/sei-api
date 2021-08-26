/**
 * 
 */
package br.gov.ro.pge.sei.api.message;

import br.gov.ro.pge.sei.api.config.MessageBundle;

import java.text.MessageFormat;


/**
 * @author Janon
 * 
 */
public class Message {
	// --
	public static final String MN00001 = MessageBundle.getMessage("MN00001");
	public static final String MN00002 = MessageBundle.getMessage("MN00002");
	public static final String MN00003 = MessageBundle.getMessage("MN00003");
	public static final String MN00004 = MessageBundle.getMessage("MN00004");
	public static final String MN00005 = MessageBundle.getMessage("MN00005");
	public static final String MN00006 = MessageBundle.getMessage("MN00006");
	public static final String MN00007 = MessageBundle.getMessage("MN00007");
	public static final String MN00008 = MessageBundle.getMessage("MN00008");
	public static final String MN00009 = MessageBundle.getMessage("MN00009");
	public static final String MN00010 = MessageBundle.getMessage("MN00010");
	public static final String MN00011 = MessageBundle.getMessage("MN00011");
	public static final String MN00012 = MessageBundle.getMessage("MN00012");
	public static final String MN00013 = MessageBundle.getMessage("MN00013");
	public static final String MN00014 = MessageBundle.getMessage("MN00014");
	public static final String MN00015 = MessageBundle.getMessage("MN00015");
	// --
	public static final String MNE00001 = MessageBundle.getMessage("MNE00001");
	public static final String MNE00002 = MessageBundle.getMessage("MNE00002");
	public static final String MNE00003 = MessageBundle.getMessage("MNE00003");
	public static final String MNE00004 = MessageBundle.getMessage("MNE00004");
	public static final String MNE00005 = MessageBundle.getMessage("MNE00005");
	public static final String MNE00006 = MessageBundle.getMessage("MNE00006");
	public static final String MNE00007 = MessageBundle.getMessage("MNE00007");
	public static final String MNE00008 = MessageBundle.getMessage("MNE00008");
	public static final String MNE00009 = MessageBundle.getMessage("MNE00009");
	public static final String MNE00010 = MessageBundle.getMessage("MNE00010");
	public static final String MNE00011 = MessageBundle.getMessage("MNE00011");
	public static final String MNE00012 = MessageBundle.getMessage("MNE00012");
	public static final String MNE00013 = MessageBundle.getMessage("MNE00013");
	public static final String MNE00014 = MessageBundle.getMessage("MNE00014");
	public static final String MNE00015 = MessageBundle.getMessage("MNE00015");
	public static final String MNE00016 = MessageBundle.getMessage("MNE00016");
	public static final String MNE00017 = MessageBundle.getMessage("MNE00017");
	public static final String MNE00018 = MessageBundle.getMessage("MNE00018");
	public static final String MNE00019 = MessageBundle.getMessage("MNE00019");
	public static final String MNE00020 = MessageBundle.getMessage("MNE00020");
	public static final String MNE00021 = MessageBundle.getMessage("MNE00021");
	public static final String MNE00022 = MessageBundle.getMessage("MNE00022");
	public static final String MNE00023 = MessageBundle.getMessage("MNE00023");
	public static final String MNE00024 = MessageBundle.getMessage("MNE00024");
	public static final String MNE00025 = MessageBundle.getMessage("MNE00025");
	public static final String MNE00026 = MessageBundle.getMessage("MNE00026");
	public static final String MNE00027 = MessageBundle.getMessage("MNE00027");
	public static final String MNE00028 = MessageBundle.getMessage("MNE00028");
	public static final String MNE00029 = MessageBundle.getMessage("MNE00029");
	public static final String MNE00030 = MessageBundle.getMessage("MNE00030");
	public static final String MNE00031 = MessageBundle.getMessage("MNE00031");
	
	public static String getMessage(final String pattern, final Object... arguments) {
		String msg = MessageFormat.format(pattern, arguments);
		return msg;
	}
}
