/**
 * Channel interface.
 *
 * Figure 3.20
 *
 * @author Gagne, Galvin, Silberschatz
 * Operating System Concepts with Java - Eighth Edition
 * Copyright John Wiley & Sons - 2010.
 */

public interface Channel<E>
{
	public void send(E item);

	public E receive();
}
