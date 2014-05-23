package umlMM.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class UMLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "UML.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (umlMM.diagram.edit.parts.PackageEditPart.MODEL_ID.equals(view
					.getType())) {
				return umlMM.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return umlMM.diagram.part.UMLVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				umlMM.diagram.part.UMLDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (umlMM.UmlMMPackage.eINSTANCE.getPackage().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((umlMM.Package) domainElement)) {
			return umlMM.diagram.edit.parts.PackageEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = umlMM.diagram.part.UMLVisualIDRegistry
				.getModelID(containerView);
		if (!umlMM.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (umlMM.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = umlMM.diagram.part.UMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = umlMM.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case umlMM.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			if (umlMM.UmlMMPackage.eINSTANCE.getClass_().isSuperTypeOf(
					domainElement.eClass())) {
				return umlMM.diagram.edit.parts.ClassEditPart.VISUAL_ID;
			}
			if (umlMM.UmlMMPackage.eINSTANCE.getDatatype().isSuperTypeOf(
					domainElement.eClass())) {
				return umlMM.diagram.edit.parts.DatatypeEditPart.VISUAL_ID;
			}
			break;
		case umlMM.diagram.edit.parts.ClassAttributeCompartmentEditPart.VISUAL_ID:
			if (umlMM.UmlMMPackage.eINSTANCE.getAttribute().isSuperTypeOf(
					domainElement.eClass())) {
				return umlMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = umlMM.diagram.part.UMLVisualIDRegistry
				.getModelID(containerView);
		if (!umlMM.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (umlMM.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = umlMM.diagram.part.UMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = umlMM.diagram.edit.parts.PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case umlMM.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			if (umlMM.diagram.edit.parts.ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (umlMM.diagram.edit.parts.DatatypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case umlMM.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			if (umlMM.diagram.edit.parts.ClassNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (umlMM.diagram.edit.parts.ClassAttributeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case umlMM.diagram.edit.parts.DatatypeEditPart.VISUAL_ID:
			if (umlMM.diagram.edit.parts.DatatypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case umlMM.diagram.edit.parts.ClassAttributeCompartmentEditPart.VISUAL_ID:
			if (umlMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (umlMM.UmlMMPackage.eINSTANCE.getAssociaton().isSuperTypeOf(
				domainElement.eClass())) {
			return umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(umlMM.Package element) {
		return true;
	}

}
