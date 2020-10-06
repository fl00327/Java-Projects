/**
 * An implementation of the Channel interface illustrating message passing.
 *
 * Figure 3.21
 *
 * @author Gagne, Galvin, Silberschatz
 * Operating System Concepts with Java - Eighth Edition
 * Copyright John Wiley & Sons - 2010.
 */

import java.util.Vector;

public class MessageQueue<E> implements Channel<E>
{
	private Vector<E> queue;

	public MessageQueue() {
		queue = new Vector<E>();
	}

	public void send(E item) {
		queue.addElement(item);
	}

	public E receive() {
		if (queue.size() == 0)
			return null;
		else
			return queue.remove(0);
	}
}
