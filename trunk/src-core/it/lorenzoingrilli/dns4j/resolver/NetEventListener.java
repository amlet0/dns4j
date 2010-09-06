package it.lorenzoingrilli.dns4j.resolver;

/**
 * @author Lorenzo Ingrilli' <info@lorenzoingrilli.it>
 */
public interface NetEventListener {
    public void onSent(byte[] buffer, int offset, int len);
    public void onRecv(byte[] buffer, int offset, int len);
}
