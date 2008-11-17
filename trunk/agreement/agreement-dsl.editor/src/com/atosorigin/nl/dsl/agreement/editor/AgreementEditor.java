package com.atosorigin.nl.dsl.agreement.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import com.atosorigin.nl.dsl.agreement.AgreementEditorPlugin;

public class AgreementEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return AgreementEditorPlugin.getDefault();
   }
}
