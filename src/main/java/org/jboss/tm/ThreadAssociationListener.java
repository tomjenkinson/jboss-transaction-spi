package org.jboss.tm;

import javax.transaction.Synchronization;

/**
 * This interface allows classes that implement Synchronization to also be
 * notified when the thread is associated with a transaction.
 * 
 * It extends Synchronization as the way to pass this to the transaction manager
 * is via the register*Synchronization methods from JTA.
 */
public interface ThreadAssociationListener extends Synchronization {

	public void threadAssociated();

	public void threadDisassociated();
}
