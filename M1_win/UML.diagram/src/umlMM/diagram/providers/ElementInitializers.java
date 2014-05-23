package umlMM.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = umlMM.diagram.part.UMLDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			umlMM.diagram.part.UMLDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
