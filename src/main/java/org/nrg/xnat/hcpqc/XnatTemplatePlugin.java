/*
 * xnat-template: org.nrg.xnat.plugins.template.plugin.XnatTemplatePlugin
 * XNAT http://www.xnat.org
 * Copyright (c) 2017, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.hcpqc.plugin;

import org.nrg.framework.annotations.XnatPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;



@XnatPlugin(value = "HCPQCXNATPlugin", name = "HCP QC XNAT Plugin")
public class XnatTemplatePlugin {
    public XnatTemplatePlugin() {
        _log.info("Creating the XnatTemplatePlugin configuration class");
    }

    @Bean
    public String templatePluginMessage() {
        return "This comes from deep within the template plugin.";
    }


    private static final Logger _log = LoggerFactory.getLogger(XnatTemplatePlugin.class);
}
