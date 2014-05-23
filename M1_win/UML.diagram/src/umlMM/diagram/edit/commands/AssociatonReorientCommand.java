package umlMM.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class AssociatonReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public AssociatonReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof umlMM.Associaton) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof umlMM.Class && newEnd instanceof umlMM.Class)) {
			return false;
		}
		umlMM.Class target = getLink().getDestination();
		if (!(getLink().eContainer() instanceof umlMM.Package)) {
			return false;
		}
		umlMM.Package container = (umlMM.Package) getLink().eContainer();
		return umlMM.diagram.edit.policies.UMLBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAssociaton_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof umlMM.Class && newEnd instanceof umlMM.Class)) {
			return false;
		}
		umlMM.Class source = getLink().getSource();
		if (!(getLink().eContainer() instanceof umlMM.Package)) {
			return false;
		}
		umlMM.Package container = (umlMM.Package) getLink().eContainer();
		return umlMM.diagram.edit.policies.UMLBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistAssociaton_4001(container,
						getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setDestination(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected umlMM.Associaton getLink() {
		return (umlMM.Associaton) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected umlMM.Class getOldSource() {
		return (umlMM.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected umlMM.Class getNewSource() {
		return (umlMM.Class) newEnd;
	}

	/**
	 * @generated
	 */
	protected umlMM.Class getOldTarget() {
		return (umlMM.Class) oldEnd;
	}

	/**
	 * @generated
	 */
	protected umlMM.Class getNewTarget() {
		return (umlMM.Class) newEnd;
	}
}
