package com.atosorigin.nl.dsl.agreement;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class AgreementEditorPlugin extends AbstractXtextEditorPlugin {
   private static AgreementEditorPlugin plugin;
   public static AgreementEditorPlugin getDefault() {
      return plugin;
   }

   private AgreementUtilities utilities = new AgreementUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public AgreementEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
}
