//Copyright 2005 Harvard University / Howard Hughes Medical Institute (HHMI) All Rights Reserved
/*
 * Created on Sep 12, 2006
 *
 */
package org.nrg.xnat.turbine.modules.screens;

import org.apache.turbine.util.RunData;
import org.apache.velocity.context.Context;
import org.nrg.xdat.turbine.modules.screens.SecureScreen;

public class QCPopup extends SecureScreen {

    @Override
    protected void doBuildTemplate(RunData data, Context context) throws Exception {
	storeParameterIfPresent(data, context, "scan");
	storeParameterIfPresent(data, context, "total");
	storeParameterIfPresent(data, context, "type");
	storeParameterIfPresent(data, context, "json");

	data.getTemplateInfo().setLayoutTemplate("/PopupOnly.vm");

    }

}
