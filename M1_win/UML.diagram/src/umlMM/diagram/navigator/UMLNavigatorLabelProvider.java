package umlMM.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class UMLNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		umlMM.diagram.part.UMLDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		umlMM.diagram.part.UMLDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof umlMM.diagram.navigator.UMLNavigatorItem
				&& !isOwnView(((umlMM.diagram.navigator.UMLNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof umlMM.diagram.navigator.UMLNavigatorGroup) {
			umlMM.diagram.navigator.UMLNavigatorGroup group = (umlMM.diagram.navigator.UMLNavigatorGroup) element;
			return umlMM.diagram.part.UMLDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof umlMM.diagram.navigator.UMLNavigatorItem) {
			umlMM.diagram.navigator.UMLNavigatorItem navigatorItem = (umlMM.diagram.navigator.UMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (umlMM.diagram.part.UMLVisualIDRegistry.getVisualID(view)) {
		case umlMM.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://es.uclm/umlMM?Class", umlMM.diagram.providers.UMLElementTypes.Class_2001); //$NON-NLS-1$
		case umlMM.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://es.uclm/umlMM?Package", umlMM.diagram.providers.UMLElementTypes.Package_1000); //$NON-NLS-1$
		case umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://es.uclm/umlMM?Associaton", umlMM.diagram.providers.UMLElementTypes.Associaton_4001); //$NON-NLS-1$
		case umlMM.diagram.edit.parts.DatatypeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://es.uclm/umlMM?Datatype", umlMM.diagram.providers.UMLElementTypes.Datatype_2002); //$NON-NLS-1$
		case umlMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://es.uclm/umlMM?Attribute", umlMM.diagram.providers.UMLElementTypes.Attribute_3001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = umlMM.diagram.part.UMLDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& umlMM.diagram.providers.UMLElementTypes
						.isKnownElementType(elementType)) {
			image = umlMM.diagram.providers.UMLElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof umlMM.diagram.navigator.UMLNavigatorGroup) {
			umlMM.diagram.navigator.UMLNavigatorGroup group = (umlMM.diagram.navigator.UMLNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof umlMM.diagram.navigator.UMLNavigatorItem) {
			umlMM.diagram.navigator.UMLNavigatorItem navigatorItem = (umlMM.diagram.navigator.UMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (umlMM.diagram.part.UMLVisualIDRegistry.getVisualID(view)) {
		case umlMM.diagram.edit.parts.ClassEditPart.VISUAL_ID:
			return getClass_2001Text(view);
		case umlMM.diagram.edit.parts.PackageEditPart.VISUAL_ID:
			return getPackage_1000Text(view);
		case umlMM.diagram.edit.parts.AssociatonEditPart.VISUAL_ID:
			return getAssociaton_4001Text(view);
		case umlMM.diagram.edit.parts.DatatypeEditPart.VISUAL_ID:
			return getDatatype_2002Text(view);
		case umlMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getClass_2001Text(View view) {
		IParser parser = umlMM.diagram.providers.UMLParserProvider
				.getParser(
						umlMM.diagram.providers.UMLElementTypes.Class_2001,
						view.getElement() != null ? view.getElement() : view,
						umlMM.diagram.part.UMLVisualIDRegistry
								.getType(umlMM.diagram.edit.parts.ClassNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			umlMM.diagram.part.UMLDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPackage_1000Text(View view) {
		umlMM.Package domainModelElement = (umlMM.Package) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			umlMM.diagram.part.UMLDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAssociaton_4001Text(View view) {
		umlMM.Associaton domainModelElement = (umlMM.Associaton) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			umlMM.diagram.part.UMLDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDatatype_2002Text(View view) {
		IParser parser = umlMM.diagram.providers.UMLParserProvider
				.getParser(
						umlMM.diagram.providers.UMLElementTypes.Datatype_2002,
						view.getElement() != null ? view.getElement() : view,
						umlMM.diagram.part.UMLVisualIDRegistry
								.getType(umlMM.diagram.edit.parts.DatatypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			umlMM.diagram.part.UMLDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttribute_3001Text(View view) {
		IParser parser = umlMM.diagram.providers.UMLParserProvider
				.getParser(
						umlMM.diagram.providers.UMLElementTypes.Attribute_3001,
						view.getElement() != null ? view.getElement() : view,
						umlMM.diagram.part.UMLVisualIDRegistry
								.getType(umlMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			umlMM.diagram.part.UMLDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return umlMM.diagram.edit.parts.PackageEditPart.MODEL_ID
				.equals(umlMM.diagram.part.UMLVisualIDRegistry.getModelID(view));
	}

}
