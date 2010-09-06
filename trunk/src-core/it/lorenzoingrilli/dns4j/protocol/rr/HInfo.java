package it.lorenzoingrilli.dns4j.protocol.rr;

/**
 * HINFO Resource Record.
 * 
 * Defined in RFC 1035
 * 
 * @author Lorenzo Ingrilli'
 * @see <a href="ftp://ftp.rfc-editor.org/in-notes/rfc1035.txt">RFC 1035</a> 
 */
public interface HInfo extends RR {
    public String getCpu();
    public void setCpu(String cpu);
    public String getHost();
    public void setHost(String host);
}
