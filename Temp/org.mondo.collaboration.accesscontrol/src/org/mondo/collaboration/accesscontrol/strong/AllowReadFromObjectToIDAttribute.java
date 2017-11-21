package org.mondo.collaboration.accesscontrol.strong;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.mondo.collaboration.accesscontrol.Asset;
import org.mondo.collaboration.accesscontrol.IConsequence;
import org.mondo.collaboration.accesscontrol.Judgement;
import org.mondo.collaboration.accesscontrol.Asset.AttributeAsset;
import org.mondo.collaboration.accesscontrol.Asset.ObjectAsset;
import org.mondo.collaboration.policy.rules.AccessibilityLevel;
import org.mondo.collaboration.policy.rules.OperationType;

import com.google.common.collect.Sets;

public class AllowReadFromObjectToIDAttribute implements IConsequence{
	private AllowReadFromObjectToIDAttribute() {
	}
	
	public static IConsequence instance = new AllowReadFromObjectToIDAttribute();

	@Override
	public Set<Judgement> propagate(Judgement judgement) {
		HashSet<Judgement> consequences = Sets.newHashSet();

		if(judgement.getAsset() instanceof ObjectAsset) {
			if(judgement.getAccess() == AccessibilityLevel.ALLOW) {
				if(judgement.getOperation() == OperationType.READ) {
					EObject object = ((ObjectAsset)judgement.getAsset()).getObject();
				    EList<EAttribute> eAllAttributes = object.eClass().getEAllAttributes();
			        for (EAttribute eAttribute : eAllAttributes) {
			        	if(eAttribute.isID()){
			        		AttributeAsset attrAsset = new Asset.AttributeAsset(object, eAttribute);
				    	    consequences.add(new Judgement(judgement.getAccess(), judgement.getOperation(), attrAsset, judgement.getPriority(), judgement.getResolution()));
			        	}
			        }
			    }
		    }
		}
		
		return consequences;
	}

}
