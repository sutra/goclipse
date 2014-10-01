/*******************************************************************************
 * Copyright (c) 2014, 2014 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.core.operations;

import melnorme.utilbox.misc.ListenerListHelper;
import melnorme.utilbox.process.ExternalProcessHelper.ExternalProcessResult;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Abstract class for running external tools and notifying interested listeners (normally the UI only).
 */
public abstract class AbstractToolsManager<LISTENER extends ILangOperationsListener> 
		extends ListenerListHelper<LISTENER> {
	
	/* ----------------- ----------------- */
	
	public ExternalProcessResult runEngineTool(ProcessBuilder pb, String clientInput, IProgressMonitor pm)
			throws CoreException {
		return new RunEngineClientOperation(this, pb).runProcess(clientInput, pm);
	}
	
}