package com.github.evra.jcr.parser.antlr.internal; 

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
import com.github.evra.jcr.services.CndGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCndParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_62", "KEYWORD_61", "KEYWORD_59", "KEYWORD_60", "KEYWORD_57", "KEYWORD_58", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_18", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "RULE_EXID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=67;
    public static final int RULE_ANY_OTHER=73;
    public static final int KEYWORD_56=14;
    public static final int KEYWORD_19=37;
    public static final int KEYWORD_55=13;
    public static final int KEYWORD_54=12;
    public static final int KEYWORD_17=65;
    public static final int KEYWORD_53=11;
    public static final int KEYWORD_18=48;
    public static final int KEYWORD_52=10;
    public static final int KEYWORD_15=63;
    public static final int KEYWORD_51=17;
    public static final int KEYWORD_16=64;
    public static final int KEYWORD_50=16;
    public static final int KEYWORD_13=61;
    public static final int KEYWORD_14=62;
    public static final int KEYWORD_11=59;
    public static final int EOF=-1;
    public static final int KEYWORD_12=60;
    public static final int KEYWORD_10=58;
    public static final int KEYWORD_59=6;
    public static final int KEYWORD_58=9;
    public static final int KEYWORD_57=8;
    public static final int KEYWORD_6=54;
    public static final int KEYWORD_7=55;
    public static final int KEYWORD_8=56;
    public static final int KEYWORD_9=57;
    public static final int KEYWORD_28=46;
    public static final int RULE_EXID=66;
    public static final int KEYWORD_29=47;
    public static final int RULE_INT=68;
    public static final int KEYWORD_61=5;
    public static final int KEYWORD_24=42;
    public static final int KEYWORD_60=7;
    public static final int KEYWORD_25=43;
    public static final int KEYWORD_26=44;
    public static final int KEYWORD_27=45;
    public static final int KEYWORD_62=4;
    public static final int KEYWORD_20=38;
    public static final int KEYWORD_21=39;
    public static final int KEYWORD_22=40;
    public static final int KEYWORD_23=41;
    public static final int KEYWORD_30=32;
    public static final int KEYWORD_1=49;
    public static final int KEYWORD_34=36;
    public static final int KEYWORD_5=53;
    public static final int KEYWORD_33=35;
    public static final int KEYWORD_4=52;
    public static final int KEYWORD_32=34;
    public static final int KEYWORD_3=51;
    public static final int KEYWORD_31=33;
    public static final int KEYWORD_2=50;
    public static final int KEYWORD_38=31;
    public static final int KEYWORD_37=30;
    public static final int RULE_SL_COMMENT=71;
    public static final int KEYWORD_36=29;
    public static final int KEYWORD_35=28;
    public static final int RULE_ML_COMMENT=70;
    public static final int KEYWORD_39=24;
    public static final int RULE_STRING=69;
    public static final int KEYWORD_41=26;
    public static final int KEYWORD_40=25;
    public static final int KEYWORD_43=18;
    public static final int KEYWORD_42=27;
    public static final int KEYWORD_45=20;
    public static final int KEYWORD_44=19;
    public static final int KEYWORD_47=22;
    public static final int RULE_WS=72;
    public static final int KEYWORD_46=21;
    public static final int KEYWORD_49=15;
    public static final int KEYWORD_48=23;

    // delegates
    // delegators


        public InternalCndParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCndParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCndParser.tokenNames; }
    public String getGrammarFileName() { return "../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g"; }




    	private CndGrammarAccess grammarAccess;
    	 	
    	public InternalCndParser(TokenStream input, CndGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "Model";	
    	} 
    	   	   	
    	@Override
    	protected CndGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleModel"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:62:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:63:2: (iv_ruleModel= ruleModel EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:64:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel77); 

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
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_namespaces_0_0= ruleNsMapping ) ) | ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_namespaces_0_0 = null;

        EObject lv_nodeTypes_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:74:28: ( ( ( (lv_namespaces_0_0= ruleNsMapping ) ) | ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:75:1: ( ( (lv_namespaces_0_0= ruleNsMapping ) ) | ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:75:1: ( ( (lv_namespaces_0_0= ruleNsMapping ) ) | ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==KEYWORD_8) ) {
                    alt1=1;
                }
                else if ( (LA1_0==KEYWORD_11) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:75:2: ( (lv_namespaces_0_0= ruleNsMapping ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:75:2: ( (lv_namespaces_0_0= ruleNsMapping ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:76:1: (lv_namespaces_0_0= ruleNsMapping )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:76:1: (lv_namespaces_0_0= ruleNsMapping )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:77:3: lv_namespaces_0_0= ruleNsMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getNamespacesNsMappingParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNsMapping_in_ruleModel123);
            	    lv_namespaces_0_0=ruleNsMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"namespaces",
            	            		lv_namespaces_0_0, 
            	            		"NsMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:94:6: ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:94:6: ( (lv_nodeTypes_1_0= ruleNodeTypeDefinition ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:95:1: (lv_nodeTypes_1_0= ruleNodeTypeDefinition )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:95:1: (lv_nodeTypes_1_0= ruleNodeTypeDefinition )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:96:3: lv_nodeTypes_1_0= ruleNodeTypeDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getNodeTypesNodeTypeDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeTypeDefinition_in_ruleModel150);
            	    lv_nodeTypes_1_0=ruleNodeTypeDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"nodeTypes",
            	            		lv_nodeTypes_1_0, 
            	            		"NodeTypeDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleNodeTypeDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:120:1: entryRuleNodeTypeDefinition returns [EObject current=null] : iv_ruleNodeTypeDefinition= ruleNodeTypeDefinition EOF ;
    public final EObject entryRuleNodeTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTypeDefinition = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:121:2: (iv_ruleNodeTypeDefinition= ruleNodeTypeDefinition EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:122:2: iv_ruleNodeTypeDefinition= ruleNodeTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getNodeTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeTypeDefinition_in_entryRuleNodeTypeDefinition186);
            iv_ruleNodeTypeDefinition=ruleNodeTypeDefinition();

            state._fsp--;

             current =iv_ruleNodeTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeDefinition196); 

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
    // $ANTLR end "entryRuleNodeTypeDefinition"


    // $ANTLR start "ruleNodeTypeDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:129:1: ruleNodeTypeDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( (lv_declaredSupertypeNames_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_declaredSupertypeNames_6_0= ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )* ) ;
    public final EObject ruleNodeTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_declaredSupertypeNames_4_0 = null;

        AntlrDatatypeRuleToken lv_declaredSupertypeNames_6_0 = null;

        AntlrDatatypeRuleToken lv_orderable_8_0 = null;

        AntlrDatatypeRuleToken lv_mixin_9_0 = null;

        AntlrDatatypeRuleToken lv_abstract_10_0 = null;

        AntlrDatatypeRuleToken lv_queryable_11_0 = null;

        AntlrDatatypeRuleToken lv_notqueryable_12_0 = null;

        AntlrDatatypeRuleToken lv_primaryItem_13_0 = null;

        EObject lv_declaredPropertyDefinitions_14_0 = null;

        EObject lv_declaredChildNodeDefinitions_15_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:132:28: ( (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( (lv_declaredSupertypeNames_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_declaredSupertypeNames_6_0= ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:133:1: (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( (lv_declaredSupertypeNames_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_declaredSupertypeNames_6_0= ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )* )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:133:1: (otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( (lv_declaredSupertypeNames_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_declaredSupertypeNames_6_0= ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:134:2: otherlv_0= KEYWORD_11 ( (lv_name_1_0= ruleJcrString ) ) otherlv_2= KEYWORD_12 (otherlv_3= KEYWORD_10 ( (lv_declaredSupertypeNames_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_declaredSupertypeNames_6_0= ruleJcrString ) ) )* )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) ) ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )*
            {
            otherlv_0=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleNodeTypeDefinition234); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeTypeDefinitionAccess().getLeftSquareBracketKeyword_0());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:138:1: ( (lv_name_1_0= ruleJcrString ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:139:1: (lv_name_1_0= ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:139:1: (lv_name_1_0= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:140:3: lv_name_1_0= ruleJcrString
            {
             
            	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getNameJcrStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition254);
            lv_name_1_0=ruleJcrString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"JcrString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleNodeTypeDefinition267); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeTypeDefinitionAccess().getRightSquareBracketKeyword_2());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:161:1: (otherlv_3= KEYWORD_10 ( (lv_declaredSupertypeNames_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_declaredSupertypeNames_6_0= ruleJcrString ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_10) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:162:2: otherlv_3= KEYWORD_10 ( (lv_declaredSupertypeNames_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_declaredSupertypeNames_6_0= ruleJcrString ) ) )*
                    {
                    otherlv_3=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleNodeTypeDefinition280); 

                        	newLeafNode(otherlv_3, grammarAccess.getNodeTypeDefinitionAccess().getGreaterThanSignKeyword_3_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:166:1: ( (lv_declaredSupertypeNames_4_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:167:1: (lv_declaredSupertypeNames_4_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:167:1: (lv_declaredSupertypeNames_4_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:168:3: lv_declaredSupertypeNames_4_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesJcrStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition300);
                    lv_declaredSupertypeNames_4_0=ruleJcrString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"declaredSupertypeNames",
                            		lv_declaredSupertypeNames_4_0, 
                            		"JcrString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:184:2: (otherlv_5= KEYWORD_6 ( (lv_declaredSupertypeNames_6_0= ruleJcrString ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==KEYWORD_6) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:185:2: otherlv_5= KEYWORD_6 ( (lv_declaredSupertypeNames_6_0= ruleJcrString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleNodeTypeDefinition314); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getNodeTypeDefinitionAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:189:1: ( (lv_declaredSupertypeNames_6_0= ruleJcrString ) )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:190:1: (lv_declaredSupertypeNames_6_0= ruleJcrString )
                    	    {
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:190:1: (lv_declaredSupertypeNames_6_0= ruleJcrString )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:191:3: lv_declaredSupertypeNames_6_0= ruleJcrString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesJcrStringParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition334);
                    	    lv_declaredSupertypeNames_6_0=ruleJcrString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declaredSupertypeNames",
                    	            		lv_declaredSupertypeNames_6_0, 
                    	            		"JcrString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:207:6: ( ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:209:1: ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:209:1: ( ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:210:2: ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:213:2: ( ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:214:3: ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:214:3: ( ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) ) )*
            loop4:
            do {
                int alt4=7;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==KEYWORD_55||LA4_0==KEYWORD_26||LA4_0==KEYWORD_15) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                    alt4=1;
                }
                else if ( (LA4_0==KEYWORD_36||LA4_0==KEYWORD_23||LA4_0==KEYWORD_14) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                    alt4=2;
                }
                else if ( (LA4_0==KEYWORD_49||LA4_0==KEYWORD_20||LA4_0==KEYWORD_13) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                    alt4=3;
                }
                else if ( (LA4_0==KEYWORD_38||LA4_0==KEYWORD_17) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                    alt4=4;
                }
                else if ( (LA4_0==KEYWORD_47||LA4_0==KEYWORD_18) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                    alt4=5;
                }
                else if ( (LA4_0==KEYWORD_60||LA4_0==KEYWORD_1) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                    alt4=6;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:216:4: ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:216:4: ({...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:217:5: {...}? => ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:217:115: ( ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:218:6: ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:221:6: ({...}? => ( (lv_orderable_8_0= ruleOrderable ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:221:7: {...}? => ( (lv_orderable_8_0= ruleOrderable ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:221:16: ( (lv_orderable_8_0= ruleOrderable ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:222:1: (lv_orderable_8_0= ruleOrderable )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:222:1: (lv_orderable_8_0= ruleOrderable )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:223:3: lv_orderable_8_0= ruleOrderable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getOrderableOrderableParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrderable_in_ruleNodeTypeDefinition404);
            	    lv_orderable_8_0=ruleOrderable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"orderable",
            	            		true, 
            	            		"Orderable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:246:4: ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:246:4: ({...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:247:5: {...}? => ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:247:115: ( ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:248:6: ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:251:6: ({...}? => ( (lv_mixin_9_0= ruleMixin ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:251:7: {...}? => ( (lv_mixin_9_0= ruleMixin ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:251:16: ( (lv_mixin_9_0= ruleMixin ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:252:1: (lv_mixin_9_0= ruleMixin )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:252:1: (lv_mixin_9_0= ruleMixin )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:253:3: lv_mixin_9_0= ruleMixin
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getMixinMixinParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMixin_in_ruleNodeTypeDefinition479);
            	    lv_mixin_9_0=ruleMixin();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"mixin",
            	            		true, 
            	            		"Mixin");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:276:4: ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:276:4: ({...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:277:5: {...}? => ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:277:115: ( ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:278:6: ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:281:6: ({...}? => ( (lv_abstract_10_0= ruleAbstract ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:281:7: {...}? => ( (lv_abstract_10_0= ruleAbstract ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:281:16: ( (lv_abstract_10_0= ruleAbstract ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:282:1: (lv_abstract_10_0= ruleAbstract )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:282:1: (lv_abstract_10_0= ruleAbstract )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:283:3: lv_abstract_10_0= ruleAbstract
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAbstractParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstract_in_ruleNodeTypeDefinition554);
            	    lv_abstract_10_0=ruleAbstract();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"abstract",
            	            		true, 
            	            		"Abstract");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:306:4: ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:306:4: ({...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:307:5: {...}? => ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:307:115: ( ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:308:6: ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:311:6: ({...}? => ( (lv_queryable_11_0= ruleQueryable ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:311:7: {...}? => ( (lv_queryable_11_0= ruleQueryable ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:311:16: ( (lv_queryable_11_0= ruleQueryable ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:312:1: (lv_queryable_11_0= ruleQueryable )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:312:1: (lv_queryable_11_0= ruleQueryable )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:313:3: lv_queryable_11_0= ruleQueryable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getQueryableQueryableParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQueryable_in_ruleNodeTypeDefinition629);
            	    lv_queryable_11_0=ruleQueryable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"queryable",
            	            		true, 
            	            		"Queryable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:336:4: ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:336:4: ({...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:337:5: {...}? => ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:337:115: ( ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:338:6: ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:341:6: ({...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:341:7: {...}? => ( (lv_notqueryable_12_0= ruleNotqueryable ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:341:16: ( (lv_notqueryable_12_0= ruleNotqueryable ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:342:1: (lv_notqueryable_12_0= ruleNotqueryable )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:342:1: (lv_notqueryable_12_0= ruleNotqueryable )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:343:3: lv_notqueryable_12_0= ruleNotqueryable
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableNotqueryableParserRuleCall_4_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotqueryable_in_ruleNodeTypeDefinition704);
            	    lv_notqueryable_12_0=ruleNotqueryable();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"notqueryable",
            	            		true, 
            	            		"Notqueryable");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:366:4: ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:366:4: ({...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:367:5: {...}? => ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:367:115: ( ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:368:6: ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:371:6: ({...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:371:7: {...}? => ( (lv_primaryItem_13_0= rulePrimaryItem ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeTypeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:371:16: ( (lv_primaryItem_13_0= rulePrimaryItem ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:372:1: (lv_primaryItem_13_0= rulePrimaryItem )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:372:1: (lv_primaryItem_13_0= rulePrimaryItem )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:373:3: lv_primaryItem_13_0= rulePrimaryItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemPrimaryItemParserRuleCall_4_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryItem_in_ruleNodeTypeDefinition779);
            	    lv_primaryItem_13_0=rulePrimaryItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"primaryItem",
            	            		lv_primaryItem_13_0, 
            	            		"PrimaryItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:403:2: ( ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) ) | ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==KEYWORD_7) ) {
                    alt5=1;
                }
                else if ( (LA5_0==KEYWORD_5) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:403:3: ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:403:3: ( (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:404:1: (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:404:1: (lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:405:3: lv_declaredPropertyDefinitions_14_0= rulePropertyDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsPropertyDefinitionParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleNodeTypeDefinition841);
            	    lv_declaredPropertyDefinitions_14_0=rulePropertyDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaredPropertyDefinitions",
            	            		lv_declaredPropertyDefinitions_14_0, 
            	            		"PropertyDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:422:6: ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:422:6: ( (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:423:1: (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:423:1: (lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:424:3: lv_declaredChildNodeDefinitions_15_0= ruleNodeDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsNodeDefinitionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeDefinition_in_ruleNodeTypeDefinition868);
            	    lv_declaredChildNodeDefinitions_15_0=ruleNodeDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeTypeDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declaredChildNodeDefinitions",
            	            		lv_declaredChildNodeDefinitions_15_0, 
            	            		"NodeDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleNodeTypeDefinition"


    // $ANTLR start "entryRuleNodeDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:448:1: entryRuleNodeDefinition returns [EObject current=null] : iv_ruleNodeDefinition= ruleNodeDefinition EOF ;
    public final EObject entryRuleNodeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeDefinition = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:449:2: (iv_ruleNodeDefinition= ruleNodeDefinition EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:450:2: iv_ruleNodeDefinition= ruleNodeDefinition EOF
            {
             newCompositeNode(grammarAccess.getNodeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition905);
            iv_ruleNodeDefinition=ruleNodeDefinition();

            state._fsp--;

             current =iv_ruleNodeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDefinition915); 

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
    // $ANTLR end "entryRuleNodeDefinition"


    // $ANTLR start "ruleNodeDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:457:1: ruleNodeDefinition returns [EObject current=null] : (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( (lv_requiredTypes_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_requiredTypes_6_0= ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( (lv_defaultType_9_0= ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleNodeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_requiredTypes_4_0 = null;

        AntlrDatatypeRuleToken lv_requiredTypes_6_0 = null;

        AntlrDatatypeRuleToken lv_defaultType_9_0 = null;

        AntlrDatatypeRuleToken lv_autocreated_11_0 = null;

        AntlrDatatypeRuleToken lv_manadatory_12_0 = null;

        AntlrDatatypeRuleToken lv_protected_13_0 = null;

        Enumerator lv_onParentVersion_14_0 = null;

        AntlrDatatypeRuleToken lv_sameNameSiblings_15_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:460:28: ( (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( (lv_requiredTypes_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_requiredTypes_6_0= ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( (lv_defaultType_9_0= ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:461:1: (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( (lv_requiredTypes_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_requiredTypes_6_0= ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( (lv_defaultType_9_0= ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:461:1: (otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( (lv_requiredTypes_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_requiredTypes_6_0= ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( (lv_defaultType_9_0= ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:462:2: otherlv_0= KEYWORD_5 ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) ) (otherlv_3= KEYWORD_2 ( ( (lv_requiredTypes_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_requiredTypes_6_0= ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )? (otherlv_8= KEYWORD_9 ( (lv_defaultType_9_0= ruleJcrString ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleNodeDefinition953); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeDefinitionAccess().getPlusSignKeyword_0());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:466:1: ( ( (lv_name_1_0= ruleJcrString ) ) | ( (lv_name_2_0= KEYWORD_4 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_23||LA6_0==RULE_EXID||LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==KEYWORD_4) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:466:2: ( (lv_name_1_0= ruleJcrString ) )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:466:2: ( (lv_name_1_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:467:1: (lv_name_1_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:467:1: (lv_name_1_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:468:3: lv_name_1_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getNameJcrStringParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition974);
                    lv_name_1_0=ruleJcrString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"JcrString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:485:6: ( (lv_name_2_0= KEYWORD_4 ) )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:485:6: ( (lv_name_2_0= KEYWORD_4 ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:486:1: (lv_name_2_0= KEYWORD_4 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:486:1: (lv_name_2_0= KEYWORD_4 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:487:3: lv_name_2_0= KEYWORD_4
                    {
                    lv_name_2_0=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleNodeDefinition999); 

                            newLeafNode(lv_name_2_0, grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "name", lv_name_2_0, "*");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:501:3: (otherlv_3= KEYWORD_2 ( ( (lv_requiredTypes_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_requiredTypes_6_0= ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_2) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:502:2: otherlv_3= KEYWORD_2 ( ( (lv_requiredTypes_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_requiredTypes_6_0= ruleJcrString ) ) )* ) otherlv_7= KEYWORD_3
                    {
                    otherlv_3=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleNodeDefinition1025); 

                        	newLeafNode(otherlv_3, grammarAccess.getNodeDefinitionAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:506:1: ( ( (lv_requiredTypes_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_requiredTypes_6_0= ruleJcrString ) ) )* )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:506:2: ( (lv_requiredTypes_4_0= ruleJcrString ) ) (otherlv_5= KEYWORD_6 ( (lv_requiredTypes_6_0= ruleJcrString ) ) )*
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:506:2: ( (lv_requiredTypes_4_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:507:1: (lv_requiredTypes_4_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:507:1: (lv_requiredTypes_4_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:508:3: lv_requiredTypes_4_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getRequiredTypesJcrStringParserRuleCall_2_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition1046);
                    lv_requiredTypes_4_0=ruleJcrString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"requiredTypes",
                            		lv_requiredTypes_4_0, 
                            		"JcrString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:524:2: (otherlv_5= KEYWORD_6 ( (lv_requiredTypes_6_0= ruleJcrString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==KEYWORD_6) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:525:2: otherlv_5= KEYWORD_6 ( (lv_requiredTypes_6_0= ruleJcrString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleNodeDefinition1060); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getNodeDefinitionAccess().getCommaKeyword_2_1_1_0());
                    	        
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:529:1: ( (lv_requiredTypes_6_0= ruleJcrString ) )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:530:1: (lv_requiredTypes_6_0= ruleJcrString )
                    	    {
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:530:1: (lv_requiredTypes_6_0= ruleJcrString )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:531:3: lv_requiredTypes_6_0= ruleJcrString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getRequiredTypesJcrStringParserRuleCall_2_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition1080);
                    	    lv_requiredTypes_6_0=ruleJcrString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"requiredTypes",
                    	            		lv_requiredTypes_6_0, 
                    	            		"JcrString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }

                    otherlv_7=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleNodeDefinition1096); 

                        	newLeafNode(otherlv_7, grammarAccess.getNodeDefinitionAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:552:3: (otherlv_8= KEYWORD_9 ( (lv_defaultType_9_0= ruleJcrString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_9) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:553:2: otherlv_8= KEYWORD_9 ( (lv_defaultType_9_0= ruleJcrString ) )
                    {
                    otherlv_8=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNodeDefinition1111); 

                        	newLeafNode(otherlv_8, grammarAccess.getNodeDefinitionAccess().getEqualsSignKeyword_3_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:557:1: ( (lv_defaultType_9_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:558:1: (lv_defaultType_9_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:558:1: (lv_defaultType_9_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:559:3: lv_defaultType_9_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getDefaultTypeJcrStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_ruleNodeDefinition1131);
                    lv_defaultType_9_0=ruleJcrString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"defaultType",
                            		lv_defaultType_9_0, 
                            		"JcrString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:575:4: ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:577:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:577:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:578:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:581:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:582:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:582:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) ) )*
            loop10:
            do {
                int alt10=6;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==KEYWORD_59||LA10_0==KEYWORD_21||LA10_0==KEYWORD_13) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                    alt10=1;
                }
                else if ( (LA10_0==KEYWORD_54||LA10_0==KEYWORD_22||LA10_0==KEYWORD_14) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                    alt10=2;
                }
                else if ( (LA10_0==KEYWORD_56||LA10_0==KEYWORD_27||LA10_0==KEYWORD_16) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                    alt10=3;
                }
                else if ( (LA10_0==KEYWORD_57||LA10_0==KEYWORD_44||LA10_0==KEYWORD_46||LA10_0==KEYWORD_41||LA10_0==KEYWORD_35||LA10_0==KEYWORD_30) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                    alt10=4;
                }
                else if ( (LA10_0==KEYWORD_50||LA10_0==KEYWORD_29||LA10_0==KEYWORD_4) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                    alt10=5;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:584:4: ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:584:4: ({...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:585:5: {...}? => ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:585:111: ( ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:586:6: ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:589:6: ({...}? => ( (lv_autocreated_11_0= ruleAutocreated ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:589:7: {...}? => ( (lv_autocreated_11_0= ruleAutocreated ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:589:16: ( (lv_autocreated_11_0= ruleAutocreated ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:590:1: (lv_autocreated_11_0= ruleAutocreated )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:590:1: (lv_autocreated_11_0= ruleAutocreated )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:591:3: lv_autocreated_11_0= ruleAutocreated
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAutocreated_in_ruleNodeDefinition1199);
            	    lv_autocreated_11_0=ruleAutocreated();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"autocreated",
            	            		true, 
            	            		"Autocreated");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:614:4: ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:614:4: ({...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:615:5: {...}? => ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:615:111: ( ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:616:6: ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:619:6: ({...}? => ( (lv_manadatory_12_0= ruleMandatory ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:619:7: {...}? => ( (lv_manadatory_12_0= ruleMandatory ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:619:16: ( (lv_manadatory_12_0= ruleMandatory ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:620:1: (lv_manadatory_12_0= ruleMandatory )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:620:1: (lv_manadatory_12_0= ruleMandatory )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:621:3: lv_manadatory_12_0= ruleMandatory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getManadatoryMandatoryParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMandatory_in_ruleNodeDefinition1274);
            	    lv_manadatory_12_0=ruleMandatory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"manadatory",
            	            		true, 
            	            		"Mandatory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:644:4: ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:644:4: ({...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:645:5: {...}? => ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:645:111: ( ({...}? => ( (lv_protected_13_0= ruleProtected ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:646:6: ({...}? => ( (lv_protected_13_0= ruleProtected ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:649:6: ({...}? => ( (lv_protected_13_0= ruleProtected ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:649:7: {...}? => ( (lv_protected_13_0= ruleProtected ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:649:16: ( (lv_protected_13_0= ruleProtected ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:650:1: (lv_protected_13_0= ruleProtected )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:650:1: (lv_protected_13_0= ruleProtected )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:651:3: lv_protected_13_0= ruleProtected
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getProtectedProtectedParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtected_in_ruleNodeDefinition1349);
            	    lv_protected_13_0=ruleProtected();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"protected",
            	            		true, 
            	            		"Protected");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:674:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:674:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:675:5: {...}? => ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:675:111: ( ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:676:6: ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:679:6: ({...}? => ( (lv_onParentVersion_14_0= ruleOpv ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:679:7: {...}? => ( (lv_onParentVersion_14_0= ruleOpv ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:679:16: ( (lv_onParentVersion_14_0= ruleOpv ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:680:1: (lv_onParentVersion_14_0= ruleOpv )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:680:1: (lv_onParentVersion_14_0= ruleOpv )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:681:3: lv_onParentVersion_14_0= ruleOpv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getOnParentVersionOpvEnumRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOpv_in_ruleNodeDefinition1424);
            	    lv_onParentVersion_14_0=ruleOpv();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"onParentVersion",
            	            		lv_onParentVersion_14_0, 
            	            		"Opv");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:704:4: ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:704:4: ({...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:705:5: {...}? => ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:705:111: ( ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:706:6: ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:709:6: ({...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:709:7: {...}? => ( (lv_sameNameSiblings_15_0= ruleSns ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNodeDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:709:16: ( (lv_sameNameSiblings_15_0= ruleSns ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:710:1: (lv_sameNameSiblings_15_0= ruleSns )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:710:1: (lv_sameNameSiblings_15_0= ruleSns )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:711:3: lv_sameNameSiblings_15_0= ruleSns
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsSnsParserRuleCall_4_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSns_in_ruleNodeDefinition1499);
            	    lv_sameNameSiblings_15_0=ruleSns();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"sameNameSiblings",
            	            		true, 
            	            		"Sns");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	

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
    // $ANTLR end "ruleNodeDefinition"


    // $ANTLR start "entryRuleSns"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:749:1: entryRuleSns returns [String current=null] : iv_ruleSns= ruleSns EOF ;
    public final String entryRuleSns() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSns = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:750:1: (iv_ruleSns= ruleSns EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:751:2: iv_ruleSns= ruleSns EOF
            {
             newCompositeNode(grammarAccess.getSnsRule()); 
            pushFollow(FOLLOW_ruleSns_in_entryRuleSns1575);
            iv_ruleSns=ruleSns();

            state._fsp--;

             current =iv_ruleSns.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSns1586); 

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
    // $ANTLR end "entryRuleSns"


    // $ANTLR start "ruleSns"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:758:1: ruleSns returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 ) ;
    public final AntlrDatatypeRuleToken ruleSns() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:762:6: ( (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:763:1: (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:763:1: (kw= KEYWORD_29 | kw= KEYWORD_4 | kw= KEYWORD_50 )
            int alt11=3;
            switch ( input.LA(1) ) {
            case KEYWORD_29:
                {
                alt11=1;
                }
                break;
            case KEYWORD_4:
                {
                alt11=2;
                }
                break;
            case KEYWORD_50:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:764:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleSns1624); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getSnsKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:771:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleSns1643); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getAsteriskKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:778:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleSns1662); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSnsAccess().getMultipleKeyword_2()); 
                        

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
    // $ANTLR end "ruleSns"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:791:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:792:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:793:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1701);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition1711); 

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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:800:1: rulePropertyDefinition returns [EObject current=null] : ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_defaultValues_8_0 = null;

        AntlrDatatypeRuleToken lv_defaultValues_10_0 = null;

        AntlrDatatypeRuleToken lv_autocreated_12_0 = null;

        AntlrDatatypeRuleToken lv_mandatory_13_0 = null;

        AntlrDatatypeRuleToken lv_protected_14_0 = null;

        Enumerator lv_onParentVersion_15_0 = null;

        AntlrDatatypeRuleToken lv_multiple_16_0 = null;

        AntlrDatatypeRuleToken lv_queryOps_17_0 = null;

        AntlrDatatypeRuleToken lv_noFullText_18_0 = null;

        AntlrDatatypeRuleToken lv_noQueryOrder_19_0 = null;

        AntlrDatatypeRuleToken lv_primary_20_0 = null;

        AntlrDatatypeRuleToken lv_valueConstraints_22_0 = null;

        AntlrDatatypeRuleToken lv_valueConstraints_24_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:803:28: ( ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:804:1: ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:804:1: ( () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )? )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:804:2: () otherlv_1= KEYWORD_7 ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 ) (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )? (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) ) (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )?
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:804:2: ()
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:805:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rulePropertyDefinition1758); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getHyphenMinusKeyword_1());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:815:1: ( ( (lv_name_2_0= ruleJcrString ) ) | otherlv_3= KEYWORD_4 )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KEYWORD_23||LA12_0==RULE_EXID||LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==KEYWORD_4) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:815:2: ( (lv_name_2_0= ruleJcrString ) )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:815:2: ( (lv_name_2_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:816:1: (lv_name_2_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:816:1: (lv_name_2_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:817:3: lv_name_2_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameJcrStringParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition1779);
                    lv_name_2_0=ruleJcrString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"JcrString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:835:2: otherlv_3= KEYWORD_4
                    {
                    otherlv_3=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulePropertyDefinition1798); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getAsteriskKeyword_2_1());
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:839:2: (otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KEYWORD_2) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:840:2: otherlv_4= KEYWORD_2 ( (lv_type_5_0= rulePropertyType ) ) otherlv_6= KEYWORD_3
                    {
                    otherlv_4=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rulePropertyDefinition1812); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:844:1: ( (lv_type_5_0= rulePropertyType ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:845:1: (lv_type_5_0= rulePropertyType )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:845:1: (lv_type_5_0= rulePropertyType )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:846:3: lv_type_5_0= rulePropertyType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyType_in_rulePropertyDefinition1832);
                    lv_type_5_0=rulePropertyType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"PropertyType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rulePropertyDefinition1845); 

                        	newLeafNode(otherlv_6, grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:867:3: (otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_9) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:868:2: otherlv_7= KEYWORD_9 ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* )
                    {
                    otherlv_7=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rulePropertyDefinition1860); 

                        	newLeafNode(otherlv_7, grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_4_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:872:1: ( ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )* )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:872:2: ( (lv_defaultValues_8_0= ruleJcrString ) ) (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )*
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:872:2: ( (lv_defaultValues_8_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:873:1: (lv_defaultValues_8_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:873:1: (lv_defaultValues_8_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:874:3: lv_defaultValues_8_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition1881);
                    lv_defaultValues_8_0=ruleJcrString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"defaultValues",
                            		lv_defaultValues_8_0, 
                            		"JcrString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:890:2: (otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==KEYWORD_6) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:891:2: otherlv_9= KEYWORD_6 ( (lv_defaultValues_10_0= ruleJcrString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePropertyDefinition1895); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_4_1_1_0());
                    	        
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:895:1: ( (lv_defaultValues_10_0= ruleJcrString ) )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:896:1: (lv_defaultValues_10_0= ruleJcrString )
                    	    {
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:896:1: (lv_defaultValues_10_0= ruleJcrString )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:897:3: lv_defaultValues_10_0= ruleJcrString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition1915);
                    	    lv_defaultValues_10_0=ruleJcrString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"defaultValues",
                    	            		lv_defaultValues_10_0, 
                    	            		"JcrString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:913:7: ( ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:915:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:915:1: ( ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:916:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:919:2: ( ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )* )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:920:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )*
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:920:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )*
            loop16:
            do {
                int alt16=10;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:922:4: ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:922:4: ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:923:5: {...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:923:115: ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:924:6: ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:927:6: ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:927:7: {...}? => ( (lv_autocreated_12_0= ruleAutocreated ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:927:16: ( (lv_autocreated_12_0= ruleAutocreated ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:928:1: (lv_autocreated_12_0= ruleAutocreated )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:928:1: (lv_autocreated_12_0= ruleAutocreated )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:929:3: lv_autocreated_12_0= ruleAutocreated
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAutocreated_in_rulePropertyDefinition1986);
            	    lv_autocreated_12_0=ruleAutocreated();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"autocreated",
            	            		true, 
            	            		"Autocreated");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:952:4: ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:952:4: ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:953:5: {...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:953:115: ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:954:6: ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:957:6: ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:957:7: {...}? => ( (lv_mandatory_13_0= ruleMandatory ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:957:16: ( (lv_mandatory_13_0= ruleMandatory ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:958:1: (lv_mandatory_13_0= ruleMandatory )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:958:1: (lv_mandatory_13_0= ruleMandatory )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:959:3: lv_mandatory_13_0= ruleMandatory
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getMandatoryMandatoryParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMandatory_in_rulePropertyDefinition2061);
            	    lv_mandatory_13_0=ruleMandatory();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"mandatory",
            	            		true, 
            	            		"Mandatory");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:982:4: ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:982:4: ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:983:5: {...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:983:115: ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:984:6: ({...}? => ( (lv_protected_14_0= ruleProtected ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:987:6: ({...}? => ( (lv_protected_14_0= ruleProtected ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:987:7: {...}? => ( (lv_protected_14_0= ruleProtected ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:987:16: ( (lv_protected_14_0= ruleProtected ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:988:1: (lv_protected_14_0= ruleProtected )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:988:1: (lv_protected_14_0= ruleProtected )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:989:3: lv_protected_14_0= ruleProtected
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getProtectedProtectedParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProtected_in_rulePropertyDefinition2136);
            	    lv_protected_14_0=ruleProtected();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"protected",
            	            		true, 
            	            		"Protected");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1012:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1012:4: ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1013:5: {...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1013:115: ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1014:6: ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1017:6: ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1017:7: {...}? => ( (lv_onParentVersion_15_0= ruleOpv ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1017:16: ( (lv_onParentVersion_15_0= ruleOpv ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1018:1: (lv_onParentVersion_15_0= ruleOpv )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1018:1: (lv_onParentVersion_15_0= ruleOpv )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1019:3: lv_onParentVersion_15_0= ruleOpv
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionOpvEnumRuleCall_5_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOpv_in_rulePropertyDefinition2211);
            	    lv_onParentVersion_15_0=ruleOpv();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"onParentVersion",
            	            		lv_onParentVersion_15_0, 
            	            		"Opv");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1042:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1042:4: ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1043:5: {...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1043:115: ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1044:6: ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1047:6: ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1047:7: {...}? => ( (lv_multiple_16_0= ruleMultiple ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1047:16: ( (lv_multiple_16_0= ruleMultiple ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1048:1: (lv_multiple_16_0= ruleMultiple )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1048:1: (lv_multiple_16_0= ruleMultiple )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1049:3: lv_multiple_16_0= ruleMultiple
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getMultipleMultipleParserRuleCall_5_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiple_in_rulePropertyDefinition2286);
            	    lv_multiple_16_0=ruleMultiple();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"multiple",
            	            		true, 
            	            		"Multiple");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1072:4: ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1072:4: ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1073:5: {...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1073:115: ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1074:6: ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1077:6: ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1077:7: {...}? => ( (lv_queryOps_17_0= ruleQueryOps ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1077:16: ( (lv_queryOps_17_0= ruleQueryOps ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1078:1: (lv_queryOps_17_0= ruleQueryOps )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1078:1: (lv_queryOps_17_0= ruleQueryOps )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1079:3: lv_queryOps_17_0= ruleQueryOps
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getQueryOpsQueryOpsParserRuleCall_5_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQueryOps_in_rulePropertyDefinition2361);
            	    lv_queryOps_17_0=ruleQueryOps();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"queryOps",
            	            		lv_queryOps_17_0, 
            	            		"QueryOps");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1102:4: ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1102:4: ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1103:5: {...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1103:115: ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1104:6: ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1107:6: ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1107:7: {...}? => ( (lv_noFullText_18_0= ruleNoFullText ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1107:16: ( (lv_noFullText_18_0= ruleNoFullText ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1108:1: (lv_noFullText_18_0= ruleNoFullText )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1108:1: (lv_noFullText_18_0= ruleNoFullText )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1109:3: lv_noFullText_18_0= ruleNoFullText
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNoFullTextNoFullTextParserRuleCall_5_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoFullText_in_rulePropertyDefinition2436);
            	    lv_noFullText_18_0=ruleNoFullText();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"noFullText",
            	            		true, 
            	            		"NoFullText");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1132:4: ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1132:4: ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1133:5: {...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1133:115: ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1134:6: ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1137:6: ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1137:7: {...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1137:16: ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1138:1: (lv_noQueryOrder_19_0= ruleNoQueryOrder )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1138:1: (lv_noQueryOrder_19_0= ruleNoQueryOrder )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1139:3: lv_noQueryOrder_19_0= ruleNoQueryOrder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderNoQueryOrderParserRuleCall_5_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoQueryOrder_in_rulePropertyDefinition2511);
            	    lv_noQueryOrder_19_0=ruleNoQueryOrder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"noQueryOrder",
            	            		true, 
            	            		"NoQueryOrder");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1162:4: ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1162:4: ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1163:5: {...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8)");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1163:115: ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1164:6: ({...}? => ( (lv_primary_20_0= rulePrimary ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8);
            	    	 				
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1167:6: ({...}? => ( (lv_primary_20_0= rulePrimary ) ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1167:7: {...}? => ( (lv_primary_20_0= rulePrimary ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePropertyDefinition", "true");
            	    }
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1167:16: ( (lv_primary_20_0= rulePrimary ) )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1168:1: (lv_primary_20_0= rulePrimary )
            	    {
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1168:1: (lv_primary_20_0= rulePrimary )
            	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1169:3: lv_primary_20_0= rulePrimary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getPrimaryPrimaryParserRuleCall_5_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimary_in_rulePropertyDefinition2586);
            	    lv_primary_20_0=rulePrimary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"primary",
            	            		true, 
            	            		"Primary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	

            }

            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1199:2: (otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_8) ) {
                switch ( input.LA(2) ) {
                    case RULE_STRING:
                        {
                        alt18=1;
                        }
                        break;
                    case RULE_EXID:
                        {
                        int LA18_4 = input.LA(3);

                        if ( (LA18_4==EOF||(LA18_4>=KEYWORD_5 && LA18_4<=KEYWORD_8)||LA18_4==KEYWORD_11) ) {
                            alt18=1;
                        }
                        }
                        break;
                    case KEYWORD_23:
                        {
                        int LA18_5 = input.LA(3);

                        if ( (LA18_5==EOF||(LA18_5>=KEYWORD_5 && LA18_5<=KEYWORD_8)||LA18_5==KEYWORD_11) ) {
                            alt18=1;
                        }
                        }
                        break;
                }

            }
            switch (alt18) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1200:2: otherlv_21= KEYWORD_8 ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* )
                    {
                    otherlv_21=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rulePropertyDefinition2640); 

                        	newLeafNode(otherlv_21, grammarAccess.getPropertyDefinitionAccess().getLessThanSignKeyword_6_0());
                        
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1204:1: ( ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )* )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1204:2: ( (lv_valueConstraints_22_0= ruleJcrString ) ) (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )*
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1204:2: ( (lv_valueConstraints_22_0= ruleJcrString ) )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1205:1: (lv_valueConstraints_22_0= ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1205:1: (lv_valueConstraints_22_0= ruleJcrString )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1206:3: lv_valueConstraints_22_0= ruleJcrString
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition2661);
                    lv_valueConstraints_22_0=ruleJcrString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"valueConstraints",
                            		lv_valueConstraints_22_0, 
                            		"JcrString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1222:2: (otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==KEYWORD_6) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1223:2: otherlv_23= KEYWORD_6 ( (lv_valueConstraints_24_0= ruleJcrString ) )
                    	    {
                    	    otherlv_23=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePropertyDefinition2675); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_1_1_0());
                    	        
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1227:1: ( (lv_valueConstraints_24_0= ruleJcrString ) )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1228:1: (lv_valueConstraints_24_0= ruleJcrString )
                    	    {
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1228:1: (lv_valueConstraints_24_0= ruleJcrString )
                    	    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1229:3: lv_valueConstraints_24_0= ruleJcrString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJcrString_in_rulePropertyDefinition2695);
                    	    lv_valueConstraints_24_0=ruleJcrString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"valueConstraints",
                    	            		lv_valueConstraints_24_0, 
                    	            		"JcrString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }


                    }
                    break;

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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleNoQueryOrder"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1253:1: entryRuleNoQueryOrder returns [String current=null] : iv_ruleNoQueryOrder= ruleNoQueryOrder EOF ;
    public final String entryRuleNoQueryOrder() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQueryOrder = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1254:1: (iv_ruleNoQueryOrder= ruleNoQueryOrder EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1255:2: iv_ruleNoQueryOrder= ruleNoQueryOrder EOF
            {
             newCompositeNode(grammarAccess.getNoQueryOrderRule()); 
            pushFollow(FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder2736);
            iv_ruleNoQueryOrder=ruleNoQueryOrder();

            state._fsp--;

             current =iv_ruleNoQueryOrder.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoQueryOrder2747); 

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
    // $ANTLR end "entryRuleNoQueryOrder"


    // $ANTLR start "ruleNoQueryOrder"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1262:1: ruleNoQueryOrder returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_61 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleNoQueryOrder() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1266:6: ( (kw= KEYWORD_61 | kw= KEYWORD_37 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1267:1: (kw= KEYWORD_61 | kw= KEYWORD_37 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1267:1: (kw= KEYWORD_61 | kw= KEYWORD_37 )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_61) ) {
                alt19=1;
            }
            else if ( (LA19_0==KEYWORD_37) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1268:2: kw= KEYWORD_61
                    {
                    kw=(Token)match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_ruleNoQueryOrder2785); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1275:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleNoQueryOrder2804); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoQueryOrderAccess().getNqordKeyword_1()); 
                        

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
    // $ANTLR end "ruleNoQueryOrder"


    // $ANTLR start "entryRuleNoFullText"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1288:1: entryRuleNoFullText returns [String current=null] : iv_ruleNoFullText= ruleNoFullText EOF ;
    public final String entryRuleNoFullText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoFullText = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1289:1: (iv_ruleNoFullText= ruleNoFullText EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1290:2: iv_ruleNoFullText= ruleNoFullText EOF
            {
             newCompositeNode(grammarAccess.getNoFullTextRule()); 
            pushFollow(FOLLOW_ruleNoFullText_in_entryRuleNoFullText2844);
            iv_ruleNoFullText=ruleNoFullText();

            state._fsp--;

             current =iv_ruleNoFullText.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoFullText2855); 

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
    // $ANTLR end "entryRuleNoFullText"


    // $ANTLR start "ruleNoFullText"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1297:1: ruleNoFullText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_58 | kw= KEYWORD_25 ) ;
    public final AntlrDatatypeRuleToken ruleNoFullText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1301:6: ( (kw= KEYWORD_58 | kw= KEYWORD_25 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1302:1: (kw= KEYWORD_58 | kw= KEYWORD_25 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1302:1: (kw= KEYWORD_58 | kw= KEYWORD_25 )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KEYWORD_58) ) {
                alt20=1;
            }
            else if ( (LA20_0==KEYWORD_25) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1303:2: kw= KEYWORD_58
                    {
                    kw=(Token)match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_ruleNoFullText2893); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1310:2: kw= KEYWORD_25
                    {
                    kw=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleNoFullText2912); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNoFullTextAccess().getNofKeyword_1()); 
                        

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
    // $ANTLR end "ruleNoFullText"


    // $ANTLR start "entryRuleQueryOps"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1323:1: entryRuleQueryOps returns [String current=null] : iv_ruleQueryOps= ruleQueryOps EOF ;
    public final String entryRuleQueryOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQueryOps = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1324:1: (iv_ruleQueryOps= ruleQueryOps EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1325:2: iv_ruleQueryOps= ruleQueryOps EOF
            {
             newCompositeNode(grammarAccess.getQueryOpsRule()); 
            pushFollow(FOLLOW_ruleQueryOps_in_entryRuleQueryOps2952);
            iv_ruleQueryOps=ruleQueryOps();

            state._fsp--;

             current =iv_ruleQueryOps.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOps2963); 

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
    // $ANTLR end "entryRuleQueryOps"


    // $ANTLR start "ruleQueryOps"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1332:1: ruleQueryOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString ) ;
    public final AntlrDatatypeRuleToken ruleQueryOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrString_2 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1336:6: ( ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1337:1: ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1337:1: ( (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1337:2: (kw= KEYWORD_51 | kw= KEYWORD_28 ) this_JcrString_2= ruleJcrString
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1337:2: (kw= KEYWORD_51 | kw= KEYWORD_28 )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_51) ) {
                alt21=1;
            }
            else if ( (LA21_0==KEYWORD_28) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1338:2: kw= KEYWORD_51
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleQueryOps3002); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1345:2: kw= KEYWORD_28
                    {
                    kw=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleQueryOps3021); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryOpsAccess().getQopKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getQueryOpsAccess().getJcrStringParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleJcrString_in_ruleQueryOps3044);
            this_JcrString_2=ruleJcrString();

            state._fsp--;


            		current.merge(this_JcrString_2);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleQueryOps"


    // $ANTLR start "entryRuleMultiple"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1369:1: entryRuleMultiple returns [String current=null] : iv_ruleMultiple= ruleMultiple EOF ;
    public final String entryRuleMultiple() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiple = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1370:1: (iv_ruleMultiple= ruleMultiple EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1371:2: iv_ruleMultiple= ruleMultiple EOF
            {
             newCompositeNode(grammarAccess.getMultipleRule()); 
            pushFollow(FOLLOW_ruleMultiple_in_entryRuleMultiple3089);
            iv_ruleMultiple=ruleMultiple();

            state._fsp--;

             current =iv_ruleMultiple.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiple3100); 

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
    // $ANTLR end "entryRuleMultiple"


    // $ANTLR start "ruleMultiple"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1378:1: ruleMultiple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 ) ;
    public final AntlrDatatypeRuleToken ruleMultiple() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1382:6: ( (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1383:1: (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1383:1: (kw= KEYWORD_50 | kw= KEYWORD_24 | kw= KEYWORD_4 )
            int alt22=3;
            switch ( input.LA(1) ) {
            case KEYWORD_50:
                {
                alt22=1;
                }
                break;
            case KEYWORD_24:
                {
                alt22=2;
                }
                break;
            case KEYWORD_4:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1384:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleMultiple3138); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getMultipleKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1391:2: kw= KEYWORD_24
                    {
                    kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleMultiple3157); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getMulKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1398:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleMultiple3176); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultipleAccess().getAsteriskKeyword_2()); 
                        

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
    // $ANTLR end "ruleMultiple"


    // $ANTLR start "entryRuleProtected"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1411:1: entryRuleProtected returns [String current=null] : iv_ruleProtected= ruleProtected EOF ;
    public final String entryRuleProtected() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProtected = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1412:1: (iv_ruleProtected= ruleProtected EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1413:2: iv_ruleProtected= ruleProtected EOF
            {
             newCompositeNode(grammarAccess.getProtectedRule()); 
            pushFollow(FOLLOW_ruleProtected_in_entryRuleProtected3216);
            iv_ruleProtected=ruleProtected();

            state._fsp--;

             current =iv_ruleProtected.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtected3227); 

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
    // $ANTLR end "entryRuleProtected"


    // $ANTLR start "ruleProtected"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1420:1: ruleProtected returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 ) ;
    public final AntlrDatatypeRuleToken ruleProtected() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1424:6: ( (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1425:1: (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1425:1: (kw= KEYWORD_56 | kw= KEYWORD_27 | kw= KEYWORD_16 )
            int alt23=3;
            switch ( input.LA(1) ) {
            case KEYWORD_56:
                {
                alt23=1;
                }
                break;
            case KEYWORD_27:
                {
                alt23=2;
                }
                break;
            case KEYWORD_16:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1426:2: kw= KEYWORD_56
                    {
                    kw=(Token)match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_ruleProtected3265); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getProtectedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1433:2: kw= KEYWORD_27
                    {
                    kw=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleProtected3284); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getProKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1440:2: kw= KEYWORD_16
                    {
                    kw=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleProtected3303); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getProtectedAccess().getPKeyword_2()); 
                        

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
    // $ANTLR end "ruleProtected"


    // $ANTLR start "entryRuleMandatory"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1453:1: entryRuleMandatory returns [String current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final String entryRuleMandatory() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMandatory = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1454:1: (iv_ruleMandatory= ruleMandatory EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1455:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory3343);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory3354); 

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
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1462:1: ruleMandatory returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 ) ;
    public final AntlrDatatypeRuleToken ruleMandatory() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1466:6: ( (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1467:1: (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1467:1: (kw= KEYWORD_54 | kw= KEYWORD_22 | kw= KEYWORD_14 )
            int alt24=3;
            switch ( input.LA(1) ) {
            case KEYWORD_54:
                {
                alt24=1;
                }
                break;
            case KEYWORD_22:
                {
                alt24=2;
                }
                break;
            case KEYWORD_14:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1468:2: kw= KEYWORD_54
                    {
                    kw=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_ruleMandatory3392); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1475:2: kw= KEYWORD_22
                    {
                    kw=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleMandatory3411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getManKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1482:2: kw= KEYWORD_14
                    {
                    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleMandatory3430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMandatoryAccess().getMKeyword_2()); 
                        

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
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleAutocreated"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1495:1: entryRuleAutocreated returns [String current=null] : iv_ruleAutocreated= ruleAutocreated EOF ;
    public final String entryRuleAutocreated() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAutocreated = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1496:1: (iv_ruleAutocreated= ruleAutocreated EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1497:2: iv_ruleAutocreated= ruleAutocreated EOF
            {
             newCompositeNode(grammarAccess.getAutocreatedRule()); 
            pushFollow(FOLLOW_ruleAutocreated_in_entryRuleAutocreated3470);
            iv_ruleAutocreated=ruleAutocreated();

            state._fsp--;

             current =iv_ruleAutocreated.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutocreated3481); 

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
    // $ANTLR end "entryRuleAutocreated"


    // $ANTLR start "ruleAutocreated"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1504:1: ruleAutocreated returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 ) ;
    public final AntlrDatatypeRuleToken ruleAutocreated() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1508:6: ( (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1509:1: (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1509:1: (kw= KEYWORD_59 | kw= KEYWORD_21 | kw= KEYWORD_13 )
            int alt25=3;
            switch ( input.LA(1) ) {
            case KEYWORD_59:
                {
                alt25=1;
                }
                break;
            case KEYWORD_21:
                {
                alt25=2;
                }
                break;
            case KEYWORD_13:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1510:2: kw= KEYWORD_59
                    {
                    kw=(Token)match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_ruleAutocreated3519); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1517:2: kw= KEYWORD_21
                    {
                    kw=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleAutocreated3538); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getAutKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1524:2: kw= KEYWORD_13
                    {
                    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleAutocreated3557); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAutocreatedAccess().getAKeyword_2()); 
                        

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
    // $ANTLR end "ruleAutocreated"


    // $ANTLR start "entryRulePrimary"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1537:1: entryRulePrimary returns [String current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final String entryRulePrimary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimary = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1538:1: (iv_rulePrimary= rulePrimary EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1539:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary3597);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary3608); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1546:1: rulePrimary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_48 | kw= KEYWORD_1 ) ;
    public final AntlrDatatypeRuleToken rulePrimary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1550:6: ( (kw= KEYWORD_48 | kw= KEYWORD_1 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1551:1: (kw= KEYWORD_48 | kw= KEYWORD_1 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1551:1: (kw= KEYWORD_48 | kw= KEYWORD_1 )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_48) ) {
                alt26=1;
            }
            else if ( (LA26_0==KEYWORD_1) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1552:2: kw= KEYWORD_48
                    {
                    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rulePrimary3646); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1559:2: kw= KEYWORD_1
                    {
                    kw=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePrimary3665); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1()); 
                        

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRulePrimaryItem"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1572:1: entryRulePrimaryItem returns [String current=null] : iv_rulePrimaryItem= rulePrimaryItem EOF ;
    public final String entryRulePrimaryItem() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryItem = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1573:1: (iv_rulePrimaryItem= rulePrimaryItem EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1574:2: iv_rulePrimaryItem= rulePrimaryItem EOF
            {
             newCompositeNode(grammarAccess.getPrimaryItemRule()); 
            pushFollow(FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem3705);
            iv_rulePrimaryItem=rulePrimaryItem();

            state._fsp--;

             current =iv_rulePrimaryItem.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryItem3716); 

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
    // $ANTLR end "entryRulePrimaryItem"


    // $ANTLR start "rulePrimaryItem"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1581:1: rulePrimaryItem returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_60 | kw= KEYWORD_1 ) this_JcrString_2= ruleJcrString ) ;
    public final AntlrDatatypeRuleToken rulePrimaryItem() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_JcrString_2 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1585:6: ( ( (kw= KEYWORD_60 | kw= KEYWORD_1 ) this_JcrString_2= ruleJcrString ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1586:1: ( (kw= KEYWORD_60 | kw= KEYWORD_1 ) this_JcrString_2= ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1586:1: ( (kw= KEYWORD_60 | kw= KEYWORD_1 ) this_JcrString_2= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1586:2: (kw= KEYWORD_60 | kw= KEYWORD_1 ) this_JcrString_2= ruleJcrString
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1586:2: (kw= KEYWORD_60 | kw= KEYWORD_1 )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KEYWORD_60) ) {
                alt27=1;
            }
            else if ( (LA27_0==KEYWORD_1) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1587:2: kw= KEYWORD_60
                    {
                    kw=(Token)match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_rulePrimaryItem3755); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryItemAccess().getPrimaryitemKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1594:2: kw= KEYWORD_1
                    {
                    kw=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rulePrimaryItem3774); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimaryItemAccess().getExclamationMarkKeyword_0_1()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getPrimaryItemAccess().getJcrStringParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleJcrString_in_rulePrimaryItem3797);
            this_JcrString_2=ruleJcrString();

            state._fsp--;


            		current.merge(this_JcrString_2);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulePrimaryItem"


    // $ANTLR start "entryRuleQueryable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1618:1: entryRuleQueryable returns [String current=null] : iv_ruleQueryable= ruleQueryable EOF ;
    public final String entryRuleQueryable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQueryable = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1619:1: (iv_ruleQueryable= ruleQueryable EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1620:2: iv_ruleQueryable= ruleQueryable EOF
            {
             newCompositeNode(grammarAccess.getQueryableRule()); 
            pushFollow(FOLLOW_ruleQueryable_in_entryRuleQueryable3842);
            iv_ruleQueryable=ruleQueryable();

            state._fsp--;

             current =iv_ruleQueryable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryable3853); 

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
    // $ANTLR end "entryRuleQueryable"


    // $ANTLR start "ruleQueryable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1627:1: ruleQueryable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_38 | kw= KEYWORD_17 ) ;
    public final AntlrDatatypeRuleToken ruleQueryable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1631:6: ( (kw= KEYWORD_38 | kw= KEYWORD_17 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1632:1: (kw= KEYWORD_38 | kw= KEYWORD_17 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1632:1: (kw= KEYWORD_38 | kw= KEYWORD_17 )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_38) ) {
                alt28=1;
            }
            else if ( (LA28_0==KEYWORD_17) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1633:2: kw= KEYWORD_38
                    {
                    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleQueryable3891); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryableAccess().getQueryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1640:2: kw= KEYWORD_17
                    {
                    kw=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleQueryable3910); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQueryableAccess().getQKeyword_1()); 
                        

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
    // $ANTLR end "ruleQueryable"


    // $ANTLR start "entryRuleNotqueryable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1653:1: entryRuleNotqueryable returns [String current=null] : iv_ruleNotqueryable= ruleNotqueryable EOF ;
    public final String entryRuleNotqueryable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotqueryable = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1654:1: (iv_ruleNotqueryable= ruleNotqueryable EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1655:2: iv_ruleNotqueryable= ruleNotqueryable EOF
            {
             newCompositeNode(grammarAccess.getNotqueryableRule()); 
            pushFollow(FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable3950);
            iv_ruleNotqueryable=ruleNotqueryable();

            state._fsp--;

             current =iv_ruleNotqueryable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotqueryable3961); 

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
    // $ANTLR end "entryRuleNotqueryable"


    // $ANTLR start "ruleNotqueryable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1662:1: ruleNotqueryable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_47 | kw= KEYWORD_18 ) ;
    public final AntlrDatatypeRuleToken ruleNotqueryable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1666:6: ( (kw= KEYWORD_47 | kw= KEYWORD_18 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1667:1: (kw= KEYWORD_47 | kw= KEYWORD_18 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1667:1: (kw= KEYWORD_47 | kw= KEYWORD_18 )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEYWORD_47) ) {
                alt29=1;
            }
            else if ( (LA29_0==KEYWORD_18) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1668:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleNotqueryable3999); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNotqueryableAccess().getNoqueryKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1675:2: kw= KEYWORD_18
                    {
                    kw=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleNotqueryable4018); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNotqueryableAccess().getNqKeyword_1()); 
                        

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
    // $ANTLR end "ruleNotqueryable"


    // $ANTLR start "entryRuleAbstract"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1688:1: entryRuleAbstract returns [String current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final String entryRuleAbstract() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbstract = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1689:1: (iv_ruleAbstract= ruleAbstract EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1690:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract4058);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract4069); 

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
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1697:1: ruleAbstract returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 ) ;
    public final AntlrDatatypeRuleToken ruleAbstract() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1701:6: ( (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1702:1: (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1702:1: (kw= KEYWORD_49 | kw= KEYWORD_20 | kw= KEYWORD_13 )
            int alt30=3;
            switch ( input.LA(1) ) {
            case KEYWORD_49:
                {
                alt30=1;
                }
                break;
            case KEYWORD_20:
                {
                alt30=2;
                }
                break;
            case KEYWORD_13:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1703:2: kw= KEYWORD_49
                    {
                    kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleAbstract4107); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getAbstractKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1710:2: kw= KEYWORD_20
                    {
                    kw=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleAbstract4126); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getAbsKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1717:2: kw= KEYWORD_13
                    {
                    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleAbstract4145); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAbstractAccess().getAKeyword_2()); 
                        

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
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleMixin"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1730:1: entryRuleMixin returns [String current=null] : iv_ruleMixin= ruleMixin EOF ;
    public final String entryRuleMixin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMixin = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1731:1: (iv_ruleMixin= ruleMixin EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1732:2: iv_ruleMixin= ruleMixin EOF
            {
             newCompositeNode(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin4185);
            iv_ruleMixin=ruleMixin();

            state._fsp--;

             current =iv_ruleMixin.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin4196); 

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
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1739:1: ruleMixin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 ) ;
    public final AntlrDatatypeRuleToken ruleMixin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1743:6: ( (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1744:1: (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1744:1: (kw= KEYWORD_36 | kw= KEYWORD_23 | kw= KEYWORD_14 )
            int alt31=3;
            switch ( input.LA(1) ) {
            case KEYWORD_36:
                {
                alt31=1;
                }
                break;
            case KEYWORD_23:
                {
                alt31=2;
                }
                break;
            case KEYWORD_14:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1745:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleMixin4234); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getMixinKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1752:2: kw= KEYWORD_23
                    {
                    kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleMixin4253); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getMixKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1759:2: kw= KEYWORD_14
                    {
                    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleMixin4272); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMixinAccess().getMKeyword_2()); 
                        

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
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleOrderable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1772:1: entryRuleOrderable returns [String current=null] : iv_ruleOrderable= ruleOrderable EOF ;
    public final String entryRuleOrderable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrderable = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1773:1: (iv_ruleOrderable= ruleOrderable EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1774:2: iv_ruleOrderable= ruleOrderable EOF
            {
             newCompositeNode(grammarAccess.getOrderableRule()); 
            pushFollow(FOLLOW_ruleOrderable_in_entryRuleOrderable4312);
            iv_ruleOrderable=ruleOrderable();

            state._fsp--;

             current =iv_ruleOrderable.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderable4323); 

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
    // $ANTLR end "entryRuleOrderable"


    // $ANTLR start "ruleOrderable"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1781:1: ruleOrderable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 ) ;
    public final AntlrDatatypeRuleToken ruleOrderable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1785:6: ( (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1786:1: (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1786:1: (kw= KEYWORD_55 | kw= KEYWORD_26 | kw= KEYWORD_15 )
            int alt32=3;
            switch ( input.LA(1) ) {
            case KEYWORD_55:
                {
                alt32=1;
                }
                break;
            case KEYWORD_26:
                {
                alt32=2;
                }
                break;
            case KEYWORD_15:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1787:2: kw= KEYWORD_55
                    {
                    kw=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_ruleOrderable4361); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getOrderableKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1794:2: kw= KEYWORD_26
                    {
                    kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleOrderable4380); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getOrdKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1801:2: kw= KEYWORD_15
                    {
                    kw=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleOrderable4399); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOrderableAccess().getOKeyword_2()); 
                        

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
    // $ANTLR end "ruleOrderable"


    // $ANTLR start "entryRuleNsMapping"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1814:1: entryRuleNsMapping returns [EObject current=null] : iv_ruleNsMapping= ruleNsMapping EOF ;
    public final EObject entryRuleNsMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNsMapping = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1815:2: (iv_ruleNsMapping= ruleNsMapping EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1816:2: iv_ruleNsMapping= ruleNsMapping EOF
            {
             newCompositeNode(grammarAccess.getNsMappingRule()); 
            pushFollow(FOLLOW_ruleNsMapping_in_entryRuleNsMapping4438);
            iv_ruleNsMapping=ruleNsMapping();

            state._fsp--;

             current =iv_ruleNsMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNsMapping4448); 

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
    // $ANTLR end "entryRuleNsMapping"


    // $ANTLR start "ruleNsMapping"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1823:1: ruleNsMapping returns [EObject current=null] : (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 ) ;
    public final EObject ruleNsMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_uri_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1826:28: ( (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1827:1: (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1827:1: (otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10 )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1828:2: otherlv_0= KEYWORD_8 ( (lv_name_1_0= rulePrefix ) ) otherlv_2= KEYWORD_9 ( (lv_uri_3_0= ruleUri ) ) otherlv_4= KEYWORD_10
            {
            otherlv_0=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleNsMapping4486); 

                	newLeafNode(otherlv_0, grammarAccess.getNsMappingAccess().getLessThanSignKeyword_0());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1832:1: ( (lv_name_1_0= rulePrefix ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1833:1: (lv_name_1_0= rulePrefix )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1833:1: (lv_name_1_0= rulePrefix )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1834:3: lv_name_1_0= rulePrefix
            {
             
            	        newCompositeNode(grammarAccess.getNsMappingAccess().getNamePrefixParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePrefix_in_ruleNsMapping4506);
            lv_name_1_0=rulePrefix();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNsMappingRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Prefix");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNsMapping4519); 

                	newLeafNode(otherlv_2, grammarAccess.getNsMappingAccess().getEqualsSignKeyword_2());
                
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1855:1: ( (lv_uri_3_0= ruleUri ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1856:1: (lv_uri_3_0= ruleUri )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1856:1: (lv_uri_3_0= ruleUri )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1857:3: lv_uri_3_0= ruleUri
            {
             
            	        newCompositeNode(grammarAccess.getNsMappingAccess().getUriUriParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUri_in_ruleNsMapping4539);
            lv_uri_3_0=ruleUri();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNsMappingRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_3_0, 
                    		"Uri");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleNsMapping4552); 

                	newLeafNode(otherlv_4, grammarAccess.getNsMappingAccess().getGreaterThanSignKeyword_4());
                

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
    // $ANTLR end "ruleNsMapping"


    // $ANTLR start "entryRulePrefix"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1886:1: entryRulePrefix returns [String current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final String entryRulePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefix = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1887:1: (iv_rulePrefix= rulePrefix EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1888:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix4587);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix4598); 

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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1895:1: rulePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_XiD_0= ruleXiD ;
    public final AntlrDatatypeRuleToken rulePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_XiD_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1899:6: (this_XiD_0= ruleXiD )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1901:5: this_XiD_0= ruleXiD
            {
             
                    newCompositeNode(grammarAccess.getPrefixAccess().getXiDParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleXiD_in_rulePrefix4644);
            this_XiD_0=ruleXiD();

            state._fsp--;


            		current.merge(this_XiD_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleUri"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1919:1: entryRuleUri returns [String current=null] : iv_ruleUri= ruleUri EOF ;
    public final String entryRuleUri() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUri = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1920:1: (iv_ruleUri= ruleUri EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1921:2: iv_ruleUri= ruleUri EOF
            {
             newCompositeNode(grammarAccess.getUriRule()); 
            pushFollow(FOLLOW_ruleUri_in_entryRuleUri4688);
            iv_ruleUri=ruleUri();

            state._fsp--;

             current =iv_ruleUri.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUri4699); 

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
    // $ANTLR end "entryRuleUri"


    // $ANTLR start "ruleUri"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1928:1: ruleUri returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_JcrString_0= ruleJcrString ;
    public final AntlrDatatypeRuleToken ruleUri() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_JcrString_0 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1932:6: (this_JcrString_0= ruleJcrString )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1934:5: this_JcrString_0= ruleJcrString
            {
             
                    newCompositeNode(grammarAccess.getUriAccess().getJcrStringParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleJcrString_in_ruleUri4745);
            this_JcrString_0=ruleJcrString();

            state._fsp--;


            		current.merge(this_JcrString_0);
                
             
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleUri"


    // $ANTLR start "entryRuleJcrString"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1952:1: entryRuleJcrString returns [String current=null] : iv_ruleJcrString= ruleJcrString EOF ;
    public final String entryRuleJcrString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJcrString = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1953:1: (iv_ruleJcrString= ruleJcrString EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1954:2: iv_ruleJcrString= ruleJcrString EOF
            {
             newCompositeNode(grammarAccess.getJcrStringRule()); 
            pushFollow(FOLLOW_ruleJcrString_in_entryRuleJcrString4789);
            iv_ruleJcrString=ruleJcrString();

            state._fsp--;

             current =iv_ruleJcrString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJcrString4800); 

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
    // $ANTLR end "entryRuleJcrString"


    // $ANTLR start "ruleJcrString"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1961:1: ruleJcrString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD ) ;
    public final AntlrDatatypeRuleToken ruleJcrString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_XiD_1 = null;


         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1965:6: ( (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1966:1: (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1966:1: (this_STRING_0= RULE_STRING | this_XiD_1= ruleXiD )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==KEYWORD_23||LA33_0==RULE_EXID) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1966:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJcrString4840); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1975:5: this_XiD_1= ruleXiD
                    {
                     
                            newCompositeNode(grammarAccess.getJcrStringAccess().getXiDParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleXiD_in_ruleJcrString4873);
                    this_XiD_1=ruleXiD();

                    state._fsp--;


                    		current.merge(this_XiD_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleJcrString"


    // $ANTLR start "entryRuleXiD"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1993:1: entryRuleXiD returns [String current=null] : iv_ruleXiD= ruleXiD EOF ;
    public final String entryRuleXiD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXiD = null;


        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1994:1: (iv_ruleXiD= ruleXiD EOF )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:1995:2: iv_ruleXiD= ruleXiD EOF
            {
             newCompositeNode(grammarAccess.getXiDRule()); 
            pushFollow(FOLLOW_ruleXiD_in_entryRuleXiD4918);
            iv_ruleXiD=ruleXiD();

            state._fsp--;

             current =iv_ruleXiD.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXiD4929); 

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
    // $ANTLR end "entryRuleXiD"


    // $ANTLR start "ruleXiD"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2002:1: ruleXiD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EXID_0= RULE_EXID | kw= KEYWORD_23 ) ;
    public final AntlrDatatypeRuleToken ruleXiD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EXID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2006:6: ( (this_EXID_0= RULE_EXID | kw= KEYWORD_23 ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2007:1: (this_EXID_0= RULE_EXID | kw= KEYWORD_23 )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2007:1: (this_EXID_0= RULE_EXID | kw= KEYWORD_23 )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_EXID) ) {
                alt34=1;
            }
            else if ( (LA34_0==KEYWORD_23) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2007:6: this_EXID_0= RULE_EXID
                    {
                    this_EXID_0=(Token)match(input,RULE_EXID,FOLLOW_RULE_EXID_in_ruleXiD4969); 

                    		current.merge(this_EXID_0);
                        
                     
                        newLeafNode(this_EXID_0, grammarAccess.getXiDAccess().getEXIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2016:2: kw= KEYWORD_23
                    {
                    kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleXiD4993); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getXiDAccess().getMixKeyword_1()); 
                        

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
    // $ANTLR end "ruleXiD"


    // $ANTLR start "ruleOpv"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2029:1: ruleOpv returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) ) ;
    public final Enumerator ruleOpv() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2031:28: ( ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2032:1: ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2032:1: ( (enumLiteral_0= KEYWORD_30 ) | (enumLiteral_1= KEYWORD_46 ) | (enumLiteral_2= KEYWORD_57 ) | (enumLiteral_3= KEYWORD_44 ) | (enumLiteral_4= KEYWORD_41 ) | (enumLiteral_5= KEYWORD_35 ) )
            int alt35=6;
            switch ( input.LA(1) ) {
            case KEYWORD_30:
                {
                alt35=1;
                }
                break;
            case KEYWORD_46:
                {
                alt35=2;
                }
                break;
            case KEYWORD_57:
                {
                alt35=3;
                }
                break;
            case KEYWORD_44:
                {
                alt35=4;
                }
                break;
            case KEYWORD_41:
                {
                alt35=5;
                }
                break;
            case KEYWORD_35:
                {
                alt35=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2032:2: (enumLiteral_0= KEYWORD_30 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2032:2: (enumLiteral_0= KEYWORD_30 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2032:7: enumLiteral_0= KEYWORD_30
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleOpv5050); 

                            current = grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2038:6: (enumLiteral_1= KEYWORD_46 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2038:6: (enumLiteral_1= KEYWORD_46 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2038:11: enumLiteral_1= KEYWORD_46
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleOpv5072); 

                            current = grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2044:6: (enumLiteral_2= KEYWORD_57 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2044:6: (enumLiteral_2= KEYWORD_57 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2044:11: enumLiteral_2= KEYWORD_57
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_ruleOpv5094); 

                            current = grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2050:6: (enumLiteral_3= KEYWORD_44 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2050:6: (enumLiteral_3= KEYWORD_44 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2050:11: enumLiteral_3= KEYWORD_44
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleOpv5116); 

                            current = grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2056:6: (enumLiteral_4= KEYWORD_41 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2056:6: (enumLiteral_4= KEYWORD_41 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2056:11: enumLiteral_4= KEYWORD_41
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleOpv5138); 

                            current = grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2062:6: (enumLiteral_5= KEYWORD_35 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2062:6: (enumLiteral_5= KEYWORD_35 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2062:11: enumLiteral_5= KEYWORD_35
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleOpv5160); 

                            current = grammarAccess.getOpvAccess().getABORTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getOpvAccess().getABORTEnumLiteralDeclaration_5()); 
                        

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
    // $ANTLR end "ruleOpv"


    // $ANTLR start "rulePropertyType"
    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2072:1: rulePropertyType returns [Enumerator current=null] : ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) ) ;
    public final Enumerator rulePropertyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;

         enterRule(); 
        try {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2074:28: ( ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) ) )
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2075:1: ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) )
            {
            // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2075:1: ( (enumLiteral_0= KEYWORD_53 ) | (enumLiteral_1= KEYWORD_42 ) | (enumLiteral_2= KEYWORD_39 ) | (enumLiteral_3= KEYWORD_32 ) | (enumLiteral_4= KEYWORD_40 ) | (enumLiteral_5= KEYWORD_31 ) | (enumLiteral_6= KEYWORD_43 ) | (enumLiteral_7= KEYWORD_33 ) | (enumLiteral_8= KEYWORD_34 ) | (enumLiteral_9= KEYWORD_52 ) | (enumLiteral_10= KEYWORD_62 ) | (enumLiteral_11= KEYWORD_19 ) | (enumLiteral_12= KEYWORD_45 ) )
            int alt36=13;
            switch ( input.LA(1) ) {
            case KEYWORD_53:
                {
                alt36=1;
                }
                break;
            case KEYWORD_42:
                {
                alt36=2;
                }
                break;
            case KEYWORD_39:
                {
                alt36=3;
                }
                break;
            case KEYWORD_32:
                {
                alt36=4;
                }
                break;
            case KEYWORD_40:
                {
                alt36=5;
                }
                break;
            case KEYWORD_31:
                {
                alt36=6;
                }
                break;
            case KEYWORD_43:
                {
                alt36=7;
                }
                break;
            case KEYWORD_33:
                {
                alt36=8;
                }
                break;
            case KEYWORD_34:
                {
                alt36=9;
                }
                break;
            case KEYWORD_52:
                {
                alt36=10;
                }
                break;
            case KEYWORD_62:
                {
                alt36=11;
                }
                break;
            case KEYWORD_19:
                {
                alt36=12;
                }
                break;
            case KEYWORD_45:
                {
                alt36=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2075:2: (enumLiteral_0= KEYWORD_53 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2075:2: (enumLiteral_0= KEYWORD_53 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2075:7: enumLiteral_0= KEYWORD_53
                    {
                    enumLiteral_0=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rulePropertyType5210); 

                            current = grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2081:6: (enumLiteral_1= KEYWORD_42 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2081:6: (enumLiteral_1= KEYWORD_42 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2081:11: enumLiteral_1= KEYWORD_42
                    {
                    enumLiteral_1=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rulePropertyType5232); 

                            current = grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2087:6: (enumLiteral_2= KEYWORD_39 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2087:6: (enumLiteral_2= KEYWORD_39 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2087:11: enumLiteral_2= KEYWORD_39
                    {
                    enumLiteral_2=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rulePropertyType5254); 

                            current = grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2093:6: (enumLiteral_3= KEYWORD_32 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2093:6: (enumLiteral_3= KEYWORD_32 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2093:11: enumLiteral_3= KEYWORD_32
                    {
                    enumLiteral_3=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rulePropertyType5276); 

                            current = grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2099:6: (enumLiteral_4= KEYWORD_40 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2099:6: (enumLiteral_4= KEYWORD_40 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2099:11: enumLiteral_4= KEYWORD_40
                    {
                    enumLiteral_4=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rulePropertyType5298); 

                            current = grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2105:6: (enumLiteral_5= KEYWORD_31 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2105:6: (enumLiteral_5= KEYWORD_31 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2105:11: enumLiteral_5= KEYWORD_31
                    {
                    enumLiteral_5=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rulePropertyType5320); 

                            current = grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2111:6: (enumLiteral_6= KEYWORD_43 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2111:6: (enumLiteral_6= KEYWORD_43 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2111:11: enumLiteral_6= KEYWORD_43
                    {
                    enumLiteral_6=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_rulePropertyType5342); 

                            current = grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2117:6: (enumLiteral_7= KEYWORD_33 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2117:6: (enumLiteral_7= KEYWORD_33 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2117:11: enumLiteral_7= KEYWORD_33
                    {
                    enumLiteral_7=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rulePropertyType5364); 

                            current = grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2123:6: (enumLiteral_8= KEYWORD_34 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2123:6: (enumLiteral_8= KEYWORD_34 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2123:11: enumLiteral_8= KEYWORD_34
                    {
                    enumLiteral_8=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_rulePropertyType5386); 

                            current = grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2129:6: (enumLiteral_9= KEYWORD_52 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2129:6: (enumLiteral_9= KEYWORD_52 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2129:11: enumLiteral_9= KEYWORD_52
                    {
                    enumLiteral_9=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rulePropertyType5408); 

                            current = grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2135:6: (enumLiteral_10= KEYWORD_62 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2135:6: (enumLiteral_10= KEYWORD_62 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2135:11: enumLiteral_10= KEYWORD_62
                    {
                    enumLiteral_10=(Token)match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_rulePropertyType5430); 

                            current = grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2141:6: (enumLiteral_11= KEYWORD_19 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2141:6: (enumLiteral_11= KEYWORD_19 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2141:11: enumLiteral_11= KEYWORD_19
                    {
                    enumLiteral_11=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rulePropertyType5452); 

                            current = grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2147:6: (enumLiteral_12= KEYWORD_45 )
                    {
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2147:6: (enumLiteral_12= KEYWORD_45 )
                    // ../com.github.evra.jcr.cnd/src-gen/com/github/evra/jcr/parser/antlr/internal/InternalCndParser.g:2147:11: enumLiteral_12= KEYWORD_45
                    {
                    enumLiteral_12=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rulePropertyType5474); 

                            current = grammarAccess.getPropertyTypeAccess().getTDECIMALEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getPropertyTypeAccess().getTDECIMALEnumLiteralDeclaration_12()); 
                        

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
    // $ANTLR end "rulePropertyType"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\13\uffff";
    static final String DFA16_eofS =
        "\1\1\12\uffff";
    static final String DFA16_minS =
        "\1\5\12\uffff";
    static final String DFA16_maxS =
        "\1\100\12\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA16_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\11\1\2\1\uffff\1\5\1\10\2\uffff\1\3\1\uffff\1\4\1\uffff"+
            "\1\6\1\7\1\uffff\1\5\1\uffff\1\5\1\uffff\1\12\2\uffff\1\5\1"+
            "\uffff\1\5\1\uffff\1\11\1\uffff\1\5\6\uffff\1\2\1\3\1\uffff"+
            "\1\6\1\10\1\uffff\1\4\1\7\2\uffff\1\12\2\uffff\1\6\1\1\1\uffff"+
            "\2\1\2\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 920:3: ( ({...}? => ( ({...}? => ( (lv_autocreated_12_0= ruleAutocreated ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_mandatory_13_0= ruleMandatory ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_protected_14_0= ruleProtected ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_onParentVersion_15_0= ruleOpv ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_multiple_16_0= ruleMultiple ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_queryOps_17_0= ruleQueryOps ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noFullText_18_0= ruleNoFullText ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_noQueryOrder_19_0= ruleNoQueryOrder ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_primary_20_0= rulePrimary ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_0==EOF||LA16_0==KEYWORD_5||(LA16_0>=KEYWORD_7 && LA16_0<=KEYWORD_8)||LA16_0==KEYWORD_11) ) {s = 1;}

                        else if ( (LA16_0==KEYWORD_59||LA16_0==KEYWORD_21||LA16_0==KEYWORD_13) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 2;}

                        else if ( (LA16_0==KEYWORD_54||LA16_0==KEYWORD_22||LA16_0==KEYWORD_14) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 3;}

                        else if ( (LA16_0==KEYWORD_56||LA16_0==KEYWORD_27||LA16_0==KEYWORD_16) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 4;}

                        else if ( (LA16_0==KEYWORD_57||LA16_0==KEYWORD_44||LA16_0==KEYWORD_46||LA16_0==KEYWORD_41||LA16_0==KEYWORD_35||LA16_0==KEYWORD_30) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 5;}

                        else if ( (LA16_0==KEYWORD_50||LA16_0==KEYWORD_24||LA16_0==KEYWORD_4) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 6;}

                        else if ( (LA16_0==KEYWORD_51||LA16_0==KEYWORD_28) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 7;}

                        else if ( (LA16_0==KEYWORD_58||LA16_0==KEYWORD_25) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 8;}

                        else if ( (LA16_0==KEYWORD_61||LA16_0==KEYWORD_37) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 9;}

                        else if ( (LA16_0==KEYWORD_48||LA16_0==KEYWORD_1) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 10;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_ruleModel123 = new BitSet(new long[]{0x0900000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeDefinition_in_ruleModel150 = new BitSet(new long[]{0x0900000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeDefinition_in_entryRuleNodeTypeDefinition186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeDefinition196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleNodeTypeDefinition234 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition254 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleNodeTypeDefinition267 = new BitSet(new long[]{0xE4A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleNodeTypeDefinition280 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition300 = new BitSet(new long[]{0xE0E31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleNodeTypeDefinition314 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeTypeDefinition334 = new BitSet(new long[]{0xE0E31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_ruleNodeTypeDefinition404 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_ruleNodeTypeDefinition479 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_ruleNodeTypeDefinition554 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryable_in_ruleNodeTypeDefinition629 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_ruleNodeTypeDefinition704 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_ruleNodeTypeDefinition779 = new BitSet(new long[]{0xE0A31240A040A082L,0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleNodeTypeDefinition841 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_ruleNodeTypeDefinition868 = new BitSet(new long[]{0x00A0000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDefinition915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleNodeDefinition953 = new BitSet(new long[]{0x0010020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition974 = new BitSet(new long[]{0x6214A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleNodeDefinition999 = new BitSet(new long[]{0x6214A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleNodeDefinition1025 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition1046 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleNodeDefinition1060 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition1080 = new BitSet(new long[]{0x0048000000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleNodeDefinition1096 = new BitSet(new long[]{0x6210A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNodeDefinition1111 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleNodeDefinition1131 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAutocreated_in_ruleNodeDefinition1199 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleNodeDefinition1274 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProtected_in_ruleNodeDefinition1349 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleOpv_in_ruleNodeDefinition1424 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSns_in_ruleNodeDefinition1499 = new BitSet(new long[]{0x6010A18114295142L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSns_in_entryRuleSns1575 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSns1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleSns1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleSns1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleSns1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rulePropertyDefinition1758 = new BitSet(new long[]{0x0010020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition1779 = new BitSet(new long[]{0x63166D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulePropertyDefinition1798 = new BitSet(new long[]{0x63166D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rulePropertyDefinition1812 = new BitSet(new long[]{0x0000003E0B140C10L});
    public static final BitSet FOLLOW_rulePropertyType_in_rulePropertyDefinition1832 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rulePropertyDefinition1845 = new BitSet(new long[]{0x63126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rulePropertyDefinition1860 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition1881 = new BitSet(new long[]{0x61526D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePropertyDefinition1895 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition1915 = new BitSet(new long[]{0x61526D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rulePropertyDefinition1986 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMandatory_in_rulePropertyDefinition2061 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleProtected_in_rulePropertyDefinition2136 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleOpv_in_rulePropertyDefinition2211 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleMultiple_in_rulePropertyDefinition2286 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleQueryOps_in_rulePropertyDefinition2361 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleNoFullText_in_rulePropertyDefinition2436 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_rulePropertyDefinition2511 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePropertyDefinition2586 = new BitSet(new long[]{0x61126D8154AB5362L,0x0000000000000001L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rulePropertyDefinition2640 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition2661 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePropertyDefinition2675 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePropertyDefinition2695 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder2736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoQueryOrder2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_ruleNoQueryOrder2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleNoQueryOrder2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_entryRuleNoFullText2844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoFullText2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_ruleNoFullText2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleNoFullText2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_entryRuleQueryOps2952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOps2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleQueryOps3002 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleQueryOps3021 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleQueryOps3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple3089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiple3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleMultiple3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleMultiple3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleMultiple3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_entryRuleProtected3216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtected3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_ruleProtected3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleProtected3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleProtected3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory3343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_ruleMandatory3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleMandatory3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleMandatory3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_entryRuleAutocreated3470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutocreated3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_ruleAutocreated3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleAutocreated3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleAutocreated3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary3597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rulePrimary3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePrimary3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem3705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryItem3716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_rulePrimaryItem3755 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rulePrimaryItem3774 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleJcrString_in_rulePrimaryItem3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryable_in_entryRuleQueryable3842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryable3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleQueryable3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleQueryable3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable3950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotqueryable3961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleNotqueryable3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleNotqueryable4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract4058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleAbstract4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleAbstract4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleAbstract4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin4185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleMixin4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleMixin4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleMixin4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_entryRuleOrderable4312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderable4323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_ruleOrderable4361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleOrderable4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleOrderable4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_entryRuleNsMapping4438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNsMapping4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleNsMapping4486 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_rulePrefix_in_ruleNsMapping4506 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNsMapping4519 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_ruleUri_in_ruleNsMapping4539 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleNsMapping4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix4587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rulePrefix4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_entryRuleUri4688 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUri4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleUri4745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_entryRuleJcrString4789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJcrString4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJcrString4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_ruleJcrString4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_entryRuleXiD4918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXiD4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXID_in_ruleXiD4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleXiD4993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleOpv5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleOpv5072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_ruleOpv5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleOpv5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleOpv5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleOpv5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rulePropertyType5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rulePropertyType5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rulePropertyType5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rulePropertyType5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rulePropertyType5298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rulePropertyType5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_rulePropertyType5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rulePropertyType5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_rulePropertyType5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rulePropertyType5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_rulePropertyType5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rulePropertyType5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rulePropertyType5474 = new BitSet(new long[]{0x0000000000000002L});

}
