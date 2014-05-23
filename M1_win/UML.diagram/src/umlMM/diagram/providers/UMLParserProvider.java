package umlMM.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class UMLParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser className_5001Parser;

	/**
	 * @generated
	 */
	private IParser getClassName_5001Parser() {
		if (className_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { umlMM.UmlMMPackage.eINSTANCE
					.getClassifier_Name() };
			umlMM.diagram.parsers.MessageFormatParser parser = new umlMM.diagram.parsers.MessageFormatParser(
					features);
			className_5001Parser = parser;
		}
		return className_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser datatypeName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getDatatypeName_5002Parser() {
		if (datatypeName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { umlMM.UmlMMPackage.eINSTANCE
					.getClassifier_Name() };
			umlMM.diagram.parsers.MessageFormatParser parser = new umlMM.diagram.parsers.MessageFormatParser(
					features);
			datatypeName_5002Parser = parser;
		}
		return datatypeName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser attribute_3001Parser;

	/**
	 * @generated
	 */
	private IParser getAttribute_3001Parser() {
		if (attribute_3001Parser == null) {
			EAttribute[] features = new EAttribute[] { umlMM.UmlMMPackage.eINSTANCE
					.getAttribute_Name() };
			EAttribute[] editableFeatures = new EAttribute[] { umlMM.UmlMMPackage.eINSTANCE
					.getAttribute_Name() };
			umlMM.diagram.parsers.MessageFormatParser parser = new umlMM.diagram.parsers.MessageFormatParser(
					features, editableFeatures);
			attribute_3001Parser = parser;
		}
		return attribute_3001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case umlMM.diagram.edit.parts.ClassNameEditPart.VISUAL_ID:
			return getClassName_5001Parser();
		case umlMM.diagram.edit.parts.DatatypeNameEditPart.VISUAL_ID:
			return getDatatypeName_5002Parser();
		case umlMM.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(umlMM.diagram.part.UMLVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(umlMM.diagram.part.UMLVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (umlMM.diagram.providers.UMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
