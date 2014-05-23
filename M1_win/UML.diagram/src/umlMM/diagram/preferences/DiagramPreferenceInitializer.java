package umlMM.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		umlMM.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		umlMM.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		umlMM.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		umlMM.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		umlMM.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return umlMM.diagram.part.UMLDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
