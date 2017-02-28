package org.mondo.collaboration.policy.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mondo.collaboration.policy.services.RulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRulesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'policy'", "'by'", "'default'", "'{'", "'}'", "'with'", "'resolution'", "'rule'", "'to'", "'select'", "'from'", "'query'", "'where'", "'bound'", "'priority'", "'allow'", "'obfuscate'", "'deny'", "'R'", "'RW'", "'ObjectFact'", "'ReferenceFact'", "'AttributeFact'", "'restrictive'", "'permissive'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRulesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRules.g"; }



     	private RulesGrammarAccess grammarAccess;

        public InternalRulesParser(TokenStream input, RulesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RulesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRules.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRules.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalRules.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRules.g:72:1: ruleModel returns [EObject current=null] : ( (lv_policy_0_0= rulePolicy ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_policy_0_0 = null;



        	enterRule();

        try {
            // InternalRules.g:78:2: ( ( (lv_policy_0_0= rulePolicy ) ) )
            // InternalRules.g:79:2: ( (lv_policy_0_0= rulePolicy ) )
            {
            // InternalRules.g:79:2: ( (lv_policy_0_0= rulePolicy ) )
            // InternalRules.g:80:3: (lv_policy_0_0= rulePolicy )
            {
            // InternalRules.g:80:3: (lv_policy_0_0= rulePolicy )
            // InternalRules.g:81:4: lv_policy_0_0= rulePolicy
            {

            				newCompositeNode(grammarAccess.getModelAccess().getPolicyPolicyParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_policy_0_0=rulePolicy();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"policy",
            					lv_policy_0_0,
            					"org.mondo.collaboration.policy.Rules.Policy");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePolicy"
    // InternalRules.g:101:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // InternalRules.g:101:47: (iv_rulePolicy= rulePolicy EOF )
            // InternalRules.g:102:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // InternalRules.g:108:1: rulePolicy returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_access_3_0 = null;

        Enumerator lv_operation_4_0 = null;

        EObject lv_rules_8_0 = null;

        Enumerator lv_resolution_11_0 = null;



        	enterRule();

        try {
            // InternalRules.g:114:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) ) )+ {...}?) ) ) )
            // InternalRules.g:115:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) ) )+ {...}?) ) )
            {
            // InternalRules.g:115:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) ) )+ {...}?) ) )
            // InternalRules.g:116:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) ) )+ {...}?) )
            {
            // InternalRules.g:116:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) ) )+ {...}?) )
            // InternalRules.g:117:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getPolicyAccess().getUnorderedGroup());
            			
            // InternalRules.g:120:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) ) )+ {...}?)
            // InternalRules.g:121:5: ( ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) ) )+ {...}?
            {
            // InternalRules.g:121:5: ( ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 >= 26 && LA2_0 <= 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 >= 29 && LA2_0 <= 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRules.g:122:3: ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalRules.g:122:3: ({...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) ) )
            	    // InternalRules.g:123:4: {...}? => ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRules.g:123:100: ( ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) ) )
            	    // InternalRules.g:124:5: ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRules.g:127:8: ({...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) ) )
            	    // InternalRules.g:127:9: {...}? => (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "true");
            	    }
            	    // InternalRules.g:127:18: (otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) ) )
            	    // InternalRules.g:127:19: otherlv_1= 'policy' ( (lv_name_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getPolicyAccess().getPolicyKeyword_0_0());
            	    							
            	    // InternalRules.g:131:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalRules.g:132:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalRules.g:132:9: (lv_name_2_0= RULE_ID )
            	    // InternalRules.g:133:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getPolicyAccess().getNameIDTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPolicyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPolicyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRules.g:155:3: ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) )
            	    {
            	    // InternalRules.g:155:3: ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) )
            	    // InternalRules.g:156:4: {...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRules.g:156:100: ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) )
            	    // InternalRules.g:157:5: ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRules.g:160:8: ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) )
            	    // InternalRules.g:160:9: {...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "true");
            	    }
            	    // InternalRules.g:160:18: ( (lv_access_3_0= ruleAccessibilityLevel ) )
            	    // InternalRules.g:160:19: (lv_access_3_0= ruleAccessibilityLevel )
            	    {
            	    // InternalRules.g:160:19: (lv_access_3_0= ruleAccessibilityLevel )
            	    // InternalRules.g:161:9: lv_access_3_0= ruleAccessibilityLevel
            	    {

            	    									newCompositeNode(grammarAccess.getPolicyAccess().getAccessAccessibilityLevelEnumRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_5);
            	    lv_access_3_0=ruleAccessibilityLevel();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    									}
            	    									set(
            	    										current,
            	    										"access",
            	    										lv_access_3_0,
            	    										"org.mondo.collaboration.policy.Rules.AccessibilityLevel");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPolicyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRules.g:183:3: ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) )
            	    {
            	    // InternalRules.g:183:3: ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) ) )
            	    // InternalRules.g:184:4: {...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "getUnorderedGroupHelper().canSelect(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRules.g:184:100: ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) ) )
            	    // InternalRules.g:185:5: ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getPolicyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRules.g:188:8: ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' ) )
            	    // InternalRules.g:188:9: {...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePolicy", "true");
            	    }
            	    // InternalRules.g:188:18: ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution' )
            	    // InternalRules.g:188:19: ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'by' otherlv_6= 'default' otherlv_7= '{' ( (lv_rules_8_0= ruleRule ) )* otherlv_9= '}' otherlv_10= 'with' ( (lv_resolution_11_0= ruleResolutionType ) ) otherlv_12= 'resolution'
            	    {
            	    // InternalRules.g:188:19: ( (lv_operation_4_0= ruleOperationType ) )
            	    // InternalRules.g:189:9: (lv_operation_4_0= ruleOperationType )
            	    {
            	    // InternalRules.g:189:9: (lv_operation_4_0= ruleOperationType )
            	    // InternalRules.g:190:10: lv_operation_4_0= ruleOperationType
            	    {

            	    										newCompositeNode(grammarAccess.getPolicyAccess().getOperationOperationTypeEnumRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_operation_4_0=ruleOperationType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"operation",
            	    											lv_operation_4_0,
            	    											"org.mondo.collaboration.policy.Rules.OperationType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FOLLOW_7); 

            	    								newLeafNode(otherlv_5, grammarAccess.getPolicyAccess().getByKeyword_2_1());
            	    							
            	    otherlv_6=(Token)match(input,13,FOLLOW_8); 

            	    								newLeafNode(otherlv_6, grammarAccess.getPolicyAccess().getDefaultKeyword_2_2());
            	    							
            	    otherlv_7=(Token)match(input,14,FOLLOW_9); 

            	    								newLeafNode(otherlv_7, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_2_3());
            	    							
            	    // InternalRules.g:219:8: ( (lv_rules_8_0= ruleRule ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==18||(LA1_0>=26 && LA1_0<=30)) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalRules.g:220:9: (lv_rules_8_0= ruleRule )
            	    	    {
            	    	    // InternalRules.g:220:9: (lv_rules_8_0= ruleRule )
            	    	    // InternalRules.g:221:10: lv_rules_8_0= ruleRule
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getPolicyAccess().getRulesRuleParserRuleCall_2_4_0());
            	    	    									
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_rules_8_0=ruleRule();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"rules",
            	    	    											lv_rules_8_0,
            	    	    											"org.mondo.collaboration.policy.Rules.Rule");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,15,FOLLOW_10); 

            	    								newLeafNode(otherlv_9, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_2_5());
            	    							
            	    otherlv_10=(Token)match(input,16,FOLLOW_11); 

            	    								newLeafNode(otherlv_10, grammarAccess.getPolicyAccess().getWithKeyword_2_6());
            	    							
            	    // InternalRules.g:246:8: ( (lv_resolution_11_0= ruleResolutionType ) )
            	    // InternalRules.g:247:9: (lv_resolution_11_0= ruleResolutionType )
            	    {
            	    // InternalRules.g:247:9: (lv_resolution_11_0= ruleResolutionType )
            	    // InternalRules.g:248:10: lv_resolution_11_0= ruleResolutionType
            	    {

            	    										newCompositeNode(grammarAccess.getPolicyAccess().getResolutionResolutionTypeEnumRuleCall_2_7_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_resolution_11_0=ruleResolutionType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"resolution",
            	    											lv_resolution_11_0,
            	    											"org.mondo.collaboration.policy.Rules.ResolutionType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_12=(Token)match(input,17,FOLLOW_5); 

            	    								newLeafNode(otherlv_12, grammarAccess.getPolicyAccess().getResolutionKeyword_2_8());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPolicyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPolicyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rulePolicy", "getUnorderedGroupHelper().canLeave(grammarAccess.getPolicyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getPolicyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleRule"
    // InternalRules.g:286:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRules.g:286:45: (iv_ruleRule= ruleRule EOF )
            // InternalRules.g:287:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRules.g:293:1: ruleRule returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_priority_18_0=null;
        Token otherlv_19=null;
        Enumerator lv_access_3_0 = null;

        Enumerator lv_operation_4_0 = null;

        EObject lv_user_6_0 = null;

        Enumerator lv_asset_9_0 = null;

        EObject lv_query_12_0 = null;



        	enterRule();

        try {
            // InternalRules.g:299:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) ) )+ {...}?) ) ) )
            // InternalRules.g:300:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) ) )+ {...}?) ) )
            {
            // InternalRules.g:300:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) ) )+ {...}?) ) )
            // InternalRules.g:301:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) ) )+ {...}?) )
            {
            // InternalRules.g:301:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) ) )+ {...}?) )
            // InternalRules.g:302:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getRuleAccess().getUnorderedGroup());
            			
            // InternalRules.g:305:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) ) )+ {...}?)
            // InternalRules.g:306:5: ( ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) ) )+ {...}?
            {
            // InternalRules.g:306:5: ( ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=4;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalRules.g:307:3: ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalRules.g:307:3: ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) )
            	    // InternalRules.g:308:4: {...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRule", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRules.g:308:98: ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) )
            	    // InternalRules.g:309:5: ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRuleAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRules.g:312:8: ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) )
            	    // InternalRules.g:312:9: {...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRule", "true");
            	    }
            	    // InternalRules.g:312:18: (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) )
            	    // InternalRules.g:312:19: otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getRuleKeyword_0_0());
            	    							
            	    // InternalRules.g:316:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalRules.g:317:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalRules.g:317:9: (lv_name_2_0= RULE_ID )
            	    // InternalRules.g:318:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getRuleRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRules.g:340:3: ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) )
            	    {
            	    // InternalRules.g:340:3: ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) )
            	    // InternalRules.g:341:4: {...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRule", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRules.g:341:98: ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) )
            	    // InternalRules.g:342:5: ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRuleAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRules.g:345:8: ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) )
            	    // InternalRules.g:345:9: {...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRule", "true");
            	    }
            	    // InternalRules.g:345:18: ( (lv_access_3_0= ruleAccessibilityLevel ) )
            	    // InternalRules.g:345:19: (lv_access_3_0= ruleAccessibilityLevel )
            	    {
            	    // InternalRules.g:345:19: (lv_access_3_0= ruleAccessibilityLevel )
            	    // InternalRules.g:346:9: lv_access_3_0= ruleAccessibilityLevel
            	    {

            	    									newCompositeNode(grammarAccess.getRuleAccess().getAccessAccessibilityLevelEnumRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_13);
            	    lv_access_3_0=ruleAccessibilityLevel();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getRuleRule());
            	    									}
            	    									set(
            	    										current,
            	    										"access",
            	    										lv_access_3_0,
            	    										"org.mondo.collaboration.policy.Rules.AccessibilityLevel");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRules.g:368:3: ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) )
            	    {
            	    // InternalRules.g:368:3: ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) )
            	    // InternalRules.g:369:4: {...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRule", "getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRules.g:369:98: ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) )
            	    // InternalRules.g:370:5: ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRuleAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRules.g:373:8: ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) )
            	    // InternalRules.g:373:9: {...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRule", "true");
            	    }
            	    // InternalRules.g:373:18: ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? )
            	    // InternalRules.g:373:19: ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )?
            	    {
            	    // InternalRules.g:373:19: ( (lv_operation_4_0= ruleOperationType ) )
            	    // InternalRules.g:374:9: (lv_operation_4_0= ruleOperationType )
            	    {
            	    // InternalRules.g:374:9: (lv_operation_4_0= ruleOperationType )
            	    // InternalRules.g:375:10: lv_operation_4_0= ruleOperationType
            	    {

            	    										newCompositeNode(grammarAccess.getRuleAccess().getOperationOperationTypeEnumRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_operation_4_0=ruleOperationType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRuleRule());
            	    										}
            	    										set(
            	    											current,
            	    											"operation",
            	    											lv_operation_4_0,
            	    											"org.mondo.collaboration.policy.Rules.OperationType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_5=(Token)match(input,19,FOLLOW_3); 

            	    								newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getToKeyword_2_1());
            	    							
            	    // InternalRules.g:396:8: ( (lv_user_6_0= ruleUser ) )
            	    // InternalRules.g:397:9: (lv_user_6_0= ruleUser )
            	    {
            	    // InternalRules.g:397:9: (lv_user_6_0= ruleUser )
            	    // InternalRules.g:398:10: lv_user_6_0= ruleUser
            	    {

            	    										newCompositeNode(grammarAccess.getRuleAccess().getUserUserParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_user_6_0=ruleUser();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRuleRule());
            	    										}
            	    										set(
            	    											current,
            	    											"user",
            	    											lv_user_6_0,
            	    											"org.mondo.collaboration.policy.Rules.User");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FOLLOW_15); 

            	    								newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2_3());
            	    							
            	    otherlv_8=(Token)match(input,20,FOLLOW_16); 

            	    								newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getSelectKeyword_2_4());
            	    							
            	    // InternalRules.g:423:8: ( (lv_asset_9_0= ruleAssetType ) )
            	    // InternalRules.g:424:9: (lv_asset_9_0= ruleAssetType )
            	    {
            	    // InternalRules.g:424:9: (lv_asset_9_0= ruleAssetType )
            	    // InternalRules.g:425:10: lv_asset_9_0= ruleAssetType
            	    {

            	    										newCompositeNode(grammarAccess.getRuleAccess().getAssetAssetTypeEnumRuleCall_2_5_0());
            	    									
            	    pushFollow(FOLLOW_17);
            	    lv_asset_9_0=ruleAssetType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRuleRule());
            	    										}
            	    										set(
            	    											current,
            	    											"asset",
            	    											lv_asset_9_0,
            	    											"org.mondo.collaboration.policy.Rules.AssetType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_10=(Token)match(input,21,FOLLOW_18); 

            	    								newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getFromKeyword_2_6());
            	    							
            	    otherlv_11=(Token)match(input,22,FOLLOW_19); 

            	    								newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getQueryKeyword_2_7());
            	    							
            	    // InternalRules.g:450:8: ( (lv_query_12_0= ruleQuery ) )
            	    // InternalRules.g:451:9: (lv_query_12_0= ruleQuery )
            	    {
            	    // InternalRules.g:451:9: (lv_query_12_0= ruleQuery )
            	    // InternalRules.g:452:10: lv_query_12_0= ruleQuery
            	    {

            	    										newCompositeNode(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_2_8_0());
            	    									
            	    pushFollow(FOLLOW_20);
            	    lv_query_12_0=ruleQuery();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRuleRule());
            	    										}
            	    										set(
            	    											current,
            	    											"query",
            	    											lv_query_12_0,
            	    											"org.mondo.collaboration.policy.Rules.Query");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    // InternalRules.g:469:8: (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==23) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalRules.g:470:9: otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to'
            	            {
            	            otherlv_13=(Token)match(input,23,FOLLOW_21); 

            	            									newLeafNode(otherlv_13, grammarAccess.getRuleAccess().getWhereKeyword_2_9_0());
            	            								
            	            otherlv_14=(Token)match(input,24,FOLLOW_14); 

            	            									newLeafNode(otherlv_14, grammarAccess.getRuleAccess().getBoundKeyword_2_9_1());
            	            								
            	            otherlv_15=(Token)match(input,19,FOLLOW_22); 

            	            									newLeafNode(otherlv_15, grammarAccess.getRuleAccess().getToKeyword_2_9_2());
            	            								

            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,15,FOLLOW_23); 

            	    								newLeafNode(otherlv_16, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_2_10());
            	    							
            	    // InternalRules.g:487:8: (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==16) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalRules.g:488:9: otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority'
            	            {
            	            otherlv_17=(Token)match(input,16,FOLLOW_24); 

            	            									newLeafNode(otherlv_17, grammarAccess.getRuleAccess().getWithKeyword_2_11_0());
            	            								
            	            // InternalRules.g:492:9: ( (lv_priority_18_0= RULE_INT ) )
            	            // InternalRules.g:493:10: (lv_priority_18_0= RULE_INT )
            	            {
            	            // InternalRules.g:493:10: (lv_priority_18_0= RULE_INT )
            	            // InternalRules.g:494:11: lv_priority_18_0= RULE_INT
            	            {
            	            lv_priority_18_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            	            											newLeafNode(lv_priority_18_0, grammarAccess.getRuleAccess().getPriorityINTTerminalRuleCall_2_11_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getRuleRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"priority",
            	            												lv_priority_18_0,
            	            												"org.eclipse.xtext.common.Terminals.INT");
            	            										

            	            }


            	            }

            	            otherlv_19=(Token)match(input,25,FOLLOW_13); 

            	            									newLeafNode(otherlv_19, grammarAccess.getRuleAccess().getPriorityKeyword_2_11_2());
            	            								

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRuleAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleRule", "getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getRuleAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleUser"
    // InternalRules.g:532:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // InternalRules.g:532:45: (iv_ruleUser= ruleUser EOF )
            // InternalRules.g:533:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // InternalRules.g:539:1: ruleUser returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRules.g:545:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalRules.g:546:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalRules.g:546:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalRules.g:547:3: (lv_name_0_0= RULE_ID )
            {
            // InternalRules.g:547:3: (lv_name_0_0= RULE_ID )
            // InternalRules.g:548:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUserRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleQuery"
    // InternalRules.g:567:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalRules.g:567:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalRules.g:568:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalRules.g:574:1: ruleQuery returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalRules.g:580:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalRules.g:581:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalRules.g:581:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalRules.g:582:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalRules.g:582:3: (lv_name_0_0= RULE_STRING )
            // InternalRules.g:583:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getQueryAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQueryRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleValue"
    // InternalRules.g:602:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalRules.g:602:45: (iv_ruleValue= ruleValue EOF )
            // InternalRules.g:603:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalRules.g:609:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalRules.g:615:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalRules.g:616:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalRules.g:616:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRules.g:617:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRules.g:625:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "ruleAccessibilityLevel"
    // InternalRules.g:636:1: ruleAccessibilityLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) ) ;
    public final Enumerator ruleAccessibilityLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRules.g:642:2: ( ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) ) )
            // InternalRules.g:643:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) )
            {
            // InternalRules.g:643:2: ( (enumLiteral_0= 'allow' ) | (enumLiteral_1= 'obfuscate' ) | (enumLiteral_2= 'deny' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRules.g:644:3: (enumLiteral_0= 'allow' )
                    {
                    // InternalRules.g:644:3: (enumLiteral_0= 'allow' )
                    // InternalRules.g:645:4: enumLiteral_0= 'allow'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessibilityLevelAccess().getALLOWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:652:3: (enumLiteral_1= 'obfuscate' )
                    {
                    // InternalRules.g:652:3: (enumLiteral_1= 'obfuscate' )
                    // InternalRules.g:653:4: enumLiteral_1= 'obfuscate'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessibilityLevelAccess().getOBFUSCATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:660:3: (enumLiteral_2= 'deny' )
                    {
                    // InternalRules.g:660:3: (enumLiteral_2= 'deny' )
                    // InternalRules.g:661:4: enumLiteral_2= 'deny'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccessibilityLevelAccess().getDENYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessibilityLevel"


    // $ANTLR start "ruleOperationType"
    // InternalRules.g:671:1: ruleOperationType returns [Enumerator current=null] : ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'RW' ) ) ;
    public final Enumerator ruleOperationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRules.g:677:2: ( ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'RW' ) ) )
            // InternalRules.g:678:2: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'RW' ) )
            {
            // InternalRules.g:678:2: ( (enumLiteral_0= 'R' ) | (enumLiteral_1= 'RW' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRules.g:679:3: (enumLiteral_0= 'R' )
                    {
                    // InternalRules.g:679:3: (enumLiteral_0= 'R' )
                    // InternalRules.g:680:4: enumLiteral_0= 'R'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationTypeAccess().getREADEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:687:3: (enumLiteral_1= 'RW' )
                    {
                    // InternalRules.g:687:3: (enumLiteral_1= 'RW' )
                    // InternalRules.g:688:4: enumLiteral_1= 'RW'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationTypeAccess().getREADWRITEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationType"


    // $ANTLR start "ruleAssetType"
    // InternalRules.g:698:1: ruleAssetType returns [Enumerator current=null] : ( (enumLiteral_0= 'ObjectFact' ) | (enumLiteral_1= 'ReferenceFact' ) | (enumLiteral_2= 'AttributeFact' ) ) ;
    public final Enumerator ruleAssetType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRules.g:704:2: ( ( (enumLiteral_0= 'ObjectFact' ) | (enumLiteral_1= 'ReferenceFact' ) | (enumLiteral_2= 'AttributeFact' ) ) )
            // InternalRules.g:705:2: ( (enumLiteral_0= 'ObjectFact' ) | (enumLiteral_1= 'ReferenceFact' ) | (enumLiteral_2= 'AttributeFact' ) )
            {
            // InternalRules.g:705:2: ( (enumLiteral_0= 'ObjectFact' ) | (enumLiteral_1= 'ReferenceFact' ) | (enumLiteral_2= 'AttributeFact' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRules.g:706:3: (enumLiteral_0= 'ObjectFact' )
                    {
                    // InternalRules.g:706:3: (enumLiteral_0= 'ObjectFact' )
                    // InternalRules.g:707:4: enumLiteral_0= 'ObjectFact'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getAssetTypeAccess().getObjectFactEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAssetTypeAccess().getObjectFactEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:714:3: (enumLiteral_1= 'ReferenceFact' )
                    {
                    // InternalRules.g:714:3: (enumLiteral_1= 'ReferenceFact' )
                    // InternalRules.g:715:4: enumLiteral_1= 'ReferenceFact'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getAssetTypeAccess().getReferenceFactEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAssetTypeAccess().getReferenceFactEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRules.g:722:3: (enumLiteral_2= 'AttributeFact' )
                    {
                    // InternalRules.g:722:3: (enumLiteral_2= 'AttributeFact' )
                    // InternalRules.g:723:4: enumLiteral_2= 'AttributeFact'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getAssetTypeAccess().getAttributeFactEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAssetTypeAccess().getAttributeFactEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssetType"


    // $ANTLR start "ruleResolutionType"
    // InternalRules.g:733:1: ruleResolutionType returns [Enumerator current=null] : ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) ;
    public final Enumerator ruleResolutionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRules.g:739:2: ( ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) ) )
            // InternalRules.g:740:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            {
            // InternalRules.g:740:2: ( (enumLiteral_0= 'restrictive' ) | (enumLiteral_1= 'permissive' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRules.g:741:3: (enumLiteral_0= 'restrictive' )
                    {
                    // InternalRules.g:741:3: (enumLiteral_0= 'restrictive' )
                    // InternalRules.g:742:4: enumLiteral_0= 'restrictive'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResolutionTypeAccess().getRESTRICTIVEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRules.g:749:3: (enumLiteral_1= 'permissive' )
                    {
                    // InternalRules.g:749:3: (enumLiteral_1= 'permissive' )
                    // InternalRules.g:750:4: enumLiteral_1= 'permissive'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getResolutionTypeAccess().getPERMISSIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleResolutionType"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\12\uffff";
    static final String dfa_3s = "\1\17\1\uffff\6\0\3\uffff";
    static final String dfa_4s = "\1\36\1\uffff\6\0\3\uffff";
    static final String dfa_5s = "\1\uffff\1\4\6\uffff\1\1\1\2\1\3";
    static final String dfa_6s = "\2\uffff\1\0\1\2\1\4\1\5\1\1\1\3\3\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\1\2\7\uffff\1\3\1\4\1\5\1\6\1\7",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 306:5: ( ({...}? => ( ({...}? => (otherlv_1= 'rule' ( (lv_name_2_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_access_3_0= ruleAccessibilityLevel ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_operation_4_0= ruleOperationType ) ) otherlv_5= 'to' ( (lv_user_6_0= ruleUser ) ) otherlv_7= '{' otherlv_8= 'select' ( (lv_asset_9_0= ruleAssetType ) ) otherlv_10= 'from' otherlv_11= 'query' ( (lv_query_12_0= ruleQuery ) ) (otherlv_13= 'where' otherlv_14= 'bound' otherlv_15= 'to' )? otherlv_16= '}' (otherlv_17= 'with' ( (lv_priority_18_0= RULE_INT ) ) otherlv_19= 'priority' )? ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 0) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_6 = input.LA(1);

                         
                        int index5_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index5_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_3 = input.LA(1);

                         
                        int index5_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index5_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_7 = input.LA(1);

                         
                        int index5_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 2) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index5_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_4 = input.LA(1);

                         
                        int index5_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index5_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_5 = input.LA(1);

                         
                        int index5_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRuleAccess().getUnorderedGroup(), 1) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getRuleAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index5_5);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000007C000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000007C001802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000007C0C8800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000007C0C0802L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000007C0D0802L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});

}