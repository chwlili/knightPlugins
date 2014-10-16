package org.chw.game.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.chw.game.cfg.CfgPackage;
import org.chw.game.cfg.EnumField;
import org.chw.game.cfg.Field;
import org.chw.game.cfg.FieldType;
import org.chw.game.cfg.InputDef;
import org.chw.game.cfg.Meta;
import org.chw.game.cfg.MetaParam;
import org.chw.game.cfg.OtherComent;
import org.chw.game.cfg.PackDef;
import org.chw.game.cfg.Type;
import org.chw.game.cfg.XML2;
import org.chw.game.services.CfgGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CfgSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CfgGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CfgPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CfgPackage.ENUM:
				if(context == grammarAccess.getEnumRule()) {
					sequence_Enum(context, (org.chw.game.cfg.Enum) semanticObject); 
					return; 
				}
				else break;
			case CfgPackage.ENUM_FIELD:
				if(context == grammarAccess.getEnumFieldRule()) {
					sequence_EnumField(context, (EnumField) semanticObject); 
					return; 
				}
				else break;
			case CfgPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case CfgPackage.FIELD_TYPE:
				if(context == grammarAccess.getFieldTypeRule()) {
					sequence_FieldType(context, (FieldType) semanticObject); 
					return; 
				}
				else break;
			case CfgPackage.INPUT_DEF:
				if(context == grammarAccess.getInputDefRule()) {
					sequence_InputDef(context, (InputDef) semanticObject); 
					return; 
				}
				else break;
			case CfgPackage.META:
				if(context == grammarAccess.getMetaRule()) {
					sequence_Meta(context, (Meta) semanticObject); 
					return; 
				}
				else break;
			case CfgPackage.META_PARAM:
				if(context == grammarAccess.getMetaParamRule()) {
					sequence_MetaParam(context, (MetaParam) semanticObject); 
					return; 
				}
				else break;
			case CfgPackage.OTHER_COMENT:
				if(context == grammarAccess.getOtherComentRule()) {
					sequence_OtherComent(context, (OtherComent) semanticObject); 
					return; 
				}
				else break;
			case CfgPackage.PACK_DEF:
				if(context == grammarAccess.getPackDefRule()) {
					sequence_PackDef(context, (PackDef) semanticObject); 
					return; 
				}
				else break;
			case CfgPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case CfgPackage.XML2:
				if(context == grammarAccess.getXML2Rule()) {
					sequence_XML2(context, (XML2) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (comment=FieldComment? meta+=Meta* fieldName=TypeName fieldValue=STRING)
	 */
	protected void sequence_EnumField(EObject context, EnumField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=TypeComment? prefix=C_ENUM name=TypeName (fields+=EnumField | comm+=OtherComent)*)
	 */
	protected void sequence_Enum(EObject context, org.chw.game.cfg.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=TypeName
	 */
	protected void sequence_FieldType(EObject context, FieldType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CfgPackage.Literals.FIELD_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CfgPackage.Literals.FIELD_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFieldTypeAccess().getTypeTypeNameParserRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comment=FieldComment? meta+=Meta* type=FieldType fieldName=TypeName nodePath=STRING)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment+=OtherComent* inputCHAR=C_INPUT url=STRING)
	 */
	protected void sequence_InputDef(EObject context, InputDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fieldName=TypeName | fieldName=STRING)
	 */
	protected void sequence_MetaParam(EObject context, MetaParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prefix=TypeName (params+=MetaParam params+=MetaParam*)?)
	 */
	protected void sequence_Meta(EObject context, Meta semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     comm=COMMENT
	 */
	protected void sequence_OtherComent(EObject context, OtherComent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CfgPackage.Literals.OTHER_COMENT__COMM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CfgPackage.Literals.OTHER_COMENT__COMM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOtherComentAccess().getCommCOMMENTTerminalRuleCall_0(), semanticObject.getComm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comment+=OtherComent* packCHAR=C_PACKAGE pack=PackName?)
	 */
	protected void sequence_PackDef(EObject context, PackDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment=TypeComment? meta+=Meta? prefix=C_TYPE name=TypeName (fields+=Field | comm+=OtherComent)*)
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((input=InputDef pack=PackDef) | (pack=PackDef input=InputDef) | pack=PackDef | input=InputDef) 
	 *         (types+=Type | enums+=Enum | comm+=OtherComent)*
	 *     )
	 */
	protected void sequence_XML2(EObject context, XML2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
