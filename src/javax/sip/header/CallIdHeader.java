/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Unpublished - rights reserved under the Copyright Laws of the United States.
 * Copyright � 2003 Sun Microsystems, Inc. All rights reserved.
 * Copyright � 2005 BEA Systems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * This distribution may include materials developed by third parties. 
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * Module Name   : JSIP Specification
 * File Name     : CallIdHeader.java
 * Author        : Phelim O'Doherty
 *
 *  HISTORY
 *  Version   Date      Author              Comments
 *  1.1     08/10/2002  Phelim O'Doherty    
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package javax.sip.header;



import java.text.ParseException;



/**

 * The Call-ID header field uniquely identifies a particular invitation or all 
 * registrations of a particular client. A single multimedia conference can give rise to

 * several calls with different Call-IDs, for example, if a user invites a

 * single individual several times to the same (long-running) conference.

 * Call-IDs are case-sensitive and are simply compared byte-by-byte.

 * <p>

 * Call-ID is generated by the combination of a random string and the

 * softphone's host name or IP address.  The combination of the To tag,

 * From tag, and Call-ID completely defines a peer-to-peer SIP relationship

 * between two users and is referred to as a dialog. It MUST be the same for 
 * all requests and responses sent by either User Agent in a dialog.  It SHOULD be the 
 * same in each registration from a User Agent.

 * <p>

 * All SIP User Agents must have a means to guarantee that the Call-ID header fields

 * they produce will not be inadvertently generated by any other User Agent.  Note

 * that when requests are retried after certain failure responses that solicit

 * an amendment to a request (for example, a challenge for authentication),

 * these retried requests are not considered new requests, and therefore do

 * not need new Call-ID header fields.

 * <p>

 * Use of cryptographically random identifiers in the generation of Call-IDs is

 * RECOMMENDED.  Implementations MAY use the form "localid@host".

 * <p>

 * For Example:<br>

 * <code>Call-ID: f81d4fae-7dec-11d0-a765-00a0c91e6bf6@jcp.org</code>

 *

 * @author BEA Systems, Inc. 
 * @author NIST
 * @version 1.2
 * @since 1.1

 *

 */



public interface CallIdHeader extends Header {



    /**

     * Sets the Call-Id of the CallIdHeader. The CallId parameter uniquely

     * identifies a serious of messages within a dialogue.

     *

     * @param callId - the string value of the Call-Id of this CallIdHeader.

     * @throws ParseException which signals that an error has been reached

     * unexpectedly while parsing the callId value.

     */

    public void setCallId(String callId) throws ParseException;



    /**

     * Returns the Call-Id of CallIdHeader. The CallId parameter uniquely

     * identifies a series of messages within a dialogue.

     *

     * @return the String value of the Call-Id of this CallIdHeader

     */

    public String getCallId();

    /**
     * Compare this CallIdHeader for equality with another. This method 
     * overrides the equals method in javax.sip.Header. This method specifies 
     * object equality as outlined by  
     * <a href = "http://www.ietf.org/rfc/rfc3261.txt">RFC3261</a>. 
     * Call-IDs are case-sensitive and are simply compared byte-by-byte. 
     *
     * @param obj the object to compare this CallIdHeader with.
     * @return <code>true</code> if <code>obj</code> is an instance of this class
     * representing the same CallIdHeader as this, <code>false</code> otherwise.
     * @since v1.2
     */
    public boolean equals(Object obj);    



    /**

     * Name of CallIdHeader

     */

    public final static String NAME = "Call-ID";

}

