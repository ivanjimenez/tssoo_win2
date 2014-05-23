package umlMM.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class UMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLNodeDescriptor> getSemanticChildren(
			View view) {
		switch (umlMM.diagram.part.UMLVisualIDRegistry.getVisualID(view)) {
		case umlMM.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000SemanticChildren(view);
		case umlMM.diagram.edit.parts.ClassAttributeCompartmentEditPart.VISUAL_ID:
			return getClassAttributeCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLNodeDescriptor> getPackage_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		umlMM.Package modelElement = (umlMM.Package) view.getElement();
		LinkedList<umlMM.diagram.part.UMLNodeDescriptor> result = new LinkedList<umlMM.diagram.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClassifier().iterator(); it
				.hasNext();) {
			umlMM.Classifier childElement = (umlMM.Classifier) it.next();
			int visualID = umlMM.diagram.part.UMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == umlMM.diagram.edit.parts.ClassEditPart.VISUAL_ID) {
				result.add(new umlMM.diagram.part.UMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
			if (visualID == umlMM.diagram.edit.parts.DatatypeEditPart.VISUAL_ID) {
				result.add(new umlMM.diagram.part.UMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLNodeDescriptor> getClassAttributeCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		umlMM.Class modelElement = (umlMM.Class) containerView.getElement();
		LinkedList<umlMM.diagram.part.UMLNodeDescriptor> result = new LinkedList<umlMM.diagram.part.UMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttribute().iterator(); it
				.hasNext();) {
			umlMM.Attribute childElement = (umlMM.Attribute) it.next();
			int visualID = umlMM.diagram.part.UMLVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == umlMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID) {
				result.add(new umlMM.diagram.part.UMLNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getContainedLinks(
			View view) {
		switch (umlMM.diagram.part.UMLVisualIDRegistry.getVisualID(view)) {
		case umlMM.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000ContainedLinks(view);
		case umlMM.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001ContainedLinks(view);
		case umlMM.diagram.edit.parts.DatatypeEditPart.VISUAL_ID:
			return getDatatype_2002ContainedLinks(view);
		case umlMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001ContainedLinks(view);
		case umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID:
			return getAssociaton_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getIncomingLinks(
			View view) {
		switch (umlMM.diagram.part.UMLVisualIDRegistry.getVisualID(view)) {
		case umlMM.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001IncomingLinks(view);
		case umlMM.diagram.edit.parts.DatatypeEditPart.VISUAL_ID:
			return getDatatype_2002IncomingLinks(view);
		case umlMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001IncomingLinks(view);
		case umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID:
			return getAssociaton_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (umlMM.diagram.part.UMLVisualIDRegistry.getVisualID(view)) {
		case umlMM.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001OutgoingLinks(view);
		case umlMM.diagram.edit.parts.DatatypeEditPart.VISUAL_ID:
			return getDatatype_2002OutgoingLinks(view);
		case umlMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001OutgoingLinks(view);
		case umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID:
			return getAssociaton_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getPackage_1000ContainedLinks(
			View view) {
		umlMM.Package modelElement = (umlMM.Package) view.getElement();
		LinkedList<umlMM.diagram.part.UMLLinkDescriptor> result = new LinkedList<umlMM.diagram.part.UMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Associaton_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getClass_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getDatatype_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getAttribute_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getAssociaton_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getClass_2001IncomingLinks(
			View view) {
		umlMM.Class modelElement = (umlMM.Class) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<umlMM.diagram.part.UMLLinkDescriptor> result = new LinkedList<umlMM.diagram.part.UMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Associaton_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getDatatype_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getAttribute_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getAssociaton_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getClass_2001OutgoingLinks(
			View view) {
		umlMM.Class modelElement = (umlMM.Class) view.getElement();
		LinkedList<umlMM.diagram.part.UMLLinkDescriptor> result = new LinkedList<umlMM.diagram.part.UMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Associaton_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getDatatype_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getAttribute_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<umlMM.diagram.part.UMLLinkDescriptor> getAssociaton_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<umlMM.diagram.part.UMLLinkDescriptor> getContainedTypeModelFacetLinks_Associaton_4001(
			umlMM.Package container) {
		LinkedList<umlMM.diagram.part.UMLLinkDescriptor> result = new LinkedList<umlMM.diagram.part.UMLLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof umlMM.Associaton) {
				continue;
			}
			umlMM.Associaton link = (umlMM.Associaton) linkObject;
			if (umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID != umlMM.diagram.part.UMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			umlMM.Class dst = link.getDestination();
			umlMM.Class src = link.getSource();
			result.add(new umlMM.diagram.part.UMLLinkDescriptor(src, dst, link,
					umlMM.diagram.providers.UMLElementTypes.Associaton_4001,
					umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<umlMM.diagram.part.UMLLinkDescriptor> getIncomingTypeModelFacetLinks_Associaton_4001(
			umlMM.Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<umlMM.diagram.part.UMLLinkDescriptor> result = new LinkedList<umlMM.diagram.part.UMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != umlMM.UmlMMPackage.eINSTANCE
					.getAssociaton_Destination()
					|| false == setting.getEObject() instanceof umlMM.Associaton) {
				continue;
			}
			umlMM.Associaton link = (umlMM.Associaton) setting.getEObject();
			if (umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID != umlMM.diagram.part.UMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			umlMM.Class src = link.getSource();
			result.add(new umlMM.diagram.part.UMLLinkDescriptor(src, target,
					link,
					umlMM.diagram.providers.UMLElementTypes.Associaton_4001,
					umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<umlMM.diagram.part.UMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Associaton_4001(
			umlMM.Class source) {
		umlMM.Package container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof umlMM.Package) {
				container = (umlMM.Package) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<umlMM.diagram.part.UMLLinkDescriptor> result = new LinkedList<umlMM.diagram.part.UMLLinkDescriptor>();
		for (Iterator<?> links = container.getAssociation().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof umlMM.Associaton) {
				continue;
			}
			umlMM.Associaton link = (umlMM.Associaton) linkObject;
			if (umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID != umlMM.diagram.part.UMLVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			umlMM.Class dst = link.getDestination();
			umlMM.Class src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new umlMM.diagram.part.UMLLinkDescriptor(src, dst, link,
					umlMM.diagram.providers.UMLElementTypes.Associaton_4001,
					umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID));
		}
		return result;
	}

}
