package umlMM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class UMLNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof umlMM.diagram.navigator.UMLNavigatorItem) {
			umlMM.diagram.navigator.UMLNavigatorItem item = (umlMM.diagram.navigator.UMLNavigatorItem) element;
			return umlMM.diagram.part.UMLVisualIDRegistry.getVisualID(item
					.getView());
		}
		return GROUP_CATEGORY;
	}

}
