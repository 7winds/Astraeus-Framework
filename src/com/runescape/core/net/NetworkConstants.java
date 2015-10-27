package com.runescape.core.net;

import java.math.BigInteger;

import com.runescape.core.net.channel.message.incoming.PacketListener;

/**
 * Class which contains network-related constants.
 * @author SeVen
 */
public class NetworkConstants {

	/**
	 * The RSA Encryption system.
	 */
	public static final BigInteger RSA_MODULUS = new BigInteger(
			"94904992129904410061849432720048295856082621425118273522925386720620318960919649616773860564226013741030211135158797393273808089000770687087538386210551037271884505217469135237269866084874090369313013016228010726263597258760029391951907049483204438424117908438852851618778702170822555894057960542749301583313");

	public static final BigInteger RSA_EXPONENT = new BigInteger(
			"72640252303588278644467876834506654511692882736878142674473705672822320822095174696379303197013981434572187481298130748148385818094460521624198552406940508805602215708418094058951352076283100448576575511642453669107583920561043364042814766866691981132717812444681081534760715694225059124574441435942822149161");
	
	/**
	 * The amount of incoming packets that can be processed at a time.
	 */
	public static final int DECODE_LIMIT = 30;
	
	/**
	 * An array of incoming packets.
	 */
	public static final PacketListener[] PACKETS = new PacketListener[257];
	
    /**
     * An array of message opcodes mapped to their respective sizes.
     */
    public static final int PACKET_SIZES[] = new int[257];
}
