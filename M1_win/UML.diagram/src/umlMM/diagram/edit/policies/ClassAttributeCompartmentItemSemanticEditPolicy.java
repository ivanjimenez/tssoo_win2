package umlMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClassAttributeCompartmentItemSemanticEditPolicy extends
		umlMM.diagram.edit.policies.UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassAttributeCompartmentItemSemanticEditPolicy() {
		super(umlMM.diagram.providers.UMLElementTypes.Class_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (umlMM.diagram.providers.UMLElementTypes.Attribute_3001 == req
				.getElementType()) {
			return getGEFWrapper(new umlMM.diagram.edit.commands.AttributeCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
