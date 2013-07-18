package com.github.evra.jcr.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.github.evra.jcr.services.CndGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCndParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_EXID", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sns'", "'*'", "'multiple'", "'?'", "'noqueryorder'", "'nqord'", "'nofulltext'", "'nof'", "'queryops'", "'qop'", "'mul'", "'COPY'", "'VERSION'", "'INITIALIZE'", "'COMPUTE'", "'IGNORE'", "'ABORT'", "'protected'", "'pro'", "'p'", "'mandatory'", "'man'", "'m'", "'autocreated'", "'aut'", "'a'", "'primary'", "'!'", "'STRING'", "'BINARY'", "'LONG'", "'DOUBLE'", "'BOOLEAN'", "'DATE'", "'NAME'", "'PATH'", "'REFERENCE'", "'WEAKREFERENCE'", "'DECIMAL'", "'URI'", "'UNDEFINED'", "'primaryitem'", "'noquery'", "'nq'", "'query'", "'q'", "'abstract'", "'abs'", "'mixin'", "'mix'", "'orderable'", "'ord'", "'o'", "'='", "'('", "')'", "'+'", "'<'", "'OPV'", "'-'", "'>'", "'['", "']'", "','"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=6;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_EXID=5;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=10;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalCndParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCndParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCndParser.tokenNames; }
    public String getGrammarFileName() { return "../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g"; }


     
     	private CndGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CndGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:61:1: ( ruleModel EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:69:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:73:2: ( ( ( rule__Model__Alternatives )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:74:1: ( ( rule__Model__Alternatives )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:74:1: ( ( rule__Model__Alternatives )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:75:1: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:76:1: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==69||LA1_0==73) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:76:2: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel94);
            	    rule__Model__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleNodeTypeDef"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:88:1: entryRuleNodeTypeDef : ruleNodeTypeDef EOF ;
    public final void entryRuleNodeTypeDef() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:89:1: ( ruleNodeTypeDef EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:90:1: ruleNodeTypeDef EOF
            {
             before(grammarAccess.getNodeTypeDefRule()); 
            pushFollow(FOLLOW_ruleNodeTypeDef_in_entryRuleNodeTypeDef122);
            ruleNodeTypeDef();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeDef129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeTypeDef"


    // $ANTLR start "ruleNodeTypeDef"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:97:1: ruleNodeTypeDef : ( ( rule__NodeTypeDef__Group__0 ) ) ;
    public final void ruleNodeTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:101:2: ( ( ( rule__NodeTypeDef__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:102:1: ( ( rule__NodeTypeDef__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:102:1: ( ( rule__NodeTypeDef__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:103:1: ( rule__NodeTypeDef__Group__0 )
            {
             before(grammarAccess.getNodeTypeDefAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:104:1: ( rule__NodeTypeDef__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:104:2: rule__NodeTypeDef__Group__0
            {
            pushFollow(FOLLOW_rule__NodeTypeDef__Group__0_in_ruleNodeTypeDef155);
            rule__NodeTypeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeTypeDef"


    // $ANTLR start "entryRuleChildNodeDef"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:116:1: entryRuleChildNodeDef : ruleChildNodeDef EOF ;
    public final void entryRuleChildNodeDef() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:117:1: ( ruleChildNodeDef EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:118:1: ruleChildNodeDef EOF
            {
             before(grammarAccess.getChildNodeDefRule()); 
            pushFollow(FOLLOW_ruleChildNodeDef_in_entryRuleChildNodeDef182);
            ruleChildNodeDef();

            state._fsp--;

             after(grammarAccess.getChildNodeDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChildNodeDef189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChildNodeDef"


    // $ANTLR start "ruleChildNodeDef"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:125:1: ruleChildNodeDef : ( ( rule__ChildNodeDef__Group__0 ) ) ;
    public final void ruleChildNodeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:129:2: ( ( ( rule__ChildNodeDef__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:130:1: ( ( rule__ChildNodeDef__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:130:1: ( ( rule__ChildNodeDef__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:131:1: ( rule__ChildNodeDef__Group__0 )
            {
             before(grammarAccess.getChildNodeDefAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:132:1: ( rule__ChildNodeDef__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:132:2: rule__ChildNodeDef__Group__0
            {
            pushFollow(FOLLOW_rule__ChildNodeDef__Group__0_in_ruleChildNodeDef215);
            rule__ChildNodeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChildNodeDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChildNodeDef"


    // $ANTLR start "entryRuleNodeAttribute"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:144:1: entryRuleNodeAttribute : ruleNodeAttribute EOF ;
    public final void entryRuleNodeAttribute() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:145:1: ( ruleNodeAttribute EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:146:1: ruleNodeAttribute EOF
            {
             before(grammarAccess.getNodeAttributeRule()); 
            pushFollow(FOLLOW_ruleNodeAttribute_in_entryRuleNodeAttribute242);
            ruleNodeAttribute();

            state._fsp--;

             after(grammarAccess.getNodeAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeAttribute249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeAttribute"


    // $ANTLR start "ruleNodeAttribute"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:153:1: ruleNodeAttribute : ( ( rule__NodeAttribute__Alternatives ) ) ;
    public final void ruleNodeAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:157:2: ( ( ( rule__NodeAttribute__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:158:1: ( ( rule__NodeAttribute__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:158:1: ( ( rule__NodeAttribute__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:159:1: ( rule__NodeAttribute__Alternatives )
            {
             before(grammarAccess.getNodeAttributeAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:160:1: ( rule__NodeAttribute__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:160:2: rule__NodeAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__NodeAttribute__Alternatives_in_ruleNodeAttribute275);
            rule__NodeAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeAttribute"


    // $ANTLR start "entryRuleSns"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:172:1: entryRuleSns : ruleSns EOF ;
    public final void entryRuleSns() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:173:1: ( ruleSns EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:174:1: ruleSns EOF
            {
             before(grammarAccess.getSnsRule()); 
            pushFollow(FOLLOW_ruleSns_in_entryRuleSns302);
            ruleSns();

            state._fsp--;

             after(grammarAccess.getSnsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSns309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSns"


    // $ANTLR start "ruleSns"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:181:1: ruleSns : ( ( rule__Sns__Group__0 ) ) ;
    public final void ruleSns() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:185:2: ( ( ( rule__Sns__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:186:1: ( ( rule__Sns__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:186:1: ( ( rule__Sns__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:187:1: ( rule__Sns__Group__0 )
            {
             before(grammarAccess.getSnsAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:188:1: ( rule__Sns__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:188:2: rule__Sns__Group__0
            {
            pushFollow(FOLLOW_rule__Sns__Group__0_in_ruleSns335);
            rule__Sns__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSnsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSns"


    // $ANTLR start "entryRuleDefaultType"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:200:1: entryRuleDefaultType : ruleDefaultType EOF ;
    public final void entryRuleDefaultType() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:201:1: ( ruleDefaultType EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:202:1: ruleDefaultType EOF
            {
             before(grammarAccess.getDefaultTypeRule()); 
            pushFollow(FOLLOW_ruleDefaultType_in_entryRuleDefaultType362);
            ruleDefaultType();

            state._fsp--;

             after(grammarAccess.getDefaultTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultType369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultType"


    // $ANTLR start "ruleDefaultType"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:209:1: ruleDefaultType : ( ( rule__DefaultType__Group__0 ) ) ;
    public final void ruleDefaultType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:213:2: ( ( ( rule__DefaultType__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:214:1: ( ( rule__DefaultType__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:214:1: ( ( rule__DefaultType__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:215:1: ( rule__DefaultType__Group__0 )
            {
             before(grammarAccess.getDefaultTypeAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:216:1: ( rule__DefaultType__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:216:2: rule__DefaultType__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultType__Group__0_in_ruleDefaultType395);
            rule__DefaultType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultType"


    // $ANTLR start "entryRuleRequiredTypes"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:228:1: entryRuleRequiredTypes : ruleRequiredTypes EOF ;
    public final void entryRuleRequiredTypes() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:229:1: ( ruleRequiredTypes EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:230:1: ruleRequiredTypes EOF
            {
             before(grammarAccess.getRequiredTypesRule()); 
            pushFollow(FOLLOW_ruleRequiredTypes_in_entryRuleRequiredTypes422);
            ruleRequiredTypes();

            state._fsp--;

             after(grammarAccess.getRequiredTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredTypes429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequiredTypes"


    // $ANTLR start "ruleRequiredTypes"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:237:1: ruleRequiredTypes : ( ( rule__RequiredTypes__Group__0 ) ) ;
    public final void ruleRequiredTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:241:2: ( ( ( rule__RequiredTypes__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:242:1: ( ( rule__RequiredTypes__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:242:1: ( ( rule__RequiredTypes__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:243:1: ( rule__RequiredTypes__Group__0 )
            {
             before(grammarAccess.getRequiredTypesAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:244:1: ( rule__RequiredTypes__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:244:2: rule__RequiredTypes__Group__0
            {
            pushFollow(FOLLOW_rule__RequiredTypes__Group__0_in_ruleRequiredTypes455);
            rule__RequiredTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequiredTypes"


    // $ANTLR start "entryRuleNodeName"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:256:1: entryRuleNodeName : ruleNodeName EOF ;
    public final void entryRuleNodeName() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:257:1: ( ruleNodeName EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:258:1: ruleNodeName EOF
            {
             before(grammarAccess.getNodeNameRule()); 
            pushFollow(FOLLOW_ruleNodeName_in_entryRuleNodeName482);
            ruleNodeName();

            state._fsp--;

             after(grammarAccess.getNodeNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeName489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeName"


    // $ANTLR start "ruleNodeName"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:265:1: ruleNodeName : ( ( rule__NodeName__Group__0 ) ) ;
    public final void ruleNodeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:269:2: ( ( ( rule__NodeName__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:270:1: ( ( rule__NodeName__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:270:1: ( ( rule__NodeName__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:271:1: ( rule__NodeName__Group__0 )
            {
             before(grammarAccess.getNodeNameAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:272:1: ( rule__NodeName__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:272:2: rule__NodeName__Group__0
            {
            pushFollow(FOLLOW_rule__NodeName__Group__0_in_ruleNodeName515);
            rule__NodeName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeName"


    // $ANTLR start "entryRulePropertyDef"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:284:1: entryRulePropertyDef : rulePropertyDef EOF ;
    public final void entryRulePropertyDef() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:285:1: ( rulePropertyDef EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:286:1: rulePropertyDef EOF
            {
             before(grammarAccess.getPropertyDefRule()); 
            pushFollow(FOLLOW_rulePropertyDef_in_entryRulePropertyDef542);
            rulePropertyDef();

            state._fsp--;

             after(grammarAccess.getPropertyDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDef549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyDef"


    // $ANTLR start "rulePropertyDef"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:293:1: rulePropertyDef : ( ( rule__PropertyDef__Group__0 ) ) ;
    public final void rulePropertyDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:297:2: ( ( ( rule__PropertyDef__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:298:1: ( ( rule__PropertyDef__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:298:1: ( ( rule__PropertyDef__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:299:1: ( rule__PropertyDef__Group__0 )
            {
             before(grammarAccess.getPropertyDefAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:300:1: ( rule__PropertyDef__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:300:2: rule__PropertyDef__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDef__Group__0_in_rulePropertyDef575);
            rule__PropertyDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyDef"


    // $ANTLR start "entryRuleValueConstraints"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:312:1: entryRuleValueConstraints : ruleValueConstraints EOF ;
    public final void entryRuleValueConstraints() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:313:1: ( ruleValueConstraints EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:314:1: ruleValueConstraints EOF
            {
             before(grammarAccess.getValueConstraintsRule()); 
            pushFollow(FOLLOW_ruleValueConstraints_in_entryRuleValueConstraints602);
            ruleValueConstraints();

            state._fsp--;

             after(grammarAccess.getValueConstraintsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueConstraints609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueConstraints"


    // $ANTLR start "ruleValueConstraints"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:321:1: ruleValueConstraints : ( ( rule__ValueConstraints__Group__0 ) ) ;
    public final void ruleValueConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:325:2: ( ( ( rule__ValueConstraints__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:326:1: ( ( rule__ValueConstraints__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:326:1: ( ( rule__ValueConstraints__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:327:1: ( rule__ValueConstraints__Group__0 )
            {
             before(grammarAccess.getValueConstraintsAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:328:1: ( rule__ValueConstraints__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:328:2: rule__ValueConstraints__Group__0
            {
            pushFollow(FOLLOW_rule__ValueConstraints__Group__0_in_ruleValueConstraints635);
            rule__ValueConstraints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueConstraintsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueConstraints"


    // $ANTLR start "entryRulePropertyAttribute"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:340:1: entryRulePropertyAttribute : rulePropertyAttribute EOF ;
    public final void entryRulePropertyAttribute() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:341:1: ( rulePropertyAttribute EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:342:1: rulePropertyAttribute EOF
            {
             before(grammarAccess.getPropertyAttributeRule()); 
            pushFollow(FOLLOW_rulePropertyAttribute_in_entryRulePropertyAttribute662);
            rulePropertyAttribute();

            state._fsp--;

             after(grammarAccess.getPropertyAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAttribute669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyAttribute"


    // $ANTLR start "rulePropertyAttribute"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:349:1: rulePropertyAttribute : ( ( rule__PropertyAttribute__Alternatives ) ) ;
    public final void rulePropertyAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:353:2: ( ( ( rule__PropertyAttribute__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:354:1: ( ( rule__PropertyAttribute__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:354:1: ( ( rule__PropertyAttribute__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:355:1: ( rule__PropertyAttribute__Alternatives )
            {
             before(grammarAccess.getPropertyAttributeAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:356:1: ( rule__PropertyAttribute__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:356:2: rule__PropertyAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__PropertyAttribute__Alternatives_in_rulePropertyAttribute695);
            rule__PropertyAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyAttribute"


    // $ANTLR start "entryRuleNoQueryOrder"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:368:1: entryRuleNoQueryOrder : ruleNoQueryOrder EOF ;
    public final void entryRuleNoQueryOrder() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:369:1: ( ruleNoQueryOrder EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:370:1: ruleNoQueryOrder EOF
            {
             before(grammarAccess.getNoQueryOrderRule()); 
            pushFollow(FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder722);
            ruleNoQueryOrder();

            state._fsp--;

             after(grammarAccess.getNoQueryOrderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoQueryOrder729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoQueryOrder"


    // $ANTLR start "ruleNoQueryOrder"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:377:1: ruleNoQueryOrder : ( ( rule__NoQueryOrder__Group__0 ) ) ;
    public final void ruleNoQueryOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:381:2: ( ( ( rule__NoQueryOrder__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:382:1: ( ( rule__NoQueryOrder__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:382:1: ( ( rule__NoQueryOrder__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:383:1: ( rule__NoQueryOrder__Group__0 )
            {
             before(grammarAccess.getNoQueryOrderAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:384:1: ( rule__NoQueryOrder__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:384:2: rule__NoQueryOrder__Group__0
            {
            pushFollow(FOLLOW_rule__NoQueryOrder__Group__0_in_ruleNoQueryOrder755);
            rule__NoQueryOrder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoQueryOrderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoQueryOrder"


    // $ANTLR start "entryRuleNoFullText"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:396:1: entryRuleNoFullText : ruleNoFullText EOF ;
    public final void entryRuleNoFullText() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:397:1: ( ruleNoFullText EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:398:1: ruleNoFullText EOF
            {
             before(grammarAccess.getNoFullTextRule()); 
            pushFollow(FOLLOW_ruleNoFullText_in_entryRuleNoFullText782);
            ruleNoFullText();

            state._fsp--;

             after(grammarAccess.getNoFullTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoFullText789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoFullText"


    // $ANTLR start "ruleNoFullText"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:405:1: ruleNoFullText : ( ( rule__NoFullText__Group__0 ) ) ;
    public final void ruleNoFullText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:409:2: ( ( ( rule__NoFullText__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:410:1: ( ( rule__NoFullText__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:410:1: ( ( rule__NoFullText__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:411:1: ( rule__NoFullText__Group__0 )
            {
             before(grammarAccess.getNoFullTextAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:412:1: ( rule__NoFullText__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:412:2: rule__NoFullText__Group__0
            {
            pushFollow(FOLLOW_rule__NoFullText__Group__0_in_ruleNoFullText815);
            rule__NoFullText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoFullTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoFullText"


    // $ANTLR start "entryRuleQueryOps"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:424:1: entryRuleQueryOps : ruleQueryOps EOF ;
    public final void entryRuleQueryOps() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:425:1: ( ruleQueryOps EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:426:1: ruleQueryOps EOF
            {
             before(grammarAccess.getQueryOpsRule()); 
            pushFollow(FOLLOW_ruleQueryOps_in_entryRuleQueryOps842);
            ruleQueryOps();

            state._fsp--;

             after(grammarAccess.getQueryOpsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOps849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryOps"


    // $ANTLR start "ruleQueryOps"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:433:1: ruleQueryOps : ( ( rule__QueryOps__Group__0 ) ) ;
    public final void ruleQueryOps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:437:2: ( ( ( rule__QueryOps__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:438:1: ( ( rule__QueryOps__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:438:1: ( ( rule__QueryOps__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:439:1: ( rule__QueryOps__Group__0 )
            {
             before(grammarAccess.getQueryOpsAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:440:1: ( rule__QueryOps__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:440:2: rule__QueryOps__Group__0
            {
            pushFollow(FOLLOW_rule__QueryOps__Group__0_in_ruleQueryOps875);
            rule__QueryOps__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryOpsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryOps"


    // $ANTLR start "entryRuleMultiple"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:452:1: entryRuleMultiple : ruleMultiple EOF ;
    public final void entryRuleMultiple() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:453:1: ( ruleMultiple EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:454:1: ruleMultiple EOF
            {
             before(grammarAccess.getMultipleRule()); 
            pushFollow(FOLLOW_ruleMultiple_in_entryRuleMultiple902);
            ruleMultiple();

            state._fsp--;

             after(grammarAccess.getMultipleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiple909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiple"


    // $ANTLR start "ruleMultiple"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:461:1: ruleMultiple : ( ( rule__Multiple__Group__0 ) ) ;
    public final void ruleMultiple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:465:2: ( ( ( rule__Multiple__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:466:1: ( ( rule__Multiple__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:466:1: ( ( rule__Multiple__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:467:1: ( rule__Multiple__Group__0 )
            {
             before(grammarAccess.getMultipleAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:468:1: ( rule__Multiple__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:468:2: rule__Multiple__Group__0
            {
            pushFollow(FOLLOW_rule__Multiple__Group__0_in_ruleMultiple935);
            rule__Multiple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiple"


    // $ANTLR start "entryRuleOpv"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:480:1: entryRuleOpv : ruleOpv EOF ;
    public final void entryRuleOpv() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:481:1: ( ruleOpv EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:482:1: ruleOpv EOF
            {
             before(grammarAccess.getOpvRule()); 
            pushFollow(FOLLOW_ruleOpv_in_entryRuleOpv962);
            ruleOpv();

            state._fsp--;

             after(grammarAccess.getOpvRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpv969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpv"


    // $ANTLR start "ruleOpv"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:489:1: ruleOpv : ( ( rule__Opv__Alternatives ) ) ;
    public final void ruleOpv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:493:2: ( ( ( rule__Opv__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:494:1: ( ( rule__Opv__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:494:1: ( ( rule__Opv__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:495:1: ( rule__Opv__Alternatives )
            {
             before(grammarAccess.getOpvAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:496:1: ( rule__Opv__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:496:2: rule__Opv__Alternatives
            {
            pushFollow(FOLLOW_rule__Opv__Alternatives_in_ruleOpv995);
            rule__Opv__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpvAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpv"


    // $ANTLR start "entryRuleProtected"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:508:1: entryRuleProtected : ruleProtected EOF ;
    public final void entryRuleProtected() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:509:1: ( ruleProtected EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:510:1: ruleProtected EOF
            {
             before(grammarAccess.getProtectedRule()); 
            pushFollow(FOLLOW_ruleProtected_in_entryRuleProtected1022);
            ruleProtected();

            state._fsp--;

             after(grammarAccess.getProtectedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtected1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtected"


    // $ANTLR start "ruleProtected"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:517:1: ruleProtected : ( ( rule__Protected__Group__0 ) ) ;
    public final void ruleProtected() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:521:2: ( ( ( rule__Protected__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:522:1: ( ( rule__Protected__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:522:1: ( ( rule__Protected__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:523:1: ( rule__Protected__Group__0 )
            {
             before(grammarAccess.getProtectedAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:524:1: ( rule__Protected__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:524:2: rule__Protected__Group__0
            {
            pushFollow(FOLLOW_rule__Protected__Group__0_in_ruleProtected1055);
            rule__Protected__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtectedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtected"


    // $ANTLR start "entryRuleMandatory"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:536:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:537:1: ( ruleMandatory EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:538:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory1082);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:545:1: ruleMandatory : ( ( rule__Mandatory__Group__0 ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:549:2: ( ( ( rule__Mandatory__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:550:1: ( ( rule__Mandatory__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:550:1: ( ( rule__Mandatory__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:551:1: ( rule__Mandatory__Group__0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:552:1: ( rule__Mandatory__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:552:2: rule__Mandatory__Group__0
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory1115);
            rule__Mandatory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleAutocreated"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:564:1: entryRuleAutocreated : ruleAutocreated EOF ;
    public final void entryRuleAutocreated() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:565:1: ( ruleAutocreated EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:566:1: ruleAutocreated EOF
            {
             before(grammarAccess.getAutocreatedRule()); 
            pushFollow(FOLLOW_ruleAutocreated_in_entryRuleAutocreated1142);
            ruleAutocreated();

            state._fsp--;

             after(grammarAccess.getAutocreatedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutocreated1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutocreated"


    // $ANTLR start "ruleAutocreated"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:573:1: ruleAutocreated : ( ( rule__Autocreated__Group__0 ) ) ;
    public final void ruleAutocreated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:577:2: ( ( ( rule__Autocreated__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:578:1: ( ( rule__Autocreated__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:578:1: ( ( rule__Autocreated__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:579:1: ( rule__Autocreated__Group__0 )
            {
             before(grammarAccess.getAutocreatedAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:580:1: ( rule__Autocreated__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:580:2: rule__Autocreated__Group__0
            {
            pushFollow(FOLLOW_rule__Autocreated__Group__0_in_ruleAutocreated1175);
            rule__Autocreated__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutocreatedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutocreated"


    // $ANTLR start "entryRulePrimary"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:592:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:593:1: ( rulePrimary EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:594:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary1202);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary1209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:601:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:605:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:606:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:606:1: ( ( rule__Primary__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:607:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:608:1: ( rule__Primary__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:608:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary1235);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleDefaultValues"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:620:1: entryRuleDefaultValues : ruleDefaultValues EOF ;
    public final void entryRuleDefaultValues() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:621:1: ( ruleDefaultValues EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:622:1: ruleDefaultValues EOF
            {
             before(grammarAccess.getDefaultValuesRule()); 
            pushFollow(FOLLOW_ruleDefaultValues_in_entryRuleDefaultValues1262);
            ruleDefaultValues();

            state._fsp--;

             after(grammarAccess.getDefaultValuesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultValues1269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultValues"


    // $ANTLR start "ruleDefaultValues"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:629:1: ruleDefaultValues : ( ( rule__DefaultValues__Group__0 ) ) ;
    public final void ruleDefaultValues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:633:2: ( ( ( rule__DefaultValues__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:634:1: ( ( rule__DefaultValues__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:634:1: ( ( rule__DefaultValues__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:635:1: ( rule__DefaultValues__Group__0 )
            {
             before(grammarAccess.getDefaultValuesAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:636:1: ( rule__DefaultValues__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:636:2: rule__DefaultValues__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultValues__Group__0_in_ruleDefaultValues1295);
            rule__DefaultValues__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultValuesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultValues"


    // $ANTLR start "entryRulePropertyType"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:648:1: entryRulePropertyType : rulePropertyType EOF ;
    public final void entryRulePropertyType() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:649:1: ( rulePropertyType EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:650:1: rulePropertyType EOF
            {
             before(grammarAccess.getPropertyTypeRule()); 
            pushFollow(FOLLOW_rulePropertyType_in_entryRulePropertyType1322);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getPropertyTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyType1329); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyType"


    // $ANTLR start "rulePropertyType"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:657:1: rulePropertyType : ( ( rule__PropertyType__Group__0 ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:661:2: ( ( ( rule__PropertyType__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:662:1: ( ( rule__PropertyType__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:662:1: ( ( rule__PropertyType__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:663:1: ( rule__PropertyType__Group__0 )
            {
             before(grammarAccess.getPropertyTypeAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:664:1: ( rule__PropertyType__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:664:2: rule__PropertyType__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyType__Group__0_in_rulePropertyType1355);
            rule__PropertyType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyType"


    // $ANTLR start "entryRulePropertyName"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:676:1: entryRulePropertyName : rulePropertyName EOF ;
    public final void entryRulePropertyName() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:677:1: ( rulePropertyName EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:678:1: rulePropertyName EOF
            {
             before(grammarAccess.getPropertyNameRule()); 
            pushFollow(FOLLOW_rulePropertyName_in_entryRulePropertyName1382);
            rulePropertyName();

            state._fsp--;

             after(grammarAccess.getPropertyNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyName1389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyName"


    // $ANTLR start "rulePropertyName"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:685:1: rulePropertyName : ( ( rule__PropertyName__Group__0 ) ) ;
    public final void rulePropertyName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:689:2: ( ( ( rule__PropertyName__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:690:1: ( ( rule__PropertyName__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:690:1: ( ( rule__PropertyName__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:691:1: ( rule__PropertyName__Group__0 )
            {
             before(grammarAccess.getPropertyNameAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:692:1: ( rule__PropertyName__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:692:2: rule__PropertyName__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyName__Group__0_in_rulePropertyName1415);
            rule__PropertyName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyName"


    // $ANTLR start "entryRuleNodeTypeAttribute"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:704:1: entryRuleNodeTypeAttribute : ruleNodeTypeAttribute EOF ;
    public final void entryRuleNodeTypeAttribute() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:705:1: ( ruleNodeTypeAttribute EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:706:1: ruleNodeTypeAttribute EOF
            {
             before(grammarAccess.getNodeTypeAttributeRule()); 
            pushFollow(FOLLOW_ruleNodeTypeAttribute_in_entryRuleNodeTypeAttribute1442);
            ruleNodeTypeAttribute();

            state._fsp--;

             after(grammarAccess.getNodeTypeAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeAttribute1449); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeTypeAttribute"


    // $ANTLR start "ruleNodeTypeAttribute"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:713:1: ruleNodeTypeAttribute : ( ( rule__NodeTypeAttribute__Alternatives ) ) ;
    public final void ruleNodeTypeAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:717:2: ( ( ( rule__NodeTypeAttribute__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:718:1: ( ( rule__NodeTypeAttribute__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:718:1: ( ( rule__NodeTypeAttribute__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:719:1: ( rule__NodeTypeAttribute__Alternatives )
            {
             before(grammarAccess.getNodeTypeAttributeAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:720:1: ( rule__NodeTypeAttribute__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:720:2: rule__NodeTypeAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__NodeTypeAttribute__Alternatives_in_ruleNodeTypeAttribute1475);
            rule__NodeTypeAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeTypeAttribute"


    // $ANTLR start "entryRulePrimaryItem"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:732:1: entryRulePrimaryItem : rulePrimaryItem EOF ;
    public final void entryRulePrimaryItem() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:733:1: ( rulePrimaryItem EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:734:1: rulePrimaryItem EOF
            {
             before(grammarAccess.getPrimaryItemRule()); 
            pushFollow(FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem1502);
            rulePrimaryItem();

            state._fsp--;

             after(grammarAccess.getPrimaryItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryItem1509); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryItem"


    // $ANTLR start "rulePrimaryItem"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:741:1: rulePrimaryItem : ( ( rule__PrimaryItem__Group__0 ) ) ;
    public final void rulePrimaryItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:745:2: ( ( ( rule__PrimaryItem__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:746:1: ( ( rule__PrimaryItem__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:746:1: ( ( rule__PrimaryItem__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:747:1: ( rule__PrimaryItem__Group__0 )
            {
             before(grammarAccess.getPrimaryItemAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:748:1: ( rule__PrimaryItem__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:748:2: rule__PrimaryItem__Group__0
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Group__0_in_rulePrimaryItem1535);
            rule__PrimaryItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryItem"


    // $ANTLR start "entryRuleQuery"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:760:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:761:1: ( ruleQuery EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:762:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery1562);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery1569); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:769:1: ruleQuery : ( ( rule__Query__Alternatives ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:773:2: ( ( ( rule__Query__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:774:1: ( ( rule__Query__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:774:1: ( ( rule__Query__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:775:1: ( rule__Query__Alternatives )
            {
             before(grammarAccess.getQueryAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:776:1: ( rule__Query__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:776:2: rule__Query__Alternatives
            {
            pushFollow(FOLLOW_rule__Query__Alternatives_in_ruleQuery1595);
            rule__Query__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleAbstract"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:788:1: entryRuleAbstract : ruleAbstract EOF ;
    public final void entryRuleAbstract() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:789:1: ( ruleAbstract EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:790:1: ruleAbstract EOF
            {
             before(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract1622);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getAbstractRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract1629); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:797:1: ruleAbstract : ( ( rule__Abstract__Group__0 ) ) ;
    public final void ruleAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:801:2: ( ( ( rule__Abstract__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:802:1: ( ( rule__Abstract__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:802:1: ( ( rule__Abstract__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:803:1: ( rule__Abstract__Group__0 )
            {
             before(grammarAccess.getAbstractAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:804:1: ( rule__Abstract__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:804:2: rule__Abstract__Group__0
            {
            pushFollow(FOLLOW_rule__Abstract__Group__0_in_ruleAbstract1655);
            rule__Abstract__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleMixin"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:816:1: entryRuleMixin : ruleMixin EOF ;
    public final void entryRuleMixin() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:817:1: ( ruleMixin EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:818:1: ruleMixin EOF
            {
             before(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin1682);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getMixinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin1689); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMixin"


    // $ANTLR start "ruleMixin"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:825:1: ruleMixin : ( ( rule__Mixin__Group__0 ) ) ;
    public final void ruleMixin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:829:2: ( ( ( rule__Mixin__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:830:1: ( ( rule__Mixin__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:830:1: ( ( rule__Mixin__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:831:1: ( rule__Mixin__Group__0 )
            {
             before(grammarAccess.getMixinAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:832:1: ( rule__Mixin__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:832:2: rule__Mixin__Group__0
            {
            pushFollow(FOLLOW_rule__Mixin__Group__0_in_ruleMixin1715);
            rule__Mixin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMixin"


    // $ANTLR start "entryRuleOrderable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:844:1: entryRuleOrderable : ruleOrderable EOF ;
    public final void entryRuleOrderable() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:845:1: ( ruleOrderable EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:846:1: ruleOrderable EOF
            {
             before(grammarAccess.getOrderableRule()); 
            pushFollow(FOLLOW_ruleOrderable_in_entryRuleOrderable1742);
            ruleOrderable();

            state._fsp--;

             after(grammarAccess.getOrderableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderable1749); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrderable"


    // $ANTLR start "ruleOrderable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:853:1: ruleOrderable : ( ( rule__Orderable__Group__0 ) ) ;
    public final void ruleOrderable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:857:2: ( ( ( rule__Orderable__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:858:1: ( ( rule__Orderable__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:858:1: ( ( rule__Orderable__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:859:1: ( rule__Orderable__Group__0 )
            {
             before(grammarAccess.getOrderableAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:860:1: ( rule__Orderable__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:860:2: rule__Orderable__Group__0
            {
            pushFollow(FOLLOW_rule__Orderable__Group__0_in_ruleOrderable1775);
            rule__Orderable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderable"


    // $ANTLR start "entryRuleSuperTypes"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:872:1: entryRuleSuperTypes : ruleSuperTypes EOF ;
    public final void entryRuleSuperTypes() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:873:1: ( ruleSuperTypes EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:874:1: ruleSuperTypes EOF
            {
             before(grammarAccess.getSuperTypesRule()); 
            pushFollow(FOLLOW_ruleSuperTypes_in_entryRuleSuperTypes1802);
            ruleSuperTypes();

            state._fsp--;

             after(grammarAccess.getSuperTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperTypes1809); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSuperTypes"


    // $ANTLR start "ruleSuperTypes"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:881:1: ruleSuperTypes : ( ( rule__SuperTypes__Group__0 ) ) ;
    public final void ruleSuperTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:885:2: ( ( ( rule__SuperTypes__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:886:1: ( ( rule__SuperTypes__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:886:1: ( ( rule__SuperTypes__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:887:1: ( rule__SuperTypes__Group__0 )
            {
             before(grammarAccess.getSuperTypesAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:888:1: ( rule__SuperTypes__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:888:2: rule__SuperTypes__Group__0
            {
            pushFollow(FOLLOW_rule__SuperTypes__Group__0_in_ruleSuperTypes1835);
            rule__SuperTypes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSuperTypesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuperTypes"


    // $ANTLR start "entryRuleNodeTypeName"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:900:1: entryRuleNodeTypeName : ruleNodeTypeName EOF ;
    public final void entryRuleNodeTypeName() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:901:1: ( ruleNodeTypeName EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:902:1: ruleNodeTypeName EOF
            {
             before(grammarAccess.getNodeTypeNameRule()); 
            pushFollow(FOLLOW_ruleNodeTypeName_in_entryRuleNodeTypeName1862);
            ruleNodeTypeName();

            state._fsp--;

             after(grammarAccess.getNodeTypeNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeName1869); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNodeTypeName"


    // $ANTLR start "ruleNodeTypeName"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:909:1: ruleNodeTypeName : ( ( rule__NodeTypeName__Group__0 ) ) ;
    public final void ruleNodeTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:913:2: ( ( ( rule__NodeTypeName__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:914:1: ( ( rule__NodeTypeName__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:914:1: ( ( rule__NodeTypeName__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:915:1: ( rule__NodeTypeName__Group__0 )
            {
             before(grammarAccess.getNodeTypeNameAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:916:1: ( rule__NodeTypeName__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:916:2: rule__NodeTypeName__Group__0
            {
            pushFollow(FOLLOW_rule__NodeTypeName__Group__0_in_ruleNodeTypeName1895);
            rule__NodeTypeName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNodeTypeName"


    // $ANTLR start "entryRuleNsMapping"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:928:1: entryRuleNsMapping : ruleNsMapping EOF ;
    public final void entryRuleNsMapping() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:929:1: ( ruleNsMapping EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:930:1: ruleNsMapping EOF
            {
             before(grammarAccess.getNsMappingRule()); 
            pushFollow(FOLLOW_ruleNsMapping_in_entryRuleNsMapping1922);
            ruleNsMapping();

            state._fsp--;

             after(grammarAccess.getNsMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNsMapping1929); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNsMapping"


    // $ANTLR start "ruleNsMapping"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:937:1: ruleNsMapping : ( ( rule__NsMapping__Group__0 ) ) ;
    public final void ruleNsMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:941:2: ( ( ( rule__NsMapping__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:942:1: ( ( rule__NsMapping__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:942:1: ( ( rule__NsMapping__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:943:1: ( rule__NsMapping__Group__0 )
            {
             before(grammarAccess.getNsMappingAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:944:1: ( rule__NsMapping__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:944:2: rule__NsMapping__Group__0
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__0_in_ruleNsMapping1955);
            rule__NsMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNsMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNsMapping"


    // $ANTLR start "entryRulePrefix"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:956:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:957:1: ( rulePrefix EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:958:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix1982);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix1989); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:965:1: rulePrefix : ( ruleXiD ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:969:2: ( ( ruleXiD ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:970:1: ( ruleXiD )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:970:1: ( ruleXiD )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:971:1: ruleXiD
            {
             before(grammarAccess.getPrefixAccess().getXiDParserRuleCall()); 
            pushFollow(FOLLOW_ruleXiD_in_rulePrefix2015);
            ruleXiD();

            state._fsp--;

             after(grammarAccess.getPrefixAccess().getXiDParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleUri"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:984:1: entryRuleUri : ruleUri EOF ;
    public final void entryRuleUri() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:985:1: ( ruleUri EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:986:1: ruleUri EOF
            {
             before(grammarAccess.getUriRule()); 
            pushFollow(FOLLOW_ruleUri_in_entryRuleUri2041);
            ruleUri();

            state._fsp--;

             after(grammarAccess.getUriRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUri2048); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUri"


    // $ANTLR start "ruleUri"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:993:1: ruleUri : ( ruleJcrString ) ;
    public final void ruleUri() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:997:2: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:998:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:998:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:999:1: ruleJcrString
            {
             before(grammarAccess.getUriAccess().getJcrStringParserRuleCall()); 
            pushFollow(FOLLOW_ruleJcrString_in_ruleUri2074);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getUriAccess().getJcrStringParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUri"


    // $ANTLR start "entryRuleJcrStringList"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1012:1: entryRuleJcrStringList : ruleJcrStringList EOF ;
    public final void entryRuleJcrStringList() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1013:1: ( ruleJcrStringList EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1014:1: ruleJcrStringList EOF
            {
             before(grammarAccess.getJcrStringListRule()); 
            pushFollow(FOLLOW_ruleJcrStringList_in_entryRuleJcrStringList2100);
            ruleJcrStringList();

            state._fsp--;

             after(grammarAccess.getJcrStringListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJcrStringList2107); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJcrStringList"


    // $ANTLR start "ruleJcrStringList"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1021:1: ruleJcrStringList : ( ( rule__JcrStringList__Group__0 ) ) ;
    public final void ruleJcrStringList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1025:2: ( ( ( rule__JcrStringList__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1026:1: ( ( rule__JcrStringList__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1026:1: ( ( rule__JcrStringList__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1027:1: ( rule__JcrStringList__Group__0 )
            {
             before(grammarAccess.getJcrStringListAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1028:1: ( rule__JcrStringList__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1028:2: rule__JcrStringList__Group__0
            {
            pushFollow(FOLLOW_rule__JcrStringList__Group__0_in_ruleJcrStringList2133);
            rule__JcrStringList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJcrStringListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJcrStringList"


    // $ANTLR start "entryRuleJcrString"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1040:1: entryRuleJcrString : ruleJcrString EOF ;
    public final void entryRuleJcrString() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1041:1: ( ruleJcrString EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1042:1: ruleJcrString EOF
            {
             before(grammarAccess.getJcrStringRule()); 
            pushFollow(FOLLOW_ruleJcrString_in_entryRuleJcrString2160);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getJcrStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJcrString2167); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJcrString"


    // $ANTLR start "ruleJcrString"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1049:1: ruleJcrString : ( ( rule__JcrString__Alternatives ) ) ;
    public final void ruleJcrString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1053:2: ( ( ( rule__JcrString__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1054:1: ( ( rule__JcrString__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1054:1: ( ( rule__JcrString__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1055:1: ( rule__JcrString__Alternatives )
            {
             before(grammarAccess.getJcrStringAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1056:1: ( rule__JcrString__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1056:2: rule__JcrString__Alternatives
            {
            pushFollow(FOLLOW_rule__JcrString__Alternatives_in_ruleJcrString2193);
            rule__JcrString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJcrStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJcrString"


    // $ANTLR start "entryRuleXiD"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1068:1: entryRuleXiD : ruleXiD EOF ;
    public final void entryRuleXiD() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1069:1: ( ruleXiD EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1070:1: ruleXiD EOF
            {
             before(grammarAccess.getXiDRule()); 
            pushFollow(FOLLOW_ruleXiD_in_entryRuleXiD2220);
            ruleXiD();

            state._fsp--;

             after(grammarAccess.getXiDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXiD2227); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXiD"


    // $ANTLR start "ruleXiD"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1077:1: ruleXiD : ( ( rule__XiD__Alternatives ) ) ;
    public final void ruleXiD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1081:2: ( ( ( rule__XiD__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1082:1: ( ( rule__XiD__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1082:1: ( ( rule__XiD__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1083:1: ( rule__XiD__Alternatives )
            {
             before(grammarAccess.getXiDAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1084:1: ( rule__XiD__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1084:2: rule__XiD__Alternatives
            {
            pushFollow(FOLLOW_rule__XiD__Alternatives_in_ruleXiD2253);
            rule__XiD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXiDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXiD"


    // $ANTLR start "rule__Model__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1096:1: rule__Model__Alternatives : ( ( ( rule__Model__MappingsAssignment_0 ) ) | ( ( rule__Model__NodetypesAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1100:1: ( ( ( rule__Model__MappingsAssignment_0 ) ) | ( ( rule__Model__NodetypesAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==69) ) {
                alt2=1;
            }
            else if ( (LA2_0==73) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1101:1: ( ( rule__Model__MappingsAssignment_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1101:1: ( ( rule__Model__MappingsAssignment_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1102:1: ( rule__Model__MappingsAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getMappingsAssignment_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1103:1: ( rule__Model__MappingsAssignment_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1103:2: rule__Model__MappingsAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__MappingsAssignment_0_in_rule__Model__Alternatives2289);
                    rule__Model__MappingsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getMappingsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1107:6: ( ( rule__Model__NodetypesAssignment_1 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1107:6: ( ( rule__Model__NodetypesAssignment_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1108:1: ( rule__Model__NodetypesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getNodetypesAssignment_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1109:1: ( rule__Model__NodetypesAssignment_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1109:2: rule__Model__NodetypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__NodetypesAssignment_1_in_rule__Model__Alternatives2307);
                    rule__Model__NodetypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNodetypesAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__NodeTypeDef__Alternatives_3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1118:1: rule__NodeTypeDef__Alternatives_3 : ( ( rulePropertyDef ) | ( ruleChildNodeDef ) );
    public final void rule__NodeTypeDef__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1122:1: ( ( rulePropertyDef ) | ( ruleChildNodeDef ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==71) ) {
                alt3=1;
            }
            else if ( (LA3_0==68) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1123:1: ( rulePropertyDef )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1123:1: ( rulePropertyDef )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1124:1: rulePropertyDef
                    {
                     before(grammarAccess.getNodeTypeDefAccess().getPropertyDefParserRuleCall_3_0()); 
                    pushFollow(FOLLOW_rulePropertyDef_in_rule__NodeTypeDef__Alternatives_32340);
                    rulePropertyDef();

                    state._fsp--;

                     after(grammarAccess.getNodeTypeDefAccess().getPropertyDefParserRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1129:6: ( ruleChildNodeDef )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1129:6: ( ruleChildNodeDef )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1130:1: ruleChildNodeDef
                    {
                     before(grammarAccess.getNodeTypeDefAccess().getChildNodeDefParserRuleCall_3_1()); 
                    pushFollow(FOLLOW_ruleChildNodeDef_in_rule__NodeTypeDef__Alternatives_32357);
                    ruleChildNodeDef();

                    state._fsp--;

                     after(grammarAccess.getNodeTypeDefAccess().getChildNodeDefParserRuleCall_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDef__Alternatives_3"


    // $ANTLR start "rule__NodeAttribute__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1140:1: rule__NodeAttribute__Alternatives : ( ( ruleAutocreated ) | ( ruleMandatory ) | ( ruleProtected ) | ( ruleOpv ) | ( ruleSns ) );
    public final void rule__NodeAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1144:1: ( ( ruleAutocreated ) | ( ruleMandatory ) | ( ruleProtected ) | ( ruleOpv ) | ( ruleSns ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 35:
            case 36:
            case 37:
                {
                alt4=1;
                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt4=2;
                }
                break;
            case 29:
            case 30:
            case 31:
                {
                alt4=3;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 70:
                {
                alt4=4;
                }
                break;
            case 12:
            case 13:
            case 14:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1145:1: ( ruleAutocreated )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1145:1: ( ruleAutocreated )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1146:1: ruleAutocreated
                    {
                     before(grammarAccess.getNodeAttributeAccess().getAutocreatedParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAutocreated_in_rule__NodeAttribute__Alternatives2389);
                    ruleAutocreated();

                    state._fsp--;

                     after(grammarAccess.getNodeAttributeAccess().getAutocreatedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1151:6: ( ruleMandatory )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1151:6: ( ruleMandatory )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1152:1: ruleMandatory
                    {
                     before(grammarAccess.getNodeAttributeAccess().getMandatoryParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMandatory_in_rule__NodeAttribute__Alternatives2406);
                    ruleMandatory();

                    state._fsp--;

                     after(grammarAccess.getNodeAttributeAccess().getMandatoryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1157:6: ( ruleProtected )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1157:6: ( ruleProtected )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1158:1: ruleProtected
                    {
                     before(grammarAccess.getNodeAttributeAccess().getProtectedParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleProtected_in_rule__NodeAttribute__Alternatives2423);
                    ruleProtected();

                    state._fsp--;

                     after(grammarAccess.getNodeAttributeAccess().getProtectedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1163:6: ( ruleOpv )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1163:6: ( ruleOpv )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1164:1: ruleOpv
                    {
                     before(grammarAccess.getNodeAttributeAccess().getOpvParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOpv_in_rule__NodeAttribute__Alternatives2440);
                    ruleOpv();

                    state._fsp--;

                     after(grammarAccess.getNodeAttributeAccess().getOpvParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1169:6: ( ruleSns )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1169:6: ( ruleSns )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1170:1: ruleSns
                    {
                     before(grammarAccess.getNodeAttributeAccess().getSnsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleSns_in_rule__NodeAttribute__Alternatives2457);
                    ruleSns();

                    state._fsp--;

                     after(grammarAccess.getNodeAttributeAccess().getSnsParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeAttribute__Alternatives"


    // $ANTLR start "rule__Sns__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1180:1: rule__Sns__Alternatives_0 : ( ( 'sns' ) | ( '*' ) | ( 'multiple' ) );
    public final void rule__Sns__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1184:1: ( ( 'sns' ) | ( '*' ) | ( 'multiple' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1185:1: ( 'sns' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1185:1: ( 'sns' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1186:1: 'sns'
                    {
                     before(grammarAccess.getSnsAccess().getSnsKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Sns__Alternatives_02490); 
                     after(grammarAccess.getSnsAccess().getSnsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1193:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1193:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1194:1: '*'
                    {
                     before(grammarAccess.getSnsAccess().getAsteriskKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Sns__Alternatives_02510); 
                     after(grammarAccess.getSnsAccess().getAsteriskKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1201:6: ( 'multiple' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1201:6: ( 'multiple' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1202:1: 'multiple'
                    {
                     before(grammarAccess.getSnsAccess().getMultipleKeyword_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__Sns__Alternatives_02530); 
                     after(grammarAccess.getSnsAccess().getMultipleKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sns__Alternatives_0"


    // $ANTLR start "rule__DefaultType__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1214:1: rule__DefaultType__Alternatives_1 : ( ( ruleJcrString ) | ( '?' ) );
    public final void rule__DefaultType__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1218:1: ( ( ruleJcrString ) | ( '?' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_EXID)||LA6_0==61) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1219:1: ( ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1219:1: ( ruleJcrString )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1220:1: ruleJcrString
                    {
                     before(grammarAccess.getDefaultTypeAccess().getJcrStringParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleJcrString_in_rule__DefaultType__Alternatives_12564);
                    ruleJcrString();

                    state._fsp--;

                     after(grammarAccess.getDefaultTypeAccess().getJcrStringParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1225:6: ( '?' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1225:6: ( '?' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1226:1: '?'
                    {
                     before(grammarAccess.getDefaultTypeAccess().getQuestionMarkKeyword_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__DefaultType__Alternatives_12582); 
                     after(grammarAccess.getDefaultTypeAccess().getQuestionMarkKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultType__Alternatives_1"


    // $ANTLR start "rule__RequiredTypes__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1238:1: rule__RequiredTypes__Alternatives_1 : ( ( ruleJcrStringList ) | ( '?' ) );
    public final void rule__RequiredTypes__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1242:1: ( ( ruleJcrStringList ) | ( '?' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_EXID)||LA7_0==61) ) {
                alt7=1;
            }
            else if ( (LA7_0==15) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1243:1: ( ruleJcrStringList )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1243:1: ( ruleJcrStringList )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1244:1: ruleJcrStringList
                    {
                     before(grammarAccess.getRequiredTypesAccess().getJcrStringListParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleJcrStringList_in_rule__RequiredTypes__Alternatives_12616);
                    ruleJcrStringList();

                    state._fsp--;

                     after(grammarAccess.getRequiredTypesAccess().getJcrStringListParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1249:6: ( '?' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1249:6: ( '?' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1250:1: '?'
                    {
                     before(grammarAccess.getRequiredTypesAccess().getQuestionMarkKeyword_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__RequiredTypes__Alternatives_12634); 
                     after(grammarAccess.getRequiredTypesAccess().getQuestionMarkKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredTypes__Alternatives_1"


    // $ANTLR start "rule__NodeName__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1262:1: rule__NodeName__Alternatives_1 : ( ( ruleJcrString ) | ( '*' ) );
    public final void rule__NodeName__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1266:1: ( ( ruleJcrString ) | ( '*' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_EXID)||LA8_0==61) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1267:1: ( ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1267:1: ( ruleJcrString )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1268:1: ruleJcrString
                    {
                     before(grammarAccess.getNodeNameAccess().getJcrStringParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleJcrString_in_rule__NodeName__Alternatives_12668);
                    ruleJcrString();

                    state._fsp--;

                     after(grammarAccess.getNodeNameAccess().getJcrStringParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1273:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1273:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1274:1: '*'
                    {
                     before(grammarAccess.getNodeNameAccess().getAsteriskKeyword_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__NodeName__Alternatives_12686); 
                     after(grammarAccess.getNodeNameAccess().getAsteriskKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeName__Alternatives_1"


    // $ANTLR start "rule__ValueConstraints__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1286:1: rule__ValueConstraints__Alternatives_1 : ( ( ruleJcrStringList ) | ( '?' ) );
    public final void rule__ValueConstraints__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1290:1: ( ( ruleJcrStringList ) | ( '?' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_EXID)||LA9_0==61) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1291:1: ( ruleJcrStringList )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1291:1: ( ruleJcrStringList )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1292:1: ruleJcrStringList
                    {
                     before(grammarAccess.getValueConstraintsAccess().getJcrStringListParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleJcrStringList_in_rule__ValueConstraints__Alternatives_12720);
                    ruleJcrStringList();

                    state._fsp--;

                     after(grammarAccess.getValueConstraintsAccess().getJcrStringListParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1297:6: ( '?' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1297:6: ( '?' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1298:1: '?'
                    {
                     before(grammarAccess.getValueConstraintsAccess().getQuestionMarkKeyword_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__ValueConstraints__Alternatives_12738); 
                     after(grammarAccess.getValueConstraintsAccess().getQuestionMarkKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueConstraints__Alternatives_1"


    // $ANTLR start "rule__PropertyAttribute__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1310:1: rule__PropertyAttribute__Alternatives : ( ( ruleAutocreated ) | ( ruleMandatory ) | ( ruleProtected ) | ( ruleOpv ) | ( ruleMultiple ) | ( ruleQueryOps ) | ( ruleNoFullText ) | ( ruleNoQueryOrder ) | ( rulePrimary ) );
    public final void rule__PropertyAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1314:1: ( ( ruleAutocreated ) | ( ruleMandatory ) | ( ruleProtected ) | ( ruleOpv ) | ( ruleMultiple ) | ( ruleQueryOps ) | ( ruleNoFullText ) | ( ruleNoQueryOrder ) | ( rulePrimary ) )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 35:
            case 36:
            case 37:
                {
                alt10=1;
                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt10=2;
                }
                break;
            case 29:
            case 30:
            case 31:
                {
                alt10=3;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 70:
                {
                alt10=4;
                }
                break;
            case 13:
            case 14:
            case 22:
                {
                alt10=5;
                }
                break;
            case 20:
            case 21:
                {
                alt10=6;
                }
                break;
            case 18:
            case 19:
                {
                alt10=7;
                }
                break;
            case 16:
            case 17:
                {
                alt10=8;
                }
                break;
            case 38:
            case 39:
                {
                alt10=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1315:1: ( ruleAutocreated )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1315:1: ( ruleAutocreated )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1316:1: ruleAutocreated
                    {
                     before(grammarAccess.getPropertyAttributeAccess().getAutocreatedParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAutocreated_in_rule__PropertyAttribute__Alternatives2772);
                    ruleAutocreated();

                    state._fsp--;

                     after(grammarAccess.getPropertyAttributeAccess().getAutocreatedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1321:6: ( ruleMandatory )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1321:6: ( ruleMandatory )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1322:1: ruleMandatory
                    {
                     before(grammarAccess.getPropertyAttributeAccess().getMandatoryParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMandatory_in_rule__PropertyAttribute__Alternatives2789);
                    ruleMandatory();

                    state._fsp--;

                     after(grammarAccess.getPropertyAttributeAccess().getMandatoryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1327:6: ( ruleProtected )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1327:6: ( ruleProtected )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1328:1: ruleProtected
                    {
                     before(grammarAccess.getPropertyAttributeAccess().getProtectedParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleProtected_in_rule__PropertyAttribute__Alternatives2806);
                    ruleProtected();

                    state._fsp--;

                     after(grammarAccess.getPropertyAttributeAccess().getProtectedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1333:6: ( ruleOpv )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1333:6: ( ruleOpv )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1334:1: ruleOpv
                    {
                     before(grammarAccess.getPropertyAttributeAccess().getOpvParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleOpv_in_rule__PropertyAttribute__Alternatives2823);
                    ruleOpv();

                    state._fsp--;

                     after(grammarAccess.getPropertyAttributeAccess().getOpvParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1339:6: ( ruleMultiple )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1339:6: ( ruleMultiple )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1340:1: ruleMultiple
                    {
                     before(grammarAccess.getPropertyAttributeAccess().getMultipleParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleMultiple_in_rule__PropertyAttribute__Alternatives2840);
                    ruleMultiple();

                    state._fsp--;

                     after(grammarAccess.getPropertyAttributeAccess().getMultipleParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1345:6: ( ruleQueryOps )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1345:6: ( ruleQueryOps )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1346:1: ruleQueryOps
                    {
                     before(grammarAccess.getPropertyAttributeAccess().getQueryOpsParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleQueryOps_in_rule__PropertyAttribute__Alternatives2857);
                    ruleQueryOps();

                    state._fsp--;

                     after(grammarAccess.getPropertyAttributeAccess().getQueryOpsParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1351:6: ( ruleNoFullText )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1351:6: ( ruleNoFullText )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1352:1: ruleNoFullText
                    {
                     before(grammarAccess.getPropertyAttributeAccess().getNoFullTextParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleNoFullText_in_rule__PropertyAttribute__Alternatives2874);
                    ruleNoFullText();

                    state._fsp--;

                     after(grammarAccess.getPropertyAttributeAccess().getNoFullTextParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1357:6: ( ruleNoQueryOrder )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1357:6: ( ruleNoQueryOrder )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1358:1: ruleNoQueryOrder
                    {
                     before(grammarAccess.getPropertyAttributeAccess().getNoQueryOrderParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleNoQueryOrder_in_rule__PropertyAttribute__Alternatives2891);
                    ruleNoQueryOrder();

                    state._fsp--;

                     after(grammarAccess.getPropertyAttributeAccess().getNoQueryOrderParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1363:6: ( rulePrimary )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1363:6: ( rulePrimary )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1364:1: rulePrimary
                    {
                     before(grammarAccess.getPropertyAttributeAccess().getPrimaryParserRuleCall_8()); 
                    pushFollow(FOLLOW_rulePrimary_in_rule__PropertyAttribute__Alternatives2908);
                    rulePrimary();

                    state._fsp--;

                     after(grammarAccess.getPropertyAttributeAccess().getPrimaryParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyAttribute__Alternatives"


    // $ANTLR start "rule__NoQueryOrder__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1374:1: rule__NoQueryOrder__Alternatives_0 : ( ( 'noqueryorder' ) | ( 'nqord' ) );
    public final void rule__NoQueryOrder__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1378:1: ( ( 'noqueryorder' ) | ( 'nqord' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1379:1: ( 'noqueryorder' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1379:1: ( 'noqueryorder' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1380:1: 'noqueryorder'
                    {
                     before(grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__NoQueryOrder__Alternatives_02941); 
                     after(grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1387:6: ( 'nqord' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1387:6: ( 'nqord' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1388:1: 'nqord'
                    {
                     before(grammarAccess.getNoQueryOrderAccess().getNqordKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__NoQueryOrder__Alternatives_02961); 
                     after(grammarAccess.getNoQueryOrderAccess().getNqordKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoQueryOrder__Alternatives_0"


    // $ANTLR start "rule__NoFullText__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1400:1: rule__NoFullText__Alternatives_0 : ( ( 'nofulltext' ) | ( 'nof' ) );
    public final void rule__NoFullText__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1404:1: ( ( 'nofulltext' ) | ( 'nof' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1405:1: ( 'nofulltext' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1405:1: ( 'nofulltext' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1406:1: 'nofulltext'
                    {
                     before(grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__NoFullText__Alternatives_02996); 
                     after(grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1413:6: ( 'nof' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1413:6: ( 'nof' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1414:1: 'nof'
                    {
                     before(grammarAccess.getNoFullTextAccess().getNofKeyword_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__NoFullText__Alternatives_03016); 
                     after(grammarAccess.getNoFullTextAccess().getNofKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoFullText__Alternatives_0"


    // $ANTLR start "rule__QueryOps__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1426:1: rule__QueryOps__Alternatives_0 : ( ( 'queryops' ) | ( 'qop' ) );
    public final void rule__QueryOps__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1430:1: ( ( 'queryops' ) | ( 'qop' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1431:1: ( 'queryops' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1431:1: ( 'queryops' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1432:1: 'queryops'
                    {
                     before(grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__QueryOps__Alternatives_03051); 
                     after(grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1439:6: ( 'qop' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1439:6: ( 'qop' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1440:1: 'qop'
                    {
                     before(grammarAccess.getQueryOpsAccess().getQopKeyword_0_1()); 
                    match(input,21,FOLLOW_21_in_rule__QueryOps__Alternatives_03071); 
                     after(grammarAccess.getQueryOpsAccess().getQopKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOps__Alternatives_0"


    // $ANTLR start "rule__QueryOps__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1452:1: rule__QueryOps__Alternatives_1 : ( ( ruleJcrString ) | ( '?' ) );
    public final void rule__QueryOps__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1456:1: ( ( ruleJcrString ) | ( '?' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_EXID)||LA14_0==61) ) {
                alt14=1;
            }
            else if ( (LA14_0==15) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1457:1: ( ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1457:1: ( ruleJcrString )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1458:1: ruleJcrString
                    {
                     before(grammarAccess.getQueryOpsAccess().getJcrStringParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleJcrString_in_rule__QueryOps__Alternatives_13105);
                    ruleJcrString();

                    state._fsp--;

                     after(grammarAccess.getQueryOpsAccess().getJcrStringParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1463:6: ( '?' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1463:6: ( '?' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1464:1: '?'
                    {
                     before(grammarAccess.getQueryOpsAccess().getQuestionMarkKeyword_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__QueryOps__Alternatives_13123); 
                     after(grammarAccess.getQueryOpsAccess().getQuestionMarkKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOps__Alternatives_1"


    // $ANTLR start "rule__Multiple__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1476:1: rule__Multiple__Alternatives_0 : ( ( 'multiple' ) | ( 'mul' ) | ( '*' ) );
    public final void rule__Multiple__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1480:1: ( ( 'multiple' ) | ( 'mul' ) | ( '*' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt15=1;
                }
                break;
            case 22:
                {
                alt15=2;
                }
                break;
            case 13:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1481:1: ( 'multiple' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1481:1: ( 'multiple' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1482:1: 'multiple'
                    {
                     before(grammarAccess.getMultipleAccess().getMultipleKeyword_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Multiple__Alternatives_03158); 
                     after(grammarAccess.getMultipleAccess().getMultipleKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1489:6: ( 'mul' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1489:6: ( 'mul' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1490:1: 'mul'
                    {
                     before(grammarAccess.getMultipleAccess().getMulKeyword_0_1()); 
                    match(input,22,FOLLOW_22_in_rule__Multiple__Alternatives_03178); 
                     after(grammarAccess.getMultipleAccess().getMulKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1497:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1497:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1498:1: '*'
                    {
                     before(grammarAccess.getMultipleAccess().getAsteriskKeyword_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__Multiple__Alternatives_03198); 
                     after(grammarAccess.getMultipleAccess().getAsteriskKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Alternatives_0"


    // $ANTLR start "rule__Opv__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1510:1: rule__Opv__Alternatives : ( ( 'COPY' ) | ( 'VERSION' ) | ( 'INITIALIZE' ) | ( 'COMPUTE' ) | ( 'IGNORE' ) | ( 'ABORT' ) | ( ( rule__Opv__Group_6__0 ) ) );
    public final void rule__Opv__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1514:1: ( ( 'COPY' ) | ( 'VERSION' ) | ( 'INITIALIZE' ) | ( 'COMPUTE' ) | ( 'IGNORE' ) | ( 'ABORT' ) | ( ( rule__Opv__Group_6__0 ) ) )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt16=1;
                }
                break;
            case 24:
                {
                alt16=2;
                }
                break;
            case 25:
                {
                alt16=3;
                }
                break;
            case 26:
                {
                alt16=4;
                }
                break;
            case 27:
                {
                alt16=5;
                }
                break;
            case 28:
                {
                alt16=6;
                }
                break;
            case 70:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1515:1: ( 'COPY' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1515:1: ( 'COPY' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1516:1: 'COPY'
                    {
                     before(grammarAccess.getOpvAccess().getCOPYKeyword_0()); 
                    match(input,23,FOLLOW_23_in_rule__Opv__Alternatives3233); 
                     after(grammarAccess.getOpvAccess().getCOPYKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1523:6: ( 'VERSION' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1523:6: ( 'VERSION' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1524:1: 'VERSION'
                    {
                     before(grammarAccess.getOpvAccess().getVERSIONKeyword_1()); 
                    match(input,24,FOLLOW_24_in_rule__Opv__Alternatives3253); 
                     after(grammarAccess.getOpvAccess().getVERSIONKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1531:6: ( 'INITIALIZE' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1531:6: ( 'INITIALIZE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1532:1: 'INITIALIZE'
                    {
                     before(grammarAccess.getOpvAccess().getINITIALIZEKeyword_2()); 
                    match(input,25,FOLLOW_25_in_rule__Opv__Alternatives3273); 
                     after(grammarAccess.getOpvAccess().getINITIALIZEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1539:6: ( 'COMPUTE' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1539:6: ( 'COMPUTE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1540:1: 'COMPUTE'
                    {
                     before(grammarAccess.getOpvAccess().getCOMPUTEKeyword_3()); 
                    match(input,26,FOLLOW_26_in_rule__Opv__Alternatives3293); 
                     after(grammarAccess.getOpvAccess().getCOMPUTEKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1547:6: ( 'IGNORE' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1547:6: ( 'IGNORE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1548:1: 'IGNORE'
                    {
                     before(grammarAccess.getOpvAccess().getIGNOREKeyword_4()); 
                    match(input,27,FOLLOW_27_in_rule__Opv__Alternatives3313); 
                     after(grammarAccess.getOpvAccess().getIGNOREKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1555:6: ( 'ABORT' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1555:6: ( 'ABORT' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1556:1: 'ABORT'
                    {
                     before(grammarAccess.getOpvAccess().getABORTKeyword_5()); 
                    match(input,28,FOLLOW_28_in_rule__Opv__Alternatives3333); 
                     after(grammarAccess.getOpvAccess().getABORTKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1563:6: ( ( rule__Opv__Group_6__0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1563:6: ( ( rule__Opv__Group_6__0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1564:1: ( rule__Opv__Group_6__0 )
                    {
                     before(grammarAccess.getOpvAccess().getGroup_6()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1565:1: ( rule__Opv__Group_6__0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1565:2: rule__Opv__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Opv__Group_6__0_in_rule__Opv__Alternatives3352);
                    rule__Opv__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpvAccess().getGroup_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opv__Alternatives"


    // $ANTLR start "rule__Protected__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1574:1: rule__Protected__Alternatives_0 : ( ( 'protected' ) | ( 'pro' ) | ( 'p' ) );
    public final void rule__Protected__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1578:1: ( ( 'protected' ) | ( 'pro' ) | ( 'p' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1579:1: ( 'protected' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1579:1: ( 'protected' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1580:1: 'protected'
                    {
                     before(grammarAccess.getProtectedAccess().getProtectedKeyword_0_0()); 
                    match(input,29,FOLLOW_29_in_rule__Protected__Alternatives_03386); 
                     after(grammarAccess.getProtectedAccess().getProtectedKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1587:6: ( 'pro' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1587:6: ( 'pro' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1588:1: 'pro'
                    {
                     before(grammarAccess.getProtectedAccess().getProKeyword_0_1()); 
                    match(input,30,FOLLOW_30_in_rule__Protected__Alternatives_03406); 
                     after(grammarAccess.getProtectedAccess().getProKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1595:6: ( 'p' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1595:6: ( 'p' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1596:1: 'p'
                    {
                     before(grammarAccess.getProtectedAccess().getPKeyword_0_2()); 
                    match(input,31,FOLLOW_31_in_rule__Protected__Alternatives_03426); 
                     after(grammarAccess.getProtectedAccess().getPKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protected__Alternatives_0"


    // $ANTLR start "rule__Mandatory__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1608:1: rule__Mandatory__Alternatives_0 : ( ( 'mandatory' ) | ( 'man' ) | ( 'm' ) );
    public final void rule__Mandatory__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1612:1: ( ( 'mandatory' ) | ( 'man' ) | ( 'm' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 33:
                {
                alt18=2;
                }
                break;
            case 34:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1613:1: ( 'mandatory' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1613:1: ( 'mandatory' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1614:1: 'mandatory'
                    {
                     before(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0_0()); 
                    match(input,32,FOLLOW_32_in_rule__Mandatory__Alternatives_03461); 
                     after(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1621:6: ( 'man' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1621:6: ( 'man' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1622:1: 'man'
                    {
                     before(grammarAccess.getMandatoryAccess().getManKeyword_0_1()); 
                    match(input,33,FOLLOW_33_in_rule__Mandatory__Alternatives_03481); 
                     after(grammarAccess.getMandatoryAccess().getManKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1629:6: ( 'm' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1629:6: ( 'm' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1630:1: 'm'
                    {
                     before(grammarAccess.getMandatoryAccess().getMKeyword_0_2()); 
                    match(input,34,FOLLOW_34_in_rule__Mandatory__Alternatives_03501); 
                     after(grammarAccess.getMandatoryAccess().getMKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Alternatives_0"


    // $ANTLR start "rule__Autocreated__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1642:1: rule__Autocreated__Alternatives_0 : ( ( 'autocreated' ) | ( 'aut' ) | ( 'a' ) );
    public final void rule__Autocreated__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1646:1: ( ( 'autocreated' ) | ( 'aut' ) | ( 'a' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt19=1;
                }
                break;
            case 36:
                {
                alt19=2;
                }
                break;
            case 37:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1647:1: ( 'autocreated' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1647:1: ( 'autocreated' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1648:1: 'autocreated'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0_0()); 
                    match(input,35,FOLLOW_35_in_rule__Autocreated__Alternatives_03536); 
                     after(grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1655:6: ( 'aut' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1655:6: ( 'aut' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1656:1: 'aut'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAutKeyword_0_1()); 
                    match(input,36,FOLLOW_36_in_rule__Autocreated__Alternatives_03556); 
                     after(grammarAccess.getAutocreatedAccess().getAutKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1663:6: ( 'a' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1663:6: ( 'a' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1664:1: 'a'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAKeyword_0_2()); 
                    match(input,37,FOLLOW_37_in_rule__Autocreated__Alternatives_03576); 
                     after(grammarAccess.getAutocreatedAccess().getAKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autocreated__Alternatives_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1676:1: rule__Primary__Alternatives : ( ( 'primary' ) | ( '!' ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1680:1: ( ( 'primary' ) | ( '!' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            else if ( (LA20_0==39) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1681:1: ( 'primary' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1681:1: ( 'primary' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1682:1: 'primary'
                    {
                     before(grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 
                    match(input,38,FOLLOW_38_in_rule__Primary__Alternatives3611); 
                     after(grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1689:6: ( '!' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1689:6: ( '!' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1690:1: '!'
                    {
                     before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1()); 
                    match(input,39,FOLLOW_39_in_rule__Primary__Alternatives3631); 
                     after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__DefaultValues__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1702:1: rule__DefaultValues__Alternatives_1 : ( ( ruleJcrStringList ) | ( '?' ) );
    public final void rule__DefaultValues__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1706:1: ( ( ruleJcrStringList ) | ( '?' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_EXID)||LA21_0==61) ) {
                alt21=1;
            }
            else if ( (LA21_0==15) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1707:1: ( ruleJcrStringList )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1707:1: ( ruleJcrStringList )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1708:1: ruleJcrStringList
                    {
                     before(grammarAccess.getDefaultValuesAccess().getJcrStringListParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleJcrStringList_in_rule__DefaultValues__Alternatives_13665);
                    ruleJcrStringList();

                    state._fsp--;

                     after(grammarAccess.getDefaultValuesAccess().getJcrStringListParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1713:6: ( '?' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1713:6: ( '?' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1714:1: '?'
                    {
                     before(grammarAccess.getDefaultValuesAccess().getQuestionMarkKeyword_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__DefaultValues__Alternatives_13683); 
                     after(grammarAccess.getDefaultValuesAccess().getQuestionMarkKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValues__Alternatives_1"


    // $ANTLR start "rule__PropertyType__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1726:1: rule__PropertyType__Alternatives_1 : ( ( 'STRING' ) | ( 'BINARY' ) | ( 'LONG' ) | ( 'DOUBLE' ) | ( 'BOOLEAN' ) | ( 'DATE' ) | ( 'NAME' ) | ( 'PATH' ) | ( 'REFERENCE' ) | ( 'WEAKREFERENCE' ) | ( 'DECIMAL' ) | ( 'URI' ) | ( 'UNDEFINED' ) | ( '*' ) | ( '?' ) );
    public final void rule__PropertyType__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1730:1: ( ( 'STRING' ) | ( 'BINARY' ) | ( 'LONG' ) | ( 'DOUBLE' ) | ( 'BOOLEAN' ) | ( 'DATE' ) | ( 'NAME' ) | ( 'PATH' ) | ( 'REFERENCE' ) | ( 'WEAKREFERENCE' ) | ( 'DECIMAL' ) | ( 'URI' ) | ( 'UNDEFINED' ) | ( '*' ) | ( '?' ) )
            int alt22=15;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt22=1;
                }
                break;
            case 41:
                {
                alt22=2;
                }
                break;
            case 42:
                {
                alt22=3;
                }
                break;
            case 43:
                {
                alt22=4;
                }
                break;
            case 44:
                {
                alt22=5;
                }
                break;
            case 45:
                {
                alt22=6;
                }
                break;
            case 46:
                {
                alt22=7;
                }
                break;
            case 47:
                {
                alt22=8;
                }
                break;
            case 48:
                {
                alt22=9;
                }
                break;
            case 49:
                {
                alt22=10;
                }
                break;
            case 50:
                {
                alt22=11;
                }
                break;
            case 51:
                {
                alt22=12;
                }
                break;
            case 52:
                {
                alt22=13;
                }
                break;
            case 13:
                {
                alt22=14;
                }
                break;
            case 15:
                {
                alt22=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1731:1: ( 'STRING' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1731:1: ( 'STRING' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1732:1: 'STRING'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getSTRINGKeyword_1_0()); 
                    match(input,40,FOLLOW_40_in_rule__PropertyType__Alternatives_13718); 
                     after(grammarAccess.getPropertyTypeAccess().getSTRINGKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1739:6: ( 'BINARY' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1739:6: ( 'BINARY' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1740:1: 'BINARY'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getBINARYKeyword_1_1()); 
                    match(input,41,FOLLOW_41_in_rule__PropertyType__Alternatives_13738); 
                     after(grammarAccess.getPropertyTypeAccess().getBINARYKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1747:6: ( 'LONG' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1747:6: ( 'LONG' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1748:1: 'LONG'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getLONGKeyword_1_2()); 
                    match(input,42,FOLLOW_42_in_rule__PropertyType__Alternatives_13758); 
                     after(grammarAccess.getPropertyTypeAccess().getLONGKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1755:6: ( 'DOUBLE' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1755:6: ( 'DOUBLE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1756:1: 'DOUBLE'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDOUBLEKeyword_1_3()); 
                    match(input,43,FOLLOW_43_in_rule__PropertyType__Alternatives_13778); 
                     after(grammarAccess.getPropertyTypeAccess().getDOUBLEKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1763:6: ( 'BOOLEAN' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1763:6: ( 'BOOLEAN' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1764:1: 'BOOLEAN'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getBOOLEANKeyword_1_4()); 
                    match(input,44,FOLLOW_44_in_rule__PropertyType__Alternatives_13798); 
                     after(grammarAccess.getPropertyTypeAccess().getBOOLEANKeyword_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1771:6: ( 'DATE' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1771:6: ( 'DATE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1772:1: 'DATE'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDATEKeyword_1_5()); 
                    match(input,45,FOLLOW_45_in_rule__PropertyType__Alternatives_13818); 
                     after(grammarAccess.getPropertyTypeAccess().getDATEKeyword_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1779:6: ( 'NAME' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1779:6: ( 'NAME' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1780:1: 'NAME'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getNAMEKeyword_1_6()); 
                    match(input,46,FOLLOW_46_in_rule__PropertyType__Alternatives_13838); 
                     after(grammarAccess.getPropertyTypeAccess().getNAMEKeyword_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1787:6: ( 'PATH' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1787:6: ( 'PATH' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1788:1: 'PATH'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getPATHKeyword_1_7()); 
                    match(input,47,FOLLOW_47_in_rule__PropertyType__Alternatives_13858); 
                     after(grammarAccess.getPropertyTypeAccess().getPATHKeyword_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1795:6: ( 'REFERENCE' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1795:6: ( 'REFERENCE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1796:1: 'REFERENCE'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getREFERENCEKeyword_1_8()); 
                    match(input,48,FOLLOW_48_in_rule__PropertyType__Alternatives_13878); 
                     after(grammarAccess.getPropertyTypeAccess().getREFERENCEKeyword_1_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1803:6: ( 'WEAKREFERENCE' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1803:6: ( 'WEAKREFERENCE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1804:1: 'WEAKREFERENCE'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getWEAKREFERENCEKeyword_1_9()); 
                    match(input,49,FOLLOW_49_in_rule__PropertyType__Alternatives_13898); 
                     after(grammarAccess.getPropertyTypeAccess().getWEAKREFERENCEKeyword_1_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1811:6: ( 'DECIMAL' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1811:6: ( 'DECIMAL' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1812:1: 'DECIMAL'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDECIMALKeyword_1_10()); 
                    match(input,50,FOLLOW_50_in_rule__PropertyType__Alternatives_13918); 
                     after(grammarAccess.getPropertyTypeAccess().getDECIMALKeyword_1_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1819:6: ( 'URI' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1819:6: ( 'URI' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1820:1: 'URI'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getURIKeyword_1_11()); 
                    match(input,51,FOLLOW_51_in_rule__PropertyType__Alternatives_13938); 
                     after(grammarAccess.getPropertyTypeAccess().getURIKeyword_1_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1827:6: ( 'UNDEFINED' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1827:6: ( 'UNDEFINED' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1828:1: 'UNDEFINED'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getUNDEFINEDKeyword_1_12()); 
                    match(input,52,FOLLOW_52_in_rule__PropertyType__Alternatives_13958); 
                     after(grammarAccess.getPropertyTypeAccess().getUNDEFINEDKeyword_1_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1835:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1835:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1836:1: '*'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getAsteriskKeyword_1_13()); 
                    match(input,13,FOLLOW_13_in_rule__PropertyType__Alternatives_13978); 
                     after(grammarAccess.getPropertyTypeAccess().getAsteriskKeyword_1_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1843:6: ( '?' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1843:6: ( '?' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1844:1: '?'
                    {
                     before(grammarAccess.getPropertyTypeAccess().getQuestionMarkKeyword_1_14()); 
                    match(input,15,FOLLOW_15_in_rule__PropertyType__Alternatives_13998); 
                     after(grammarAccess.getPropertyTypeAccess().getQuestionMarkKeyword_1_14()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Alternatives_1"


    // $ANTLR start "rule__PropertyName__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1856:1: rule__PropertyName__Alternatives_1 : ( ( ruleJcrString ) | ( '*' ) );
    public final void rule__PropertyName__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1860:1: ( ( ruleJcrString ) | ( '*' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_EXID)||LA23_0==61) ) {
                alt23=1;
            }
            else if ( (LA23_0==13) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1861:1: ( ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1861:1: ( ruleJcrString )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1862:1: ruleJcrString
                    {
                     before(grammarAccess.getPropertyNameAccess().getJcrStringParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyName__Alternatives_14032);
                    ruleJcrString();

                    state._fsp--;

                     after(grammarAccess.getPropertyNameAccess().getJcrStringParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1867:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1867:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1868:1: '*'
                    {
                     before(grammarAccess.getPropertyNameAccess().getAsteriskKeyword_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__PropertyName__Alternatives_14050); 
                     after(grammarAccess.getPropertyNameAccess().getAsteriskKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyName__Alternatives_1"


    // $ANTLR start "rule__NodeTypeAttribute__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1880:1: rule__NodeTypeAttribute__Alternatives : ( ( ruleOrderable ) | ( ruleMixin ) | ( ruleAbstract ) | ( ruleQuery ) | ( rulePrimaryItem ) );
    public final void rule__NodeTypeAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1884:1: ( ( ruleOrderable ) | ( ruleMixin ) | ( ruleAbstract ) | ( ruleQuery ) | ( rulePrimaryItem ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 62:
            case 63:
            case 64:
                {
                alt24=1;
                }
                break;
            case 34:
            case 60:
            case 61:
                {
                alt24=2;
                }
                break;
            case 37:
            case 58:
            case 59:
                {
                alt24=3;
                }
                break;
            case 54:
            case 55:
            case 56:
            case 57:
                {
                alt24=4;
                }
                break;
            case 39:
            case 53:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1885:1: ( ruleOrderable )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1885:1: ( ruleOrderable )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1886:1: ruleOrderable
                    {
                     before(grammarAccess.getNodeTypeAttributeAccess().getOrderableParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleOrderable_in_rule__NodeTypeAttribute__Alternatives4084);
                    ruleOrderable();

                    state._fsp--;

                     after(grammarAccess.getNodeTypeAttributeAccess().getOrderableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1891:6: ( ruleMixin )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1891:6: ( ruleMixin )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1892:1: ruleMixin
                    {
                     before(grammarAccess.getNodeTypeAttributeAccess().getMixinParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleMixin_in_rule__NodeTypeAttribute__Alternatives4101);
                    ruleMixin();

                    state._fsp--;

                     after(grammarAccess.getNodeTypeAttributeAccess().getMixinParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1897:6: ( ruleAbstract )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1897:6: ( ruleAbstract )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1898:1: ruleAbstract
                    {
                     before(grammarAccess.getNodeTypeAttributeAccess().getAbstractParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAbstract_in_rule__NodeTypeAttribute__Alternatives4118);
                    ruleAbstract();

                    state._fsp--;

                     after(grammarAccess.getNodeTypeAttributeAccess().getAbstractParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1903:6: ( ruleQuery )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1903:6: ( ruleQuery )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1904:1: ruleQuery
                    {
                     before(grammarAccess.getNodeTypeAttributeAccess().getQueryParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleQuery_in_rule__NodeTypeAttribute__Alternatives4135);
                    ruleQuery();

                    state._fsp--;

                     after(grammarAccess.getNodeTypeAttributeAccess().getQueryParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1909:6: ( rulePrimaryItem )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1909:6: ( rulePrimaryItem )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1910:1: rulePrimaryItem
                    {
                     before(grammarAccess.getNodeTypeAttributeAccess().getPrimaryItemParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulePrimaryItem_in_rule__NodeTypeAttribute__Alternatives4152);
                    rulePrimaryItem();

                    state._fsp--;

                     after(grammarAccess.getNodeTypeAttributeAccess().getPrimaryItemParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeAttribute__Alternatives"


    // $ANTLR start "rule__PrimaryItem__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1920:1: rule__PrimaryItem__Alternatives_0 : ( ( 'primaryitem' ) | ( '!' ) );
    public final void rule__PrimaryItem__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1924:1: ( ( 'primaryitem' ) | ( '!' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==53) ) {
                alt25=1;
            }
            else if ( (LA25_0==39) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1925:1: ( 'primaryitem' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1925:1: ( 'primaryitem' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1926:1: 'primaryitem'
                    {
                     before(grammarAccess.getPrimaryItemAccess().getPrimaryitemKeyword_0_0()); 
                    match(input,53,FOLLOW_53_in_rule__PrimaryItem__Alternatives_04185); 
                     after(grammarAccess.getPrimaryItemAccess().getPrimaryitemKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1933:6: ( '!' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1933:6: ( '!' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1934:1: '!'
                    {
                     before(grammarAccess.getPrimaryItemAccess().getExclamationMarkKeyword_0_1()); 
                    match(input,39,FOLLOW_39_in_rule__PrimaryItem__Alternatives_04205); 
                     after(grammarAccess.getPrimaryItemAccess().getExclamationMarkKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryItem__Alternatives_0"


    // $ANTLR start "rule__PrimaryItem__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1946:1: rule__PrimaryItem__Alternatives_1 : ( ( ruleJcrString ) | ( '?' ) );
    public final void rule__PrimaryItem__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1950:1: ( ( ruleJcrString ) | ( '?' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_EXID)||LA26_0==61) ) {
                alt26=1;
            }
            else if ( (LA26_0==15) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1951:1: ( ruleJcrString )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1951:1: ( ruleJcrString )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1952:1: ruleJcrString
                    {
                     before(grammarAccess.getPrimaryItemAccess().getJcrStringParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleJcrString_in_rule__PrimaryItem__Alternatives_14239);
                    ruleJcrString();

                    state._fsp--;

                     after(grammarAccess.getPrimaryItemAccess().getJcrStringParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1957:6: ( '?' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1957:6: ( '?' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1958:1: '?'
                    {
                     before(grammarAccess.getPrimaryItemAccess().getQuestionMarkKeyword_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__PrimaryItem__Alternatives_14257); 
                     after(grammarAccess.getPrimaryItemAccess().getQuestionMarkKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryItem__Alternatives_1"


    // $ANTLR start "rule__Query__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1970:1: rule__Query__Alternatives : ( ( ( rule__Query__Alternatives_0 ) ) | ( ( rule__Query__Alternatives_1 ) ) );
    public final void rule__Query__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1974:1: ( ( ( rule__Query__Alternatives_0 ) ) | ( ( rule__Query__Alternatives_1 ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=54 && LA27_0<=55)) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=56 && LA27_0<=57)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1975:1: ( ( rule__Query__Alternatives_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1975:1: ( ( rule__Query__Alternatives_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1976:1: ( rule__Query__Alternatives_0 )
                    {
                     before(grammarAccess.getQueryAccess().getAlternatives_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1977:1: ( rule__Query__Alternatives_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1977:2: rule__Query__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__Query__Alternatives_0_in_rule__Query__Alternatives4291);
                    rule__Query__Alternatives_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQueryAccess().getAlternatives_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1981:6: ( ( rule__Query__Alternatives_1 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1981:6: ( ( rule__Query__Alternatives_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1982:1: ( rule__Query__Alternatives_1 )
                    {
                     before(grammarAccess.getQueryAccess().getAlternatives_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1983:1: ( rule__Query__Alternatives_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1983:2: rule__Query__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Query__Alternatives_1_in_rule__Query__Alternatives4309);
                    rule__Query__Alternatives_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getQueryAccess().getAlternatives_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Alternatives"


    // $ANTLR start "rule__Query__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1992:1: rule__Query__Alternatives_0 : ( ( 'noquery' ) | ( 'nq' ) );
    public final void rule__Query__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1996:1: ( ( 'noquery' ) | ( 'nq' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            else if ( (LA28_0==55) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1997:1: ( 'noquery' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1997:1: ( 'noquery' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1998:1: 'noquery'
                    {
                     before(grammarAccess.getQueryAccess().getNoqueryKeyword_0_0()); 
                    match(input,54,FOLLOW_54_in_rule__Query__Alternatives_04343); 
                     after(grammarAccess.getQueryAccess().getNoqueryKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2005:6: ( 'nq' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2005:6: ( 'nq' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2006:1: 'nq'
                    {
                     before(grammarAccess.getQueryAccess().getNqKeyword_0_1()); 
                    match(input,55,FOLLOW_55_in_rule__Query__Alternatives_04363); 
                     after(grammarAccess.getQueryAccess().getNqKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Alternatives_0"


    // $ANTLR start "rule__Query__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2018:1: rule__Query__Alternatives_1 : ( ( 'query' ) | ( 'q' ) );
    public final void rule__Query__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2022:1: ( ( 'query' ) | ( 'q' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==56) ) {
                alt29=1;
            }
            else if ( (LA29_0==57) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2023:1: ( 'query' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2023:1: ( 'query' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2024:1: 'query'
                    {
                     before(grammarAccess.getQueryAccess().getQueryKeyword_1_0()); 
                    match(input,56,FOLLOW_56_in_rule__Query__Alternatives_14398); 
                     after(grammarAccess.getQueryAccess().getQueryKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2031:6: ( 'q' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2031:6: ( 'q' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2032:1: 'q'
                    {
                     before(grammarAccess.getQueryAccess().getQKeyword_1_1()); 
                    match(input,57,FOLLOW_57_in_rule__Query__Alternatives_14418); 
                     after(grammarAccess.getQueryAccess().getQKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Alternatives_1"


    // $ANTLR start "rule__Abstract__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2044:1: rule__Abstract__Alternatives_0 : ( ( 'abstract' ) | ( 'abs' ) | ( 'a' ) );
    public final void rule__Abstract__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2048:1: ( ( 'abstract' ) | ( 'abs' ) | ( 'a' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt30=1;
                }
                break;
            case 59:
                {
                alt30=2;
                }
                break;
            case 37:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2049:1: ( 'abstract' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2049:1: ( 'abstract' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2050:1: 'abstract'
                    {
                     before(grammarAccess.getAbstractAccess().getAbstractKeyword_0_0()); 
                    match(input,58,FOLLOW_58_in_rule__Abstract__Alternatives_04453); 
                     after(grammarAccess.getAbstractAccess().getAbstractKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2057:6: ( 'abs' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2057:6: ( 'abs' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2058:1: 'abs'
                    {
                     before(grammarAccess.getAbstractAccess().getAbsKeyword_0_1()); 
                    match(input,59,FOLLOW_59_in_rule__Abstract__Alternatives_04473); 
                     after(grammarAccess.getAbstractAccess().getAbsKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2065:6: ( 'a' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2065:6: ( 'a' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2066:1: 'a'
                    {
                     before(grammarAccess.getAbstractAccess().getAKeyword_0_2()); 
                    match(input,37,FOLLOW_37_in_rule__Abstract__Alternatives_04493); 
                     after(grammarAccess.getAbstractAccess().getAKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstract__Alternatives_0"


    // $ANTLR start "rule__Mixin__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2078:1: rule__Mixin__Alternatives_0 : ( ( 'mixin' ) | ( 'mix' ) | ( 'm' ) );
    public final void rule__Mixin__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2082:1: ( ( 'mixin' ) | ( 'mix' ) | ( 'm' ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt31=1;
                }
                break;
            case 61:
                {
                alt31=2;
                }
                break;
            case 34:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2083:1: ( 'mixin' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2083:1: ( 'mixin' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2084:1: 'mixin'
                    {
                     before(grammarAccess.getMixinAccess().getMixinKeyword_0_0()); 
                    match(input,60,FOLLOW_60_in_rule__Mixin__Alternatives_04528); 
                     after(grammarAccess.getMixinAccess().getMixinKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2091:6: ( 'mix' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2091:6: ( 'mix' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2092:1: 'mix'
                    {
                     before(grammarAccess.getMixinAccess().getMixKeyword_0_1()); 
                    match(input,61,FOLLOW_61_in_rule__Mixin__Alternatives_04548); 
                     after(grammarAccess.getMixinAccess().getMixKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2099:6: ( 'm' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2099:6: ( 'm' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2100:1: 'm'
                    {
                     before(grammarAccess.getMixinAccess().getMKeyword_0_2()); 
                    match(input,34,FOLLOW_34_in_rule__Mixin__Alternatives_04568); 
                     after(grammarAccess.getMixinAccess().getMKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Alternatives_0"


    // $ANTLR start "rule__Orderable__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2112:1: rule__Orderable__Alternatives_0 : ( ( 'orderable' ) | ( 'ord' ) | ( 'o' ) );
    public final void rule__Orderable__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2116:1: ( ( 'orderable' ) | ( 'ord' ) | ( 'o' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt32=1;
                }
                break;
            case 63:
                {
                alt32=2;
                }
                break;
            case 64:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2117:1: ( 'orderable' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2117:1: ( 'orderable' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2118:1: 'orderable'
                    {
                     before(grammarAccess.getOrderableAccess().getOrderableKeyword_0_0()); 
                    match(input,62,FOLLOW_62_in_rule__Orderable__Alternatives_04603); 
                     after(grammarAccess.getOrderableAccess().getOrderableKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2125:6: ( 'ord' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2125:6: ( 'ord' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2126:1: 'ord'
                    {
                     before(grammarAccess.getOrderableAccess().getOrdKeyword_0_1()); 
                    match(input,63,FOLLOW_63_in_rule__Orderable__Alternatives_04623); 
                     after(grammarAccess.getOrderableAccess().getOrdKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2133:6: ( 'o' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2133:6: ( 'o' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2134:1: 'o'
                    {
                     before(grammarAccess.getOrderableAccess().getOKeyword_0_2()); 
                    match(input,64,FOLLOW_64_in_rule__Orderable__Alternatives_04643); 
                     after(grammarAccess.getOrderableAccess().getOKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orderable__Alternatives_0"


    // $ANTLR start "rule__SuperTypes__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2146:1: rule__SuperTypes__Alternatives_1 : ( ( ruleJcrStringList ) | ( '?' ) );
    public final void rule__SuperTypes__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2150:1: ( ( ruleJcrStringList ) | ( '?' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_EXID)||LA33_0==61) ) {
                alt33=1;
            }
            else if ( (LA33_0==15) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2151:1: ( ruleJcrStringList )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2151:1: ( ruleJcrStringList )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2152:1: ruleJcrStringList
                    {
                     before(grammarAccess.getSuperTypesAccess().getJcrStringListParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleJcrStringList_in_rule__SuperTypes__Alternatives_14677);
                    ruleJcrStringList();

                    state._fsp--;

                     after(grammarAccess.getSuperTypesAccess().getJcrStringListParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2157:6: ( '?' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2157:6: ( '?' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2158:1: '?'
                    {
                     before(grammarAccess.getSuperTypesAccess().getQuestionMarkKeyword_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__SuperTypes__Alternatives_14695); 
                     after(grammarAccess.getSuperTypesAccess().getQuestionMarkKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypes__Alternatives_1"


    // $ANTLR start "rule__JcrString__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2170:1: rule__JcrString__Alternatives : ( ( RULE_STRING ) | ( ruleXiD ) );
    public final void rule__JcrString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2174:1: ( ( RULE_STRING ) | ( ruleXiD ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_EXID||LA34_0==61) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2175:1: ( RULE_STRING )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2175:1: ( RULE_STRING )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2176:1: RULE_STRING
                    {
                     before(grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JcrString__Alternatives4729); 
                     after(grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2181:6: ( ruleXiD )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2181:6: ( ruleXiD )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2182:1: ruleXiD
                    {
                     before(grammarAccess.getJcrStringAccess().getXiDParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXiD_in_rule__JcrString__Alternatives4746);
                    ruleXiD();

                    state._fsp--;

                     after(grammarAccess.getJcrStringAccess().getXiDParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JcrString__Alternatives"


    // $ANTLR start "rule__XiD__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2192:1: rule__XiD__Alternatives : ( ( RULE_EXID ) | ( 'mix' ) );
    public final void rule__XiD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2196:1: ( ( RULE_EXID ) | ( 'mix' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_EXID) ) {
                alt35=1;
            }
            else if ( (LA35_0==61) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2197:1: ( RULE_EXID )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2197:1: ( RULE_EXID )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2198:1: RULE_EXID
                    {
                     before(grammarAccess.getXiDAccess().getEXIDTerminalRuleCall_0()); 
                    match(input,RULE_EXID,FOLLOW_RULE_EXID_in_rule__XiD__Alternatives4778); 
                     after(grammarAccess.getXiDAccess().getEXIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2203:6: ( 'mix' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2203:6: ( 'mix' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2204:1: 'mix'
                    {
                     before(grammarAccess.getXiDAccess().getMixKeyword_1()); 
                    match(input,61,FOLLOW_61_in_rule__XiD__Alternatives4796); 
                     after(grammarAccess.getXiDAccess().getMixKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XiD__Alternatives"


    // $ANTLR start "rule__NodeTypeDef__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2218:1: rule__NodeTypeDef__Group__0 : rule__NodeTypeDef__Group__0__Impl rule__NodeTypeDef__Group__1 ;
    public final void rule__NodeTypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2222:1: ( rule__NodeTypeDef__Group__0__Impl rule__NodeTypeDef__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2223:2: rule__NodeTypeDef__Group__0__Impl rule__NodeTypeDef__Group__1
            {
            pushFollow(FOLLOW_rule__NodeTypeDef__Group__0__Impl_in_rule__NodeTypeDef__Group__04828);
            rule__NodeTypeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDef__Group__1_in_rule__NodeTypeDef__Group__04831);
            rule__NodeTypeDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDef__Group__0"


    // $ANTLR start "rule__NodeTypeDef__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2230:1: rule__NodeTypeDef__Group__0__Impl : ( ruleNodeTypeName ) ;
    public final void rule__NodeTypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2234:1: ( ( ruleNodeTypeName ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2235:1: ( ruleNodeTypeName )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2235:1: ( ruleNodeTypeName )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2236:1: ruleNodeTypeName
            {
             before(grammarAccess.getNodeTypeDefAccess().getNodeTypeNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNodeTypeName_in_rule__NodeTypeDef__Group__0__Impl4858);
            ruleNodeTypeName();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefAccess().getNodeTypeNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDef__Group__0__Impl"


    // $ANTLR start "rule__NodeTypeDef__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2247:1: rule__NodeTypeDef__Group__1 : rule__NodeTypeDef__Group__1__Impl rule__NodeTypeDef__Group__2 ;
    public final void rule__NodeTypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2251:1: ( rule__NodeTypeDef__Group__1__Impl rule__NodeTypeDef__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2252:2: rule__NodeTypeDef__Group__1__Impl rule__NodeTypeDef__Group__2
            {
            pushFollow(FOLLOW_rule__NodeTypeDef__Group__1__Impl_in_rule__NodeTypeDef__Group__14887);
            rule__NodeTypeDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDef__Group__2_in_rule__NodeTypeDef__Group__14890);
            rule__NodeTypeDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDef__Group__1"


    // $ANTLR start "rule__NodeTypeDef__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2259:1: rule__NodeTypeDef__Group__1__Impl : ( ( ruleSuperTypes )? ) ;
    public final void rule__NodeTypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2263:1: ( ( ( ruleSuperTypes )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2264:1: ( ( ruleSuperTypes )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2264:1: ( ( ruleSuperTypes )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2265:1: ( ruleSuperTypes )?
            {
             before(grammarAccess.getNodeTypeDefAccess().getSuperTypesParserRuleCall_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2266:1: ( ruleSuperTypes )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==72) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2266:3: ruleSuperTypes
                    {
                    pushFollow(FOLLOW_ruleSuperTypes_in_rule__NodeTypeDef__Group__1__Impl4918);
                    ruleSuperTypes();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTypeDefAccess().getSuperTypesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDef__Group__1__Impl"


    // $ANTLR start "rule__NodeTypeDef__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2276:1: rule__NodeTypeDef__Group__2 : rule__NodeTypeDef__Group__2__Impl rule__NodeTypeDef__Group__3 ;
    public final void rule__NodeTypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2280:1: ( rule__NodeTypeDef__Group__2__Impl rule__NodeTypeDef__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2281:2: rule__NodeTypeDef__Group__2__Impl rule__NodeTypeDef__Group__3
            {
            pushFollow(FOLLOW_rule__NodeTypeDef__Group__2__Impl_in_rule__NodeTypeDef__Group__24949);
            rule__NodeTypeDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDef__Group__3_in_rule__NodeTypeDef__Group__24952);
            rule__NodeTypeDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDef__Group__2"


    // $ANTLR start "rule__NodeTypeDef__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2288:1: rule__NodeTypeDef__Group__2__Impl : ( ( rule__NodeTypeDef__AttributesAssignment_2 )* ) ;
    public final void rule__NodeTypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2292:1: ( ( ( rule__NodeTypeDef__AttributesAssignment_2 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2293:1: ( ( rule__NodeTypeDef__AttributesAssignment_2 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2293:1: ( ( rule__NodeTypeDef__AttributesAssignment_2 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2294:1: ( rule__NodeTypeDef__AttributesAssignment_2 )*
            {
             before(grammarAccess.getNodeTypeDefAccess().getAttributesAssignment_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2295:1: ( rule__NodeTypeDef__AttributesAssignment_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==34||LA37_0==37||LA37_0==39||(LA37_0>=53 && LA37_0<=64)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2295:2: rule__NodeTypeDef__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__NodeTypeDef__AttributesAssignment_2_in_rule__NodeTypeDef__Group__2__Impl4979);
            	    rule__NodeTypeDef__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getNodeTypeDefAccess().getAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDef__Group__2__Impl"


    // $ANTLR start "rule__NodeTypeDef__Group__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2305:1: rule__NodeTypeDef__Group__3 : rule__NodeTypeDef__Group__3__Impl ;
    public final void rule__NodeTypeDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2309:1: ( rule__NodeTypeDef__Group__3__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2310:2: rule__NodeTypeDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDef__Group__3__Impl_in_rule__NodeTypeDef__Group__35010);
            rule__NodeTypeDef__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDef__Group__3"


    // $ANTLR start "rule__NodeTypeDef__Group__3__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2316:1: rule__NodeTypeDef__Group__3__Impl : ( ( rule__NodeTypeDef__Alternatives_3 )* ) ;
    public final void rule__NodeTypeDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2320:1: ( ( ( rule__NodeTypeDef__Alternatives_3 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2321:1: ( ( rule__NodeTypeDef__Alternatives_3 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2321:1: ( ( rule__NodeTypeDef__Alternatives_3 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2322:1: ( rule__NodeTypeDef__Alternatives_3 )*
            {
             before(grammarAccess.getNodeTypeDefAccess().getAlternatives_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2323:1: ( rule__NodeTypeDef__Alternatives_3 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==68||LA38_0==71) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2323:2: rule__NodeTypeDef__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__NodeTypeDef__Alternatives_3_in_rule__NodeTypeDef__Group__3__Impl5037);
            	    rule__NodeTypeDef__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getNodeTypeDefAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDef__Group__3__Impl"


    // $ANTLR start "rule__ChildNodeDef__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2341:1: rule__ChildNodeDef__Group__0 : rule__ChildNodeDef__Group__0__Impl rule__ChildNodeDef__Group__1 ;
    public final void rule__ChildNodeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2345:1: ( rule__ChildNodeDef__Group__0__Impl rule__ChildNodeDef__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2346:2: rule__ChildNodeDef__Group__0__Impl rule__ChildNodeDef__Group__1
            {
            pushFollow(FOLLOW_rule__ChildNodeDef__Group__0__Impl_in_rule__ChildNodeDef__Group__05076);
            rule__ChildNodeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChildNodeDef__Group__1_in_rule__ChildNodeDef__Group__05079);
            rule__ChildNodeDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildNodeDef__Group__0"


    // $ANTLR start "rule__ChildNodeDef__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2353:1: rule__ChildNodeDef__Group__0__Impl : ( ruleNodeName ) ;
    public final void rule__ChildNodeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2357:1: ( ( ruleNodeName ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2358:1: ( ruleNodeName )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2358:1: ( ruleNodeName )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2359:1: ruleNodeName
            {
             before(grammarAccess.getChildNodeDefAccess().getNodeNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNodeName_in_rule__ChildNodeDef__Group__0__Impl5106);
            ruleNodeName();

            state._fsp--;

             after(grammarAccess.getChildNodeDefAccess().getNodeNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildNodeDef__Group__0__Impl"


    // $ANTLR start "rule__ChildNodeDef__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2370:1: rule__ChildNodeDef__Group__1 : rule__ChildNodeDef__Group__1__Impl rule__ChildNodeDef__Group__2 ;
    public final void rule__ChildNodeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2374:1: ( rule__ChildNodeDef__Group__1__Impl rule__ChildNodeDef__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2375:2: rule__ChildNodeDef__Group__1__Impl rule__ChildNodeDef__Group__2
            {
            pushFollow(FOLLOW_rule__ChildNodeDef__Group__1__Impl_in_rule__ChildNodeDef__Group__15135);
            rule__ChildNodeDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChildNodeDef__Group__2_in_rule__ChildNodeDef__Group__15138);
            rule__ChildNodeDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildNodeDef__Group__1"


    // $ANTLR start "rule__ChildNodeDef__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2382:1: rule__ChildNodeDef__Group__1__Impl : ( ( ruleRequiredTypes )? ) ;
    public final void rule__ChildNodeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2386:1: ( ( ( ruleRequiredTypes )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2387:1: ( ( ruleRequiredTypes )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2387:1: ( ( ruleRequiredTypes )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2388:1: ( ruleRequiredTypes )?
            {
             before(grammarAccess.getChildNodeDefAccess().getRequiredTypesParserRuleCall_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2389:1: ( ruleRequiredTypes )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==66) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2389:3: ruleRequiredTypes
                    {
                    pushFollow(FOLLOW_ruleRequiredTypes_in_rule__ChildNodeDef__Group__1__Impl5166);
                    ruleRequiredTypes();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChildNodeDefAccess().getRequiredTypesParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildNodeDef__Group__1__Impl"


    // $ANTLR start "rule__ChildNodeDef__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2399:1: rule__ChildNodeDef__Group__2 : rule__ChildNodeDef__Group__2__Impl rule__ChildNodeDef__Group__3 ;
    public final void rule__ChildNodeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2403:1: ( rule__ChildNodeDef__Group__2__Impl rule__ChildNodeDef__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2404:2: rule__ChildNodeDef__Group__2__Impl rule__ChildNodeDef__Group__3
            {
            pushFollow(FOLLOW_rule__ChildNodeDef__Group__2__Impl_in_rule__ChildNodeDef__Group__25197);
            rule__ChildNodeDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChildNodeDef__Group__3_in_rule__ChildNodeDef__Group__25200);
            rule__ChildNodeDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildNodeDef__Group__2"


    // $ANTLR start "rule__ChildNodeDef__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2411:1: rule__ChildNodeDef__Group__2__Impl : ( ( ruleDefaultType )? ) ;
    public final void rule__ChildNodeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2415:1: ( ( ( ruleDefaultType )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2416:1: ( ( ruleDefaultType )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2416:1: ( ( ruleDefaultType )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2417:1: ( ruleDefaultType )?
            {
             before(grammarAccess.getChildNodeDefAccess().getDefaultTypeParserRuleCall_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2418:1: ( ruleDefaultType )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==65) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2418:3: ruleDefaultType
                    {
                    pushFollow(FOLLOW_ruleDefaultType_in_rule__ChildNodeDef__Group__2__Impl5228);
                    ruleDefaultType();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getChildNodeDefAccess().getDefaultTypeParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildNodeDef__Group__2__Impl"


    // $ANTLR start "rule__ChildNodeDef__Group__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2428:1: rule__ChildNodeDef__Group__3 : rule__ChildNodeDef__Group__3__Impl ;
    public final void rule__ChildNodeDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2432:1: ( rule__ChildNodeDef__Group__3__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2433:2: rule__ChildNodeDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ChildNodeDef__Group__3__Impl_in_rule__ChildNodeDef__Group__35259);
            rule__ChildNodeDef__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildNodeDef__Group__3"


    // $ANTLR start "rule__ChildNodeDef__Group__3__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2439:1: rule__ChildNodeDef__Group__3__Impl : ( ( ruleNodeAttribute )* ) ;
    public final void rule__ChildNodeDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2443:1: ( ( ( ruleNodeAttribute )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2444:1: ( ( ruleNodeAttribute )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2444:1: ( ( ruleNodeAttribute )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2445:1: ( ruleNodeAttribute )*
            {
             before(grammarAccess.getChildNodeDefAccess().getNodeAttributeParserRuleCall_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2446:1: ( ruleNodeAttribute )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=12 && LA41_0<=14)||(LA41_0>=23 && LA41_0<=37)||LA41_0==70) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2446:3: ruleNodeAttribute
            	    {
            	    pushFollow(FOLLOW_ruleNodeAttribute_in_rule__ChildNodeDef__Group__3__Impl5287);
            	    ruleNodeAttribute();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getChildNodeDefAccess().getNodeAttributeParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildNodeDef__Group__3__Impl"


    // $ANTLR start "rule__Sns__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2464:1: rule__Sns__Group__0 : rule__Sns__Group__0__Impl rule__Sns__Group__1 ;
    public final void rule__Sns__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2468:1: ( rule__Sns__Group__0__Impl rule__Sns__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2469:2: rule__Sns__Group__0__Impl rule__Sns__Group__1
            {
            pushFollow(FOLLOW_rule__Sns__Group__0__Impl_in_rule__Sns__Group__05326);
            rule__Sns__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sns__Group__1_in_rule__Sns__Group__05329);
            rule__Sns__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sns__Group__0"


    // $ANTLR start "rule__Sns__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2476:1: rule__Sns__Group__0__Impl : ( ( rule__Sns__Alternatives_0 ) ) ;
    public final void rule__Sns__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2480:1: ( ( ( rule__Sns__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2481:1: ( ( rule__Sns__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2481:1: ( ( rule__Sns__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2482:1: ( rule__Sns__Alternatives_0 )
            {
             before(grammarAccess.getSnsAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2483:1: ( rule__Sns__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2483:2: rule__Sns__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Sns__Alternatives_0_in_rule__Sns__Group__0__Impl5356);
            rule__Sns__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSnsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sns__Group__0__Impl"


    // $ANTLR start "rule__Sns__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2493:1: rule__Sns__Group__1 : rule__Sns__Group__1__Impl ;
    public final void rule__Sns__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2497:1: ( rule__Sns__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2498:2: rule__Sns__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sns__Group__1__Impl_in_rule__Sns__Group__15386);
            rule__Sns__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sns__Group__1"


    // $ANTLR start "rule__Sns__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2504:1: rule__Sns__Group__1__Impl : ( ( '?' )? ) ;
    public final void rule__Sns__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2508:1: ( ( ( '?' )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2509:1: ( ( '?' )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2509:1: ( ( '?' )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2510:1: ( '?' )?
            {
             before(grammarAccess.getSnsAccess().getQuestionMarkKeyword_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2511:1: ( '?' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==15) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2512:2: '?'
                    {
                    match(input,15,FOLLOW_15_in_rule__Sns__Group__1__Impl5415); 

                    }
                    break;

            }

             after(grammarAccess.getSnsAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sns__Group__1__Impl"


    // $ANTLR start "rule__DefaultType__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2527:1: rule__DefaultType__Group__0 : rule__DefaultType__Group__0__Impl rule__DefaultType__Group__1 ;
    public final void rule__DefaultType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2531:1: ( rule__DefaultType__Group__0__Impl rule__DefaultType__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2532:2: rule__DefaultType__Group__0__Impl rule__DefaultType__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultType__Group__0__Impl_in_rule__DefaultType__Group__05452);
            rule__DefaultType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultType__Group__1_in_rule__DefaultType__Group__05455);
            rule__DefaultType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultType__Group__0"


    // $ANTLR start "rule__DefaultType__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2539:1: rule__DefaultType__Group__0__Impl : ( '=' ) ;
    public final void rule__DefaultType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2543:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2544:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2544:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2545:1: '='
            {
             before(grammarAccess.getDefaultTypeAccess().getEqualsSignKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__DefaultType__Group__0__Impl5483); 
             after(grammarAccess.getDefaultTypeAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultType__Group__0__Impl"


    // $ANTLR start "rule__DefaultType__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2558:1: rule__DefaultType__Group__1 : rule__DefaultType__Group__1__Impl ;
    public final void rule__DefaultType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2562:1: ( rule__DefaultType__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2563:2: rule__DefaultType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DefaultType__Group__1__Impl_in_rule__DefaultType__Group__15514);
            rule__DefaultType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultType__Group__1"


    // $ANTLR start "rule__DefaultType__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2569:1: rule__DefaultType__Group__1__Impl : ( ( rule__DefaultType__Alternatives_1 ) ) ;
    public final void rule__DefaultType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2573:1: ( ( ( rule__DefaultType__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2574:1: ( ( rule__DefaultType__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2574:1: ( ( rule__DefaultType__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2575:1: ( rule__DefaultType__Alternatives_1 )
            {
             before(grammarAccess.getDefaultTypeAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2576:1: ( rule__DefaultType__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2576:2: rule__DefaultType__Alternatives_1
            {
            pushFollow(FOLLOW_rule__DefaultType__Alternatives_1_in_rule__DefaultType__Group__1__Impl5541);
            rule__DefaultType__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultTypeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultType__Group__1__Impl"


    // $ANTLR start "rule__RequiredTypes__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2590:1: rule__RequiredTypes__Group__0 : rule__RequiredTypes__Group__0__Impl rule__RequiredTypes__Group__1 ;
    public final void rule__RequiredTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2594:1: ( rule__RequiredTypes__Group__0__Impl rule__RequiredTypes__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2595:2: rule__RequiredTypes__Group__0__Impl rule__RequiredTypes__Group__1
            {
            pushFollow(FOLLOW_rule__RequiredTypes__Group__0__Impl_in_rule__RequiredTypes__Group__05575);
            rule__RequiredTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredTypes__Group__1_in_rule__RequiredTypes__Group__05578);
            rule__RequiredTypes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredTypes__Group__0"


    // $ANTLR start "rule__RequiredTypes__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2602:1: rule__RequiredTypes__Group__0__Impl : ( '(' ) ;
    public final void rule__RequiredTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2606:1: ( ( '(' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2607:1: ( '(' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2607:1: ( '(' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2608:1: '('
            {
             before(grammarAccess.getRequiredTypesAccess().getLeftParenthesisKeyword_0()); 
            match(input,66,FOLLOW_66_in_rule__RequiredTypes__Group__0__Impl5606); 
             after(grammarAccess.getRequiredTypesAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredTypes__Group__0__Impl"


    // $ANTLR start "rule__RequiredTypes__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2621:1: rule__RequiredTypes__Group__1 : rule__RequiredTypes__Group__1__Impl rule__RequiredTypes__Group__2 ;
    public final void rule__RequiredTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2625:1: ( rule__RequiredTypes__Group__1__Impl rule__RequiredTypes__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2626:2: rule__RequiredTypes__Group__1__Impl rule__RequiredTypes__Group__2
            {
            pushFollow(FOLLOW_rule__RequiredTypes__Group__1__Impl_in_rule__RequiredTypes__Group__15637);
            rule__RequiredTypes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RequiredTypes__Group__2_in_rule__RequiredTypes__Group__15640);
            rule__RequiredTypes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredTypes__Group__1"


    // $ANTLR start "rule__RequiredTypes__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2633:1: rule__RequiredTypes__Group__1__Impl : ( ( rule__RequiredTypes__Alternatives_1 ) ) ;
    public final void rule__RequiredTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2637:1: ( ( ( rule__RequiredTypes__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2638:1: ( ( rule__RequiredTypes__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2638:1: ( ( rule__RequiredTypes__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2639:1: ( rule__RequiredTypes__Alternatives_1 )
            {
             before(grammarAccess.getRequiredTypesAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2640:1: ( rule__RequiredTypes__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2640:2: rule__RequiredTypes__Alternatives_1
            {
            pushFollow(FOLLOW_rule__RequiredTypes__Alternatives_1_in_rule__RequiredTypes__Group__1__Impl5667);
            rule__RequiredTypes__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRequiredTypesAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredTypes__Group__1__Impl"


    // $ANTLR start "rule__RequiredTypes__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2650:1: rule__RequiredTypes__Group__2 : rule__RequiredTypes__Group__2__Impl ;
    public final void rule__RequiredTypes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2654:1: ( rule__RequiredTypes__Group__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2655:2: rule__RequiredTypes__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RequiredTypes__Group__2__Impl_in_rule__RequiredTypes__Group__25697);
            rule__RequiredTypes__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredTypes__Group__2"


    // $ANTLR start "rule__RequiredTypes__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2661:1: rule__RequiredTypes__Group__2__Impl : ( ')' ) ;
    public final void rule__RequiredTypes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2665:1: ( ( ')' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2666:1: ( ')' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2666:1: ( ')' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2667:1: ')'
            {
             before(grammarAccess.getRequiredTypesAccess().getRightParenthesisKeyword_2()); 
            match(input,67,FOLLOW_67_in_rule__RequiredTypes__Group__2__Impl5725); 
             after(grammarAccess.getRequiredTypesAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredTypes__Group__2__Impl"


    // $ANTLR start "rule__NodeName__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2686:1: rule__NodeName__Group__0 : rule__NodeName__Group__0__Impl rule__NodeName__Group__1 ;
    public final void rule__NodeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2690:1: ( rule__NodeName__Group__0__Impl rule__NodeName__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2691:2: rule__NodeName__Group__0__Impl rule__NodeName__Group__1
            {
            pushFollow(FOLLOW_rule__NodeName__Group__0__Impl_in_rule__NodeName__Group__05762);
            rule__NodeName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeName__Group__1_in_rule__NodeName__Group__05765);
            rule__NodeName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeName__Group__0"


    // $ANTLR start "rule__NodeName__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2698:1: rule__NodeName__Group__0__Impl : ( '+' ) ;
    public final void rule__NodeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2702:1: ( ( '+' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2703:1: ( '+' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2703:1: ( '+' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2704:1: '+'
            {
             before(grammarAccess.getNodeNameAccess().getPlusSignKeyword_0()); 
            match(input,68,FOLLOW_68_in_rule__NodeName__Group__0__Impl5793); 
             after(grammarAccess.getNodeNameAccess().getPlusSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeName__Group__0__Impl"


    // $ANTLR start "rule__NodeName__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2717:1: rule__NodeName__Group__1 : rule__NodeName__Group__1__Impl ;
    public final void rule__NodeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2721:1: ( rule__NodeName__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2722:2: rule__NodeName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeName__Group__1__Impl_in_rule__NodeName__Group__15824);
            rule__NodeName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeName__Group__1"


    // $ANTLR start "rule__NodeName__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2728:1: rule__NodeName__Group__1__Impl : ( ( rule__NodeName__Alternatives_1 ) ) ;
    public final void rule__NodeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2732:1: ( ( ( rule__NodeName__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2733:1: ( ( rule__NodeName__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2733:1: ( ( rule__NodeName__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2734:1: ( rule__NodeName__Alternatives_1 )
            {
             before(grammarAccess.getNodeNameAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2735:1: ( rule__NodeName__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2735:2: rule__NodeName__Alternatives_1
            {
            pushFollow(FOLLOW_rule__NodeName__Alternatives_1_in_rule__NodeName__Group__1__Impl5851);
            rule__NodeName__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeNameAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeName__Group__1__Impl"


    // $ANTLR start "rule__PropertyDef__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2749:1: rule__PropertyDef__Group__0 : rule__PropertyDef__Group__0__Impl rule__PropertyDef__Group__1 ;
    public final void rule__PropertyDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2753:1: ( rule__PropertyDef__Group__0__Impl rule__PropertyDef__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2754:2: rule__PropertyDef__Group__0__Impl rule__PropertyDef__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDef__Group__0__Impl_in_rule__PropertyDef__Group__05885);
            rule__PropertyDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDef__Group__1_in_rule__PropertyDef__Group__05888);
            rule__PropertyDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDef__Group__0"


    // $ANTLR start "rule__PropertyDef__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2761:1: rule__PropertyDef__Group__0__Impl : ( rulePropertyName ) ;
    public final void rule__PropertyDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2765:1: ( ( rulePropertyName ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2766:1: ( rulePropertyName )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2766:1: ( rulePropertyName )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2767:1: rulePropertyName
            {
             before(grammarAccess.getPropertyDefAccess().getPropertyNameParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePropertyName_in_rule__PropertyDef__Group__0__Impl5915);
            rulePropertyName();

            state._fsp--;

             after(grammarAccess.getPropertyDefAccess().getPropertyNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDef__Group__0__Impl"


    // $ANTLR start "rule__PropertyDef__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2778:1: rule__PropertyDef__Group__1 : rule__PropertyDef__Group__1__Impl rule__PropertyDef__Group__2 ;
    public final void rule__PropertyDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2782:1: ( rule__PropertyDef__Group__1__Impl rule__PropertyDef__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2783:2: rule__PropertyDef__Group__1__Impl rule__PropertyDef__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDef__Group__1__Impl_in_rule__PropertyDef__Group__15944);
            rule__PropertyDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDef__Group__2_in_rule__PropertyDef__Group__15947);
            rule__PropertyDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDef__Group__1"


    // $ANTLR start "rule__PropertyDef__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2790:1: rule__PropertyDef__Group__1__Impl : ( ( rulePropertyType )? ) ;
    public final void rule__PropertyDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2794:1: ( ( ( rulePropertyType )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2795:1: ( ( rulePropertyType )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2795:1: ( ( rulePropertyType )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2796:1: ( rulePropertyType )?
            {
             before(grammarAccess.getPropertyDefAccess().getPropertyTypeParserRuleCall_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2797:1: ( rulePropertyType )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==66) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2797:3: rulePropertyType
                    {
                    pushFollow(FOLLOW_rulePropertyType_in_rule__PropertyDef__Group__1__Impl5975);
                    rulePropertyType();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefAccess().getPropertyTypeParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDef__Group__1__Impl"


    // $ANTLR start "rule__PropertyDef__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2807:1: rule__PropertyDef__Group__2 : rule__PropertyDef__Group__2__Impl rule__PropertyDef__Group__3 ;
    public final void rule__PropertyDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2811:1: ( rule__PropertyDef__Group__2__Impl rule__PropertyDef__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2812:2: rule__PropertyDef__Group__2__Impl rule__PropertyDef__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDef__Group__2__Impl_in_rule__PropertyDef__Group__26006);
            rule__PropertyDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDef__Group__3_in_rule__PropertyDef__Group__26009);
            rule__PropertyDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDef__Group__2"


    // $ANTLR start "rule__PropertyDef__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2819:1: rule__PropertyDef__Group__2__Impl : ( ( ruleDefaultValues )? ) ;
    public final void rule__PropertyDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2823:1: ( ( ( ruleDefaultValues )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2824:1: ( ( ruleDefaultValues )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2824:1: ( ( ruleDefaultValues )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2825:1: ( ruleDefaultValues )?
            {
             before(grammarAccess.getPropertyDefAccess().getDefaultValuesParserRuleCall_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2826:1: ( ruleDefaultValues )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==65) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2826:3: ruleDefaultValues
                    {
                    pushFollow(FOLLOW_ruleDefaultValues_in_rule__PropertyDef__Group__2__Impl6037);
                    ruleDefaultValues();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefAccess().getDefaultValuesParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDef__Group__2__Impl"


    // $ANTLR start "rule__PropertyDef__Group__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2836:1: rule__PropertyDef__Group__3 : rule__PropertyDef__Group__3__Impl rule__PropertyDef__Group__4 ;
    public final void rule__PropertyDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2840:1: ( rule__PropertyDef__Group__3__Impl rule__PropertyDef__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2841:2: rule__PropertyDef__Group__3__Impl rule__PropertyDef__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDef__Group__3__Impl_in_rule__PropertyDef__Group__36068);
            rule__PropertyDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDef__Group__4_in_rule__PropertyDef__Group__36071);
            rule__PropertyDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDef__Group__3"


    // $ANTLR start "rule__PropertyDef__Group__3__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2848:1: rule__PropertyDef__Group__3__Impl : ( ( rulePropertyAttribute )* ) ;
    public final void rule__PropertyDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2852:1: ( ( ( rulePropertyAttribute )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2853:1: ( ( rulePropertyAttribute )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2853:1: ( ( rulePropertyAttribute )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2854:1: ( rulePropertyAttribute )*
            {
             before(grammarAccess.getPropertyDefAccess().getPropertyAttributeParserRuleCall_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2855:1: ( rulePropertyAttribute )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=13 && LA45_0<=14)||(LA45_0>=16 && LA45_0<=39)||LA45_0==70) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2855:3: rulePropertyAttribute
            	    {
            	    pushFollow(FOLLOW_rulePropertyAttribute_in_rule__PropertyDef__Group__3__Impl6099);
            	    rulePropertyAttribute();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getPropertyDefAccess().getPropertyAttributeParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDef__Group__3__Impl"


    // $ANTLR start "rule__PropertyDef__Group__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2865:1: rule__PropertyDef__Group__4 : rule__PropertyDef__Group__4__Impl ;
    public final void rule__PropertyDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2869:1: ( rule__PropertyDef__Group__4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2870:2: rule__PropertyDef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDef__Group__4__Impl_in_rule__PropertyDef__Group__46130);
            rule__PropertyDef__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDef__Group__4"


    // $ANTLR start "rule__PropertyDef__Group__4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2876:1: rule__PropertyDef__Group__4__Impl : ( ( ruleValueConstraints )? ) ;
    public final void rule__PropertyDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2880:1: ( ( ( ruleValueConstraints )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2881:1: ( ( ruleValueConstraints )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2881:1: ( ( ruleValueConstraints )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2882:1: ( ruleValueConstraints )?
            {
             before(grammarAccess.getPropertyDefAccess().getValueConstraintsParserRuleCall_4()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2883:1: ( ruleValueConstraints )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==69) ) {
                switch ( input.LA(2) ) {
                    case RULE_STRING:
                    case 15:
                        {
                        alt46=1;
                        }
                        break;
                    case RULE_EXID:
                        {
                        int LA46_4 = input.LA(3);

                        if ( (LA46_4==EOF||(LA46_4>=68 && LA46_4<=69)||LA46_4==71||LA46_4==73||LA46_4==75) ) {
                            alt46=1;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA46_5 = input.LA(3);

                        if ( (LA46_5==EOF||(LA46_5>=68 && LA46_5<=69)||LA46_5==71||LA46_5==73||LA46_5==75) ) {
                            alt46=1;
                        }
                        }
                        break;
                }

            }
            switch (alt46) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2883:3: ruleValueConstraints
                    {
                    pushFollow(FOLLOW_ruleValueConstraints_in_rule__PropertyDef__Group__4__Impl6158);
                    ruleValueConstraints();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefAccess().getValueConstraintsParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDef__Group__4__Impl"


    // $ANTLR start "rule__ValueConstraints__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2903:1: rule__ValueConstraints__Group__0 : rule__ValueConstraints__Group__0__Impl rule__ValueConstraints__Group__1 ;
    public final void rule__ValueConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2907:1: ( rule__ValueConstraints__Group__0__Impl rule__ValueConstraints__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2908:2: rule__ValueConstraints__Group__0__Impl rule__ValueConstraints__Group__1
            {
            pushFollow(FOLLOW_rule__ValueConstraints__Group__0__Impl_in_rule__ValueConstraints__Group__06199);
            rule__ValueConstraints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ValueConstraints__Group__1_in_rule__ValueConstraints__Group__06202);
            rule__ValueConstraints__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueConstraints__Group__0"


    // $ANTLR start "rule__ValueConstraints__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2915:1: rule__ValueConstraints__Group__0__Impl : ( '<' ) ;
    public final void rule__ValueConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2919:1: ( ( '<' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2920:1: ( '<' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2920:1: ( '<' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2921:1: '<'
            {
             before(grammarAccess.getValueConstraintsAccess().getLessThanSignKeyword_0()); 
            match(input,69,FOLLOW_69_in_rule__ValueConstraints__Group__0__Impl6230); 
             after(grammarAccess.getValueConstraintsAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueConstraints__Group__0__Impl"


    // $ANTLR start "rule__ValueConstraints__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2934:1: rule__ValueConstraints__Group__1 : rule__ValueConstraints__Group__1__Impl ;
    public final void rule__ValueConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2938:1: ( rule__ValueConstraints__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2939:2: rule__ValueConstraints__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ValueConstraints__Group__1__Impl_in_rule__ValueConstraints__Group__16261);
            rule__ValueConstraints__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueConstraints__Group__1"


    // $ANTLR start "rule__ValueConstraints__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2945:1: rule__ValueConstraints__Group__1__Impl : ( ( rule__ValueConstraints__Alternatives_1 ) ) ;
    public final void rule__ValueConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2949:1: ( ( ( rule__ValueConstraints__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2950:1: ( ( rule__ValueConstraints__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2950:1: ( ( rule__ValueConstraints__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2951:1: ( rule__ValueConstraints__Alternatives_1 )
            {
             before(grammarAccess.getValueConstraintsAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2952:1: ( rule__ValueConstraints__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2952:2: rule__ValueConstraints__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ValueConstraints__Alternatives_1_in_rule__ValueConstraints__Group__1__Impl6288);
            rule__ValueConstraints__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getValueConstraintsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueConstraints__Group__1__Impl"


    // $ANTLR start "rule__NoQueryOrder__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2966:1: rule__NoQueryOrder__Group__0 : rule__NoQueryOrder__Group__0__Impl rule__NoQueryOrder__Group__1 ;
    public final void rule__NoQueryOrder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2970:1: ( rule__NoQueryOrder__Group__0__Impl rule__NoQueryOrder__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2971:2: rule__NoQueryOrder__Group__0__Impl rule__NoQueryOrder__Group__1
            {
            pushFollow(FOLLOW_rule__NoQueryOrder__Group__0__Impl_in_rule__NoQueryOrder__Group__06322);
            rule__NoQueryOrder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoQueryOrder__Group__1_in_rule__NoQueryOrder__Group__06325);
            rule__NoQueryOrder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoQueryOrder__Group__0"


    // $ANTLR start "rule__NoQueryOrder__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2978:1: rule__NoQueryOrder__Group__0__Impl : ( ( rule__NoQueryOrder__Alternatives_0 ) ) ;
    public final void rule__NoQueryOrder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2982:1: ( ( ( rule__NoQueryOrder__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2983:1: ( ( rule__NoQueryOrder__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2983:1: ( ( rule__NoQueryOrder__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2984:1: ( rule__NoQueryOrder__Alternatives_0 )
            {
             before(grammarAccess.getNoQueryOrderAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2985:1: ( rule__NoQueryOrder__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2985:2: rule__NoQueryOrder__Alternatives_0
            {
            pushFollow(FOLLOW_rule__NoQueryOrder__Alternatives_0_in_rule__NoQueryOrder__Group__0__Impl6352);
            rule__NoQueryOrder__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNoQueryOrderAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoQueryOrder__Group__0__Impl"


    // $ANTLR start "rule__NoQueryOrder__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2995:1: rule__NoQueryOrder__Group__1 : rule__NoQueryOrder__Group__1__Impl ;
    public final void rule__NoQueryOrder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2999:1: ( rule__NoQueryOrder__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3000:2: rule__NoQueryOrder__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NoQueryOrder__Group__1__Impl_in_rule__NoQueryOrder__Group__16382);
            rule__NoQueryOrder__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoQueryOrder__Group__1"


    // $ANTLR start "rule__NoQueryOrder__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3006:1: rule__NoQueryOrder__Group__1__Impl : ( ( '?' )? ) ;
    public final void rule__NoQueryOrder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3010:1: ( ( ( '?' )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3011:1: ( ( '?' )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3011:1: ( ( '?' )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3012:1: ( '?' )?
            {
             before(grammarAccess.getNoQueryOrderAccess().getQuestionMarkKeyword_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3013:1: ( '?' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==15) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3014:2: '?'
                    {
                    match(input,15,FOLLOW_15_in_rule__NoQueryOrder__Group__1__Impl6411); 

                    }
                    break;

            }

             after(grammarAccess.getNoQueryOrderAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoQueryOrder__Group__1__Impl"


    // $ANTLR start "rule__NoFullText__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3029:1: rule__NoFullText__Group__0 : rule__NoFullText__Group__0__Impl rule__NoFullText__Group__1 ;
    public final void rule__NoFullText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3033:1: ( rule__NoFullText__Group__0__Impl rule__NoFullText__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3034:2: rule__NoFullText__Group__0__Impl rule__NoFullText__Group__1
            {
            pushFollow(FOLLOW_rule__NoFullText__Group__0__Impl_in_rule__NoFullText__Group__06448);
            rule__NoFullText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoFullText__Group__1_in_rule__NoFullText__Group__06451);
            rule__NoFullText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoFullText__Group__0"


    // $ANTLR start "rule__NoFullText__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3041:1: rule__NoFullText__Group__0__Impl : ( ( rule__NoFullText__Alternatives_0 ) ) ;
    public final void rule__NoFullText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3045:1: ( ( ( rule__NoFullText__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3046:1: ( ( rule__NoFullText__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3046:1: ( ( rule__NoFullText__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3047:1: ( rule__NoFullText__Alternatives_0 )
            {
             before(grammarAccess.getNoFullTextAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3048:1: ( rule__NoFullText__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3048:2: rule__NoFullText__Alternatives_0
            {
            pushFollow(FOLLOW_rule__NoFullText__Alternatives_0_in_rule__NoFullText__Group__0__Impl6478);
            rule__NoFullText__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getNoFullTextAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoFullText__Group__0__Impl"


    // $ANTLR start "rule__NoFullText__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3058:1: rule__NoFullText__Group__1 : rule__NoFullText__Group__1__Impl ;
    public final void rule__NoFullText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3062:1: ( rule__NoFullText__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3063:2: rule__NoFullText__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NoFullText__Group__1__Impl_in_rule__NoFullText__Group__16508);
            rule__NoFullText__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoFullText__Group__1"


    // $ANTLR start "rule__NoFullText__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3069:1: rule__NoFullText__Group__1__Impl : ( ( '?' )? ) ;
    public final void rule__NoFullText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3073:1: ( ( ( '?' )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3074:1: ( ( '?' )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3074:1: ( ( '?' )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3075:1: ( '?' )?
            {
             before(grammarAccess.getNoFullTextAccess().getQuestionMarkKeyword_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3076:1: ( '?' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==15) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3077:2: '?'
                    {
                    match(input,15,FOLLOW_15_in_rule__NoFullText__Group__1__Impl6537); 

                    }
                    break;

            }

             after(grammarAccess.getNoFullTextAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoFullText__Group__1__Impl"


    // $ANTLR start "rule__QueryOps__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3092:1: rule__QueryOps__Group__0 : rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1 ;
    public final void rule__QueryOps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3096:1: ( rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3097:2: rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1
            {
            pushFollow(FOLLOW_rule__QueryOps__Group__0__Impl_in_rule__QueryOps__Group__06574);
            rule__QueryOps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryOps__Group__1_in_rule__QueryOps__Group__06577);
            rule__QueryOps__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOps__Group__0"


    // $ANTLR start "rule__QueryOps__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3104:1: rule__QueryOps__Group__0__Impl : ( ( rule__QueryOps__Alternatives_0 ) ) ;
    public final void rule__QueryOps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3108:1: ( ( ( rule__QueryOps__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3109:1: ( ( rule__QueryOps__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3109:1: ( ( rule__QueryOps__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3110:1: ( rule__QueryOps__Alternatives_0 )
            {
             before(grammarAccess.getQueryOpsAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3111:1: ( rule__QueryOps__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3111:2: rule__QueryOps__Alternatives_0
            {
            pushFollow(FOLLOW_rule__QueryOps__Alternatives_0_in_rule__QueryOps__Group__0__Impl6604);
            rule__QueryOps__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryOpsAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOps__Group__0__Impl"


    // $ANTLR start "rule__QueryOps__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3121:1: rule__QueryOps__Group__1 : rule__QueryOps__Group__1__Impl ;
    public final void rule__QueryOps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3125:1: ( rule__QueryOps__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3126:2: rule__QueryOps__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QueryOps__Group__1__Impl_in_rule__QueryOps__Group__16634);
            rule__QueryOps__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOps__Group__1"


    // $ANTLR start "rule__QueryOps__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3132:1: rule__QueryOps__Group__1__Impl : ( ( rule__QueryOps__Alternatives_1 ) ) ;
    public final void rule__QueryOps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3136:1: ( ( ( rule__QueryOps__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3137:1: ( ( rule__QueryOps__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3137:1: ( ( rule__QueryOps__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3138:1: ( rule__QueryOps__Alternatives_1 )
            {
             before(grammarAccess.getQueryOpsAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3139:1: ( rule__QueryOps__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3139:2: rule__QueryOps__Alternatives_1
            {
            pushFollow(FOLLOW_rule__QueryOps__Alternatives_1_in_rule__QueryOps__Group__1__Impl6661);
            rule__QueryOps__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryOpsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOps__Group__1__Impl"


    // $ANTLR start "rule__Multiple__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3153:1: rule__Multiple__Group__0 : rule__Multiple__Group__0__Impl rule__Multiple__Group__1 ;
    public final void rule__Multiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3157:1: ( rule__Multiple__Group__0__Impl rule__Multiple__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3158:2: rule__Multiple__Group__0__Impl rule__Multiple__Group__1
            {
            pushFollow(FOLLOW_rule__Multiple__Group__0__Impl_in_rule__Multiple__Group__06695);
            rule__Multiple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiple__Group__1_in_rule__Multiple__Group__06698);
            rule__Multiple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__0"


    // $ANTLR start "rule__Multiple__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3165:1: rule__Multiple__Group__0__Impl : ( ( rule__Multiple__Alternatives_0 ) ) ;
    public final void rule__Multiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3169:1: ( ( ( rule__Multiple__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3170:1: ( ( rule__Multiple__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3170:1: ( ( rule__Multiple__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3171:1: ( rule__Multiple__Alternatives_0 )
            {
             before(grammarAccess.getMultipleAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3172:1: ( rule__Multiple__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3172:2: rule__Multiple__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Multiple__Alternatives_0_in_rule__Multiple__Group__0__Impl6725);
            rule__Multiple__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__0__Impl"


    // $ANTLR start "rule__Multiple__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3182:1: rule__Multiple__Group__1 : rule__Multiple__Group__1__Impl ;
    public final void rule__Multiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3186:1: ( rule__Multiple__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3187:2: rule__Multiple__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiple__Group__1__Impl_in_rule__Multiple__Group__16755);
            rule__Multiple__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__1"


    // $ANTLR start "rule__Multiple__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3193:1: rule__Multiple__Group__1__Impl : ( ( '?' )? ) ;
    public final void rule__Multiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3197:1: ( ( ( '?' )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3198:1: ( ( '?' )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3198:1: ( ( '?' )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3199:1: ( '?' )?
            {
             before(grammarAccess.getMultipleAccess().getQuestionMarkKeyword_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3200:1: ( '?' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==15) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3201:2: '?'
                    {
                    match(input,15,FOLLOW_15_in_rule__Multiple__Group__1__Impl6784); 

                    }
                    break;

            }

             after(grammarAccess.getMultipleAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__1__Impl"


    // $ANTLR start "rule__Opv__Group_6__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3216:1: rule__Opv__Group_6__0 : rule__Opv__Group_6__0__Impl rule__Opv__Group_6__1 ;
    public final void rule__Opv__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3220:1: ( rule__Opv__Group_6__0__Impl rule__Opv__Group_6__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3221:2: rule__Opv__Group_6__0__Impl rule__Opv__Group_6__1
            {
            pushFollow(FOLLOW_rule__Opv__Group_6__0__Impl_in_rule__Opv__Group_6__06821);
            rule__Opv__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Opv__Group_6__1_in_rule__Opv__Group_6__06824);
            rule__Opv__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opv__Group_6__0"


    // $ANTLR start "rule__Opv__Group_6__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3228:1: rule__Opv__Group_6__0__Impl : ( 'OPV' ) ;
    public final void rule__Opv__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3232:1: ( ( 'OPV' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3233:1: ( 'OPV' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3233:1: ( 'OPV' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3234:1: 'OPV'
            {
             before(grammarAccess.getOpvAccess().getOPVKeyword_6_0()); 
            match(input,70,FOLLOW_70_in_rule__Opv__Group_6__0__Impl6852); 
             after(grammarAccess.getOpvAccess().getOPVKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opv__Group_6__0__Impl"


    // $ANTLR start "rule__Opv__Group_6__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3247:1: rule__Opv__Group_6__1 : rule__Opv__Group_6__1__Impl ;
    public final void rule__Opv__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3251:1: ( rule__Opv__Group_6__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3252:2: rule__Opv__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Opv__Group_6__1__Impl_in_rule__Opv__Group_6__16883);
            rule__Opv__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opv__Group_6__1"


    // $ANTLR start "rule__Opv__Group_6__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3258:1: rule__Opv__Group_6__1__Impl : ( '?' ) ;
    public final void rule__Opv__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3262:1: ( ( '?' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3263:1: ( '?' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3263:1: ( '?' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3264:1: '?'
            {
             before(grammarAccess.getOpvAccess().getQuestionMarkKeyword_6_1()); 
            match(input,15,FOLLOW_15_in_rule__Opv__Group_6__1__Impl6911); 
             after(grammarAccess.getOpvAccess().getQuestionMarkKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opv__Group_6__1__Impl"


    // $ANTLR start "rule__Protected__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3281:1: rule__Protected__Group__0 : rule__Protected__Group__0__Impl rule__Protected__Group__1 ;
    public final void rule__Protected__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3285:1: ( rule__Protected__Group__0__Impl rule__Protected__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3286:2: rule__Protected__Group__0__Impl rule__Protected__Group__1
            {
            pushFollow(FOLLOW_rule__Protected__Group__0__Impl_in_rule__Protected__Group__06946);
            rule__Protected__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Protected__Group__1_in_rule__Protected__Group__06949);
            rule__Protected__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protected__Group__0"


    // $ANTLR start "rule__Protected__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3293:1: rule__Protected__Group__0__Impl : ( ( rule__Protected__Alternatives_0 ) ) ;
    public final void rule__Protected__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3297:1: ( ( ( rule__Protected__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3298:1: ( ( rule__Protected__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3298:1: ( ( rule__Protected__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3299:1: ( rule__Protected__Alternatives_0 )
            {
             before(grammarAccess.getProtectedAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3300:1: ( rule__Protected__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3300:2: rule__Protected__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Protected__Alternatives_0_in_rule__Protected__Group__0__Impl6976);
            rule__Protected__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getProtectedAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protected__Group__0__Impl"


    // $ANTLR start "rule__Protected__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3310:1: rule__Protected__Group__1 : rule__Protected__Group__1__Impl ;
    public final void rule__Protected__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3314:1: ( rule__Protected__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3315:2: rule__Protected__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Protected__Group__1__Impl_in_rule__Protected__Group__17006);
            rule__Protected__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protected__Group__1"


    // $ANTLR start "rule__Protected__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3321:1: rule__Protected__Group__1__Impl : ( ( '?' )? ) ;
    public final void rule__Protected__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3325:1: ( ( ( '?' )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3326:1: ( ( '?' )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3326:1: ( ( '?' )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3327:1: ( '?' )?
            {
             before(grammarAccess.getProtectedAccess().getQuestionMarkKeyword_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3328:1: ( '?' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==15) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3329:2: '?'
                    {
                    match(input,15,FOLLOW_15_in_rule__Protected__Group__1__Impl7035); 

                    }
                    break;

            }

             after(grammarAccess.getProtectedAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protected__Group__1__Impl"


    // $ANTLR start "rule__Mandatory__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3344:1: rule__Mandatory__Group__0 : rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 ;
    public final void rule__Mandatory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3348:1: ( rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3349:2: rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__07072);
            rule__Mandatory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__07075);
            rule__Mandatory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0"


    // $ANTLR start "rule__Mandatory__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3356:1: rule__Mandatory__Group__0__Impl : ( ( rule__Mandatory__Alternatives_0 ) ) ;
    public final void rule__Mandatory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3360:1: ( ( ( rule__Mandatory__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3361:1: ( ( rule__Mandatory__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3361:1: ( ( rule__Mandatory__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3362:1: ( rule__Mandatory__Alternatives_0 )
            {
             before(grammarAccess.getMandatoryAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3363:1: ( rule__Mandatory__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3363:2: rule__Mandatory__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Mandatory__Alternatives_0_in_rule__Mandatory__Group__0__Impl7102);
            rule__Mandatory__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0__Impl"


    // $ANTLR start "rule__Mandatory__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3373:1: rule__Mandatory__Group__1 : rule__Mandatory__Group__1__Impl ;
    public final void rule__Mandatory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3377:1: ( rule__Mandatory__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3378:2: rule__Mandatory__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__17132);
            rule__Mandatory__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1"


    // $ANTLR start "rule__Mandatory__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3384:1: rule__Mandatory__Group__1__Impl : ( ( '?' )? ) ;
    public final void rule__Mandatory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3388:1: ( ( ( '?' )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3389:1: ( ( '?' )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3389:1: ( ( '?' )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3390:1: ( '?' )?
            {
             before(grammarAccess.getMandatoryAccess().getQuestionMarkKeyword_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3391:1: ( '?' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==15) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3392:2: '?'
                    {
                    match(input,15,FOLLOW_15_in_rule__Mandatory__Group__1__Impl7161); 

                    }
                    break;

            }

             after(grammarAccess.getMandatoryAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1__Impl"


    // $ANTLR start "rule__Autocreated__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3407:1: rule__Autocreated__Group__0 : rule__Autocreated__Group__0__Impl rule__Autocreated__Group__1 ;
    public final void rule__Autocreated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3411:1: ( rule__Autocreated__Group__0__Impl rule__Autocreated__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3412:2: rule__Autocreated__Group__0__Impl rule__Autocreated__Group__1
            {
            pushFollow(FOLLOW_rule__Autocreated__Group__0__Impl_in_rule__Autocreated__Group__07198);
            rule__Autocreated__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Autocreated__Group__1_in_rule__Autocreated__Group__07201);
            rule__Autocreated__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autocreated__Group__0"


    // $ANTLR start "rule__Autocreated__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3419:1: rule__Autocreated__Group__0__Impl : ( ( rule__Autocreated__Alternatives_0 ) ) ;
    public final void rule__Autocreated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3423:1: ( ( ( rule__Autocreated__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3424:1: ( ( rule__Autocreated__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3424:1: ( ( rule__Autocreated__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3425:1: ( rule__Autocreated__Alternatives_0 )
            {
             before(grammarAccess.getAutocreatedAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3426:1: ( rule__Autocreated__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3426:2: rule__Autocreated__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Autocreated__Alternatives_0_in_rule__Autocreated__Group__0__Impl7228);
            rule__Autocreated__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAutocreatedAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autocreated__Group__0__Impl"


    // $ANTLR start "rule__Autocreated__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3436:1: rule__Autocreated__Group__1 : rule__Autocreated__Group__1__Impl ;
    public final void rule__Autocreated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3440:1: ( rule__Autocreated__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3441:2: rule__Autocreated__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Autocreated__Group__1__Impl_in_rule__Autocreated__Group__17258);
            rule__Autocreated__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autocreated__Group__1"


    // $ANTLR start "rule__Autocreated__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3447:1: rule__Autocreated__Group__1__Impl : ( ( '?' )? ) ;
    public final void rule__Autocreated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3451:1: ( ( ( '?' )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3452:1: ( ( '?' )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3452:1: ( ( '?' )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3453:1: ( '?' )?
            {
             before(grammarAccess.getAutocreatedAccess().getQuestionMarkKeyword_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3454:1: ( '?' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==15) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3455:2: '?'
                    {
                    match(input,15,FOLLOW_15_in_rule__Autocreated__Group__1__Impl7287); 

                    }
                    break;

            }

             after(grammarAccess.getAutocreatedAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autocreated__Group__1__Impl"


    // $ANTLR start "rule__DefaultValues__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3470:1: rule__DefaultValues__Group__0 : rule__DefaultValues__Group__0__Impl rule__DefaultValues__Group__1 ;
    public final void rule__DefaultValues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3474:1: ( rule__DefaultValues__Group__0__Impl rule__DefaultValues__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3475:2: rule__DefaultValues__Group__0__Impl rule__DefaultValues__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultValues__Group__0__Impl_in_rule__DefaultValues__Group__07324);
            rule__DefaultValues__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultValues__Group__1_in_rule__DefaultValues__Group__07327);
            rule__DefaultValues__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValues__Group__0"


    // $ANTLR start "rule__DefaultValues__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3482:1: rule__DefaultValues__Group__0__Impl : ( '=' ) ;
    public final void rule__DefaultValues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3486:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3487:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3487:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3488:1: '='
            {
             before(grammarAccess.getDefaultValuesAccess().getEqualsSignKeyword_0()); 
            match(input,65,FOLLOW_65_in_rule__DefaultValues__Group__0__Impl7355); 
             after(grammarAccess.getDefaultValuesAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValues__Group__0__Impl"


    // $ANTLR start "rule__DefaultValues__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3501:1: rule__DefaultValues__Group__1 : rule__DefaultValues__Group__1__Impl ;
    public final void rule__DefaultValues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3505:1: ( rule__DefaultValues__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3506:2: rule__DefaultValues__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DefaultValues__Group__1__Impl_in_rule__DefaultValues__Group__17386);
            rule__DefaultValues__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValues__Group__1"


    // $ANTLR start "rule__DefaultValues__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3512:1: rule__DefaultValues__Group__1__Impl : ( ( rule__DefaultValues__Alternatives_1 ) ) ;
    public final void rule__DefaultValues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3516:1: ( ( ( rule__DefaultValues__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3517:1: ( ( rule__DefaultValues__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3517:1: ( ( rule__DefaultValues__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3518:1: ( rule__DefaultValues__Alternatives_1 )
            {
             before(grammarAccess.getDefaultValuesAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3519:1: ( rule__DefaultValues__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3519:2: rule__DefaultValues__Alternatives_1
            {
            pushFollow(FOLLOW_rule__DefaultValues__Alternatives_1_in_rule__DefaultValues__Group__1__Impl7413);
            rule__DefaultValues__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultValuesAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultValues__Group__1__Impl"


    // $ANTLR start "rule__PropertyType__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3533:1: rule__PropertyType__Group__0 : rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1 ;
    public final void rule__PropertyType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3537:1: ( rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3538:2: rule__PropertyType__Group__0__Impl rule__PropertyType__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyType__Group__0__Impl_in_rule__PropertyType__Group__07447);
            rule__PropertyType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyType__Group__1_in_rule__PropertyType__Group__07450);
            rule__PropertyType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__0"


    // $ANTLR start "rule__PropertyType__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3545:1: rule__PropertyType__Group__0__Impl : ( '(' ) ;
    public final void rule__PropertyType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3549:1: ( ( '(' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3550:1: ( '(' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3550:1: ( '(' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3551:1: '('
            {
             before(grammarAccess.getPropertyTypeAccess().getLeftParenthesisKeyword_0()); 
            match(input,66,FOLLOW_66_in_rule__PropertyType__Group__0__Impl7478); 
             after(grammarAccess.getPropertyTypeAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__0__Impl"


    // $ANTLR start "rule__PropertyType__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3564:1: rule__PropertyType__Group__1 : rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2 ;
    public final void rule__PropertyType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3568:1: ( rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3569:2: rule__PropertyType__Group__1__Impl rule__PropertyType__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyType__Group__1__Impl_in_rule__PropertyType__Group__17509);
            rule__PropertyType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyType__Group__2_in_rule__PropertyType__Group__17512);
            rule__PropertyType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__1"


    // $ANTLR start "rule__PropertyType__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3576:1: rule__PropertyType__Group__1__Impl : ( ( rule__PropertyType__Alternatives_1 ) ) ;
    public final void rule__PropertyType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3580:1: ( ( ( rule__PropertyType__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3581:1: ( ( rule__PropertyType__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3581:1: ( ( rule__PropertyType__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3582:1: ( rule__PropertyType__Alternatives_1 )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3583:1: ( rule__PropertyType__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3583:2: rule__PropertyType__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PropertyType__Alternatives_1_in_rule__PropertyType__Group__1__Impl7539);
            rule__PropertyType__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__1__Impl"


    // $ANTLR start "rule__PropertyType__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3593:1: rule__PropertyType__Group__2 : rule__PropertyType__Group__2__Impl ;
    public final void rule__PropertyType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3597:1: ( rule__PropertyType__Group__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3598:2: rule__PropertyType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyType__Group__2__Impl_in_rule__PropertyType__Group__27569);
            rule__PropertyType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__2"


    // $ANTLR start "rule__PropertyType__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3604:1: rule__PropertyType__Group__2__Impl : ( ')' ) ;
    public final void rule__PropertyType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3608:1: ( ( ')' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3609:1: ( ')' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3609:1: ( ')' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3610:1: ')'
            {
             before(grammarAccess.getPropertyTypeAccess().getRightParenthesisKeyword_2()); 
            match(input,67,FOLLOW_67_in_rule__PropertyType__Group__2__Impl7597); 
             after(grammarAccess.getPropertyTypeAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyType__Group__2__Impl"


    // $ANTLR start "rule__PropertyName__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3629:1: rule__PropertyName__Group__0 : rule__PropertyName__Group__0__Impl rule__PropertyName__Group__1 ;
    public final void rule__PropertyName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3633:1: ( rule__PropertyName__Group__0__Impl rule__PropertyName__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3634:2: rule__PropertyName__Group__0__Impl rule__PropertyName__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyName__Group__0__Impl_in_rule__PropertyName__Group__07634);
            rule__PropertyName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyName__Group__1_in_rule__PropertyName__Group__07637);
            rule__PropertyName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyName__Group__0"


    // $ANTLR start "rule__PropertyName__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3641:1: rule__PropertyName__Group__0__Impl : ( '-' ) ;
    public final void rule__PropertyName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3645:1: ( ( '-' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3646:1: ( '-' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3646:1: ( '-' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3647:1: '-'
            {
             before(grammarAccess.getPropertyNameAccess().getHyphenMinusKeyword_0()); 
            match(input,71,FOLLOW_71_in_rule__PropertyName__Group__0__Impl7665); 
             after(grammarAccess.getPropertyNameAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyName__Group__0__Impl"


    // $ANTLR start "rule__PropertyName__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3660:1: rule__PropertyName__Group__1 : rule__PropertyName__Group__1__Impl ;
    public final void rule__PropertyName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3664:1: ( rule__PropertyName__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3665:2: rule__PropertyName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyName__Group__1__Impl_in_rule__PropertyName__Group__17696);
            rule__PropertyName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyName__Group__1"


    // $ANTLR start "rule__PropertyName__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3671:1: rule__PropertyName__Group__1__Impl : ( ( rule__PropertyName__Alternatives_1 ) ) ;
    public final void rule__PropertyName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3675:1: ( ( ( rule__PropertyName__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3676:1: ( ( rule__PropertyName__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3676:1: ( ( rule__PropertyName__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3677:1: ( rule__PropertyName__Alternatives_1 )
            {
             before(grammarAccess.getPropertyNameAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3678:1: ( rule__PropertyName__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3678:2: rule__PropertyName__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PropertyName__Alternatives_1_in_rule__PropertyName__Group__1__Impl7723);
            rule__PropertyName__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyNameAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyName__Group__1__Impl"


    // $ANTLR start "rule__PrimaryItem__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3692:1: rule__PrimaryItem__Group__0 : rule__PrimaryItem__Group__0__Impl rule__PrimaryItem__Group__1 ;
    public final void rule__PrimaryItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3696:1: ( rule__PrimaryItem__Group__0__Impl rule__PrimaryItem__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3697:2: rule__PrimaryItem__Group__0__Impl rule__PrimaryItem__Group__1
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Group__0__Impl_in_rule__PrimaryItem__Group__07757);
            rule__PrimaryItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryItem__Group__1_in_rule__PrimaryItem__Group__07760);
            rule__PrimaryItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryItem__Group__0"


    // $ANTLR start "rule__PrimaryItem__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3704:1: rule__PrimaryItem__Group__0__Impl : ( ( rule__PrimaryItem__Alternatives_0 ) ) ;
    public final void rule__PrimaryItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3708:1: ( ( ( rule__PrimaryItem__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3709:1: ( ( rule__PrimaryItem__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3709:1: ( ( rule__PrimaryItem__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3710:1: ( rule__PrimaryItem__Alternatives_0 )
            {
             before(grammarAccess.getPrimaryItemAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3711:1: ( rule__PrimaryItem__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3711:2: rule__PrimaryItem__Alternatives_0
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Alternatives_0_in_rule__PrimaryItem__Group__0__Impl7787);
            rule__PrimaryItem__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryItemAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryItem__Group__0__Impl"


    // $ANTLR start "rule__PrimaryItem__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3721:1: rule__PrimaryItem__Group__1 : rule__PrimaryItem__Group__1__Impl ;
    public final void rule__PrimaryItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3725:1: ( rule__PrimaryItem__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3726:2: rule__PrimaryItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Group__1__Impl_in_rule__PrimaryItem__Group__17817);
            rule__PrimaryItem__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryItem__Group__1"


    // $ANTLR start "rule__PrimaryItem__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3732:1: rule__PrimaryItem__Group__1__Impl : ( ( rule__PrimaryItem__Alternatives_1 ) ) ;
    public final void rule__PrimaryItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3736:1: ( ( ( rule__PrimaryItem__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3737:1: ( ( rule__PrimaryItem__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3737:1: ( ( rule__PrimaryItem__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3738:1: ( rule__PrimaryItem__Alternatives_1 )
            {
             before(grammarAccess.getPrimaryItemAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3739:1: ( rule__PrimaryItem__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3739:2: rule__PrimaryItem__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Alternatives_1_in_rule__PrimaryItem__Group__1__Impl7844);
            rule__PrimaryItem__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryItemAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryItem__Group__1__Impl"


    // $ANTLR start "rule__Abstract__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3753:1: rule__Abstract__Group__0 : rule__Abstract__Group__0__Impl rule__Abstract__Group__1 ;
    public final void rule__Abstract__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3757:1: ( rule__Abstract__Group__0__Impl rule__Abstract__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3758:2: rule__Abstract__Group__0__Impl rule__Abstract__Group__1
            {
            pushFollow(FOLLOW_rule__Abstract__Group__0__Impl_in_rule__Abstract__Group__07878);
            rule__Abstract__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Abstract__Group__1_in_rule__Abstract__Group__07881);
            rule__Abstract__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstract__Group__0"


    // $ANTLR start "rule__Abstract__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3765:1: rule__Abstract__Group__0__Impl : ( ( rule__Abstract__Alternatives_0 ) ) ;
    public final void rule__Abstract__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3769:1: ( ( ( rule__Abstract__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3770:1: ( ( rule__Abstract__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3770:1: ( ( rule__Abstract__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3771:1: ( rule__Abstract__Alternatives_0 )
            {
             before(grammarAccess.getAbstractAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3772:1: ( rule__Abstract__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3772:2: rule__Abstract__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Abstract__Alternatives_0_in_rule__Abstract__Group__0__Impl7908);
            rule__Abstract__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstract__Group__0__Impl"


    // $ANTLR start "rule__Abstract__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3782:1: rule__Abstract__Group__1 : rule__Abstract__Group__1__Impl ;
    public final void rule__Abstract__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3786:1: ( rule__Abstract__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3787:2: rule__Abstract__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Abstract__Group__1__Impl_in_rule__Abstract__Group__17938);
            rule__Abstract__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstract__Group__1"


    // $ANTLR start "rule__Abstract__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3793:1: rule__Abstract__Group__1__Impl : ( ( '?' )? ) ;
    public final void rule__Abstract__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3797:1: ( ( ( '?' )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3798:1: ( ( '?' )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3798:1: ( ( '?' )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3799:1: ( '?' )?
            {
             before(grammarAccess.getAbstractAccess().getQuestionMarkKeyword_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3800:1: ( '?' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==15) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3801:2: '?'
                    {
                    match(input,15,FOLLOW_15_in_rule__Abstract__Group__1__Impl7967); 

                    }
                    break;

            }

             after(grammarAccess.getAbstractAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Abstract__Group__1__Impl"


    // $ANTLR start "rule__Mixin__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3816:1: rule__Mixin__Group__0 : rule__Mixin__Group__0__Impl rule__Mixin__Group__1 ;
    public final void rule__Mixin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3820:1: ( rule__Mixin__Group__0__Impl rule__Mixin__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3821:2: rule__Mixin__Group__0__Impl rule__Mixin__Group__1
            {
            pushFollow(FOLLOW_rule__Mixin__Group__0__Impl_in_rule__Mixin__Group__08004);
            rule__Mixin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mixin__Group__1_in_rule__Mixin__Group__08007);
            rule__Mixin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__0"


    // $ANTLR start "rule__Mixin__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3828:1: rule__Mixin__Group__0__Impl : ( ( rule__Mixin__Alternatives_0 ) ) ;
    public final void rule__Mixin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3832:1: ( ( ( rule__Mixin__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3833:1: ( ( rule__Mixin__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3833:1: ( ( rule__Mixin__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3834:1: ( rule__Mixin__Alternatives_0 )
            {
             before(grammarAccess.getMixinAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3835:1: ( rule__Mixin__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3835:2: rule__Mixin__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Mixin__Alternatives_0_in_rule__Mixin__Group__0__Impl8034);
            rule__Mixin__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__0__Impl"


    // $ANTLR start "rule__Mixin__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3845:1: rule__Mixin__Group__1 : rule__Mixin__Group__1__Impl ;
    public final void rule__Mixin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3849:1: ( rule__Mixin__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3850:2: rule__Mixin__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mixin__Group__1__Impl_in_rule__Mixin__Group__18064);
            rule__Mixin__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__1"


    // $ANTLR start "rule__Mixin__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3856:1: rule__Mixin__Group__1__Impl : ( ( '?' )? ) ;
    public final void rule__Mixin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3860:1: ( ( ( '?' )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3861:1: ( ( '?' )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3861:1: ( ( '?' )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3862:1: ( '?' )?
            {
             before(grammarAccess.getMixinAccess().getQuestionMarkKeyword_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3863:1: ( '?' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==15) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3864:2: '?'
                    {
                    match(input,15,FOLLOW_15_in_rule__Mixin__Group__1__Impl8093); 

                    }
                    break;

            }

             after(grammarAccess.getMixinAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mixin__Group__1__Impl"


    // $ANTLR start "rule__Orderable__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3879:1: rule__Orderable__Group__0 : rule__Orderable__Group__0__Impl rule__Orderable__Group__1 ;
    public final void rule__Orderable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3883:1: ( rule__Orderable__Group__0__Impl rule__Orderable__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3884:2: rule__Orderable__Group__0__Impl rule__Orderable__Group__1
            {
            pushFollow(FOLLOW_rule__Orderable__Group__0__Impl_in_rule__Orderable__Group__08130);
            rule__Orderable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Orderable__Group__1_in_rule__Orderable__Group__08133);
            rule__Orderable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orderable__Group__0"


    // $ANTLR start "rule__Orderable__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3891:1: rule__Orderable__Group__0__Impl : ( ( rule__Orderable__Alternatives_0 ) ) ;
    public final void rule__Orderable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3895:1: ( ( ( rule__Orderable__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3896:1: ( ( rule__Orderable__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3896:1: ( ( rule__Orderable__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3897:1: ( rule__Orderable__Alternatives_0 )
            {
             before(grammarAccess.getOrderableAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3898:1: ( rule__Orderable__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3898:2: rule__Orderable__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Orderable__Alternatives_0_in_rule__Orderable__Group__0__Impl8160);
            rule__Orderable__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderableAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orderable__Group__0__Impl"


    // $ANTLR start "rule__Orderable__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3908:1: rule__Orderable__Group__1 : rule__Orderable__Group__1__Impl ;
    public final void rule__Orderable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3912:1: ( rule__Orderable__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3913:2: rule__Orderable__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Orderable__Group__1__Impl_in_rule__Orderable__Group__18190);
            rule__Orderable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orderable__Group__1"


    // $ANTLR start "rule__Orderable__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3919:1: rule__Orderable__Group__1__Impl : ( ( '?' )? ) ;
    public final void rule__Orderable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3923:1: ( ( ( '?' )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3924:1: ( ( '?' )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3924:1: ( ( '?' )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3925:1: ( '?' )?
            {
             before(grammarAccess.getOrderableAccess().getQuestionMarkKeyword_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3926:1: ( '?' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==15) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3927:2: '?'
                    {
                    match(input,15,FOLLOW_15_in_rule__Orderable__Group__1__Impl8219); 

                    }
                    break;

            }

             after(grammarAccess.getOrderableAccess().getQuestionMarkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Orderable__Group__1__Impl"


    // $ANTLR start "rule__SuperTypes__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3942:1: rule__SuperTypes__Group__0 : rule__SuperTypes__Group__0__Impl rule__SuperTypes__Group__1 ;
    public final void rule__SuperTypes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3946:1: ( rule__SuperTypes__Group__0__Impl rule__SuperTypes__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3947:2: rule__SuperTypes__Group__0__Impl rule__SuperTypes__Group__1
            {
            pushFollow(FOLLOW_rule__SuperTypes__Group__0__Impl_in_rule__SuperTypes__Group__08256);
            rule__SuperTypes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SuperTypes__Group__1_in_rule__SuperTypes__Group__08259);
            rule__SuperTypes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypes__Group__0"


    // $ANTLR start "rule__SuperTypes__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3954:1: rule__SuperTypes__Group__0__Impl : ( '>' ) ;
    public final void rule__SuperTypes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3958:1: ( ( '>' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3959:1: ( '>' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3959:1: ( '>' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3960:1: '>'
            {
             before(grammarAccess.getSuperTypesAccess().getGreaterThanSignKeyword_0()); 
            match(input,72,FOLLOW_72_in_rule__SuperTypes__Group__0__Impl8287); 
             after(grammarAccess.getSuperTypesAccess().getGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypes__Group__0__Impl"


    // $ANTLR start "rule__SuperTypes__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3973:1: rule__SuperTypes__Group__1 : rule__SuperTypes__Group__1__Impl ;
    public final void rule__SuperTypes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3977:1: ( rule__SuperTypes__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3978:2: rule__SuperTypes__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SuperTypes__Group__1__Impl_in_rule__SuperTypes__Group__18318);
            rule__SuperTypes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypes__Group__1"


    // $ANTLR start "rule__SuperTypes__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3984:1: rule__SuperTypes__Group__1__Impl : ( ( rule__SuperTypes__Alternatives_1 ) ) ;
    public final void rule__SuperTypes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3988:1: ( ( ( rule__SuperTypes__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3989:1: ( ( rule__SuperTypes__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3989:1: ( ( rule__SuperTypes__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3990:1: ( rule__SuperTypes__Alternatives_1 )
            {
             before(grammarAccess.getSuperTypesAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3991:1: ( rule__SuperTypes__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3991:2: rule__SuperTypes__Alternatives_1
            {
            pushFollow(FOLLOW_rule__SuperTypes__Alternatives_1_in_rule__SuperTypes__Group__1__Impl8345);
            rule__SuperTypes__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSuperTypesAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperTypes__Group__1__Impl"


    // $ANTLR start "rule__NodeTypeName__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4005:1: rule__NodeTypeName__Group__0 : rule__NodeTypeName__Group__0__Impl rule__NodeTypeName__Group__1 ;
    public final void rule__NodeTypeName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4009:1: ( rule__NodeTypeName__Group__0__Impl rule__NodeTypeName__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4010:2: rule__NodeTypeName__Group__0__Impl rule__NodeTypeName__Group__1
            {
            pushFollow(FOLLOW_rule__NodeTypeName__Group__0__Impl_in_rule__NodeTypeName__Group__08379);
            rule__NodeTypeName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeName__Group__1_in_rule__NodeTypeName__Group__08382);
            rule__NodeTypeName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeName__Group__0"


    // $ANTLR start "rule__NodeTypeName__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4017:1: rule__NodeTypeName__Group__0__Impl : ( '[' ) ;
    public final void rule__NodeTypeName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4021:1: ( ( '[' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4022:1: ( '[' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4022:1: ( '[' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4023:1: '['
            {
             before(grammarAccess.getNodeTypeNameAccess().getLeftSquareBracketKeyword_0()); 
            match(input,73,FOLLOW_73_in_rule__NodeTypeName__Group__0__Impl8410); 
             after(grammarAccess.getNodeTypeNameAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeName__Group__0__Impl"


    // $ANTLR start "rule__NodeTypeName__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4036:1: rule__NodeTypeName__Group__1 : rule__NodeTypeName__Group__1__Impl rule__NodeTypeName__Group__2 ;
    public final void rule__NodeTypeName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4040:1: ( rule__NodeTypeName__Group__1__Impl rule__NodeTypeName__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4041:2: rule__NodeTypeName__Group__1__Impl rule__NodeTypeName__Group__2
            {
            pushFollow(FOLLOW_rule__NodeTypeName__Group__1__Impl_in_rule__NodeTypeName__Group__18441);
            rule__NodeTypeName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeName__Group__2_in_rule__NodeTypeName__Group__18444);
            rule__NodeTypeName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeName__Group__1"


    // $ANTLR start "rule__NodeTypeName__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4048:1: rule__NodeTypeName__Group__1__Impl : ( ( rule__NodeTypeName__NameAssignment_1 ) ) ;
    public final void rule__NodeTypeName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4052:1: ( ( ( rule__NodeTypeName__NameAssignment_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4053:1: ( ( rule__NodeTypeName__NameAssignment_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4053:1: ( ( rule__NodeTypeName__NameAssignment_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4054:1: ( rule__NodeTypeName__NameAssignment_1 )
            {
             before(grammarAccess.getNodeTypeNameAccess().getNameAssignment_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4055:1: ( rule__NodeTypeName__NameAssignment_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4055:2: rule__NodeTypeName__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeTypeName__NameAssignment_1_in_rule__NodeTypeName__Group__1__Impl8471);
            rule__NodeTypeName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeName__Group__1__Impl"


    // $ANTLR start "rule__NodeTypeName__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4065:1: rule__NodeTypeName__Group__2 : rule__NodeTypeName__Group__2__Impl ;
    public final void rule__NodeTypeName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4069:1: ( rule__NodeTypeName__Group__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4070:2: rule__NodeTypeName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeName__Group__2__Impl_in_rule__NodeTypeName__Group__28501);
            rule__NodeTypeName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeName__Group__2"


    // $ANTLR start "rule__NodeTypeName__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4076:1: rule__NodeTypeName__Group__2__Impl : ( ']' ) ;
    public final void rule__NodeTypeName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4080:1: ( ( ']' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4081:1: ( ']' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4081:1: ( ']' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4082:1: ']'
            {
             before(grammarAccess.getNodeTypeNameAccess().getRightSquareBracketKeyword_2()); 
            match(input,74,FOLLOW_74_in_rule__NodeTypeName__Group__2__Impl8529); 
             after(grammarAccess.getNodeTypeNameAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeName__Group__2__Impl"


    // $ANTLR start "rule__NsMapping__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4101:1: rule__NsMapping__Group__0 : rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1 ;
    public final void rule__NsMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4105:1: ( rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4106:2: rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__0__Impl_in_rule__NsMapping__Group__08566);
            rule__NsMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__1_in_rule__NsMapping__Group__08569);
            rule__NsMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__0"


    // $ANTLR start "rule__NsMapping__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4113:1: rule__NsMapping__Group__0__Impl : ( '<' ) ;
    public final void rule__NsMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4117:1: ( ( '<' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4118:1: ( '<' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4118:1: ( '<' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4119:1: '<'
            {
             before(grammarAccess.getNsMappingAccess().getLessThanSignKeyword_0()); 
            match(input,69,FOLLOW_69_in_rule__NsMapping__Group__0__Impl8597); 
             after(grammarAccess.getNsMappingAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__0__Impl"


    // $ANTLR start "rule__NsMapping__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4132:1: rule__NsMapping__Group__1 : rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2 ;
    public final void rule__NsMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4136:1: ( rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4137:2: rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__1__Impl_in_rule__NsMapping__Group__18628);
            rule__NsMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__2_in_rule__NsMapping__Group__18631);
            rule__NsMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__1"


    // $ANTLR start "rule__NsMapping__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4144:1: rule__NsMapping__Group__1__Impl : ( ( rule__NsMapping__NameAssignment_1 ) ) ;
    public final void rule__NsMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4148:1: ( ( ( rule__NsMapping__NameAssignment_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4149:1: ( ( rule__NsMapping__NameAssignment_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4149:1: ( ( rule__NsMapping__NameAssignment_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4150:1: ( rule__NsMapping__NameAssignment_1 )
            {
             before(grammarAccess.getNsMappingAccess().getNameAssignment_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4151:1: ( rule__NsMapping__NameAssignment_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4151:2: rule__NsMapping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NsMapping__NameAssignment_1_in_rule__NsMapping__Group__1__Impl8658);
            rule__NsMapping__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNsMappingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__1__Impl"


    // $ANTLR start "rule__NsMapping__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4161:1: rule__NsMapping__Group__2 : rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3 ;
    public final void rule__NsMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4165:1: ( rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4166:2: rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__2__Impl_in_rule__NsMapping__Group__28688);
            rule__NsMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__3_in_rule__NsMapping__Group__28691);
            rule__NsMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__2"


    // $ANTLR start "rule__NsMapping__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4173:1: rule__NsMapping__Group__2__Impl : ( '=' ) ;
    public final void rule__NsMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4177:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4178:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4178:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4179:1: '='
            {
             before(grammarAccess.getNsMappingAccess().getEqualsSignKeyword_2()); 
            match(input,65,FOLLOW_65_in_rule__NsMapping__Group__2__Impl8719); 
             after(grammarAccess.getNsMappingAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__2__Impl"


    // $ANTLR start "rule__NsMapping__Group__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4192:1: rule__NsMapping__Group__3 : rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4 ;
    public final void rule__NsMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4196:1: ( rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4197:2: rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__3__Impl_in_rule__NsMapping__Group__38750);
            rule__NsMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__4_in_rule__NsMapping__Group__38753);
            rule__NsMapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__3"


    // $ANTLR start "rule__NsMapping__Group__3__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4204:1: rule__NsMapping__Group__3__Impl : ( ( rule__NsMapping__UriAssignment_3 ) ) ;
    public final void rule__NsMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4208:1: ( ( ( rule__NsMapping__UriAssignment_3 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4209:1: ( ( rule__NsMapping__UriAssignment_3 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4209:1: ( ( rule__NsMapping__UriAssignment_3 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4210:1: ( rule__NsMapping__UriAssignment_3 )
            {
             before(grammarAccess.getNsMappingAccess().getUriAssignment_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4211:1: ( rule__NsMapping__UriAssignment_3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4211:2: rule__NsMapping__UriAssignment_3
            {
            pushFollow(FOLLOW_rule__NsMapping__UriAssignment_3_in_rule__NsMapping__Group__3__Impl8780);
            rule__NsMapping__UriAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNsMappingAccess().getUriAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__3__Impl"


    // $ANTLR start "rule__NsMapping__Group__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4221:1: rule__NsMapping__Group__4 : rule__NsMapping__Group__4__Impl ;
    public final void rule__NsMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4225:1: ( rule__NsMapping__Group__4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4226:2: rule__NsMapping__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__4__Impl_in_rule__NsMapping__Group__48810);
            rule__NsMapping__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__4"


    // $ANTLR start "rule__NsMapping__Group__4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4232:1: rule__NsMapping__Group__4__Impl : ( '>' ) ;
    public final void rule__NsMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4236:1: ( ( '>' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4237:1: ( '>' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4237:1: ( '>' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4238:1: '>'
            {
             before(grammarAccess.getNsMappingAccess().getGreaterThanSignKeyword_4()); 
            match(input,72,FOLLOW_72_in_rule__NsMapping__Group__4__Impl8838); 
             after(grammarAccess.getNsMappingAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__Group__4__Impl"


    // $ANTLR start "rule__JcrStringList__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4261:1: rule__JcrStringList__Group__0 : rule__JcrStringList__Group__0__Impl rule__JcrStringList__Group__1 ;
    public final void rule__JcrStringList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4265:1: ( rule__JcrStringList__Group__0__Impl rule__JcrStringList__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4266:2: rule__JcrStringList__Group__0__Impl rule__JcrStringList__Group__1
            {
            pushFollow(FOLLOW_rule__JcrStringList__Group__0__Impl_in_rule__JcrStringList__Group__08879);
            rule__JcrStringList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JcrStringList__Group__1_in_rule__JcrStringList__Group__08882);
            rule__JcrStringList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JcrStringList__Group__0"


    // $ANTLR start "rule__JcrStringList__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4273:1: rule__JcrStringList__Group__0__Impl : ( ruleJcrString ) ;
    public final void rule__JcrStringList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4277:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4278:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4278:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4279:1: ruleJcrString
            {
             before(grammarAccess.getJcrStringListAccess().getJcrStringParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__JcrStringList__Group__0__Impl8909);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getJcrStringListAccess().getJcrStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JcrStringList__Group__0__Impl"


    // $ANTLR start "rule__JcrStringList__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4290:1: rule__JcrStringList__Group__1 : rule__JcrStringList__Group__1__Impl ;
    public final void rule__JcrStringList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4294:1: ( rule__JcrStringList__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4295:2: rule__JcrStringList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JcrStringList__Group__1__Impl_in_rule__JcrStringList__Group__18938);
            rule__JcrStringList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JcrStringList__Group__1"


    // $ANTLR start "rule__JcrStringList__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4301:1: rule__JcrStringList__Group__1__Impl : ( ( rule__JcrStringList__Group_1__0 )* ) ;
    public final void rule__JcrStringList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4305:1: ( ( ( rule__JcrStringList__Group_1__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4306:1: ( ( rule__JcrStringList__Group_1__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4306:1: ( ( rule__JcrStringList__Group_1__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4307:1: ( rule__JcrStringList__Group_1__0 )*
            {
             before(grammarAccess.getJcrStringListAccess().getGroup_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4308:1: ( rule__JcrStringList__Group_1__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==75) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4308:2: rule__JcrStringList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JcrStringList__Group_1__0_in_rule__JcrStringList__Group__1__Impl8965);
            	    rule__JcrStringList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getJcrStringListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JcrStringList__Group__1__Impl"


    // $ANTLR start "rule__JcrStringList__Group_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4322:1: rule__JcrStringList__Group_1__0 : rule__JcrStringList__Group_1__0__Impl rule__JcrStringList__Group_1__1 ;
    public final void rule__JcrStringList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4326:1: ( rule__JcrStringList__Group_1__0__Impl rule__JcrStringList__Group_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4327:2: rule__JcrStringList__Group_1__0__Impl rule__JcrStringList__Group_1__1
            {
            pushFollow(FOLLOW_rule__JcrStringList__Group_1__0__Impl_in_rule__JcrStringList__Group_1__09000);
            rule__JcrStringList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JcrStringList__Group_1__1_in_rule__JcrStringList__Group_1__09003);
            rule__JcrStringList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JcrStringList__Group_1__0"


    // $ANTLR start "rule__JcrStringList__Group_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4334:1: rule__JcrStringList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__JcrStringList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4338:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4339:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4339:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4340:1: ','
            {
             before(grammarAccess.getJcrStringListAccess().getCommaKeyword_1_0()); 
            match(input,75,FOLLOW_75_in_rule__JcrStringList__Group_1__0__Impl9031); 
             after(grammarAccess.getJcrStringListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JcrStringList__Group_1__0__Impl"


    // $ANTLR start "rule__JcrStringList__Group_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4353:1: rule__JcrStringList__Group_1__1 : rule__JcrStringList__Group_1__1__Impl ;
    public final void rule__JcrStringList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4357:1: ( rule__JcrStringList__Group_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4358:2: rule__JcrStringList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__JcrStringList__Group_1__1__Impl_in_rule__JcrStringList__Group_1__19062);
            rule__JcrStringList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JcrStringList__Group_1__1"


    // $ANTLR start "rule__JcrStringList__Group_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4364:1: rule__JcrStringList__Group_1__1__Impl : ( ruleJcrString ) ;
    public final void rule__JcrStringList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4368:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4369:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4369:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4370:1: ruleJcrString
            {
             before(grammarAccess.getJcrStringListAccess().getJcrStringParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__JcrStringList__Group_1__1__Impl9089);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getJcrStringListAccess().getJcrStringParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JcrStringList__Group_1__1__Impl"


    // $ANTLR start "rule__Model__MappingsAssignment_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4386:1: rule__Model__MappingsAssignment_0 : ( ruleNsMapping ) ;
    public final void rule__Model__MappingsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4390:1: ( ( ruleNsMapping ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4391:1: ( ruleNsMapping )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4391:1: ( ruleNsMapping )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4392:1: ruleNsMapping
            {
             before(grammarAccess.getModelAccess().getMappingsNsMappingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNsMapping_in_rule__Model__MappingsAssignment_09127);
            ruleNsMapping();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMappingsNsMappingParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MappingsAssignment_0"


    // $ANTLR start "rule__Model__NodetypesAssignment_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4401:1: rule__Model__NodetypesAssignment_1 : ( ruleNodeTypeDef ) ;
    public final void rule__Model__NodetypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4405:1: ( ( ruleNodeTypeDef ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4406:1: ( ruleNodeTypeDef )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4406:1: ( ruleNodeTypeDef )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4407:1: ruleNodeTypeDef
            {
             before(grammarAccess.getModelAccess().getNodetypesNodeTypeDefParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeTypeDef_in_rule__Model__NodetypesAssignment_19158);
            ruleNodeTypeDef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNodetypesNodeTypeDefParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NodetypesAssignment_1"


    // $ANTLR start "rule__NodeTypeDef__AttributesAssignment_2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4416:1: rule__NodeTypeDef__AttributesAssignment_2 : ( ruleNodeTypeAttribute ) ;
    public final void rule__NodeTypeDef__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4420:1: ( ( ruleNodeTypeAttribute ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4421:1: ( ruleNodeTypeAttribute )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4421:1: ( ruleNodeTypeAttribute )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4422:1: ruleNodeTypeAttribute
            {
             before(grammarAccess.getNodeTypeDefAccess().getAttributesNodeTypeAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleNodeTypeAttribute_in_rule__NodeTypeDef__AttributesAssignment_29189);
            ruleNodeTypeAttribute();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefAccess().getAttributesNodeTypeAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDef__AttributesAssignment_2"


    // $ANTLR start "rule__NodeTypeName__NameAssignment_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4431:1: rule__NodeTypeName__NameAssignment_1 : ( ruleJcrString ) ;
    public final void rule__NodeTypeName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4435:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4436:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4436:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4437:1: ruleJcrString
            {
             before(grammarAccess.getNodeTypeNameAccess().getNameJcrStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeTypeName__NameAssignment_19220);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeTypeNameAccess().getNameJcrStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeName__NameAssignment_1"


    // $ANTLR start "rule__NsMapping__NameAssignment_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4446:1: rule__NsMapping__NameAssignment_1 : ( rulePrefix ) ;
    public final void rule__NsMapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4450:1: ( ( rulePrefix ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4451:1: ( rulePrefix )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4451:1: ( rulePrefix )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4452:1: rulePrefix
            {
             before(grammarAccess.getNsMappingAccess().getNamePrefixParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__NsMapping__NameAssignment_19251);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getNsMappingAccess().getNamePrefixParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__NameAssignment_1"


    // $ANTLR start "rule__NsMapping__UriAssignment_3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4461:1: rule__NsMapping__UriAssignment_3 : ( ruleUri ) ;
    public final void rule__NsMapping__UriAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4465:1: ( ( ruleUri ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4466:1: ( ruleUri )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4466:1: ( ruleUri )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4467:1: ruleUri
            {
             before(grammarAccess.getNsMappingAccess().getUriUriParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUri_in_rule__NsMapping__UriAssignment_39282);
            ruleUri();

            state._fsp--;

             after(grammarAccess.getNsMappingAccess().getUriUriParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NsMapping__UriAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000220L});
    public static final BitSet FOLLOW_ruleNodeTypeDef_in_entryRuleNodeTypeDef122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeDef129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDef__Group__0_in_ruleNodeTypeDef155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildNodeDef_in_entryRuleChildNodeDef182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChildNodeDef189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChildNodeDef__Group__0_in_ruleChildNodeDef215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAttribute_in_entryRuleNodeAttribute242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeAttribute249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeAttribute__Alternatives_in_ruleNodeAttribute275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSns_in_entryRuleSns302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSns309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sns__Group__0_in_ruleSns335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultType_in_entryRuleDefaultType362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultType369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultType__Group__0_in_ruleDefaultType395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredTypes_in_entryRuleRequiredTypes422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredTypes429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredTypes__Group__0_in_ruleRequiredTypes455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeName_in_entryRuleNodeName482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeName489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeName__Group__0_in_ruleNodeName515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDef_in_entryRulePropertyDef542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDef549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDef__Group__0_in_rulePropertyDef575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueConstraints_in_entryRuleValueConstraints602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueConstraints609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueConstraints__Group__0_in_ruleValueConstraints635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_entryRulePropertyAttribute662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAttribute669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAttribute__Alternatives_in_rulePropertyAttribute695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoQueryOrder729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoQueryOrder__Group__0_in_ruleNoQueryOrder755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_entryRuleNoFullText782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoFullText789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoFullText__Group__0_in_ruleNoFullText815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_entryRuleQueryOps842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOps849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__0_in_ruleQueryOps875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiple909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiple__Group__0_in_ruleMultiple935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_entryRuleOpv962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpv969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Opv__Alternatives_in_ruleOpv995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_entryRuleProtected1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtected1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protected__Group__0_in_ruleProtected1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_entryRuleAutocreated1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutocreated1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Autocreated__Group__0_in_ruleAutocreated1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValues_in_entryRuleDefaultValues1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultValues1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValues__Group__0_in_ruleDefaultValues1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_entryRulePropertyType1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyType1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyType__Group__0_in_rulePropertyType1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_entryRulePropertyName1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyName1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyName__Group__0_in_rulePropertyName1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeAttribute_in_entryRuleNodeTypeAttribute1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeAttribute1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeAttribute__Alternatives_in_ruleNodeTypeAttribute1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryItem1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__0_in_rulePrimaryItem1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_in_ruleQuery1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__0_in_ruleAbstract1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__0_in_ruleMixin1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_entryRuleOrderable1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderable1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orderable__Group__0_in_ruleOrderable1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperTypes_in_entryRuleSuperTypes1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperTypes1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperTypes__Group__0_in_ruleSuperTypes1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeName_in_entryRuleNodeTypeName1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeName1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeName__Group__0_in_ruleNodeTypeName1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_entryRuleNsMapping1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNsMapping1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__0_in_ruleNsMapping1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rulePrefix2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_entryRuleUri2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUri2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleUri2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrStringList_in_entryRuleJcrStringList2100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJcrStringList2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JcrStringList__Group__0_in_ruleJcrStringList2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_entryRuleJcrString2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJcrString2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JcrString__Alternatives_in_ruleJcrString2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_entryRuleXiD2220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXiD2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XiD__Alternatives_in_ruleXiD2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MappingsAssignment_0_in_rule__Model__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NodetypesAssignment_1_in_rule__Model__Alternatives2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDef_in_rule__NodeTypeDef__Alternatives_32340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChildNodeDef_in_rule__NodeTypeDef__Alternatives_32357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rule__NodeAttribute__Alternatives2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__NodeAttribute__Alternatives2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_rule__NodeAttribute__Alternatives2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_rule__NodeAttribute__Alternatives2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSns_in_rule__NodeAttribute__Alternatives2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sns__Alternatives_02490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Sns__Alternatives_02510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Sns__Alternatives_02530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__DefaultType__Alternatives_12564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DefaultType__Alternatives_12582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrStringList_in_rule__RequiredTypes__Alternatives_12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RequiredTypes__Alternatives_12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeName__Alternatives_12668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeName__Alternatives_12686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrStringList_in_rule__ValueConstraints__Alternatives_12720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ValueConstraints__Alternatives_12738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rule__PropertyAttribute__Alternatives2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__PropertyAttribute__Alternatives2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_rule__PropertyAttribute__Alternatives2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_rule__PropertyAttribute__Alternatives2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_rule__PropertyAttribute__Alternatives2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_rule__PropertyAttribute__Alternatives2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_rule__PropertyAttribute__Alternatives2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_rule__PropertyAttribute__Alternatives2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__PropertyAttribute__Alternatives2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NoQueryOrder__Alternatives_02941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NoQueryOrder__Alternatives_02961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NoFullText__Alternatives_02996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__NoFullText__Alternatives_03016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QueryOps__Alternatives_03051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QueryOps__Alternatives_03071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__QueryOps__Alternatives_13105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QueryOps__Alternatives_13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Multiple__Alternatives_03158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Multiple__Alternatives_03178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Multiple__Alternatives_03198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Opv__Alternatives3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Opv__Alternatives3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Opv__Alternatives3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Opv__Alternatives3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Opv__Alternatives3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Opv__Alternatives3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Opv__Group_6__0_in_rule__Opv__Alternatives3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Protected__Alternatives_03386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Protected__Alternatives_03406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Protected__Alternatives_03426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Mandatory__Alternatives_03461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Mandatory__Alternatives_03481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Mandatory__Alternatives_03501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Autocreated__Alternatives_03536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Autocreated__Alternatives_03556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Autocreated__Alternatives_03576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Primary__Alternatives3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Primary__Alternatives3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrStringList_in_rule__DefaultValues__Alternatives_13665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DefaultValues__Alternatives_13683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__PropertyType__Alternatives_13718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__PropertyType__Alternatives_13738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__PropertyType__Alternatives_13758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__PropertyType__Alternatives_13778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__PropertyType__Alternatives_13798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__PropertyType__Alternatives_13818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__PropertyType__Alternatives_13838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__PropertyType__Alternatives_13858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PropertyType__Alternatives_13878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__PropertyType__Alternatives_13898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__PropertyType__Alternatives_13918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PropertyType__Alternatives_13938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__PropertyType__Alternatives_13958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PropertyType__Alternatives_13978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PropertyType__Alternatives_13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyName__Alternatives_14032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PropertyName__Alternatives_14050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_rule__NodeTypeAttribute__Alternatives4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_rule__NodeTypeAttribute__Alternatives4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__NodeTypeAttribute__Alternatives4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__NodeTypeAttribute__Alternatives4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_rule__NodeTypeAttribute__Alternatives4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PrimaryItem__Alternatives_04185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__PrimaryItem__Alternatives_04205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PrimaryItem__Alternatives_14239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PrimaryItem__Alternatives_14257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_0_in_rule__Query__Alternatives4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_1_in_rule__Query__Alternatives4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Query__Alternatives_04343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Query__Alternatives_04363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Query__Alternatives_14398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Query__Alternatives_14418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Abstract__Alternatives_04453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Abstract__Alternatives_04473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Abstract__Alternatives_04493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Mixin__Alternatives_04528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Mixin__Alternatives_04548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Mixin__Alternatives_04568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Orderable__Alternatives_04603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__Orderable__Alternatives_04623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__Orderable__Alternatives_04643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrStringList_in_rule__SuperTypes__Alternatives_14677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SuperTypes__Alternatives_14695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JcrString__Alternatives4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rule__JcrString__Alternatives4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXID_in_rule__XiD__Alternatives4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__XiD__Alternatives4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDef__Group__0__Impl_in_rule__NodeTypeDef__Group__04828 = new BitSet(new long[]{0xFFE000A400000000L,0x0000000000000191L});
    public static final BitSet FOLLOW_rule__NodeTypeDef__Group__1_in_rule__NodeTypeDef__Group__04831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeName_in_rule__NodeTypeDef__Group__0__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDef__Group__1__Impl_in_rule__NodeTypeDef__Group__14887 = new BitSet(new long[]{0xFFE000A400000000L,0x0000000000000191L});
    public static final BitSet FOLLOW_rule__NodeTypeDef__Group__2_in_rule__NodeTypeDef__Group__14890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperTypes_in_rule__NodeTypeDef__Group__1__Impl4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDef__Group__2__Impl_in_rule__NodeTypeDef__Group__24949 = new BitSet(new long[]{0xFFE000A400000000L,0x0000000000000191L});
    public static final BitSet FOLLOW_rule__NodeTypeDef__Group__3_in_rule__NodeTypeDef__Group__24952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDef__AttributesAssignment_2_in_rule__NodeTypeDef__Group__2__Impl4979 = new BitSet(new long[]{0xFFE000A400000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__NodeTypeDef__Group__3__Impl_in_rule__NodeTypeDef__Group__35010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDef__Alternatives_3_in_rule__NodeTypeDef__Group__3__Impl5037 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000090L});
    public static final BitSet FOLLOW_rule__ChildNodeDef__Group__0__Impl_in_rule__ChildNodeDef__Group__05076 = new BitSet(new long[]{0x0000003FFF807000L,0x0000000000000046L});
    public static final BitSet FOLLOW_rule__ChildNodeDef__Group__1_in_rule__ChildNodeDef__Group__05079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeName_in_rule__ChildNodeDef__Group__0__Impl5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChildNodeDef__Group__1__Impl_in_rule__ChildNodeDef__Group__15135 = new BitSet(new long[]{0x0000003FFF807000L,0x0000000000000046L});
    public static final BitSet FOLLOW_rule__ChildNodeDef__Group__2_in_rule__ChildNodeDef__Group__15138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredTypes_in_rule__ChildNodeDef__Group__1__Impl5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChildNodeDef__Group__2__Impl_in_rule__ChildNodeDef__Group__25197 = new BitSet(new long[]{0x0000003FFF807000L,0x0000000000000046L});
    public static final BitSet FOLLOW_rule__ChildNodeDef__Group__3_in_rule__ChildNodeDef__Group__25200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultType_in_rule__ChildNodeDef__Group__2__Impl5228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChildNodeDef__Group__3__Impl_in_rule__ChildNodeDef__Group__35259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeAttribute_in_rule__ChildNodeDef__Group__3__Impl5287 = new BitSet(new long[]{0x0000003FFF807002L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Sns__Group__0__Impl_in_rule__Sns__Group__05326 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Sns__Group__1_in_rule__Sns__Group__05329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sns__Alternatives_0_in_rule__Sns__Group__0__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sns__Group__1__Impl_in_rule__Sns__Group__15386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Sns__Group__1__Impl5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultType__Group__0__Impl_in_rule__DefaultType__Group__05452 = new BitSet(new long[]{0x2000000000008030L});
    public static final BitSet FOLLOW_rule__DefaultType__Group__1_in_rule__DefaultType__Group__05455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__DefaultType__Group__0__Impl5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultType__Group__1__Impl_in_rule__DefaultType__Group__15514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultType__Alternatives_1_in_rule__DefaultType__Group__1__Impl5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredTypes__Group__0__Impl_in_rule__RequiredTypes__Group__05575 = new BitSet(new long[]{0x2000000000008030L});
    public static final BitSet FOLLOW_rule__RequiredTypes__Group__1_in_rule__RequiredTypes__Group__05578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__RequiredTypes__Group__0__Impl5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredTypes__Group__1__Impl_in_rule__RequiredTypes__Group__15637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__RequiredTypes__Group__2_in_rule__RequiredTypes__Group__15640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredTypes__Alternatives_1_in_rule__RequiredTypes__Group__1__Impl5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RequiredTypes__Group__2__Impl_in_rule__RequiredTypes__Group__25697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__RequiredTypes__Group__2__Impl5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeName__Group__0__Impl_in_rule__NodeName__Group__05762 = new BitSet(new long[]{0x2000000000002030L});
    public static final BitSet FOLLOW_rule__NodeName__Group__1_in_rule__NodeName__Group__05765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__NodeName__Group__0__Impl5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeName__Group__1__Impl_in_rule__NodeName__Group__15824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeName__Alternatives_1_in_rule__NodeName__Group__1__Impl5851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDef__Group__0__Impl_in_rule__PropertyDef__Group__05885 = new BitSet(new long[]{0x000000FFFFFF6000L,0x0000000000000066L});
    public static final BitSet FOLLOW_rule__PropertyDef__Group__1_in_rule__PropertyDef__Group__05888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyName_in_rule__PropertyDef__Group__0__Impl5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDef__Group__1__Impl_in_rule__PropertyDef__Group__15944 = new BitSet(new long[]{0x000000FFFFFF6000L,0x0000000000000066L});
    public static final BitSet FOLLOW_rule__PropertyDef__Group__2_in_rule__PropertyDef__Group__15947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_rule__PropertyDef__Group__1__Impl5975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDef__Group__2__Impl_in_rule__PropertyDef__Group__26006 = new BitSet(new long[]{0x000000FFFFFF6000L,0x0000000000000066L});
    public static final BitSet FOLLOW_rule__PropertyDef__Group__3_in_rule__PropertyDef__Group__26009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultValues_in_rule__PropertyDef__Group__2__Impl6037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDef__Group__3__Impl_in_rule__PropertyDef__Group__36068 = new BitSet(new long[]{0x000000FFFFFF6000L,0x0000000000000066L});
    public static final BitSet FOLLOW_rule__PropertyDef__Group__4_in_rule__PropertyDef__Group__36071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAttribute_in_rule__PropertyDef__Group__3__Impl6099 = new BitSet(new long[]{0x000000FFFFFF6002L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PropertyDef__Group__4__Impl_in_rule__PropertyDef__Group__46130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueConstraints_in_rule__PropertyDef__Group__4__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueConstraints__Group__0__Impl_in_rule__ValueConstraints__Group__06199 = new BitSet(new long[]{0x2000000000008030L});
    public static final BitSet FOLLOW_rule__ValueConstraints__Group__1_in_rule__ValueConstraints__Group__06202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__ValueConstraints__Group__0__Impl6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueConstraints__Group__1__Impl_in_rule__ValueConstraints__Group__16261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueConstraints__Alternatives_1_in_rule__ValueConstraints__Group__1__Impl6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoQueryOrder__Group__0__Impl_in_rule__NoQueryOrder__Group__06322 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__NoQueryOrder__Group__1_in_rule__NoQueryOrder__Group__06325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoQueryOrder__Alternatives_0_in_rule__NoQueryOrder__Group__0__Impl6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoQueryOrder__Group__1__Impl_in_rule__NoQueryOrder__Group__16382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NoQueryOrder__Group__1__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoFullText__Group__0__Impl_in_rule__NoFullText__Group__06448 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__NoFullText__Group__1_in_rule__NoFullText__Group__06451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoFullText__Alternatives_0_in_rule__NoFullText__Group__0__Impl6478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoFullText__Group__1__Impl_in_rule__NoFullText__Group__16508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NoFullText__Group__1__Impl6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__0__Impl_in_rule__QueryOps__Group__06574 = new BitSet(new long[]{0x2000000000008030L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__1_in_rule__QueryOps__Group__06577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Alternatives_0_in_rule__QueryOps__Group__0__Impl6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__1__Impl_in_rule__QueryOps__Group__16634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Alternatives_1_in_rule__QueryOps__Group__1__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiple__Group__0__Impl_in_rule__Multiple__Group__06695 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Multiple__Group__1_in_rule__Multiple__Group__06698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiple__Alternatives_0_in_rule__Multiple__Group__0__Impl6725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiple__Group__1__Impl_in_rule__Multiple__Group__16755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Multiple__Group__1__Impl6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Opv__Group_6__0__Impl_in_rule__Opv__Group_6__06821 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Opv__Group_6__1_in_rule__Opv__Group_6__06824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__Opv__Group_6__0__Impl6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Opv__Group_6__1__Impl_in_rule__Opv__Group_6__16883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Opv__Group_6__1__Impl6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protected__Group__0__Impl_in_rule__Protected__Group__06946 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Protected__Group__1_in_rule__Protected__Group__06949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protected__Alternatives_0_in_rule__Protected__Group__0__Impl6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protected__Group__1__Impl_in_rule__Protected__Group__17006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Protected__Group__1__Impl7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__07072 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__07075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Alternatives_0_in_rule__Mandatory__Group__0__Impl7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__17132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Mandatory__Group__1__Impl7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Autocreated__Group__0__Impl_in_rule__Autocreated__Group__07198 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Autocreated__Group__1_in_rule__Autocreated__Group__07201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Autocreated__Alternatives_0_in_rule__Autocreated__Group__0__Impl7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Autocreated__Group__1__Impl_in_rule__Autocreated__Group__17258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Autocreated__Group__1__Impl7287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValues__Group__0__Impl_in_rule__DefaultValues__Group__07324 = new BitSet(new long[]{0x2000000000008030L});
    public static final BitSet FOLLOW_rule__DefaultValues__Group__1_in_rule__DefaultValues__Group__07327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__DefaultValues__Group__0__Impl7355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValues__Group__1__Impl_in_rule__DefaultValues__Group__17386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultValues__Alternatives_1_in_rule__DefaultValues__Group__1__Impl7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyType__Group__0__Impl_in_rule__PropertyType__Group__07447 = new BitSet(new long[]{0x001FFF000000A000L});
    public static final BitSet FOLLOW_rule__PropertyType__Group__1_in_rule__PropertyType__Group__07450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__PropertyType__Group__0__Impl7478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyType__Group__1__Impl_in_rule__PropertyType__Group__17509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyType__Group__2_in_rule__PropertyType__Group__17512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyType__Alternatives_1_in_rule__PropertyType__Group__1__Impl7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyType__Group__2__Impl_in_rule__PropertyType__Group__27569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__PropertyType__Group__2__Impl7597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyName__Group__0__Impl_in_rule__PropertyName__Group__07634 = new BitSet(new long[]{0x2000000000002030L});
    public static final BitSet FOLLOW_rule__PropertyName__Group__1_in_rule__PropertyName__Group__07637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__PropertyName__Group__0__Impl7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyName__Group__1__Impl_in_rule__PropertyName__Group__17696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyName__Alternatives_1_in_rule__PropertyName__Group__1__Impl7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__0__Impl_in_rule__PrimaryItem__Group__07757 = new BitSet(new long[]{0x2000000000008030L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__1_in_rule__PrimaryItem__Group__07760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Alternatives_0_in_rule__PrimaryItem__Group__0__Impl7787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__1__Impl_in_rule__PrimaryItem__Group__17817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Alternatives_1_in_rule__PrimaryItem__Group__1__Impl7844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__0__Impl_in_rule__Abstract__Group__07878 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Abstract__Group__1_in_rule__Abstract__Group__07881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Alternatives_0_in_rule__Abstract__Group__0__Impl7908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Group__1__Impl_in_rule__Abstract__Group__17938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Abstract__Group__1__Impl7967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__0__Impl_in_rule__Mixin__Group__08004 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Mixin__Group__1_in_rule__Mixin__Group__08007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Alternatives_0_in_rule__Mixin__Group__0__Impl8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Group__1__Impl_in_rule__Mixin__Group__18064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Mixin__Group__1__Impl8093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orderable__Group__0__Impl_in_rule__Orderable__Group__08130 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Orderable__Group__1_in_rule__Orderable__Group__08133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orderable__Alternatives_0_in_rule__Orderable__Group__0__Impl8160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orderable__Group__1__Impl_in_rule__Orderable__Group__18190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Orderable__Group__1__Impl8219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperTypes__Group__0__Impl_in_rule__SuperTypes__Group__08256 = new BitSet(new long[]{0x2000000000008030L});
    public static final BitSet FOLLOW_rule__SuperTypes__Group__1_in_rule__SuperTypes__Group__08259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__SuperTypes__Group__0__Impl8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperTypes__Group__1__Impl_in_rule__SuperTypes__Group__18318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SuperTypes__Alternatives_1_in_rule__SuperTypes__Group__1__Impl8345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeName__Group__0__Impl_in_rule__NodeTypeName__Group__08379 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_rule__NodeTypeName__Group__1_in_rule__NodeTypeName__Group__08382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__NodeTypeName__Group__0__Impl8410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeName__Group__1__Impl_in_rule__NodeTypeName__Group__18441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__NodeTypeName__Group__2_in_rule__NodeTypeName__Group__18444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeName__NameAssignment_1_in_rule__NodeTypeName__Group__1__Impl8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeName__Group__2__Impl_in_rule__NodeTypeName__Group__28501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__NodeTypeName__Group__2__Impl8529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__0__Impl_in_rule__NsMapping__Group__08566 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__1_in_rule__NsMapping__Group__08569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__NsMapping__Group__0__Impl8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__1__Impl_in_rule__NsMapping__Group__18628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__2_in_rule__NsMapping__Group__18631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__NameAssignment_1_in_rule__NsMapping__Group__1__Impl8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__2__Impl_in_rule__NsMapping__Group__28688 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__3_in_rule__NsMapping__Group__28691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__NsMapping__Group__2__Impl8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__3__Impl_in_rule__NsMapping__Group__38750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__4_in_rule__NsMapping__Group__38753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__UriAssignment_3_in_rule__NsMapping__Group__3__Impl8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__4__Impl_in_rule__NsMapping__Group__48810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__NsMapping__Group__4__Impl8838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JcrStringList__Group__0__Impl_in_rule__JcrStringList__Group__08879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__JcrStringList__Group__1_in_rule__JcrStringList__Group__08882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__JcrStringList__Group__0__Impl8909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JcrStringList__Group__1__Impl_in_rule__JcrStringList__Group__18938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JcrStringList__Group_1__0_in_rule__JcrStringList__Group__1__Impl8965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__JcrStringList__Group_1__0__Impl_in_rule__JcrStringList__Group_1__09000 = new BitSet(new long[]{0x2000000000000030L});
    public static final BitSet FOLLOW_rule__JcrStringList__Group_1__1_in_rule__JcrStringList__Group_1__09003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__JcrStringList__Group_1__0__Impl9031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JcrStringList__Group_1__1__Impl_in_rule__JcrStringList__Group_1__19062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__JcrStringList__Group_1__1__Impl9089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_rule__Model__MappingsAssignment_09127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeDef_in_rule__Model__NodetypesAssignment_19158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeAttribute_in_rule__NodeTypeDef__AttributesAssignment_29189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeTypeName__NameAssignment_19220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__NsMapping__NameAssignment_19251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_rule__NsMapping__UriAssignment_39282 = new BitSet(new long[]{0x0000000000000002L});

}