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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_EXID", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sns'", "'*'", "'multiple'", "'noqueryorder'", "'nqord'", "'nofulltext'", "'nof'", "'queryops'", "'qop'", "'mul'", "'protected'", "'pro'", "'p'", "'mandatory'", "'man'", "'m'", "'autocreated'", "'aut'", "'a'", "'primary'", "'!'", "'primaryitem'", "'query'", "'q'", "'noquery'", "'nq'", "'abstract'", "'abs'", "'mixin'", "'mix'", "'orderable'", "'ord'", "'o'", "'COPY'", "'VERSION'", "'INITIALIZE'", "'COMPUTE'", "'IGNORE'", "'ABORT'", "'UNDEFINED'", "'STRING'", "'BINARY'", "'LONG'", "'DOUBLE'", "'DATE'", "'BOOLEAN'", "'NAME'", "'PATH'", "'REFERENCE'", "'WEAKREFERENCE'", "'URI'", "'DECIMAL'", "'['", "']'", "'>'", "','", "'+'", "'('", "')'", "'='", "'-'", "'<'"
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

                if ( (LA1_0==64||LA1_0==73) ) {
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


    // $ANTLR start "entryRuleNodeTypeDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:88:1: entryRuleNodeTypeDefinition : ruleNodeTypeDefinition EOF ;
    public final void entryRuleNodeTypeDefinition() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:89:1: ( ruleNodeTypeDefinition EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:90:1: ruleNodeTypeDefinition EOF
            {
             before(grammarAccess.getNodeTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeTypeDefinition_in_entryRuleNodeTypeDefinition122);
            ruleNodeTypeDefinition();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTypeDefinition129); 

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
    // $ANTLR end "entryRuleNodeTypeDefinition"


    // $ANTLR start "ruleNodeTypeDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:97:1: ruleNodeTypeDefinition : ( ( rule__NodeTypeDefinition__Group__0 ) ) ;
    public final void ruleNodeTypeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:101:2: ( ( ( rule__NodeTypeDefinition__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:102:1: ( ( rule__NodeTypeDefinition__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:102:1: ( ( rule__NodeTypeDefinition__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:103:1: ( rule__NodeTypeDefinition__Group__0 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:104:1: ( rule__NodeTypeDefinition__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:104:2: rule__NodeTypeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__0_in_ruleNodeTypeDefinition155);
            rule__NodeTypeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleNodeTypeDefinition"


    // $ANTLR start "entryRuleNodeDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:116:1: entryRuleNodeDefinition : ruleNodeDefinition EOF ;
    public final void entryRuleNodeDefinition() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:117:1: ( ruleNodeDefinition EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:118:1: ruleNodeDefinition EOF
            {
             before(grammarAccess.getNodeDefinitionRule()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition182);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeDefinition189); 

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
    // $ANTLR end "entryRuleNodeDefinition"


    // $ANTLR start "ruleNodeDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:125:1: ruleNodeDefinition : ( ( rule__NodeDefinition__Group__0 ) ) ;
    public final void ruleNodeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:129:2: ( ( ( rule__NodeDefinition__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:130:1: ( ( rule__NodeDefinition__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:130:1: ( ( rule__NodeDefinition__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:131:1: ( rule__NodeDefinition__Group__0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:132:1: ( rule__NodeDefinition__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:132:2: rule__NodeDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__0_in_ruleNodeDefinition215);
            rule__NodeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleNodeDefinition"


    // $ANTLR start "entryRuleSns"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:144:1: entryRuleSns : ruleSns EOF ;
    public final void entryRuleSns() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:145:1: ( ruleSns EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:146:1: ruleSns EOF
            {
             before(grammarAccess.getSnsRule()); 
            pushFollow(FOLLOW_ruleSns_in_entryRuleSns242);
            ruleSns();

            state._fsp--;

             after(grammarAccess.getSnsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSns249); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:153:1: ruleSns : ( ( rule__Sns__Alternatives ) ) ;
    public final void ruleSns() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:157:2: ( ( ( rule__Sns__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:158:1: ( ( rule__Sns__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:158:1: ( ( rule__Sns__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:159:1: ( rule__Sns__Alternatives )
            {
             before(grammarAccess.getSnsAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:160:1: ( rule__Sns__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:160:2: rule__Sns__Alternatives
            {
            pushFollow(FOLLOW_rule__Sns__Alternatives_in_ruleSns275);
            rule__Sns__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSnsAccess().getAlternatives()); 

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


    // $ANTLR start "entryRulePropertyDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:172:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:173:1: ( rulePropertyDefinition EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:174:1: rulePropertyDefinition EOF
            {
             before(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition302);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition309); 

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
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:181:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Group__0 ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:185:2: ( ( ( rule__PropertyDefinition__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:186:1: ( ( rule__PropertyDefinition__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:186:1: ( ( rule__PropertyDefinition__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:187:1: ( rule__PropertyDefinition__Group__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:188:1: ( rule__PropertyDefinition__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:188:2: rule__PropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition335);
            rule__PropertyDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup()); 

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
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleNoQueryOrder"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:200:1: entryRuleNoQueryOrder : ruleNoQueryOrder EOF ;
    public final void entryRuleNoQueryOrder() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:201:1: ( ruleNoQueryOrder EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:202:1: ruleNoQueryOrder EOF
            {
             before(grammarAccess.getNoQueryOrderRule()); 
            pushFollow(FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder362);
            ruleNoQueryOrder();

            state._fsp--;

             after(grammarAccess.getNoQueryOrderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoQueryOrder369); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:209:1: ruleNoQueryOrder : ( ( rule__NoQueryOrder__Alternatives ) ) ;
    public final void ruleNoQueryOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:213:2: ( ( ( rule__NoQueryOrder__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:214:1: ( ( rule__NoQueryOrder__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:214:1: ( ( rule__NoQueryOrder__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:215:1: ( rule__NoQueryOrder__Alternatives )
            {
             before(grammarAccess.getNoQueryOrderAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:216:1: ( rule__NoQueryOrder__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:216:2: rule__NoQueryOrder__Alternatives
            {
            pushFollow(FOLLOW_rule__NoQueryOrder__Alternatives_in_ruleNoQueryOrder395);
            rule__NoQueryOrder__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoQueryOrderAccess().getAlternatives()); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:228:1: entryRuleNoFullText : ruleNoFullText EOF ;
    public final void entryRuleNoFullText() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:229:1: ( ruleNoFullText EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:230:1: ruleNoFullText EOF
            {
             before(grammarAccess.getNoFullTextRule()); 
            pushFollow(FOLLOW_ruleNoFullText_in_entryRuleNoFullText422);
            ruleNoFullText();

            state._fsp--;

             after(grammarAccess.getNoFullTextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoFullText429); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:237:1: ruleNoFullText : ( ( rule__NoFullText__Alternatives ) ) ;
    public final void ruleNoFullText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:241:2: ( ( ( rule__NoFullText__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:242:1: ( ( rule__NoFullText__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:242:1: ( ( rule__NoFullText__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:243:1: ( rule__NoFullText__Alternatives )
            {
             before(grammarAccess.getNoFullTextAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:244:1: ( rule__NoFullText__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:244:2: rule__NoFullText__Alternatives
            {
            pushFollow(FOLLOW_rule__NoFullText__Alternatives_in_ruleNoFullText455);
            rule__NoFullText__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoFullTextAccess().getAlternatives()); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:256:1: entryRuleQueryOps : ruleQueryOps EOF ;
    public final void entryRuleQueryOps() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:257:1: ( ruleQueryOps EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:258:1: ruleQueryOps EOF
            {
             before(grammarAccess.getQueryOpsRule()); 
            pushFollow(FOLLOW_ruleQueryOps_in_entryRuleQueryOps482);
            ruleQueryOps();

            state._fsp--;

             after(grammarAccess.getQueryOpsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryOps489); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:265:1: ruleQueryOps : ( ( rule__QueryOps__Group__0 ) ) ;
    public final void ruleQueryOps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:269:2: ( ( ( rule__QueryOps__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:270:1: ( ( rule__QueryOps__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:270:1: ( ( rule__QueryOps__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:271:1: ( rule__QueryOps__Group__0 )
            {
             before(grammarAccess.getQueryOpsAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:272:1: ( rule__QueryOps__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:272:2: rule__QueryOps__Group__0
            {
            pushFollow(FOLLOW_rule__QueryOps__Group__0_in_ruleQueryOps515);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:284:1: entryRuleMultiple : ruleMultiple EOF ;
    public final void entryRuleMultiple() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:285:1: ( ruleMultiple EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:286:1: ruleMultiple EOF
            {
             before(grammarAccess.getMultipleRule()); 
            pushFollow(FOLLOW_ruleMultiple_in_entryRuleMultiple542);
            ruleMultiple();

            state._fsp--;

             after(grammarAccess.getMultipleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiple549); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:293:1: ruleMultiple : ( ( rule__Multiple__Alternatives ) ) ;
    public final void ruleMultiple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:297:2: ( ( ( rule__Multiple__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:298:1: ( ( rule__Multiple__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:298:1: ( ( rule__Multiple__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:299:1: ( rule__Multiple__Alternatives )
            {
             before(grammarAccess.getMultipleAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:300:1: ( rule__Multiple__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:300:2: rule__Multiple__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiple__Alternatives_in_ruleMultiple575);
            rule__Multiple__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleProtected"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:312:1: entryRuleProtected : ruleProtected EOF ;
    public final void entryRuleProtected() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:313:1: ( ruleProtected EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:314:1: ruleProtected EOF
            {
             before(grammarAccess.getProtectedRule()); 
            pushFollow(FOLLOW_ruleProtected_in_entryRuleProtected602);
            ruleProtected();

            state._fsp--;

             after(grammarAccess.getProtectedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProtected609); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:321:1: ruleProtected : ( ( rule__Protected__Alternatives ) ) ;
    public final void ruleProtected() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:325:2: ( ( ( rule__Protected__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:326:1: ( ( rule__Protected__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:326:1: ( ( rule__Protected__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:327:1: ( rule__Protected__Alternatives )
            {
             before(grammarAccess.getProtectedAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:328:1: ( rule__Protected__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:328:2: rule__Protected__Alternatives
            {
            pushFollow(FOLLOW_rule__Protected__Alternatives_in_ruleProtected635);
            rule__Protected__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtectedAccess().getAlternatives()); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:340:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:341:1: ( ruleMandatory EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:342:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory662);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory669); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:349:1: ruleMandatory : ( ( rule__Mandatory__Alternatives ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:353:2: ( ( ( rule__Mandatory__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:354:1: ( ( rule__Mandatory__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:354:1: ( ( rule__Mandatory__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:355:1: ( rule__Mandatory__Alternatives )
            {
             before(grammarAccess.getMandatoryAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:356:1: ( rule__Mandatory__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:356:2: rule__Mandatory__Alternatives
            {
            pushFollow(FOLLOW_rule__Mandatory__Alternatives_in_ruleMandatory695);
            rule__Mandatory__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getAlternatives()); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:368:1: entryRuleAutocreated : ruleAutocreated EOF ;
    public final void entryRuleAutocreated() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:369:1: ( ruleAutocreated EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:370:1: ruleAutocreated EOF
            {
             before(grammarAccess.getAutocreatedRule()); 
            pushFollow(FOLLOW_ruleAutocreated_in_entryRuleAutocreated722);
            ruleAutocreated();

            state._fsp--;

             after(grammarAccess.getAutocreatedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAutocreated729); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:377:1: ruleAutocreated : ( ( rule__Autocreated__Alternatives ) ) ;
    public final void ruleAutocreated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:381:2: ( ( ( rule__Autocreated__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:382:1: ( ( rule__Autocreated__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:382:1: ( ( rule__Autocreated__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:383:1: ( rule__Autocreated__Alternatives )
            {
             before(grammarAccess.getAutocreatedAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:384:1: ( rule__Autocreated__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:384:2: rule__Autocreated__Alternatives
            {
            pushFollow(FOLLOW_rule__Autocreated__Alternatives_in_ruleAutocreated755);
            rule__Autocreated__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAutocreatedAccess().getAlternatives()); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:396:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:397:1: ( rulePrimary EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:398:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary782);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary789); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:405:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:409:2: ( ( ( rule__Primary__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:410:1: ( ( rule__Primary__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:410:1: ( ( rule__Primary__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:411:1: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:412:1: ( rule__Primary__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:412:2: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary__Alternatives_in_rulePrimary815);
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


    // $ANTLR start "entryRulePrimaryItem"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:424:1: entryRulePrimaryItem : rulePrimaryItem EOF ;
    public final void entryRulePrimaryItem() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:425:1: ( rulePrimaryItem EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:426:1: rulePrimaryItem EOF
            {
             before(grammarAccess.getPrimaryItemRule()); 
            pushFollow(FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem842);
            rulePrimaryItem();

            state._fsp--;

             after(grammarAccess.getPrimaryItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryItem849); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:433:1: rulePrimaryItem : ( ( rule__PrimaryItem__Group__0 ) ) ;
    public final void rulePrimaryItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:437:2: ( ( ( rule__PrimaryItem__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:438:1: ( ( rule__PrimaryItem__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:438:1: ( ( rule__PrimaryItem__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:439:1: ( rule__PrimaryItem__Group__0 )
            {
             before(grammarAccess.getPrimaryItemAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:440:1: ( rule__PrimaryItem__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:440:2: rule__PrimaryItem__Group__0
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Group__0_in_rulePrimaryItem875);
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


    // $ANTLR start "entryRuleQueryable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:452:1: entryRuleQueryable : ruleQueryable EOF ;
    public final void entryRuleQueryable() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:453:1: ( ruleQueryable EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:454:1: ruleQueryable EOF
            {
             before(grammarAccess.getQueryableRule()); 
            pushFollow(FOLLOW_ruleQueryable_in_entryRuleQueryable902);
            ruleQueryable();

            state._fsp--;

             after(grammarAccess.getQueryableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQueryable909); 

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
    // $ANTLR end "entryRuleQueryable"


    // $ANTLR start "ruleQueryable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:461:1: ruleQueryable : ( ( rule__Queryable__Alternatives ) ) ;
    public final void ruleQueryable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:465:2: ( ( ( rule__Queryable__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:466:1: ( ( rule__Queryable__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:466:1: ( ( rule__Queryable__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:467:1: ( rule__Queryable__Alternatives )
            {
             before(grammarAccess.getQueryableAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:468:1: ( rule__Queryable__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:468:2: rule__Queryable__Alternatives
            {
            pushFollow(FOLLOW_rule__Queryable__Alternatives_in_ruleQueryable935);
            rule__Queryable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQueryableAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQueryable"


    // $ANTLR start "entryRuleNotqueryable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:480:1: entryRuleNotqueryable : ruleNotqueryable EOF ;
    public final void entryRuleNotqueryable() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:481:1: ( ruleNotqueryable EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:482:1: ruleNotqueryable EOF
            {
             before(grammarAccess.getNotqueryableRule()); 
            pushFollow(FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable962);
            ruleNotqueryable();

            state._fsp--;

             after(grammarAccess.getNotqueryableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotqueryable969); 

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
    // $ANTLR end "entryRuleNotqueryable"


    // $ANTLR start "ruleNotqueryable"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:489:1: ruleNotqueryable : ( ( rule__Notqueryable__Alternatives ) ) ;
    public final void ruleNotqueryable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:493:2: ( ( ( rule__Notqueryable__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:494:1: ( ( rule__Notqueryable__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:494:1: ( ( rule__Notqueryable__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:495:1: ( rule__Notqueryable__Alternatives )
            {
             before(grammarAccess.getNotqueryableAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:496:1: ( rule__Notqueryable__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:496:2: rule__Notqueryable__Alternatives
            {
            pushFollow(FOLLOW_rule__Notqueryable__Alternatives_in_ruleNotqueryable995);
            rule__Notqueryable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotqueryableAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNotqueryable"


    // $ANTLR start "entryRuleAbstract"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:508:1: entryRuleAbstract : ruleAbstract EOF ;
    public final void entryRuleAbstract() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:509:1: ( ruleAbstract EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:510:1: ruleAbstract EOF
            {
             before(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_ruleAbstract_in_entryRuleAbstract1022);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getAbstractRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstract1029); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:517:1: ruleAbstract : ( ( rule__Abstract__Alternatives ) ) ;
    public final void ruleAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:521:2: ( ( ( rule__Abstract__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:522:1: ( ( rule__Abstract__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:522:1: ( ( rule__Abstract__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:523:1: ( rule__Abstract__Alternatives )
            {
             before(grammarAccess.getAbstractAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:524:1: ( rule__Abstract__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:524:2: rule__Abstract__Alternatives
            {
            pushFollow(FOLLOW_rule__Abstract__Alternatives_in_ruleAbstract1055);
            rule__Abstract__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractAccess().getAlternatives()); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:536:1: entryRuleMixin : ruleMixin EOF ;
    public final void entryRuleMixin() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:537:1: ( ruleMixin EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:538:1: ruleMixin EOF
            {
             before(grammarAccess.getMixinRule()); 
            pushFollow(FOLLOW_ruleMixin_in_entryRuleMixin1082);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getMixinRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMixin1089); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:545:1: ruleMixin : ( ( rule__Mixin__Alternatives ) ) ;
    public final void ruleMixin() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:549:2: ( ( ( rule__Mixin__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:550:1: ( ( rule__Mixin__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:550:1: ( ( rule__Mixin__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:551:1: ( rule__Mixin__Alternatives )
            {
             before(grammarAccess.getMixinAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:552:1: ( rule__Mixin__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:552:2: rule__Mixin__Alternatives
            {
            pushFollow(FOLLOW_rule__Mixin__Alternatives_in_ruleMixin1115);
            rule__Mixin__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMixinAccess().getAlternatives()); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:564:1: entryRuleOrderable : ruleOrderable EOF ;
    public final void entryRuleOrderable() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:565:1: ( ruleOrderable EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:566:1: ruleOrderable EOF
            {
             before(grammarAccess.getOrderableRule()); 
            pushFollow(FOLLOW_ruleOrderable_in_entryRuleOrderable1142);
            ruleOrderable();

            state._fsp--;

             after(grammarAccess.getOrderableRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrderable1149); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:573:1: ruleOrderable : ( ( rule__Orderable__Alternatives ) ) ;
    public final void ruleOrderable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:577:2: ( ( ( rule__Orderable__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:578:1: ( ( rule__Orderable__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:578:1: ( ( rule__Orderable__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:579:1: ( rule__Orderable__Alternatives )
            {
             before(grammarAccess.getOrderableAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:580:1: ( rule__Orderable__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:580:2: rule__Orderable__Alternatives
            {
            pushFollow(FOLLOW_rule__Orderable__Alternatives_in_ruleOrderable1175);
            rule__Orderable__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderableAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleNsMapping"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:592:1: entryRuleNsMapping : ruleNsMapping EOF ;
    public final void entryRuleNsMapping() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:593:1: ( ruleNsMapping EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:594:1: ruleNsMapping EOF
            {
             before(grammarAccess.getNsMappingRule()); 
            pushFollow(FOLLOW_ruleNsMapping_in_entryRuleNsMapping1202);
            ruleNsMapping();

            state._fsp--;

             after(grammarAccess.getNsMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNsMapping1209); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:601:1: ruleNsMapping : ( ( rule__NsMapping__Group__0 ) ) ;
    public final void ruleNsMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:605:2: ( ( ( rule__NsMapping__Group__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:606:1: ( ( rule__NsMapping__Group__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:606:1: ( ( rule__NsMapping__Group__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:607:1: ( rule__NsMapping__Group__0 )
            {
             before(grammarAccess.getNsMappingAccess().getGroup()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:608:1: ( rule__NsMapping__Group__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:608:2: rule__NsMapping__Group__0
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__0_in_ruleNsMapping1235);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:620:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:621:1: ( rulePrefix EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:622:1: rulePrefix EOF
            {
             before(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_rulePrefix_in_entryRulePrefix1262);
            rulePrefix();

            state._fsp--;

             after(grammarAccess.getPrefixRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefix1269); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:629:1: rulePrefix : ( ruleXiD ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:633:2: ( ( ruleXiD ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:634:1: ( ruleXiD )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:634:1: ( ruleXiD )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:635:1: ruleXiD
            {
             before(grammarAccess.getPrefixAccess().getXiDParserRuleCall()); 
            pushFollow(FOLLOW_ruleXiD_in_rulePrefix1295);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:648:1: entryRuleUri : ruleUri EOF ;
    public final void entryRuleUri() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:649:1: ( ruleUri EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:650:1: ruleUri EOF
            {
             before(grammarAccess.getUriRule()); 
            pushFollow(FOLLOW_ruleUri_in_entryRuleUri1321);
            ruleUri();

            state._fsp--;

             after(grammarAccess.getUriRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUri1328); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:657:1: ruleUri : ( ruleJcrString ) ;
    public final void ruleUri() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:661:2: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:662:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:662:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:663:1: ruleJcrString
            {
             before(grammarAccess.getUriAccess().getJcrStringParserRuleCall()); 
            pushFollow(FOLLOW_ruleJcrString_in_ruleUri1354);
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


    // $ANTLR start "entryRuleJcrString"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:676:1: entryRuleJcrString : ruleJcrString EOF ;
    public final void entryRuleJcrString() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:677:1: ( ruleJcrString EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:678:1: ruleJcrString EOF
            {
             before(grammarAccess.getJcrStringRule()); 
            pushFollow(FOLLOW_ruleJcrString_in_entryRuleJcrString1380);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getJcrStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJcrString1387); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:685:1: ruleJcrString : ( ( rule__JcrString__Alternatives ) ) ;
    public final void ruleJcrString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:689:2: ( ( ( rule__JcrString__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:690:1: ( ( rule__JcrString__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:690:1: ( ( rule__JcrString__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:691:1: ( rule__JcrString__Alternatives )
            {
             before(grammarAccess.getJcrStringAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:692:1: ( rule__JcrString__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:692:2: rule__JcrString__Alternatives
            {
            pushFollow(FOLLOW_rule__JcrString__Alternatives_in_ruleJcrString1413);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:704:1: entryRuleXiD : ruleXiD EOF ;
    public final void entryRuleXiD() throws RecognitionException {
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:705:1: ( ruleXiD EOF )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:706:1: ruleXiD EOF
            {
             before(grammarAccess.getXiDRule()); 
            pushFollow(FOLLOW_ruleXiD_in_entryRuleXiD1440);
            ruleXiD();

            state._fsp--;

             after(grammarAccess.getXiDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXiD1447); 

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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:713:1: ruleXiD : ( ( rule__XiD__Alternatives ) ) ;
    public final void ruleXiD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:717:2: ( ( ( rule__XiD__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:718:1: ( ( rule__XiD__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:718:1: ( ( rule__XiD__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:719:1: ( rule__XiD__Alternatives )
            {
             before(grammarAccess.getXiDAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:720:1: ( rule__XiD__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:720:2: rule__XiD__Alternatives
            {
            pushFollow(FOLLOW_rule__XiD__Alternatives_in_ruleXiD1473);
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


    // $ANTLR start "ruleOpv"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:733:1: ruleOpv : ( ( rule__Opv__Alternatives ) ) ;
    public final void ruleOpv() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:737:1: ( ( ( rule__Opv__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:738:1: ( ( rule__Opv__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:738:1: ( ( rule__Opv__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:739:1: ( rule__Opv__Alternatives )
            {
             before(grammarAccess.getOpvAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:740:1: ( rule__Opv__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:740:2: rule__Opv__Alternatives
            {
            pushFollow(FOLLOW_rule__Opv__Alternatives_in_ruleOpv1510);
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


    // $ANTLR start "rulePropertyType"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:752:1: rulePropertyType : ( ( rule__PropertyType__Alternatives ) ) ;
    public final void rulePropertyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:756:1: ( ( ( rule__PropertyType__Alternatives ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:757:1: ( ( rule__PropertyType__Alternatives ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:757:1: ( ( rule__PropertyType__Alternatives ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:758:1: ( rule__PropertyType__Alternatives )
            {
             before(grammarAccess.getPropertyTypeAccess().getAlternatives()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:759:1: ( rule__PropertyType__Alternatives )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:759:2: rule__PropertyType__Alternatives
            {
            pushFollow(FOLLOW_rule__PropertyType__Alternatives_in_rulePropertyType1546);
            rule__PropertyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyTypeAccess().getAlternatives()); 

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


    // $ANTLR start "rule__Model__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:770:1: rule__Model__Alternatives : ( ( ( rule__Model__NamespacesAssignment_0 ) ) | ( ( rule__Model__NodeTypesAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:774:1: ( ( ( rule__Model__NamespacesAssignment_0 ) ) | ( ( rule__Model__NodeTypesAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==73) ) {
                alt2=1;
            }
            else if ( (LA2_0==64) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:775:1: ( ( rule__Model__NamespacesAssignment_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:775:1: ( ( rule__Model__NamespacesAssignment_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:776:1: ( rule__Model__NamespacesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getNamespacesAssignment_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:777:1: ( rule__Model__NamespacesAssignment_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:777:2: rule__Model__NamespacesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__NamespacesAssignment_0_in_rule__Model__Alternatives1581);
                    rule__Model__NamespacesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNamespacesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:781:6: ( ( rule__Model__NodeTypesAssignment_1 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:781:6: ( ( rule__Model__NodeTypesAssignment_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:782:1: ( rule__Model__NodeTypesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getNodeTypesAssignment_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:783:1: ( rule__Model__NodeTypesAssignment_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:783:2: rule__Model__NodeTypesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__NodeTypesAssignment_1_in_rule__Model__Alternatives1599);
                    rule__Model__NodeTypesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNodeTypesAssignment_1()); 

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


    // $ANTLR start "rule__NodeTypeDefinition__Alternatives_5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:792:1: rule__NodeTypeDefinition__Alternatives_5 : ( ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) ) | ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) ) );
    public final void rule__NodeTypeDefinition__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:796:1: ( ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) ) | ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==72) ) {
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:797:1: ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:797:1: ( ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:798:1: ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsAssignment_5_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:799:1: ( rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:799:2: rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0_in_rule__NodeTypeDefinition__Alternatives_51632);
                    rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:803:6: ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:803:6: ( ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:804:1: ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsAssignment_5_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:805:1: ( rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:805:2: rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1_in_rule__NodeTypeDefinition__Alternatives_51650);
                    rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsAssignment_5_1()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Alternatives_5"


    // $ANTLR start "rule__NodeDefinition__Alternatives_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:814:1: rule__NodeDefinition__Alternatives_1 : ( ( ( rule__NodeDefinition__NameAssignment_1_0 ) ) | ( ( rule__NodeDefinition__NameAssignment_1_1 ) ) );
    public final void rule__NodeDefinition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:818:1: ( ( ( rule__NodeDefinition__NameAssignment_1_0 ) ) | ( ( rule__NodeDefinition__NameAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_EXID)||LA4_0==41) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:819:1: ( ( rule__NodeDefinition__NameAssignment_1_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:819:1: ( ( rule__NodeDefinition__NameAssignment_1_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:820:1: ( rule__NodeDefinition__NameAssignment_1_0 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:821:1: ( rule__NodeDefinition__NameAssignment_1_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:821:2: rule__NodeDefinition__NameAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__NameAssignment_1_0_in_rule__NodeDefinition__Alternatives_11683);
                    rule__NodeDefinition__NameAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:825:6: ( ( rule__NodeDefinition__NameAssignment_1_1 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:825:6: ( ( rule__NodeDefinition__NameAssignment_1_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:826:1: ( rule__NodeDefinition__NameAssignment_1_1 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:827:1: ( rule__NodeDefinition__NameAssignment_1_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:827:2: rule__NodeDefinition__NameAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__NameAssignment_1_1_in_rule__NodeDefinition__Alternatives_11701);
                    rule__NodeDefinition__NameAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getNameAssignment_1_1()); 

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
    // $ANTLR end "rule__NodeDefinition__Alternatives_1"


    // $ANTLR start "rule__Sns__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:836:1: rule__Sns__Alternatives : ( ( 'sns' ) | ( '*' ) | ( 'multiple' ) );
    public final void rule__Sns__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:840:1: ( ( 'sns' ) | ( '*' ) | ( 'multiple' ) )
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:841:1: ( 'sns' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:841:1: ( 'sns' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:842:1: 'sns'
                    {
                     before(grammarAccess.getSnsAccess().getSnsKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__Sns__Alternatives1735); 
                     after(grammarAccess.getSnsAccess().getSnsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:849:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:849:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:850:1: '*'
                    {
                     before(grammarAccess.getSnsAccess().getAsteriskKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Sns__Alternatives1755); 
                     after(grammarAccess.getSnsAccess().getAsteriskKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:857:6: ( 'multiple' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:857:6: ( 'multiple' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:858:1: 'multiple'
                    {
                     before(grammarAccess.getSnsAccess().getMultipleKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__Sns__Alternatives1775); 
                     after(grammarAccess.getSnsAccess().getMultipleKeyword_2()); 

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
    // $ANTLR end "rule__Sns__Alternatives"


    // $ANTLR start "rule__PropertyDefinition__Alternatives_2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:870:1: rule__PropertyDefinition__Alternatives_2 : ( ( ( rule__PropertyDefinition__NameAssignment_2_0 ) ) | ( '*' ) );
    public final void rule__PropertyDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:874:1: ( ( ( rule__PropertyDefinition__NameAssignment_2_0 ) ) | ( '*' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_EXID)||LA6_0==41) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:875:1: ( ( rule__PropertyDefinition__NameAssignment_2_0 ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:875:1: ( ( rule__PropertyDefinition__NameAssignment_2_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:876:1: ( rule__PropertyDefinition__NameAssignment_2_0 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:877:1: ( rule__PropertyDefinition__NameAssignment_2_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:877:2: rule__PropertyDefinition__NameAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_2_0_in_rule__PropertyDefinition__Alternatives_21809);
                    rule__PropertyDefinition__NameAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:881:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:881:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:882:1: '*'
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getAsteriskKeyword_2_1()); 
                    match(input,13,FOLLOW_13_in_rule__PropertyDefinition__Alternatives_21828); 
                     after(grammarAccess.getPropertyDefinitionAccess().getAsteriskKeyword_2_1()); 

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
    // $ANTLR end "rule__PropertyDefinition__Alternatives_2"


    // $ANTLR start "rule__NoQueryOrder__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:894:1: rule__NoQueryOrder__Alternatives : ( ( 'noqueryorder' ) | ( 'nqord' ) );
    public final void rule__NoQueryOrder__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:898:1: ( ( 'noqueryorder' ) | ( 'nqord' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:899:1: ( 'noqueryorder' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:899:1: ( 'noqueryorder' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:900:1: 'noqueryorder'
                    {
                     before(grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0()); 
                    match(input,15,FOLLOW_15_in_rule__NoQueryOrder__Alternatives1863); 
                     after(grammarAccess.getNoQueryOrderAccess().getNoqueryorderKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:907:6: ( 'nqord' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:907:6: ( 'nqord' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:908:1: 'nqord'
                    {
                     before(grammarAccess.getNoQueryOrderAccess().getNqordKeyword_1()); 
                    match(input,16,FOLLOW_16_in_rule__NoQueryOrder__Alternatives1883); 
                     after(grammarAccess.getNoQueryOrderAccess().getNqordKeyword_1()); 

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
    // $ANTLR end "rule__NoQueryOrder__Alternatives"


    // $ANTLR start "rule__NoFullText__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:920:1: rule__NoFullText__Alternatives : ( ( 'nofulltext' ) | ( 'nof' ) );
    public final void rule__NoFullText__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:924:1: ( ( 'nofulltext' ) | ( 'nof' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:925:1: ( 'nofulltext' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:925:1: ( 'nofulltext' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:926:1: 'nofulltext'
                    {
                     before(grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0()); 
                    match(input,17,FOLLOW_17_in_rule__NoFullText__Alternatives1918); 
                     after(grammarAccess.getNoFullTextAccess().getNofulltextKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:933:6: ( 'nof' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:933:6: ( 'nof' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:934:1: 'nof'
                    {
                     before(grammarAccess.getNoFullTextAccess().getNofKeyword_1()); 
                    match(input,18,FOLLOW_18_in_rule__NoFullText__Alternatives1938); 
                     after(grammarAccess.getNoFullTextAccess().getNofKeyword_1()); 

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
    // $ANTLR end "rule__NoFullText__Alternatives"


    // $ANTLR start "rule__QueryOps__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:946:1: rule__QueryOps__Alternatives_0 : ( ( 'queryops' ) | ( 'qop' ) );
    public final void rule__QueryOps__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:950:1: ( ( 'queryops' ) | ( 'qop' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            else if ( (LA9_0==20) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:951:1: ( 'queryops' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:951:1: ( 'queryops' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:952:1: 'queryops'
                    {
                     before(grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__QueryOps__Alternatives_01973); 
                     after(grammarAccess.getQueryOpsAccess().getQueryopsKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:959:6: ( 'qop' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:959:6: ( 'qop' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:960:1: 'qop'
                    {
                     before(grammarAccess.getQueryOpsAccess().getQopKeyword_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__QueryOps__Alternatives_01993); 
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


    // $ANTLR start "rule__Multiple__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:972:1: rule__Multiple__Alternatives : ( ( 'multiple' ) | ( 'mul' ) | ( '*' ) );
    public final void rule__Multiple__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:976:1: ( ( 'multiple' ) | ( 'mul' ) | ( '*' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 13:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:977:1: ( 'multiple' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:977:1: ( 'multiple' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:978:1: 'multiple'
                    {
                     before(grammarAccess.getMultipleAccess().getMultipleKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__Multiple__Alternatives2028); 
                     after(grammarAccess.getMultipleAccess().getMultipleKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:985:6: ( 'mul' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:985:6: ( 'mul' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:986:1: 'mul'
                    {
                     before(grammarAccess.getMultipleAccess().getMulKeyword_1()); 
                    match(input,21,FOLLOW_21_in_rule__Multiple__Alternatives2048); 
                     after(grammarAccess.getMultipleAccess().getMulKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:993:6: ( '*' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:993:6: ( '*' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:994:1: '*'
                    {
                     before(grammarAccess.getMultipleAccess().getAsteriskKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__Multiple__Alternatives2068); 
                     after(grammarAccess.getMultipleAccess().getAsteriskKeyword_2()); 

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
    // $ANTLR end "rule__Multiple__Alternatives"


    // $ANTLR start "rule__Protected__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1006:1: rule__Protected__Alternatives : ( ( 'protected' ) | ( 'pro' ) | ( 'p' ) );
    public final void rule__Protected__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1010:1: ( ( 'protected' ) | ( 'pro' ) | ( 'p' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1011:1: ( 'protected' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1011:1: ( 'protected' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1012:1: 'protected'
                    {
                     before(grammarAccess.getProtectedAccess().getProtectedKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__Protected__Alternatives2103); 
                     after(grammarAccess.getProtectedAccess().getProtectedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1019:6: ( 'pro' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1019:6: ( 'pro' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1020:1: 'pro'
                    {
                     before(grammarAccess.getProtectedAccess().getProKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__Protected__Alternatives2123); 
                     after(grammarAccess.getProtectedAccess().getProKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1027:6: ( 'p' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1027:6: ( 'p' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1028:1: 'p'
                    {
                     before(grammarAccess.getProtectedAccess().getPKeyword_2()); 
                    match(input,24,FOLLOW_24_in_rule__Protected__Alternatives2143); 
                     after(grammarAccess.getProtectedAccess().getPKeyword_2()); 

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
    // $ANTLR end "rule__Protected__Alternatives"


    // $ANTLR start "rule__Mandatory__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1040:1: rule__Mandatory__Alternatives : ( ( 'mandatory' ) | ( 'man' ) | ( 'm' ) );
    public final void rule__Mandatory__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1044:1: ( ( 'mandatory' ) | ( 'man' ) | ( 'm' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1045:1: ( 'mandatory' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1045:1: ( 'mandatory' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1046:1: 'mandatory'
                    {
                     before(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 
                    match(input,25,FOLLOW_25_in_rule__Mandatory__Alternatives2178); 
                     after(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1053:6: ( 'man' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1053:6: ( 'man' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1054:1: 'man'
                    {
                     before(grammarAccess.getMandatoryAccess().getManKeyword_1()); 
                    match(input,26,FOLLOW_26_in_rule__Mandatory__Alternatives2198); 
                     after(grammarAccess.getMandatoryAccess().getManKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1061:6: ( 'm' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1061:6: ( 'm' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1062:1: 'm'
                    {
                     before(grammarAccess.getMandatoryAccess().getMKeyword_2()); 
                    match(input,27,FOLLOW_27_in_rule__Mandatory__Alternatives2218); 
                     after(grammarAccess.getMandatoryAccess().getMKeyword_2()); 

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
    // $ANTLR end "rule__Mandatory__Alternatives"


    // $ANTLR start "rule__Autocreated__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1074:1: rule__Autocreated__Alternatives : ( ( 'autocreated' ) | ( 'aut' ) | ( 'a' ) );
    public final void rule__Autocreated__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1078:1: ( ( 'autocreated' ) | ( 'aut' ) | ( 'a' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1079:1: ( 'autocreated' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1079:1: ( 'autocreated' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1080:1: 'autocreated'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0()); 
                    match(input,28,FOLLOW_28_in_rule__Autocreated__Alternatives2253); 
                     after(grammarAccess.getAutocreatedAccess().getAutocreatedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1087:6: ( 'aut' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1087:6: ( 'aut' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1088:1: 'aut'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAutKeyword_1()); 
                    match(input,29,FOLLOW_29_in_rule__Autocreated__Alternatives2273); 
                     after(grammarAccess.getAutocreatedAccess().getAutKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1095:6: ( 'a' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1095:6: ( 'a' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1096:1: 'a'
                    {
                     before(grammarAccess.getAutocreatedAccess().getAKeyword_2()); 
                    match(input,30,FOLLOW_30_in_rule__Autocreated__Alternatives2293); 
                     after(grammarAccess.getAutocreatedAccess().getAKeyword_2()); 

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
    // $ANTLR end "rule__Autocreated__Alternatives"


    // $ANTLR start "rule__Primary__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1108:1: rule__Primary__Alternatives : ( ( 'primary' ) | ( '!' ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1112:1: ( ( 'primary' ) | ( '!' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            else if ( (LA14_0==32) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1113:1: ( 'primary' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1113:1: ( 'primary' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1114:1: 'primary'
                    {
                     before(grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 
                    match(input,31,FOLLOW_31_in_rule__Primary__Alternatives2328); 
                     after(grammarAccess.getPrimaryAccess().getPrimaryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1121:6: ( '!' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1121:6: ( '!' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1122:1: '!'
                    {
                     before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1()); 
                    match(input,32,FOLLOW_32_in_rule__Primary__Alternatives2348); 
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


    // $ANTLR start "rule__PrimaryItem__Alternatives_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1134:1: rule__PrimaryItem__Alternatives_0 : ( ( 'primaryitem' ) | ( '!' ) );
    public final void rule__PrimaryItem__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1138:1: ( ( 'primaryitem' ) | ( '!' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1139:1: ( 'primaryitem' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1139:1: ( 'primaryitem' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1140:1: 'primaryitem'
                    {
                     before(grammarAccess.getPrimaryItemAccess().getPrimaryitemKeyword_0_0()); 
                    match(input,33,FOLLOW_33_in_rule__PrimaryItem__Alternatives_02383); 
                     after(grammarAccess.getPrimaryItemAccess().getPrimaryitemKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1147:6: ( '!' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1147:6: ( '!' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1148:1: '!'
                    {
                     before(grammarAccess.getPrimaryItemAccess().getExclamationMarkKeyword_0_1()); 
                    match(input,32,FOLLOW_32_in_rule__PrimaryItem__Alternatives_02403); 
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


    // $ANTLR start "rule__Queryable__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1160:1: rule__Queryable__Alternatives : ( ( 'query' ) | ( 'q' ) );
    public final void rule__Queryable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1164:1: ( ( 'query' ) | ( 'q' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            else if ( (LA16_0==35) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1165:1: ( 'query' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1165:1: ( 'query' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1166:1: 'query'
                    {
                     before(grammarAccess.getQueryableAccess().getQueryKeyword_0()); 
                    match(input,34,FOLLOW_34_in_rule__Queryable__Alternatives2438); 
                     after(grammarAccess.getQueryableAccess().getQueryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1173:6: ( 'q' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1173:6: ( 'q' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1174:1: 'q'
                    {
                     before(grammarAccess.getQueryableAccess().getQKeyword_1()); 
                    match(input,35,FOLLOW_35_in_rule__Queryable__Alternatives2458); 
                     after(grammarAccess.getQueryableAccess().getQKeyword_1()); 

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
    // $ANTLR end "rule__Queryable__Alternatives"


    // $ANTLR start "rule__Notqueryable__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1186:1: rule__Notqueryable__Alternatives : ( ( 'noquery' ) | ( 'nq' ) );
    public final void rule__Notqueryable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1190:1: ( ( 'noquery' ) | ( 'nq' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            else if ( (LA17_0==37) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1191:1: ( 'noquery' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1191:1: ( 'noquery' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1192:1: 'noquery'
                    {
                     before(grammarAccess.getNotqueryableAccess().getNoqueryKeyword_0()); 
                    match(input,36,FOLLOW_36_in_rule__Notqueryable__Alternatives2493); 
                     after(grammarAccess.getNotqueryableAccess().getNoqueryKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1199:6: ( 'nq' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1199:6: ( 'nq' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1200:1: 'nq'
                    {
                     before(grammarAccess.getNotqueryableAccess().getNqKeyword_1()); 
                    match(input,37,FOLLOW_37_in_rule__Notqueryable__Alternatives2513); 
                     after(grammarAccess.getNotqueryableAccess().getNqKeyword_1()); 

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
    // $ANTLR end "rule__Notqueryable__Alternatives"


    // $ANTLR start "rule__Abstract__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1212:1: rule__Abstract__Alternatives : ( ( 'abstract' ) | ( 'abs' ) | ( 'a' ) );
    public final void rule__Abstract__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1216:1: ( ( 'abstract' ) | ( 'abs' ) | ( 'a' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 30:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1217:1: ( 'abstract' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1217:1: ( 'abstract' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1218:1: 'abstract'
                    {
                     before(grammarAccess.getAbstractAccess().getAbstractKeyword_0()); 
                    match(input,38,FOLLOW_38_in_rule__Abstract__Alternatives2548); 
                     after(grammarAccess.getAbstractAccess().getAbstractKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1225:6: ( 'abs' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1225:6: ( 'abs' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1226:1: 'abs'
                    {
                     before(grammarAccess.getAbstractAccess().getAbsKeyword_1()); 
                    match(input,39,FOLLOW_39_in_rule__Abstract__Alternatives2568); 
                     after(grammarAccess.getAbstractAccess().getAbsKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1233:6: ( 'a' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1233:6: ( 'a' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1234:1: 'a'
                    {
                     before(grammarAccess.getAbstractAccess().getAKeyword_2()); 
                    match(input,30,FOLLOW_30_in_rule__Abstract__Alternatives2588); 
                     after(grammarAccess.getAbstractAccess().getAKeyword_2()); 

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
    // $ANTLR end "rule__Abstract__Alternatives"


    // $ANTLR start "rule__Mixin__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1246:1: rule__Mixin__Alternatives : ( ( 'mixin' ) | ( 'mix' ) | ( 'm' ) );
    public final void rule__Mixin__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1250:1: ( ( 'mixin' ) | ( 'mix' ) | ( 'm' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt19=1;
                }
                break;
            case 41:
                {
                alt19=2;
                }
                break;
            case 27:
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
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1251:1: ( 'mixin' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1251:1: ( 'mixin' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1252:1: 'mixin'
                    {
                     before(grammarAccess.getMixinAccess().getMixinKeyword_0()); 
                    match(input,40,FOLLOW_40_in_rule__Mixin__Alternatives2623); 
                     after(grammarAccess.getMixinAccess().getMixinKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1259:6: ( 'mix' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1259:6: ( 'mix' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1260:1: 'mix'
                    {
                     before(grammarAccess.getMixinAccess().getMixKeyword_1()); 
                    match(input,41,FOLLOW_41_in_rule__Mixin__Alternatives2643); 
                     after(grammarAccess.getMixinAccess().getMixKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1267:6: ( 'm' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1267:6: ( 'm' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1268:1: 'm'
                    {
                     before(grammarAccess.getMixinAccess().getMKeyword_2()); 
                    match(input,27,FOLLOW_27_in_rule__Mixin__Alternatives2663); 
                     after(grammarAccess.getMixinAccess().getMKeyword_2()); 

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
    // $ANTLR end "rule__Mixin__Alternatives"


    // $ANTLR start "rule__Orderable__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1280:1: rule__Orderable__Alternatives : ( ( 'orderable' ) | ( 'ord' ) | ( 'o' ) );
    public final void rule__Orderable__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1284:1: ( ( 'orderable' ) | ( 'ord' ) | ( 'o' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt20=1;
                }
                break;
            case 43:
                {
                alt20=2;
                }
                break;
            case 44:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1285:1: ( 'orderable' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1285:1: ( 'orderable' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1286:1: 'orderable'
                    {
                     before(grammarAccess.getOrderableAccess().getOrderableKeyword_0()); 
                    match(input,42,FOLLOW_42_in_rule__Orderable__Alternatives2698); 
                     after(grammarAccess.getOrderableAccess().getOrderableKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1293:6: ( 'ord' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1293:6: ( 'ord' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1294:1: 'ord'
                    {
                     before(grammarAccess.getOrderableAccess().getOrdKeyword_1()); 
                    match(input,43,FOLLOW_43_in_rule__Orderable__Alternatives2718); 
                     after(grammarAccess.getOrderableAccess().getOrdKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1301:6: ( 'o' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1301:6: ( 'o' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1302:1: 'o'
                    {
                     before(grammarAccess.getOrderableAccess().getOKeyword_2()); 
                    match(input,44,FOLLOW_44_in_rule__Orderable__Alternatives2738); 
                     after(grammarAccess.getOrderableAccess().getOKeyword_2()); 

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
    // $ANTLR end "rule__Orderable__Alternatives"


    // $ANTLR start "rule__JcrString__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1314:1: rule__JcrString__Alternatives : ( ( RULE_STRING ) | ( ruleXiD ) );
    public final void rule__JcrString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1318:1: ( ( RULE_STRING ) | ( ruleXiD ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_EXID||LA21_0==41) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1319:1: ( RULE_STRING )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1319:1: ( RULE_STRING )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1320:1: RULE_STRING
                    {
                     before(grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JcrString__Alternatives2772); 
                     after(grammarAccess.getJcrStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1325:6: ( ruleXiD )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1325:6: ( ruleXiD )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1326:1: ruleXiD
                    {
                     before(grammarAccess.getJcrStringAccess().getXiDParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleXiD_in_rule__JcrString__Alternatives2789);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1336:1: rule__XiD__Alternatives : ( ( RULE_EXID ) | ( 'mix' ) );
    public final void rule__XiD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1340:1: ( ( RULE_EXID ) | ( 'mix' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_EXID) ) {
                alt22=1;
            }
            else if ( (LA22_0==41) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1341:1: ( RULE_EXID )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1341:1: ( RULE_EXID )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1342:1: RULE_EXID
                    {
                     before(grammarAccess.getXiDAccess().getEXIDTerminalRuleCall_0()); 
                    match(input,RULE_EXID,FOLLOW_RULE_EXID_in_rule__XiD__Alternatives2821); 
                     after(grammarAccess.getXiDAccess().getEXIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1347:6: ( 'mix' )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1347:6: ( 'mix' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1348:1: 'mix'
                    {
                     before(grammarAccess.getXiDAccess().getMixKeyword_1()); 
                    match(input,41,FOLLOW_41_in_rule__XiD__Alternatives2839); 
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


    // $ANTLR start "rule__Opv__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1360:1: rule__Opv__Alternatives : ( ( ( 'COPY' ) ) | ( ( 'VERSION' ) ) | ( ( 'INITIALIZE' ) ) | ( ( 'COMPUTE' ) ) | ( ( 'IGNORE' ) ) | ( ( 'ABORT' ) ) );
    public final void rule__Opv__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1364:1: ( ( ( 'COPY' ) ) | ( ( 'VERSION' ) ) | ( ( 'INITIALIZE' ) ) | ( ( 'COMPUTE' ) ) | ( ( 'IGNORE' ) ) | ( ( 'ABORT' ) ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt23=1;
                }
                break;
            case 46:
                {
                alt23=2;
                }
                break;
            case 47:
                {
                alt23=3;
                }
                break;
            case 48:
                {
                alt23=4;
                }
                break;
            case 49:
                {
                alt23=5;
                }
                break;
            case 50:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1365:1: ( ( 'COPY' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1365:1: ( ( 'COPY' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1366:1: ( 'COPY' )
                    {
                     before(grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1367:1: ( 'COPY' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1367:3: 'COPY'
                    {
                    match(input,45,FOLLOW_45_in_rule__Opv__Alternatives2874); 

                    }

                     after(grammarAccess.getOpvAccess().getCOPYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1372:6: ( ( 'VERSION' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1372:6: ( ( 'VERSION' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1373:1: ( 'VERSION' )
                    {
                     before(grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1374:1: ( 'VERSION' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1374:3: 'VERSION'
                    {
                    match(input,46,FOLLOW_46_in_rule__Opv__Alternatives2895); 

                    }

                     after(grammarAccess.getOpvAccess().getVERSIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1379:6: ( ( 'INITIALIZE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1379:6: ( ( 'INITIALIZE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1380:1: ( 'INITIALIZE' )
                    {
                     before(grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1381:1: ( 'INITIALIZE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1381:3: 'INITIALIZE'
                    {
                    match(input,47,FOLLOW_47_in_rule__Opv__Alternatives2916); 

                    }

                     after(grammarAccess.getOpvAccess().getINITIALIZEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1386:6: ( ( 'COMPUTE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1386:6: ( ( 'COMPUTE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1387:1: ( 'COMPUTE' )
                    {
                     before(grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1388:1: ( 'COMPUTE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1388:3: 'COMPUTE'
                    {
                    match(input,48,FOLLOW_48_in_rule__Opv__Alternatives2937); 

                    }

                     after(grammarAccess.getOpvAccess().getCOMPUTEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1393:6: ( ( 'IGNORE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1393:6: ( ( 'IGNORE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1394:1: ( 'IGNORE' )
                    {
                     before(grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1395:1: ( 'IGNORE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1395:3: 'IGNORE'
                    {
                    match(input,49,FOLLOW_49_in_rule__Opv__Alternatives2958); 

                    }

                     after(grammarAccess.getOpvAccess().getIGNOREEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1400:6: ( ( 'ABORT' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1400:6: ( ( 'ABORT' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1401:1: ( 'ABORT' )
                    {
                     before(grammarAccess.getOpvAccess().getABORTEnumLiteralDeclaration_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1402:1: ( 'ABORT' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1402:3: 'ABORT'
                    {
                    match(input,50,FOLLOW_50_in_rule__Opv__Alternatives2979); 

                    }

                     after(grammarAccess.getOpvAccess().getABORTEnumLiteralDeclaration_5()); 

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


    // $ANTLR start "rule__PropertyType__Alternatives"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1412:1: rule__PropertyType__Alternatives : ( ( ( 'UNDEFINED' ) ) | ( ( 'STRING' ) ) | ( ( 'BINARY' ) ) | ( ( 'LONG' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'DATE' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'NAME' ) ) | ( ( 'PATH' ) ) | ( ( 'REFERENCE' ) ) | ( ( 'WEAKREFERENCE' ) ) | ( ( 'URI' ) ) | ( ( 'DECIMAL' ) ) );
    public final void rule__PropertyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1416:1: ( ( ( 'UNDEFINED' ) ) | ( ( 'STRING' ) ) | ( ( 'BINARY' ) ) | ( ( 'LONG' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'DATE' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'NAME' ) ) | ( ( 'PATH' ) ) | ( ( 'REFERENCE' ) ) | ( ( 'WEAKREFERENCE' ) ) | ( ( 'URI' ) ) | ( ( 'DECIMAL' ) ) )
            int alt24=13;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt24=1;
                }
                break;
            case 52:
                {
                alt24=2;
                }
                break;
            case 53:
                {
                alt24=3;
                }
                break;
            case 54:
                {
                alt24=4;
                }
                break;
            case 55:
                {
                alt24=5;
                }
                break;
            case 56:
                {
                alt24=6;
                }
                break;
            case 57:
                {
                alt24=7;
                }
                break;
            case 58:
                {
                alt24=8;
                }
                break;
            case 59:
                {
                alt24=9;
                }
                break;
            case 60:
                {
                alt24=10;
                }
                break;
            case 61:
                {
                alt24=11;
                }
                break;
            case 62:
                {
                alt24=12;
                }
                break;
            case 63:
                {
                alt24=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1417:1: ( ( 'UNDEFINED' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1417:1: ( ( 'UNDEFINED' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1418:1: ( 'UNDEFINED' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1419:1: ( 'UNDEFINED' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1419:3: 'UNDEFINED'
                    {
                    match(input,51,FOLLOW_51_in_rule__PropertyType__Alternatives3015); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getUNDEFINEDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1424:6: ( ( 'STRING' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1424:6: ( ( 'STRING' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1425:1: ( 'STRING' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1426:1: ( 'STRING' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1426:3: 'STRING'
                    {
                    match(input,52,FOLLOW_52_in_rule__PropertyType__Alternatives3036); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1431:6: ( ( 'BINARY' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1431:6: ( ( 'BINARY' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1432:1: ( 'BINARY' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1433:1: ( 'BINARY' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1433:3: 'BINARY'
                    {
                    match(input,53,FOLLOW_53_in_rule__PropertyType__Alternatives3057); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTBINARYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1438:6: ( ( 'LONG' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1438:6: ( ( 'LONG' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1439:1: ( 'LONG' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1440:1: ( 'LONG' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1440:3: 'LONG'
                    {
                    match(input,54,FOLLOW_54_in_rule__PropertyType__Alternatives3078); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTLONGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1445:6: ( ( 'DOUBLE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1445:6: ( ( 'DOUBLE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1446:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1447:1: ( 'DOUBLE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1447:3: 'DOUBLE'
                    {
                    match(input,55,FOLLOW_55_in_rule__PropertyType__Alternatives3099); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTDOUBLEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1452:6: ( ( 'DATE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1452:6: ( ( 'DATE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1453:1: ( 'DATE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1454:1: ( 'DATE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1454:3: 'DATE'
                    {
                    match(input,56,FOLLOW_56_in_rule__PropertyType__Alternatives3120); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getDDATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1459:6: ( ( 'BOOLEAN' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1459:6: ( ( 'BOOLEAN' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1460:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1461:1: ( 'BOOLEAN' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1461:3: 'BOOLEAN'
                    {
                    match(input,57,FOLLOW_57_in_rule__PropertyType__Alternatives3141); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTBOOLEANEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1466:6: ( ( 'NAME' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1466:6: ( ( 'NAME' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1467:1: ( 'NAME' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1468:1: ( 'NAME' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1468:3: 'NAME'
                    {
                    match(input,58,FOLLOW_58_in_rule__PropertyType__Alternatives3162); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTNAMEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1473:6: ( ( 'PATH' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1473:6: ( ( 'PATH' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1474:1: ( 'PATH' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1475:1: ( 'PATH' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1475:3: 'PATH'
                    {
                    match(input,59,FOLLOW_59_in_rule__PropertyType__Alternatives3183); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTPATHEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1480:6: ( ( 'REFERENCE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1480:6: ( ( 'REFERENCE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1481:1: ( 'REFERENCE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1482:1: ( 'REFERENCE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1482:3: 'REFERENCE'
                    {
                    match(input,60,FOLLOW_60_in_rule__PropertyType__Alternatives3204); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTREFERENCEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1487:6: ( ( 'WEAKREFERENCE' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1487:6: ( ( 'WEAKREFERENCE' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1488:1: ( 'WEAKREFERENCE' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1489:1: ( 'WEAKREFERENCE' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1489:3: 'WEAKREFERENCE'
                    {
                    match(input,61,FOLLOW_61_in_rule__PropertyType__Alternatives3225); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTWEAKREFERENCEEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1494:6: ( ( 'URI' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1494:6: ( ( 'URI' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1495:1: ( 'URI' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1496:1: ( 'URI' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1496:3: 'URI'
                    {
                    match(input,62,FOLLOW_62_in_rule__PropertyType__Alternatives3246); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTURIEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1501:6: ( ( 'DECIMAL' ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1501:6: ( ( 'DECIMAL' ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1502:1: ( 'DECIMAL' )
                    {
                     before(grammarAccess.getPropertyTypeAccess().getTDECIMALEnumLiteralDeclaration_12()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1503:1: ( 'DECIMAL' )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1503:3: 'DECIMAL'
                    {
                    match(input,63,FOLLOW_63_in_rule__PropertyType__Alternatives3267); 

                    }

                     after(grammarAccess.getPropertyTypeAccess().getTDECIMALEnumLiteralDeclaration_12()); 

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
    // $ANTLR end "rule__PropertyType__Alternatives"


    // $ANTLR start "rule__NodeTypeDefinition__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1515:1: rule__NodeTypeDefinition__Group__0 : rule__NodeTypeDefinition__Group__0__Impl rule__NodeTypeDefinition__Group__1 ;
    public final void rule__NodeTypeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1519:1: ( rule__NodeTypeDefinition__Group__0__Impl rule__NodeTypeDefinition__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1520:2: rule__NodeTypeDefinition__Group__0__Impl rule__NodeTypeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__0__Impl_in_rule__NodeTypeDefinition__Group__03300);
            rule__NodeTypeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__1_in_rule__NodeTypeDefinition__Group__03303);
            rule__NodeTypeDefinition__Group__1();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__0"


    // $ANTLR start "rule__NodeTypeDefinition__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1527:1: rule__NodeTypeDefinition__Group__0__Impl : ( '[' ) ;
    public final void rule__NodeTypeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1531:1: ( ( '[' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1532:1: ( '[' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1532:1: ( '[' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1533:1: '['
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,64,FOLLOW_64_in_rule__NodeTypeDefinition__Group__0__Impl3331); 
             after(grammarAccess.getNodeTypeDefinitionAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__0__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1546:1: rule__NodeTypeDefinition__Group__1 : rule__NodeTypeDefinition__Group__1__Impl rule__NodeTypeDefinition__Group__2 ;
    public final void rule__NodeTypeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1550:1: ( rule__NodeTypeDefinition__Group__1__Impl rule__NodeTypeDefinition__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1551:2: rule__NodeTypeDefinition__Group__1__Impl rule__NodeTypeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__1__Impl_in_rule__NodeTypeDefinition__Group__13362);
            rule__NodeTypeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__2_in_rule__NodeTypeDefinition__Group__13365);
            rule__NodeTypeDefinition__Group__2();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__1"


    // $ANTLR start "rule__NodeTypeDefinition__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1558:1: rule__NodeTypeDefinition__Group__1__Impl : ( ( rule__NodeTypeDefinition__NameAssignment_1 ) ) ;
    public final void rule__NodeTypeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1562:1: ( ( ( rule__NodeTypeDefinition__NameAssignment_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1563:1: ( ( rule__NodeTypeDefinition__NameAssignment_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1563:1: ( ( rule__NodeTypeDefinition__NameAssignment_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1564:1: ( rule__NodeTypeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getNameAssignment_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1565:1: ( rule__NodeTypeDefinition__NameAssignment_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1565:2: rule__NodeTypeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__NameAssignment_1_in_rule__NodeTypeDefinition__Group__1__Impl3392);
            rule__NodeTypeDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__1__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1575:1: rule__NodeTypeDefinition__Group__2 : rule__NodeTypeDefinition__Group__2__Impl rule__NodeTypeDefinition__Group__3 ;
    public final void rule__NodeTypeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1579:1: ( rule__NodeTypeDefinition__Group__2__Impl rule__NodeTypeDefinition__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1580:2: rule__NodeTypeDefinition__Group__2__Impl rule__NodeTypeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__2__Impl_in_rule__NodeTypeDefinition__Group__23422);
            rule__NodeTypeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__3_in_rule__NodeTypeDefinition__Group__23425);
            rule__NodeTypeDefinition__Group__3();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__2"


    // $ANTLR start "rule__NodeTypeDefinition__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1587:1: rule__NodeTypeDefinition__Group__2__Impl : ( ']' ) ;
    public final void rule__NodeTypeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1591:1: ( ( ']' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1592:1: ( ']' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1592:1: ( ']' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1593:1: ']'
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getRightSquareBracketKeyword_2()); 
            match(input,65,FOLLOW_65_in_rule__NodeTypeDefinition__Group__2__Impl3453); 
             after(grammarAccess.getNodeTypeDefinitionAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__2__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1606:1: rule__NodeTypeDefinition__Group__3 : rule__NodeTypeDefinition__Group__3__Impl rule__NodeTypeDefinition__Group__4 ;
    public final void rule__NodeTypeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1610:1: ( rule__NodeTypeDefinition__Group__3__Impl rule__NodeTypeDefinition__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1611:2: rule__NodeTypeDefinition__Group__3__Impl rule__NodeTypeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__3__Impl_in_rule__NodeTypeDefinition__Group__33484);
            rule__NodeTypeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__4_in_rule__NodeTypeDefinition__Group__33487);
            rule__NodeTypeDefinition__Group__4();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__3"


    // $ANTLR start "rule__NodeTypeDefinition__Group__3__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1618:1: rule__NodeTypeDefinition__Group__3__Impl : ( ( rule__NodeTypeDefinition__Group_3__0 )? ) ;
    public final void rule__NodeTypeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1622:1: ( ( ( rule__NodeTypeDefinition__Group_3__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1623:1: ( ( rule__NodeTypeDefinition__Group_3__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1623:1: ( ( rule__NodeTypeDefinition__Group_3__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1624:1: ( rule__NodeTypeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getGroup_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1625:1: ( rule__NodeTypeDefinition__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==66) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1625:2: rule__NodeTypeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__0_in_rule__NodeTypeDefinition__Group__3__Impl3514);
                    rule__NodeTypeDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__3__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1635:1: rule__NodeTypeDefinition__Group__4 : rule__NodeTypeDefinition__Group__4__Impl rule__NodeTypeDefinition__Group__5 ;
    public final void rule__NodeTypeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1639:1: ( rule__NodeTypeDefinition__Group__4__Impl rule__NodeTypeDefinition__Group__5 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1640:2: rule__NodeTypeDefinition__Group__4__Impl rule__NodeTypeDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__4__Impl_in_rule__NodeTypeDefinition__Group__43545);
            rule__NodeTypeDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__5_in_rule__NodeTypeDefinition__Group__43548);
            rule__NodeTypeDefinition__Group__5();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__4"


    // $ANTLR start "rule__NodeTypeDefinition__Group__4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1647:1: rule__NodeTypeDefinition__Group__4__Impl : ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) ) ;
    public final void rule__NodeTypeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1651:1: ( ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1652:1: ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1652:1: ( ( rule__NodeTypeDefinition__UnorderedGroup_4 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1653:1: ( rule__NodeTypeDefinition__UnorderedGroup_4 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1654:1: ( rule__NodeTypeDefinition__UnorderedGroup_4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1654:2: rule__NodeTypeDefinition__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4_in_rule__NodeTypeDefinition__Group__4__Impl3575);
            rule__NodeTypeDefinition__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__4__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group__5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1664:1: rule__NodeTypeDefinition__Group__5 : rule__NodeTypeDefinition__Group__5__Impl ;
    public final void rule__NodeTypeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1668:1: ( rule__NodeTypeDefinition__Group__5__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1669:2: rule__NodeTypeDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group__5__Impl_in_rule__NodeTypeDefinition__Group__53605);
            rule__NodeTypeDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__5"


    // $ANTLR start "rule__NodeTypeDefinition__Group__5__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1675:1: rule__NodeTypeDefinition__Group__5__Impl : ( ( rule__NodeTypeDefinition__Alternatives_5 )* ) ;
    public final void rule__NodeTypeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1679:1: ( ( ( rule__NodeTypeDefinition__Alternatives_5 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1680:1: ( ( rule__NodeTypeDefinition__Alternatives_5 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1680:1: ( ( rule__NodeTypeDefinition__Alternatives_5 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1681:1: ( rule__NodeTypeDefinition__Alternatives_5 )*
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getAlternatives_5()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1682:1: ( rule__NodeTypeDefinition__Alternatives_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==68||LA26_0==72) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1682:2: rule__NodeTypeDefinition__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__NodeTypeDefinition__Alternatives_5_in_rule__NodeTypeDefinition__Group__5__Impl3632);
            	    rule__NodeTypeDefinition__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getNodeTypeDefinitionAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group__5__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1704:1: rule__NodeTypeDefinition__Group_3__0 : rule__NodeTypeDefinition__Group_3__0__Impl rule__NodeTypeDefinition__Group_3__1 ;
    public final void rule__NodeTypeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1708:1: ( rule__NodeTypeDefinition__Group_3__0__Impl rule__NodeTypeDefinition__Group_3__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1709:2: rule__NodeTypeDefinition__Group_3__0__Impl rule__NodeTypeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__0__Impl_in_rule__NodeTypeDefinition__Group_3__03675);
            rule__NodeTypeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__1_in_rule__NodeTypeDefinition__Group_3__03678);
            rule__NodeTypeDefinition__Group_3__1();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__0"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1716:1: rule__NodeTypeDefinition__Group_3__0__Impl : ( '>' ) ;
    public final void rule__NodeTypeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1720:1: ( ( '>' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1721:1: ( '>' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1721:1: ( '>' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1722:1: '>'
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getGreaterThanSignKeyword_3_0()); 
            match(input,66,FOLLOW_66_in_rule__NodeTypeDefinition__Group_3__0__Impl3706); 
             after(grammarAccess.getNodeTypeDefinitionAccess().getGreaterThanSignKeyword_3_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1735:1: rule__NodeTypeDefinition__Group_3__1 : rule__NodeTypeDefinition__Group_3__1__Impl rule__NodeTypeDefinition__Group_3__2 ;
    public final void rule__NodeTypeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1739:1: ( rule__NodeTypeDefinition__Group_3__1__Impl rule__NodeTypeDefinition__Group_3__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1740:2: rule__NodeTypeDefinition__Group_3__1__Impl rule__NodeTypeDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__1__Impl_in_rule__NodeTypeDefinition__Group_3__13737);
            rule__NodeTypeDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__2_in_rule__NodeTypeDefinition__Group_3__13740);
            rule__NodeTypeDefinition__Group_3__2();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__1"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1747:1: rule__NodeTypeDefinition__Group_3__1__Impl : ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) ) ;
    public final void rule__NodeTypeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1751:1: ( ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1752:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1752:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1753:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesAssignment_3_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1754:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1754:2: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1_in_rule__NodeTypeDefinition__Group_3__1__Impl3767);
            rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesAssignment_3_1()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1764:1: rule__NodeTypeDefinition__Group_3__2 : rule__NodeTypeDefinition__Group_3__2__Impl ;
    public final void rule__NodeTypeDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1768:1: ( rule__NodeTypeDefinition__Group_3__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1769:2: rule__NodeTypeDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3__2__Impl_in_rule__NodeTypeDefinition__Group_3__23797);
            rule__NodeTypeDefinition__Group_3__2__Impl();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__2"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1775:1: rule__NodeTypeDefinition__Group_3__2__Impl : ( ( rule__NodeTypeDefinition__Group_3_2__0 )* ) ;
    public final void rule__NodeTypeDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1779:1: ( ( ( rule__NodeTypeDefinition__Group_3_2__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1780:1: ( ( rule__NodeTypeDefinition__Group_3_2__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1780:1: ( ( rule__NodeTypeDefinition__Group_3_2__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1781:1: ( rule__NodeTypeDefinition__Group_3_2__0 )*
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getGroup_3_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1782:1: ( rule__NodeTypeDefinition__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==67) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1782:2: rule__NodeTypeDefinition__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__0_in_rule__NodeTypeDefinition__Group_3__2__Impl3824);
            	    rule__NodeTypeDefinition__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getNodeTypeDefinitionAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3_2__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1798:1: rule__NodeTypeDefinition__Group_3_2__0 : rule__NodeTypeDefinition__Group_3_2__0__Impl rule__NodeTypeDefinition__Group_3_2__1 ;
    public final void rule__NodeTypeDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1802:1: ( rule__NodeTypeDefinition__Group_3_2__0__Impl rule__NodeTypeDefinition__Group_3_2__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1803:2: rule__NodeTypeDefinition__Group_3_2__0__Impl rule__NodeTypeDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__0__Impl_in_rule__NodeTypeDefinition__Group_3_2__03861);
            rule__NodeTypeDefinition__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__1_in_rule__NodeTypeDefinition__Group_3_2__03864);
            rule__NodeTypeDefinition__Group_3_2__1();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_3_2__0"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3_2__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1810:1: rule__NodeTypeDefinition__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__NodeTypeDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1814:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1815:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1815:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1816:1: ','
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getCommaKeyword_3_2_0()); 
            match(input,67,FOLLOW_67_in_rule__NodeTypeDefinition__Group_3_2__0__Impl3892); 
             after(grammarAccess.getNodeTypeDefinitionAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3_2__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1829:1: rule__NodeTypeDefinition__Group_3_2__1 : rule__NodeTypeDefinition__Group_3_2__1__Impl ;
    public final void rule__NodeTypeDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1833:1: ( rule__NodeTypeDefinition__Group_3_2__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1834:2: rule__NodeTypeDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__Group_3_2__1__Impl_in_rule__NodeTypeDefinition__Group_3_2__13923);
            rule__NodeTypeDefinition__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_3_2__1"


    // $ANTLR start "rule__NodeTypeDefinition__Group_3_2__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1840:1: rule__NodeTypeDefinition__Group_3_2__1__Impl : ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) ) ;
    public final void rule__NodeTypeDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1844:1: ( ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1845:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1845:1: ( ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1846:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 )
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesAssignment_3_2_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1847:1: ( rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1847:2: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1_in_rule__NodeTypeDefinition__Group_3_2__1__Impl3950);
            rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesAssignment_3_2_1()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1861:1: rule__NodeDefinition__Group__0 : rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 ;
    public final void rule__NodeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1865:1: ( rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1866:2: rule__NodeDefinition__Group__0__Impl rule__NodeDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__0__Impl_in_rule__NodeDefinition__Group__03984);
            rule__NodeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__1_in_rule__NodeDefinition__Group__03987);
            rule__NodeDefinition__Group__1();

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
    // $ANTLR end "rule__NodeDefinition__Group__0"


    // $ANTLR start "rule__NodeDefinition__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1873:1: rule__NodeDefinition__Group__0__Impl : ( '+' ) ;
    public final void rule__NodeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1877:1: ( ( '+' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1878:1: ( '+' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1878:1: ( '+' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1879:1: '+'
            {
             before(grammarAccess.getNodeDefinitionAccess().getPlusSignKeyword_0()); 
            match(input,68,FOLLOW_68_in_rule__NodeDefinition__Group__0__Impl4015); 
             after(grammarAccess.getNodeDefinitionAccess().getPlusSignKeyword_0()); 

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
    // $ANTLR end "rule__NodeDefinition__Group__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1892:1: rule__NodeDefinition__Group__1 : rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 ;
    public final void rule__NodeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1896:1: ( rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1897:2: rule__NodeDefinition__Group__1__Impl rule__NodeDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__1__Impl_in_rule__NodeDefinition__Group__14046);
            rule__NodeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__2_in_rule__NodeDefinition__Group__14049);
            rule__NodeDefinition__Group__2();

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
    // $ANTLR end "rule__NodeDefinition__Group__1"


    // $ANTLR start "rule__NodeDefinition__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1904:1: rule__NodeDefinition__Group__1__Impl : ( ( rule__NodeDefinition__Alternatives_1 ) ) ;
    public final void rule__NodeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1908:1: ( ( ( rule__NodeDefinition__Alternatives_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1909:1: ( ( rule__NodeDefinition__Alternatives_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1909:1: ( ( rule__NodeDefinition__Alternatives_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1910:1: ( rule__NodeDefinition__Alternatives_1 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getAlternatives_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1911:1: ( rule__NodeDefinition__Alternatives_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1911:2: rule__NodeDefinition__Alternatives_1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Alternatives_1_in_rule__NodeDefinition__Group__1__Impl4076);
            rule__NodeDefinition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__NodeDefinition__Group__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1921:1: rule__NodeDefinition__Group__2 : rule__NodeDefinition__Group__2__Impl rule__NodeDefinition__Group__3 ;
    public final void rule__NodeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1925:1: ( rule__NodeDefinition__Group__2__Impl rule__NodeDefinition__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1926:2: rule__NodeDefinition__Group__2__Impl rule__NodeDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__2__Impl_in_rule__NodeDefinition__Group__24106);
            rule__NodeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__3_in_rule__NodeDefinition__Group__24109);
            rule__NodeDefinition__Group__3();

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
    // $ANTLR end "rule__NodeDefinition__Group__2"


    // $ANTLR start "rule__NodeDefinition__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1933:1: rule__NodeDefinition__Group__2__Impl : ( ( rule__NodeDefinition__Group_2__0 )? ) ;
    public final void rule__NodeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1937:1: ( ( ( rule__NodeDefinition__Group_2__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1938:1: ( ( rule__NodeDefinition__Group_2__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1938:1: ( ( rule__NodeDefinition__Group_2__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1939:1: ( rule__NodeDefinition__Group_2__0 )?
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1940:1: ( rule__NodeDefinition__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==69) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1940:2: rule__NodeDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__Group_2__0_in_rule__NodeDefinition__Group__2__Impl4136);
                    rule__NodeDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeDefinitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NodeDefinition__Group__2__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1950:1: rule__NodeDefinition__Group__3 : rule__NodeDefinition__Group__3__Impl rule__NodeDefinition__Group__4 ;
    public final void rule__NodeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1954:1: ( rule__NodeDefinition__Group__3__Impl rule__NodeDefinition__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1955:2: rule__NodeDefinition__Group__3__Impl rule__NodeDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__3__Impl_in_rule__NodeDefinition__Group__34167);
            rule__NodeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group__4_in_rule__NodeDefinition__Group__34170);
            rule__NodeDefinition__Group__4();

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
    // $ANTLR end "rule__NodeDefinition__Group__3"


    // $ANTLR start "rule__NodeDefinition__Group__3__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1962:1: rule__NodeDefinition__Group__3__Impl : ( ( rule__NodeDefinition__Group_3__0 )? ) ;
    public final void rule__NodeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1966:1: ( ( ( rule__NodeDefinition__Group_3__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1967:1: ( ( rule__NodeDefinition__Group_3__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1967:1: ( ( rule__NodeDefinition__Group_3__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1968:1: ( rule__NodeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1969:1: ( rule__NodeDefinition__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==71) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1969:2: rule__NodeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__Group_3__0_in_rule__NodeDefinition__Group__3__Impl4197);
                    rule__NodeDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeDefinitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__NodeDefinition__Group__3__Impl"


    // $ANTLR start "rule__NodeDefinition__Group__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1979:1: rule__NodeDefinition__Group__4 : rule__NodeDefinition__Group__4__Impl ;
    public final void rule__NodeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1983:1: ( rule__NodeDefinition__Group__4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1984:2: rule__NodeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group__4__Impl_in_rule__NodeDefinition__Group__44228);
            rule__NodeDefinition__Group__4__Impl();

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
    // $ANTLR end "rule__NodeDefinition__Group__4"


    // $ANTLR start "rule__NodeDefinition__Group__4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1990:1: rule__NodeDefinition__Group__4__Impl : ( ( rule__NodeDefinition__UnorderedGroup_4 ) ) ;
    public final void rule__NodeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1994:1: ( ( ( rule__NodeDefinition__UnorderedGroup_4 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1995:1: ( ( rule__NodeDefinition__UnorderedGroup_4 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1995:1: ( ( rule__NodeDefinition__UnorderedGroup_4 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1996:1: ( rule__NodeDefinition__UnorderedGroup_4 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1997:1: ( rule__NodeDefinition__UnorderedGroup_4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:1997:2: rule__NodeDefinition__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4_in_rule__NodeDefinition__Group__4__Impl4255);
            rule__NodeDefinition__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4()); 

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
    // $ANTLR end "rule__NodeDefinition__Group__4__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2017:1: rule__NodeDefinition__Group_2__0 : rule__NodeDefinition__Group_2__0__Impl rule__NodeDefinition__Group_2__1 ;
    public final void rule__NodeDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2021:1: ( rule__NodeDefinition__Group_2__0__Impl rule__NodeDefinition__Group_2__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2022:2: rule__NodeDefinition__Group_2__0__Impl rule__NodeDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__0__Impl_in_rule__NodeDefinition__Group_2__04295);
            rule__NodeDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__1_in_rule__NodeDefinition__Group_2__04298);
            rule__NodeDefinition__Group_2__1();

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
    // $ANTLR end "rule__NodeDefinition__Group_2__0"


    // $ANTLR start "rule__NodeDefinition__Group_2__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2029:1: rule__NodeDefinition__Group_2__0__Impl : ( '(' ) ;
    public final void rule__NodeDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2033:1: ( ( '(' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2034:1: ( '(' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2034:1: ( '(' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2035:1: '('
            {
             before(grammarAccess.getNodeDefinitionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,69,FOLLOW_69_in_rule__NodeDefinition__Group_2__0__Impl4326); 
             after(grammarAccess.getNodeDefinitionAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__NodeDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2048:1: rule__NodeDefinition__Group_2__1 : rule__NodeDefinition__Group_2__1__Impl rule__NodeDefinition__Group_2__2 ;
    public final void rule__NodeDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2052:1: ( rule__NodeDefinition__Group_2__1__Impl rule__NodeDefinition__Group_2__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2053:2: rule__NodeDefinition__Group_2__1__Impl rule__NodeDefinition__Group_2__2
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__1__Impl_in_rule__NodeDefinition__Group_2__14357);
            rule__NodeDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__2_in_rule__NodeDefinition__Group_2__14360);
            rule__NodeDefinition__Group_2__2();

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
    // $ANTLR end "rule__NodeDefinition__Group_2__1"


    // $ANTLR start "rule__NodeDefinition__Group_2__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2060:1: rule__NodeDefinition__Group_2__1__Impl : ( ( rule__NodeDefinition__Group_2_1__0 ) ) ;
    public final void rule__NodeDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2064:1: ( ( ( rule__NodeDefinition__Group_2_1__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2065:1: ( ( rule__NodeDefinition__Group_2_1__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2065:1: ( ( rule__NodeDefinition__Group_2_1__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2066:1: ( rule__NodeDefinition__Group_2_1__0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_2_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2067:1: ( rule__NodeDefinition__Group_2_1__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2067:2: rule__NodeDefinition__Group_2_1__0
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__0_in_rule__NodeDefinition__Group_2__1__Impl4387);
            rule__NodeDefinition__Group_2_1__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__NodeDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2077:1: rule__NodeDefinition__Group_2__2 : rule__NodeDefinition__Group_2__2__Impl ;
    public final void rule__NodeDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2081:1: ( rule__NodeDefinition__Group_2__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2082:2: rule__NodeDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2__2__Impl_in_rule__NodeDefinition__Group_2__24417);
            rule__NodeDefinition__Group_2__2__Impl();

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
    // $ANTLR end "rule__NodeDefinition__Group_2__2"


    // $ANTLR start "rule__NodeDefinition__Group_2__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2088:1: rule__NodeDefinition__Group_2__2__Impl : ( ')' ) ;
    public final void rule__NodeDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2092:1: ( ( ')' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2093:1: ( ')' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2093:1: ( ')' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2094:1: ')'
            {
             before(grammarAccess.getNodeDefinitionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,70,FOLLOW_70_in_rule__NodeDefinition__Group_2__2__Impl4445); 
             after(grammarAccess.getNodeDefinitionAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__NodeDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2113:1: rule__NodeDefinition__Group_2_1__0 : rule__NodeDefinition__Group_2_1__0__Impl rule__NodeDefinition__Group_2_1__1 ;
    public final void rule__NodeDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2117:1: ( rule__NodeDefinition__Group_2_1__0__Impl rule__NodeDefinition__Group_2_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2118:2: rule__NodeDefinition__Group_2_1__0__Impl rule__NodeDefinition__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__0__Impl_in_rule__NodeDefinition__Group_2_1__04482);
            rule__NodeDefinition__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__1_in_rule__NodeDefinition__Group_2_1__04485);
            rule__NodeDefinition__Group_2_1__1();

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
    // $ANTLR end "rule__NodeDefinition__Group_2_1__0"


    // $ANTLR start "rule__NodeDefinition__Group_2_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2125:1: rule__NodeDefinition__Group_2_1__0__Impl : ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) ) ;
    public final void rule__NodeDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2129:1: ( ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2130:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2130:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2131:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesAssignment_2_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2132:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2132:2: rule__NodeDefinition__RequiredTypesAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_0_in_rule__NodeDefinition__Group_2_1__0__Impl4512);
            rule__NodeDefinition__RequiredTypesAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getRequiredTypesAssignment_2_1_0()); 

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
    // $ANTLR end "rule__NodeDefinition__Group_2_1__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2142:1: rule__NodeDefinition__Group_2_1__1 : rule__NodeDefinition__Group_2_1__1__Impl ;
    public final void rule__NodeDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2146:1: ( rule__NodeDefinition__Group_2_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2147:2: rule__NodeDefinition__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1__1__Impl_in_rule__NodeDefinition__Group_2_1__14542);
            rule__NodeDefinition__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__NodeDefinition__Group_2_1__1"


    // $ANTLR start "rule__NodeDefinition__Group_2_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2153:1: rule__NodeDefinition__Group_2_1__1__Impl : ( ( rule__NodeDefinition__Group_2_1_1__0 )* ) ;
    public final void rule__NodeDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2157:1: ( ( ( rule__NodeDefinition__Group_2_1_1__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2158:1: ( ( rule__NodeDefinition__Group_2_1_1__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2158:1: ( ( rule__NodeDefinition__Group_2_1_1__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2159:1: ( rule__NodeDefinition__Group_2_1_1__0 )*
            {
             before(grammarAccess.getNodeDefinitionAccess().getGroup_2_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2160:1: ( rule__NodeDefinition__Group_2_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==67) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2160:2: rule__NodeDefinition__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__0_in_rule__NodeDefinition__Group_2_1__1__Impl4569);
            	    rule__NodeDefinition__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getNodeDefinitionAccess().getGroup_2_1_1()); 

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
    // $ANTLR end "rule__NodeDefinition__Group_2_1__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2_1_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2174:1: rule__NodeDefinition__Group_2_1_1__0 : rule__NodeDefinition__Group_2_1_1__0__Impl rule__NodeDefinition__Group_2_1_1__1 ;
    public final void rule__NodeDefinition__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2178:1: ( rule__NodeDefinition__Group_2_1_1__0__Impl rule__NodeDefinition__Group_2_1_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2179:2: rule__NodeDefinition__Group_2_1_1__0__Impl rule__NodeDefinition__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__0__Impl_in_rule__NodeDefinition__Group_2_1_1__04604);
            rule__NodeDefinition__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__1_in_rule__NodeDefinition__Group_2_1_1__04607);
            rule__NodeDefinition__Group_2_1_1__1();

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
    // $ANTLR end "rule__NodeDefinition__Group_2_1_1__0"


    // $ANTLR start "rule__NodeDefinition__Group_2_1_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2186:1: rule__NodeDefinition__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__NodeDefinition__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2190:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2191:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2191:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2192:1: ','
            {
             before(grammarAccess.getNodeDefinitionAccess().getCommaKeyword_2_1_1_0()); 
            match(input,67,FOLLOW_67_in_rule__NodeDefinition__Group_2_1_1__0__Impl4635); 
             after(grammarAccess.getNodeDefinitionAccess().getCommaKeyword_2_1_1_0()); 

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
    // $ANTLR end "rule__NodeDefinition__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_2_1_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2205:1: rule__NodeDefinition__Group_2_1_1__1 : rule__NodeDefinition__Group_2_1_1__1__Impl ;
    public final void rule__NodeDefinition__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2209:1: ( rule__NodeDefinition__Group_2_1_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2210:2: rule__NodeDefinition__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_2_1_1__1__Impl_in_rule__NodeDefinition__Group_2_1_1__14666);
            rule__NodeDefinition__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__NodeDefinition__Group_2_1_1__1"


    // $ANTLR start "rule__NodeDefinition__Group_2_1_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2216:1: rule__NodeDefinition__Group_2_1_1__1__Impl : ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) ) ;
    public final void rule__NodeDefinition__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2220:1: ( ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2221:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2221:1: ( ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2222:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesAssignment_2_1_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2223:1: ( rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2223:2: rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1_in_rule__NodeDefinition__Group_2_1_1__1__Impl4693);
            rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getRequiredTypesAssignment_2_1_1_1()); 

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
    // $ANTLR end "rule__NodeDefinition__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_3__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2237:1: rule__NodeDefinition__Group_3__0 : rule__NodeDefinition__Group_3__0__Impl rule__NodeDefinition__Group_3__1 ;
    public final void rule__NodeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2241:1: ( rule__NodeDefinition__Group_3__0__Impl rule__NodeDefinition__Group_3__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2242:2: rule__NodeDefinition__Group_3__0__Impl rule__NodeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_3__0__Impl_in_rule__NodeDefinition__Group_3__04727);
            rule__NodeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NodeDefinition__Group_3__1_in_rule__NodeDefinition__Group_3__04730);
            rule__NodeDefinition__Group_3__1();

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
    // $ANTLR end "rule__NodeDefinition__Group_3__0"


    // $ANTLR start "rule__NodeDefinition__Group_3__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2249:1: rule__NodeDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__NodeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2253:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2254:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2254:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2255:1: '='
            {
             before(grammarAccess.getNodeDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,71,FOLLOW_71_in_rule__NodeDefinition__Group_3__0__Impl4758); 
             after(grammarAccess.getNodeDefinitionAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__NodeDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__NodeDefinition__Group_3__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2268:1: rule__NodeDefinition__Group_3__1 : rule__NodeDefinition__Group_3__1__Impl ;
    public final void rule__NodeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2272:1: ( rule__NodeDefinition__Group_3__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2273:2: rule__NodeDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__Group_3__1__Impl_in_rule__NodeDefinition__Group_3__14789);
            rule__NodeDefinition__Group_3__1__Impl();

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
    // $ANTLR end "rule__NodeDefinition__Group_3__1"


    // $ANTLR start "rule__NodeDefinition__Group_3__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2279:1: rule__NodeDefinition__Group_3__1__Impl : ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) ) ;
    public final void rule__NodeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2283:1: ( ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2284:1: ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2284:1: ( ( rule__NodeDefinition__DefaultTypeAssignment_3_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2285:1: ( rule__NodeDefinition__DefaultTypeAssignment_3_1 )
            {
             before(grammarAccess.getNodeDefinitionAccess().getDefaultTypeAssignment_3_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2286:1: ( rule__NodeDefinition__DefaultTypeAssignment_3_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2286:2: rule__NodeDefinition__DefaultTypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__NodeDefinition__DefaultTypeAssignment_3_1_in_rule__NodeDefinition__Group_3__1__Impl4816);
            rule__NodeDefinition__DefaultTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeDefinitionAccess().getDefaultTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__NodeDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2300:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2304:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2305:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__04850);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__04853);
            rule__PropertyDefinition__Group__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group__0"


    // $ANTLR start "rule__PropertyDefinition__Group__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2312:1: rule__PropertyDefinition__Group__0__Impl : ( () ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2316:1: ( ( () ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2317:1: ( () )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2317:1: ( () )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2318:1: ()
            {
             before(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2319:1: ()
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2321:1: 
            {
            }

             after(grammarAccess.getPropertyDefinitionAccess().getPropertyDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2331:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2335:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2336:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__14911);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__14914);
            rule__PropertyDefinition__Group__2();

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
    // $ANTLR end "rule__PropertyDefinition__Group__1"


    // $ANTLR start "rule__PropertyDefinition__Group__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2343:1: rule__PropertyDefinition__Group__1__Impl : ( '-' ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2347:1: ( ( '-' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2348:1: ( '-' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2348:1: ( '-' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2349:1: '-'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getHyphenMinusKeyword_1()); 
            match(input,72,FOLLOW_72_in_rule__PropertyDefinition__Group__1__Impl4942); 
             after(grammarAccess.getPropertyDefinitionAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2362:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2366:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2367:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__24973);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__24976);
            rule__PropertyDefinition__Group__3();

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
    // $ANTLR end "rule__PropertyDefinition__Group__2"


    // $ANTLR start "rule__PropertyDefinition__Group__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2374:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__Alternatives_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2378:1: ( ( ( rule__PropertyDefinition__Alternatives_2 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2379:1: ( ( rule__PropertyDefinition__Alternatives_2 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2379:1: ( ( rule__PropertyDefinition__Alternatives_2 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2380:1: ( rule__PropertyDefinition__Alternatives_2 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAlternatives_2()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2381:1: ( rule__PropertyDefinition__Alternatives_2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2381:2: rule__PropertyDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Alternatives_2_in_rule__PropertyDefinition__Group__2__Impl5003);
            rule__PropertyDefinition__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2391:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2395:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2396:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__35033);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__35036);
            rule__PropertyDefinition__Group__4();

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
    // $ANTLR end "rule__PropertyDefinition__Group__3"


    // $ANTLR start "rule__PropertyDefinition__Group__3__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2403:1: rule__PropertyDefinition__Group__3__Impl : ( ( rule__PropertyDefinition__Group_3__0 )? ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2407:1: ( ( ( rule__PropertyDefinition__Group_3__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2408:1: ( ( rule__PropertyDefinition__Group_3__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2408:1: ( ( rule__PropertyDefinition__Group_3__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2409:1: ( rule__PropertyDefinition__Group_3__0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2410:1: ( rule__PropertyDefinition__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==69) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2410:2: rule__PropertyDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__0_in_rule__PropertyDefinition__Group__3__Impl5063);
                    rule__PropertyDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group__3__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2420:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2424:1: ( rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2425:2: rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__45094);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__45097);
            rule__PropertyDefinition__Group__5();

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
    // $ANTLR end "rule__PropertyDefinition__Group__4"


    // $ANTLR start "rule__PropertyDefinition__Group__4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2432:1: rule__PropertyDefinition__Group__4__Impl : ( ( rule__PropertyDefinition__Group_4__0 )? ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2436:1: ( ( ( rule__PropertyDefinition__Group_4__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2437:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2437:1: ( ( rule__PropertyDefinition__Group_4__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2438:1: ( rule__PropertyDefinition__Group_4__0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2439:1: ( rule__PropertyDefinition__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==71) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2439:2: rule__PropertyDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__0_in_rule__PropertyDefinition__Group__4__Impl5124);
                    rule__PropertyDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group__4__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2449:1: rule__PropertyDefinition__Group__5 : rule__PropertyDefinition__Group__5__Impl rule__PropertyDefinition__Group__6 ;
    public final void rule__PropertyDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2453:1: ( rule__PropertyDefinition__Group__5__Impl rule__PropertyDefinition__Group__6 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2454:2: rule__PropertyDefinition__Group__5__Impl rule__PropertyDefinition__Group__6
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__55155);
            rule__PropertyDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__6_in_rule__PropertyDefinition__Group__55158);
            rule__PropertyDefinition__Group__6();

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
    // $ANTLR end "rule__PropertyDefinition__Group__5"


    // $ANTLR start "rule__PropertyDefinition__Group__5__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2461:1: rule__PropertyDefinition__Group__5__Impl : ( ( rule__PropertyDefinition__UnorderedGroup_5 ) ) ;
    public final void rule__PropertyDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2465:1: ( ( ( rule__PropertyDefinition__UnorderedGroup_5 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2466:1: ( ( rule__PropertyDefinition__UnorderedGroup_5 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2466:1: ( ( rule__PropertyDefinition__UnorderedGroup_5 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2467:1: ( rule__PropertyDefinition__UnorderedGroup_5 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2468:1: ( rule__PropertyDefinition__UnorderedGroup_5 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2468:2: rule__PropertyDefinition__UnorderedGroup_5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5_in_rule__PropertyDefinition__Group__5__Impl5185);
            rule__PropertyDefinition__UnorderedGroup_5();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group__5__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__6"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2478:1: rule__PropertyDefinition__Group__6 : rule__PropertyDefinition__Group__6__Impl ;
    public final void rule__PropertyDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2482:1: ( rule__PropertyDefinition__Group__6__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2483:2: rule__PropertyDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__6__Impl_in_rule__PropertyDefinition__Group__65215);
            rule__PropertyDefinition__Group__6__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group__6"


    // $ANTLR start "rule__PropertyDefinition__Group__6__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2489:1: rule__PropertyDefinition__Group__6__Impl : ( ( rule__PropertyDefinition__Group_6__0 )? ) ;
    public final void rule__PropertyDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2493:1: ( ( ( rule__PropertyDefinition__Group_6__0 )? ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2494:1: ( ( rule__PropertyDefinition__Group_6__0 )? )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2494:1: ( ( rule__PropertyDefinition__Group_6__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2495:1: ( rule__PropertyDefinition__Group_6__0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_6()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2496:1: ( rule__PropertyDefinition__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==73) ) {
                switch ( input.LA(2) ) {
                    case RULE_STRING:
                        {
                        alt33=1;
                        }
                        break;
                    case RULE_EXID:
                        {
                        int LA33_4 = input.LA(3);

                        if ( (LA33_4==EOF||LA33_4==64||(LA33_4>=67 && LA33_4<=68)||(LA33_4>=72 && LA33_4<=73)) ) {
                            alt33=1;
                        }
                        }
                        break;
                    case 41:
                        {
                        int LA33_5 = input.LA(3);

                        if ( (LA33_5==EOF||LA33_5==64||(LA33_5>=67 && LA33_5<=68)||(LA33_5>=72 && LA33_5<=73)) ) {
                            alt33=1;
                        }
                        }
                        break;
                }

            }
            switch (alt33) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2496:2: rule__PropertyDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__0_in_rule__PropertyDefinition__Group__6__Impl5242);
                    rule__PropertyDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group__6__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_3__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2520:1: rule__PropertyDefinition__Group_3__0 : rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1 ;
    public final void rule__PropertyDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2524:1: ( rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2525:2: rule__PropertyDefinition__Group_3__0__Impl rule__PropertyDefinition__Group_3__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__0__Impl_in_rule__PropertyDefinition__Group_3__05287);
            rule__PropertyDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__1_in_rule__PropertyDefinition__Group_3__05290);
            rule__PropertyDefinition__Group_3__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_3__0"


    // $ANTLR start "rule__PropertyDefinition__Group_3__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2532:1: rule__PropertyDefinition__Group_3__0__Impl : ( '(' ) ;
    public final void rule__PropertyDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2536:1: ( ( '(' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2537:1: ( '(' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2537:1: ( '(' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2538:1: '('
            {
             before(grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,69,FOLLOW_69_in_rule__PropertyDefinition__Group_3__0__Impl5318); 
             after(grammarAccess.getPropertyDefinitionAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_3__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2551:1: rule__PropertyDefinition__Group_3__1 : rule__PropertyDefinition__Group_3__1__Impl rule__PropertyDefinition__Group_3__2 ;
    public final void rule__PropertyDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2555:1: ( rule__PropertyDefinition__Group_3__1__Impl rule__PropertyDefinition__Group_3__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2556:2: rule__PropertyDefinition__Group_3__1__Impl rule__PropertyDefinition__Group_3__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__1__Impl_in_rule__PropertyDefinition__Group_3__15349);
            rule__PropertyDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__2_in_rule__PropertyDefinition__Group_3__15352);
            rule__PropertyDefinition__Group_3__2();

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
    // $ANTLR end "rule__PropertyDefinition__Group_3__1"


    // $ANTLR start "rule__PropertyDefinition__Group_3__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2563:1: rule__PropertyDefinition__Group_3__1__Impl : ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) ) ;
    public final void rule__PropertyDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2567:1: ( ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2568:1: ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2568:1: ( ( rule__PropertyDefinition__TypeAssignment_3_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2569:1: ( rule__PropertyDefinition__TypeAssignment_3_1 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_3_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2570:1: ( rule__PropertyDefinition__TypeAssignment_3_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2570:2: rule__PropertyDefinition__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__TypeAssignment_3_1_in_rule__PropertyDefinition__Group_3__1__Impl5379);
            rule__PropertyDefinition__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_3__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2580:1: rule__PropertyDefinition__Group_3__2 : rule__PropertyDefinition__Group_3__2__Impl ;
    public final void rule__PropertyDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2584:1: ( rule__PropertyDefinition__Group_3__2__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2585:2: rule__PropertyDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_3__2__Impl_in_rule__PropertyDefinition__Group_3__25409);
            rule__PropertyDefinition__Group_3__2__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_3__2"


    // $ANTLR start "rule__PropertyDefinition__Group_3__2__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2591:1: rule__PropertyDefinition__Group_3__2__Impl : ( ')' ) ;
    public final void rule__PropertyDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2595:1: ( ( ')' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2596:1: ( ')' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2596:1: ( ')' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2597:1: ')'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_3_2()); 
            match(input,70,FOLLOW_70_in_rule__PropertyDefinition__Group_3__2__Impl5437); 
             after(grammarAccess.getPropertyDefinitionAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2616:1: rule__PropertyDefinition__Group_4__0 : rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 ;
    public final void rule__PropertyDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2620:1: ( rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2621:2: rule__PropertyDefinition__Group_4__0__Impl rule__PropertyDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__0__Impl_in_rule__PropertyDefinition__Group_4__05474);
            rule__PropertyDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__1_in_rule__PropertyDefinition__Group_4__05477);
            rule__PropertyDefinition__Group_4__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__0"


    // $ANTLR start "rule__PropertyDefinition__Group_4__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2628:1: rule__PropertyDefinition__Group_4__0__Impl : ( '=' ) ;
    public final void rule__PropertyDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2632:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2633:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2633:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2634:1: '='
            {
             before(grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_4_0()); 
            match(input,71,FOLLOW_71_in_rule__PropertyDefinition__Group_4__0__Impl5505); 
             after(grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_4_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2647:1: rule__PropertyDefinition__Group_4__1 : rule__PropertyDefinition__Group_4__1__Impl ;
    public final void rule__PropertyDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2651:1: ( rule__PropertyDefinition__Group_4__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2652:2: rule__PropertyDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4__1__Impl_in_rule__PropertyDefinition__Group_4__15536);
            rule__PropertyDefinition__Group_4__1__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__1"


    // $ANTLR start "rule__PropertyDefinition__Group_4__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2658:1: rule__PropertyDefinition__Group_4__1__Impl : ( ( rule__PropertyDefinition__Group_4_1__0 ) ) ;
    public final void rule__PropertyDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2662:1: ( ( ( rule__PropertyDefinition__Group_4_1__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2663:1: ( ( rule__PropertyDefinition__Group_4_1__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2663:1: ( ( rule__PropertyDefinition__Group_4_1__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2664:1: ( rule__PropertyDefinition__Group_4_1__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_4_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2665:1: ( rule__PropertyDefinition__Group_4_1__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2665:2: rule__PropertyDefinition__Group_4_1__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__0_in_rule__PropertyDefinition__Group_4__1__Impl5563);
            rule__PropertyDefinition__Group_4_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2679:1: rule__PropertyDefinition__Group_4_1__0 : rule__PropertyDefinition__Group_4_1__0__Impl rule__PropertyDefinition__Group_4_1__1 ;
    public final void rule__PropertyDefinition__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2683:1: ( rule__PropertyDefinition__Group_4_1__0__Impl rule__PropertyDefinition__Group_4_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2684:2: rule__PropertyDefinition__Group_4_1__0__Impl rule__PropertyDefinition__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__0__Impl_in_rule__PropertyDefinition__Group_4_1__05597);
            rule__PropertyDefinition__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__1_in_rule__PropertyDefinition__Group_4_1__05600);
            rule__PropertyDefinition__Group_4_1__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4_1__0"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2691:1: rule__PropertyDefinition__Group_4_1__0__Impl : ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) ) ;
    public final void rule__PropertyDefinition__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2695:1: ( ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2696:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2696:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2697:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesAssignment_4_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2698:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2698:2: rule__PropertyDefinition__DefaultValuesAssignment_4_1_0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_0_in_rule__PropertyDefinition__Group_4_1__0__Impl5627);
            rule__PropertyDefinition__DefaultValuesAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesAssignment_4_1_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_4_1__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2708:1: rule__PropertyDefinition__Group_4_1__1 : rule__PropertyDefinition__Group_4_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2712:1: ( rule__PropertyDefinition__Group_4_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2713:2: rule__PropertyDefinition__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1__1__Impl_in_rule__PropertyDefinition__Group_4_1__15657);
            rule__PropertyDefinition__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4_1__1"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2719:1: rule__PropertyDefinition__Group_4_1__1__Impl : ( ( rule__PropertyDefinition__Group_4_1_1__0 )* ) ;
    public final void rule__PropertyDefinition__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2723:1: ( ( ( rule__PropertyDefinition__Group_4_1_1__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2724:1: ( ( rule__PropertyDefinition__Group_4_1_1__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2724:1: ( ( rule__PropertyDefinition__Group_4_1_1__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2725:1: ( rule__PropertyDefinition__Group_4_1_1__0 )*
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_4_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2726:1: ( rule__PropertyDefinition__Group_4_1_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==67) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2726:2: rule__PropertyDefinition__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__0_in_rule__PropertyDefinition__Group_4_1__1__Impl5684);
            	    rule__PropertyDefinition__Group_4_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_4_1_1()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_4_1__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2740:1: rule__PropertyDefinition__Group_4_1_1__0 : rule__PropertyDefinition__Group_4_1_1__0__Impl rule__PropertyDefinition__Group_4_1_1__1 ;
    public final void rule__PropertyDefinition__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2744:1: ( rule__PropertyDefinition__Group_4_1_1__0__Impl rule__PropertyDefinition__Group_4_1_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2745:2: rule__PropertyDefinition__Group_4_1_1__0__Impl rule__PropertyDefinition__Group_4_1_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__0__Impl_in_rule__PropertyDefinition__Group_4_1_1__05719);
            rule__PropertyDefinition__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__1_in_rule__PropertyDefinition__Group_4_1_1__05722);
            rule__PropertyDefinition__Group_4_1_1__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4_1_1__0"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2752:1: rule__PropertyDefinition__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__PropertyDefinition__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2756:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2757:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2757:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2758:1: ','
            {
             before(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_4_1_1_0()); 
            match(input,67,FOLLOW_67_in_rule__PropertyDefinition__Group_4_1_1__0__Impl5750); 
             after(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_4_1_1_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2771:1: rule__PropertyDefinition__Group_4_1_1__1 : rule__PropertyDefinition__Group_4_1_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2775:1: ( rule__PropertyDefinition__Group_4_1_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2776:2: rule__PropertyDefinition__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_4_1_1__1__Impl_in_rule__PropertyDefinition__Group_4_1_1__15781);
            rule__PropertyDefinition__Group_4_1_1__1__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_4_1_1__1"


    // $ANTLR start "rule__PropertyDefinition__Group_4_1_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2782:1: rule__PropertyDefinition__Group_4_1_1__1__Impl : ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) ) ;
    public final void rule__PropertyDefinition__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2786:1: ( ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2787:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2787:1: ( ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2788:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesAssignment_4_1_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2789:1: ( rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2789:2: rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1_in_rule__PropertyDefinition__Group_4_1_1__1__Impl5808);
            rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesAssignment_4_1_1_1()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2803:1: rule__PropertyDefinition__Group_6__0 : rule__PropertyDefinition__Group_6__0__Impl rule__PropertyDefinition__Group_6__1 ;
    public final void rule__PropertyDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2807:1: ( rule__PropertyDefinition__Group_6__0__Impl rule__PropertyDefinition__Group_6__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2808:2: rule__PropertyDefinition__Group_6__0__Impl rule__PropertyDefinition__Group_6__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__0__Impl_in_rule__PropertyDefinition__Group_6__05842);
            rule__PropertyDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__1_in_rule__PropertyDefinition__Group_6__05845);
            rule__PropertyDefinition__Group_6__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_6__0"


    // $ANTLR start "rule__PropertyDefinition__Group_6__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2815:1: rule__PropertyDefinition__Group_6__0__Impl : ( '<' ) ;
    public final void rule__PropertyDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2819:1: ( ( '<' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2820:1: ( '<' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2820:1: ( '<' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2821:1: '<'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getLessThanSignKeyword_6_0()); 
            match(input,73,FOLLOW_73_in_rule__PropertyDefinition__Group_6__0__Impl5873); 
             after(grammarAccess.getPropertyDefinitionAccess().getLessThanSignKeyword_6_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2834:1: rule__PropertyDefinition__Group_6__1 : rule__PropertyDefinition__Group_6__1__Impl ;
    public final void rule__PropertyDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2838:1: ( rule__PropertyDefinition__Group_6__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2839:2: rule__PropertyDefinition__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6__1__Impl_in_rule__PropertyDefinition__Group_6__15904);
            rule__PropertyDefinition__Group_6__1__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_6__1"


    // $ANTLR start "rule__PropertyDefinition__Group_6__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2845:1: rule__PropertyDefinition__Group_6__1__Impl : ( ( rule__PropertyDefinition__Group_6_1__0 ) ) ;
    public final void rule__PropertyDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2849:1: ( ( ( rule__PropertyDefinition__Group_6_1__0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2850:1: ( ( rule__PropertyDefinition__Group_6_1__0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2850:1: ( ( rule__PropertyDefinition__Group_6_1__0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2851:1: ( rule__PropertyDefinition__Group_6_1__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_6_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2852:1: ( rule__PropertyDefinition__Group_6_1__0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2852:2: rule__PropertyDefinition__Group_6_1__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__0_in_rule__PropertyDefinition__Group_6__1__Impl5931);
            rule__PropertyDefinition__Group_6_1__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_6_1()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2866:1: rule__PropertyDefinition__Group_6_1__0 : rule__PropertyDefinition__Group_6_1__0__Impl rule__PropertyDefinition__Group_6_1__1 ;
    public final void rule__PropertyDefinition__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2870:1: ( rule__PropertyDefinition__Group_6_1__0__Impl rule__PropertyDefinition__Group_6_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2871:2: rule__PropertyDefinition__Group_6_1__0__Impl rule__PropertyDefinition__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__0__Impl_in_rule__PropertyDefinition__Group_6_1__05965);
            rule__PropertyDefinition__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__1_in_rule__PropertyDefinition__Group_6_1__05968);
            rule__PropertyDefinition__Group_6_1__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_6_1__0"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2878:1: rule__PropertyDefinition__Group_6_1__0__Impl : ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) ) ;
    public final void rule__PropertyDefinition__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2882:1: ( ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2883:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2883:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2884:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsAssignment_6_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2885:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2885:2: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0_in_rule__PropertyDefinition__Group_6_1__0__Impl5995);
            rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsAssignment_6_1_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_6_1__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2895:1: rule__PropertyDefinition__Group_6_1__1 : rule__PropertyDefinition__Group_6_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2899:1: ( rule__PropertyDefinition__Group_6_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2900:2: rule__PropertyDefinition__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1__1__Impl_in_rule__PropertyDefinition__Group_6_1__16025);
            rule__PropertyDefinition__Group_6_1__1__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_6_1__1"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2906:1: rule__PropertyDefinition__Group_6_1__1__Impl : ( ( rule__PropertyDefinition__Group_6_1_1__0 )* ) ;
    public final void rule__PropertyDefinition__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2910:1: ( ( ( rule__PropertyDefinition__Group_6_1_1__0 )* ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2911:1: ( ( rule__PropertyDefinition__Group_6_1_1__0 )* )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2911:1: ( ( rule__PropertyDefinition__Group_6_1_1__0 )* )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2912:1: ( rule__PropertyDefinition__Group_6_1_1__0 )*
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup_6_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2913:1: ( rule__PropertyDefinition__Group_6_1_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==67) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2913:2: rule__PropertyDefinition__Group_6_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__0_in_rule__PropertyDefinition__Group_6_1__1__Impl6052);
            	    rule__PropertyDefinition__Group_6_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getPropertyDefinitionAccess().getGroup_6_1_1()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_6_1__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1_1__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2927:1: rule__PropertyDefinition__Group_6_1_1__0 : rule__PropertyDefinition__Group_6_1_1__0__Impl rule__PropertyDefinition__Group_6_1_1__1 ;
    public final void rule__PropertyDefinition__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2931:1: ( rule__PropertyDefinition__Group_6_1_1__0__Impl rule__PropertyDefinition__Group_6_1_1__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2932:2: rule__PropertyDefinition__Group_6_1_1__0__Impl rule__PropertyDefinition__Group_6_1_1__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__0__Impl_in_rule__PropertyDefinition__Group_6_1_1__06087);
            rule__PropertyDefinition__Group_6_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__1_in_rule__PropertyDefinition__Group_6_1_1__06090);
            rule__PropertyDefinition__Group_6_1_1__1();

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
    // $ANTLR end "rule__PropertyDefinition__Group_6_1_1__0"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1_1__0__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2939:1: rule__PropertyDefinition__Group_6_1_1__0__Impl : ( ',' ) ;
    public final void rule__PropertyDefinition__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2943:1: ( ( ',' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2944:1: ( ',' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2944:1: ( ',' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2945:1: ','
            {
             before(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_1_1_0()); 
            match(input,67,FOLLOW_67_in_rule__PropertyDefinition__Group_6_1_1__0__Impl6118); 
             after(grammarAccess.getPropertyDefinitionAccess().getCommaKeyword_6_1_1_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_6_1_1__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1_1__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2958:1: rule__PropertyDefinition__Group_6_1_1__1 : rule__PropertyDefinition__Group_6_1_1__1__Impl ;
    public final void rule__PropertyDefinition__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2962:1: ( rule__PropertyDefinition__Group_6_1_1__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2963:2: rule__PropertyDefinition__Group_6_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group_6_1_1__1__Impl_in_rule__PropertyDefinition__Group_6_1_1__16149);
            rule__PropertyDefinition__Group_6_1_1__1__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__Group_6_1_1__1"


    // $ANTLR start "rule__PropertyDefinition__Group_6_1_1__1__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2969:1: rule__PropertyDefinition__Group_6_1_1__1__Impl : ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) ) ;
    public final void rule__PropertyDefinition__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2973:1: ( ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2974:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2974:1: ( ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2975:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsAssignment_6_1_1_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2976:1: ( rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2976:2: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1_in_rule__PropertyDefinition__Group_6_1_1__1__Impl6176);
            rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsAssignment_6_1_1_1()); 

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
    // $ANTLR end "rule__PropertyDefinition__Group_6_1_1__1__Impl"


    // $ANTLR start "rule__QueryOps__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2990:1: rule__QueryOps__Group__0 : rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1 ;
    public final void rule__QueryOps__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2994:1: ( rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:2995:2: rule__QueryOps__Group__0__Impl rule__QueryOps__Group__1
            {
            pushFollow(FOLLOW_rule__QueryOps__Group__0__Impl_in_rule__QueryOps__Group__06210);
            rule__QueryOps__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QueryOps__Group__1_in_rule__QueryOps__Group__06213);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3002:1: rule__QueryOps__Group__0__Impl : ( ( rule__QueryOps__Alternatives_0 ) ) ;
    public final void rule__QueryOps__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3006:1: ( ( ( rule__QueryOps__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3007:1: ( ( rule__QueryOps__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3007:1: ( ( rule__QueryOps__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3008:1: ( rule__QueryOps__Alternatives_0 )
            {
             before(grammarAccess.getQueryOpsAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3009:1: ( rule__QueryOps__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3009:2: rule__QueryOps__Alternatives_0
            {
            pushFollow(FOLLOW_rule__QueryOps__Alternatives_0_in_rule__QueryOps__Group__0__Impl6240);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3019:1: rule__QueryOps__Group__1 : rule__QueryOps__Group__1__Impl ;
    public final void rule__QueryOps__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3023:1: ( rule__QueryOps__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3024:2: rule__QueryOps__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QueryOps__Group__1__Impl_in_rule__QueryOps__Group__16270);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3030:1: rule__QueryOps__Group__1__Impl : ( ruleJcrString ) ;
    public final void rule__QueryOps__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3034:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3035:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3035:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3036:1: ruleJcrString
            {
             before(grammarAccess.getQueryOpsAccess().getJcrStringParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__QueryOps__Group__1__Impl6297);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getQueryOpsAccess().getJcrStringParserRuleCall_1()); 

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


    // $ANTLR start "rule__PrimaryItem__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3051:1: rule__PrimaryItem__Group__0 : rule__PrimaryItem__Group__0__Impl rule__PrimaryItem__Group__1 ;
    public final void rule__PrimaryItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3055:1: ( rule__PrimaryItem__Group__0__Impl rule__PrimaryItem__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3056:2: rule__PrimaryItem__Group__0__Impl rule__PrimaryItem__Group__1
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Group__0__Impl_in_rule__PrimaryItem__Group__06330);
            rule__PrimaryItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryItem__Group__1_in_rule__PrimaryItem__Group__06333);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3063:1: rule__PrimaryItem__Group__0__Impl : ( ( rule__PrimaryItem__Alternatives_0 ) ) ;
    public final void rule__PrimaryItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3067:1: ( ( ( rule__PrimaryItem__Alternatives_0 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3068:1: ( ( rule__PrimaryItem__Alternatives_0 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3068:1: ( ( rule__PrimaryItem__Alternatives_0 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3069:1: ( rule__PrimaryItem__Alternatives_0 )
            {
             before(grammarAccess.getPrimaryItemAccess().getAlternatives_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3070:1: ( rule__PrimaryItem__Alternatives_0 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3070:2: rule__PrimaryItem__Alternatives_0
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Alternatives_0_in_rule__PrimaryItem__Group__0__Impl6360);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3080:1: rule__PrimaryItem__Group__1 : rule__PrimaryItem__Group__1__Impl ;
    public final void rule__PrimaryItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3084:1: ( rule__PrimaryItem__Group__1__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3085:2: rule__PrimaryItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryItem__Group__1__Impl_in_rule__PrimaryItem__Group__16390);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3091:1: rule__PrimaryItem__Group__1__Impl : ( ruleJcrString ) ;
    public final void rule__PrimaryItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3095:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3096:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3096:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3097:1: ruleJcrString
            {
             before(grammarAccess.getPrimaryItemAccess().getJcrStringParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PrimaryItem__Group__1__Impl6417);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPrimaryItemAccess().getJcrStringParserRuleCall_1()); 

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


    // $ANTLR start "rule__NsMapping__Group__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3112:1: rule__NsMapping__Group__0 : rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1 ;
    public final void rule__NsMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3116:1: ( rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3117:2: rule__NsMapping__Group__0__Impl rule__NsMapping__Group__1
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__0__Impl_in_rule__NsMapping__Group__06450);
            rule__NsMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__1_in_rule__NsMapping__Group__06453);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3124:1: rule__NsMapping__Group__0__Impl : ( '<' ) ;
    public final void rule__NsMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3128:1: ( ( '<' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3129:1: ( '<' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3129:1: ( '<' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3130:1: '<'
            {
             before(grammarAccess.getNsMappingAccess().getLessThanSignKeyword_0()); 
            match(input,73,FOLLOW_73_in_rule__NsMapping__Group__0__Impl6481); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3143:1: rule__NsMapping__Group__1 : rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2 ;
    public final void rule__NsMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3147:1: ( rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3148:2: rule__NsMapping__Group__1__Impl rule__NsMapping__Group__2
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__1__Impl_in_rule__NsMapping__Group__16512);
            rule__NsMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__2_in_rule__NsMapping__Group__16515);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3155:1: rule__NsMapping__Group__1__Impl : ( ( rule__NsMapping__NameAssignment_1 ) ) ;
    public final void rule__NsMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3159:1: ( ( ( rule__NsMapping__NameAssignment_1 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3160:1: ( ( rule__NsMapping__NameAssignment_1 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3160:1: ( ( rule__NsMapping__NameAssignment_1 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3161:1: ( rule__NsMapping__NameAssignment_1 )
            {
             before(grammarAccess.getNsMappingAccess().getNameAssignment_1()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3162:1: ( rule__NsMapping__NameAssignment_1 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3162:2: rule__NsMapping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NsMapping__NameAssignment_1_in_rule__NsMapping__Group__1__Impl6542);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3172:1: rule__NsMapping__Group__2 : rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3 ;
    public final void rule__NsMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3176:1: ( rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3177:2: rule__NsMapping__Group__2__Impl rule__NsMapping__Group__3
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__2__Impl_in_rule__NsMapping__Group__26572);
            rule__NsMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__3_in_rule__NsMapping__Group__26575);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3184:1: rule__NsMapping__Group__2__Impl : ( '=' ) ;
    public final void rule__NsMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3188:1: ( ( '=' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3189:1: ( '=' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3189:1: ( '=' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3190:1: '='
            {
             before(grammarAccess.getNsMappingAccess().getEqualsSignKeyword_2()); 
            match(input,71,FOLLOW_71_in_rule__NsMapping__Group__2__Impl6603); 
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3203:1: rule__NsMapping__Group__3 : rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4 ;
    public final void rule__NsMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3207:1: ( rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3208:2: rule__NsMapping__Group__3__Impl rule__NsMapping__Group__4
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__3__Impl_in_rule__NsMapping__Group__36634);
            rule__NsMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NsMapping__Group__4_in_rule__NsMapping__Group__36637);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3215:1: rule__NsMapping__Group__3__Impl : ( ( rule__NsMapping__UriAssignment_3 ) ) ;
    public final void rule__NsMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3219:1: ( ( ( rule__NsMapping__UriAssignment_3 ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3220:1: ( ( rule__NsMapping__UriAssignment_3 ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3220:1: ( ( rule__NsMapping__UriAssignment_3 ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3221:1: ( rule__NsMapping__UriAssignment_3 )
            {
             before(grammarAccess.getNsMappingAccess().getUriAssignment_3()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3222:1: ( rule__NsMapping__UriAssignment_3 )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3222:2: rule__NsMapping__UriAssignment_3
            {
            pushFollow(FOLLOW_rule__NsMapping__UriAssignment_3_in_rule__NsMapping__Group__3__Impl6664);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3232:1: rule__NsMapping__Group__4 : rule__NsMapping__Group__4__Impl ;
    public final void rule__NsMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3236:1: ( rule__NsMapping__Group__4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3237:2: rule__NsMapping__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__NsMapping__Group__4__Impl_in_rule__NsMapping__Group__46694);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3243:1: rule__NsMapping__Group__4__Impl : ( '>' ) ;
    public final void rule__NsMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3247:1: ( ( '>' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3248:1: ( '>' )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3248:1: ( '>' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3249:1: '>'
            {
             before(grammarAccess.getNsMappingAccess().getGreaterThanSignKeyword_4()); 
            match(input,66,FOLLOW_66_in_rule__NsMapping__Group__4__Impl6722); 
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


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3273:1: rule__NodeTypeDefinition__UnorderedGroup_4 : ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3278:1: ( ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3279:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )?
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3279:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 >=42 && LA36_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt36=1;
            }
            else if ( (LA36_0==27|| LA36_0 >=40 && LA36_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt36=1;
            }
            else if ( (LA36_0==30|| LA36_0 >=38 && LA36_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt36=1;
            }
            else if ( LA36_0 >=34 && LA36_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt36=1;
            }
            else if ( LA36_0 >=36 && LA36_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt36=1;
            }
            else if ( LA36_0 >=32 && LA36_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3279:2: rule__NodeTypeDefinition__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__0_in_rule__NodeTypeDefinition__UnorderedGroup_46764);
                    rule__NodeTypeDefinition__UnorderedGroup_4__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3289:1: rule__NodeTypeDefinition__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) ) ) ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3294:1: ( ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3295:3: ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3295:3: ( ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) ) | ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) ) )
            int alt37=6;
            int LA37_0 = input.LA(1);

            if ( LA37_0 >=42 && LA37_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt37=1;
            }
            else if ( (LA37_0==27|| LA37_0 >=40 && LA37_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt37=2;
            }
            else if ( (LA37_0==30|| LA37_0 >=38 && LA37_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt37=3;
            }
            else if ( LA37_0 >=34 && LA37_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt37=4;
            }
            else if ( LA37_0 >=36 && LA37_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt37=5;
            }
            else if ( LA37_0 >=32 && LA37_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt37=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3297:4: ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3297:4: ({...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3298:5: {...}? => ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3298:115: ( ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3299:6: ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3305:6: ( ( rule__NodeTypeDefinition__OrderableAssignment_4_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3307:7: ( rule__NodeTypeDefinition__OrderableAssignment_4_0 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getOrderableAssignment_4_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3308:7: ( rule__NodeTypeDefinition__OrderableAssignment_4_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3308:8: rule__NodeTypeDefinition__OrderableAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__OrderableAssignment_4_0_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6851);
                    rule__NodeTypeDefinition__OrderableAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getOrderableAssignment_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3314:4: ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3314:4: ({...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3315:5: {...}? => ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3315:115: ( ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3316:6: ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3322:6: ( ( rule__NodeTypeDefinition__MixinAssignment_4_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3324:7: ( rule__NodeTypeDefinition__MixinAssignment_4_1 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getMixinAssignment_4_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3325:7: ( rule__NodeTypeDefinition__MixinAssignment_4_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3325:8: rule__NodeTypeDefinition__MixinAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__MixinAssignment_4_1_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6942);
                    rule__NodeTypeDefinition__MixinAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getMixinAssignment_4_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3331:4: ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3331:4: ({...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3332:5: {...}? => ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3332:115: ( ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3333:6: ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3339:6: ( ( rule__NodeTypeDefinition__AbstractAssignment_4_2 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3341:7: ( rule__NodeTypeDefinition__AbstractAssignment_4_2 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAssignment_4_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3342:7: ( rule__NodeTypeDefinition__AbstractAssignment_4_2 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3342:8: rule__NodeTypeDefinition__AbstractAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__AbstractAssignment_4_2_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7033);
                    rule__NodeTypeDefinition__AbstractAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAssignment_4_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3348:4: ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3348:4: ({...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3349:5: {...}? => ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3349:115: ( ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3350:6: ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3356:6: ( ( rule__NodeTypeDefinition__QueryableAssignment_4_3 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3358:7: ( rule__NodeTypeDefinition__QueryableAssignment_4_3 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getQueryableAssignment_4_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3359:7: ( rule__NodeTypeDefinition__QueryableAssignment_4_3 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3359:8: rule__NodeTypeDefinition__QueryableAssignment_4_3
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__QueryableAssignment_4_3_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7124);
                    rule__NodeTypeDefinition__QueryableAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getQueryableAssignment_4_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3365:4: ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3365:4: ({...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3366:5: {...}? => ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3366:115: ( ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3367:6: ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3373:6: ( ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3375:7: ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableAssignment_4_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3376:7: ( rule__NodeTypeDefinition__NotqueryableAssignment_4_4 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3376:8: rule__NodeTypeDefinition__NotqueryableAssignment_4_4
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__NotqueryableAssignment_4_4_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7215);
                    rule__NodeTypeDefinition__NotqueryableAssignment_4_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableAssignment_4_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3382:4: ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3382:4: ({...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3383:5: {...}? => ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                        throw new FailedPredicateException(input, "rule__NodeTypeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3383:115: ( ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3384:6: ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3390:6: ( ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3392:7: ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 )
                    {
                     before(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemAssignment_4_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3393:7: ( rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3393:8: rule__NodeTypeDefinition__PrimaryItemAssignment_4_5
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7306);
                    rule__NodeTypeDefinition__PrimaryItemAssignment_4_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemAssignment_4_5()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3408:1: rule__NodeTypeDefinition__UnorderedGroup_4__0 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3412:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3413:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__07365);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3414:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( LA38_0 >=42 && LA38_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt38=1;
            }
            else if ( (LA38_0==27|| LA38_0 >=40 && LA38_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt38=1;
            }
            else if ( (LA38_0==30|| LA38_0 >=38 && LA38_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt38=1;
            }
            else if ( LA38_0 >=34 && LA38_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt38=1;
            }
            else if ( LA38_0 >=36 && LA38_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt38=1;
            }
            else if ( LA38_0 >=32 && LA38_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3414:2: rule__NodeTypeDefinition__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__1_in_rule__NodeTypeDefinition__UnorderedGroup_4__07368);
                    rule__NodeTypeDefinition__UnorderedGroup_4__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__0"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3421:1: rule__NodeTypeDefinition__UnorderedGroup_4__1 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3425:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3426:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__17393);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3427:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 >=42 && LA39_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt39=1;
            }
            else if ( (LA39_0==27|| LA39_0 >=40 && LA39_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt39=1;
            }
            else if ( (LA39_0==30|| LA39_0 >=38 && LA39_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt39=1;
            }
            else if ( LA39_0 >=34 && LA39_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt39=1;
            }
            else if ( LA39_0 >=36 && LA39_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt39=1;
            }
            else if ( LA39_0 >=32 && LA39_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3427:2: rule__NodeTypeDefinition__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__2_in_rule__NodeTypeDefinition__UnorderedGroup_4__17396);
                    rule__NodeTypeDefinition__UnorderedGroup_4__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__1"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3434:1: rule__NodeTypeDefinition__UnorderedGroup_4__2 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3438:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3439:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__27421);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3440:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__3 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 >=42 && LA40_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt40=1;
            }
            else if ( (LA40_0==27|| LA40_0 >=40 && LA40_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt40=1;
            }
            else if ( (LA40_0==30|| LA40_0 >=38 && LA40_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt40=1;
            }
            else if ( LA40_0 >=34 && LA40_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt40=1;
            }
            else if ( LA40_0 >=36 && LA40_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt40=1;
            }
            else if ( LA40_0 >=32 && LA40_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3440:2: rule__NodeTypeDefinition__UnorderedGroup_4__3
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__3_in_rule__NodeTypeDefinition__UnorderedGroup_4__27424);
                    rule__NodeTypeDefinition__UnorderedGroup_4__3();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__2"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3447:1: rule__NodeTypeDefinition__UnorderedGroup_4__3 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3451:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3452:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__37449);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3453:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__4 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 >=42 && LA41_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt41=1;
            }
            else if ( (LA41_0==27|| LA41_0 >=40 && LA41_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt41=1;
            }
            else if ( (LA41_0==30|| LA41_0 >=38 && LA41_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt41=1;
            }
            else if ( LA41_0 >=34 && LA41_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt41=1;
            }
            else if ( LA41_0 >=36 && LA41_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt41=1;
            }
            else if ( LA41_0 >=32 && LA41_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3453:2: rule__NodeTypeDefinition__UnorderedGroup_4__4
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__4_in_rule__NodeTypeDefinition__UnorderedGroup_4__37452);
                    rule__NodeTypeDefinition__UnorderedGroup_4__4();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__3"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3460:1: rule__NodeTypeDefinition__UnorderedGroup_4__4 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )? ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3464:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3465:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )?
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__47477);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3466:2: ( rule__NodeTypeDefinition__UnorderedGroup_4__5 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 >=42 && LA42_0<=44 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt42=1;
            }
            else if ( (LA42_0==27|| LA42_0 >=40 && LA42_0<=41) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt42=1;
            }
            else if ( (LA42_0==30|| LA42_0 >=38 && LA42_0<=39) && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt42=1;
            }
            else if ( LA42_0 >=34 && LA42_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt42=1;
            }
            else if ( LA42_0 >=36 && LA42_0<=37 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt42=1;
            }
            else if ( LA42_0 >=32 && LA42_0<=33 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeTypeDefinitionAccess().getUnorderedGroup_4(), 5) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3466:2: rule__NodeTypeDefinition__UnorderedGroup_4__5
                    {
                    pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__5_in_rule__NodeTypeDefinition__UnorderedGroup_4__47480);
                    rule__NodeTypeDefinition__UnorderedGroup_4__5();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__4"


    // $ANTLR start "rule__NodeTypeDefinition__UnorderedGroup_4__5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3473:1: rule__NodeTypeDefinition__UnorderedGroup_4__5 : rule__NodeTypeDefinition__UnorderedGroup_4__Impl ;
    public final void rule__NodeTypeDefinition__UnorderedGroup_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3477:1: ( rule__NodeTypeDefinition__UnorderedGroup_4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3478:2: rule__NodeTypeDefinition__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__57505);
            rule__NodeTypeDefinition__UnorderedGroup_4__Impl();

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
    // $ANTLR end "rule__NodeTypeDefinition__UnorderedGroup_4__5"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3497:1: rule__NodeDefinition__UnorderedGroup_4 : ( rule__NodeDefinition__UnorderedGroup_4__0 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3502:1: ( ( rule__NodeDefinition__UnorderedGroup_4__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3503:2: ( rule__NodeDefinition__UnorderedGroup_4__0 )?
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3503:2: ( rule__NodeDefinition__UnorderedGroup_4__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 >=28 && LA43_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 >=25 && LA43_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt43=1;
            }
            else if ( LA43_0 >=22 && LA43_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt43=1;
            }
            else if ( LA43_0 >=45 && LA43_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt43=1;
            }
            else if ( LA43_0 >=12 && LA43_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3503:2: rule__NodeDefinition__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__0_in_rule__NodeDefinition__UnorderedGroup_47541);
                    rule__NodeDefinition__UnorderedGroup_4__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3513:1: rule__NodeDefinition__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) ) ;
    public final void rule__NodeDefinition__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3518:1: ( ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3519:3: ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3519:3: ( ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) ) | ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) ) )
            int alt44=5;
            int LA44_0 = input.LA(1);

            if ( LA44_0 >=28 && LA44_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 >=25 && LA44_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt44=2;
            }
            else if ( LA44_0 >=22 && LA44_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt44=3;
            }
            else if ( LA44_0 >=45 && LA44_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt44=4;
            }
            else if ( LA44_0 >=12 && LA44_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt44=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3521:4: ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3521:4: ({...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3522:5: {...}? => ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3522:111: ( ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3523:6: ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3529:6: ( ( rule__NodeDefinition__AutocreatedAssignment_4_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3531:7: ( rule__NodeDefinition__AutocreatedAssignment_4_0 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getAutocreatedAssignment_4_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3532:7: ( rule__NodeDefinition__AutocreatedAssignment_4_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3532:8: rule__NodeDefinition__AutocreatedAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__AutocreatedAssignment_4_0_in_rule__NodeDefinition__UnorderedGroup_4__Impl7628);
                    rule__NodeDefinition__AutocreatedAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getAutocreatedAssignment_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3538:4: ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3538:4: ({...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3539:5: {...}? => ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3539:111: ( ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3540:6: ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3546:6: ( ( rule__NodeDefinition__ManadatoryAssignment_4_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3548:7: ( rule__NodeDefinition__ManadatoryAssignment_4_1 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getManadatoryAssignment_4_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3549:7: ( rule__NodeDefinition__ManadatoryAssignment_4_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3549:8: rule__NodeDefinition__ManadatoryAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__ManadatoryAssignment_4_1_in_rule__NodeDefinition__UnorderedGroup_4__Impl7719);
                    rule__NodeDefinition__ManadatoryAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getManadatoryAssignment_4_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3555:4: ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3555:4: ({...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3556:5: {...}? => ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3556:111: ( ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3557:6: ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3563:6: ( ( rule__NodeDefinition__ProtectedAssignment_4_2 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3565:7: ( rule__NodeDefinition__ProtectedAssignment_4_2 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getProtectedAssignment_4_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3566:7: ( rule__NodeDefinition__ProtectedAssignment_4_2 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3566:8: rule__NodeDefinition__ProtectedAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__ProtectedAssignment_4_2_in_rule__NodeDefinition__UnorderedGroup_4__Impl7810);
                    rule__NodeDefinition__ProtectedAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getProtectedAssignment_4_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3572:4: ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3572:4: ({...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3573:5: {...}? => ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3573:111: ( ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3574:6: ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3580:6: ( ( rule__NodeDefinition__OnParentVersionAssignment_4_3 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3582:7: ( rule__NodeDefinition__OnParentVersionAssignment_4_3 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getOnParentVersionAssignment_4_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3583:7: ( rule__NodeDefinition__OnParentVersionAssignment_4_3 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3583:8: rule__NodeDefinition__OnParentVersionAssignment_4_3
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__OnParentVersionAssignment_4_3_in_rule__NodeDefinition__UnorderedGroup_4__Impl7901);
                    rule__NodeDefinition__OnParentVersionAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getOnParentVersionAssignment_4_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3589:4: ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3589:4: ({...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3590:5: {...}? => ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                        throw new FailedPredicateException(input, "rule__NodeDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3590:111: ( ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3591:6: ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3597:6: ( ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3599:7: ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 )
                    {
                     before(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsAssignment_4_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3600:7: ( rule__NodeDefinition__SameNameSiblingsAssignment_4_4 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3600:8: rule__NodeDefinition__SameNameSiblingsAssignment_4_4
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__SameNameSiblingsAssignment_4_4_in_rule__NodeDefinition__UnorderedGroup_4__Impl7992);
                    rule__NodeDefinition__SameNameSiblingsAssignment_4_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsAssignment_4_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3615:1: rule__NodeDefinition__UnorderedGroup_4__0 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__1 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3619:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__1 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3620:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__08051);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3621:2: ( rule__NodeDefinition__UnorderedGroup_4__1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 >=28 && LA45_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 >=25 && LA45_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt45=1;
            }
            else if ( LA45_0 >=22 && LA45_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt45=1;
            }
            else if ( LA45_0 >=45 && LA45_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt45=1;
            }
            else if ( LA45_0 >=12 && LA45_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3621:2: rule__NodeDefinition__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__1_in_rule__NodeDefinition__UnorderedGroup_4__08054);
                    rule__NodeDefinition__UnorderedGroup_4__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__0"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3628:1: rule__NodeDefinition__UnorderedGroup_4__1 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__2 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3632:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__2 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3633:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__18079);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3634:2: ( rule__NodeDefinition__UnorderedGroup_4__2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 >=28 && LA46_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 >=25 && LA46_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt46=1;
            }
            else if ( LA46_0 >=22 && LA46_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt46=1;
            }
            else if ( LA46_0 >=45 && LA46_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt46=1;
            }
            else if ( LA46_0 >=12 && LA46_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3634:2: rule__NodeDefinition__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__2_in_rule__NodeDefinition__UnorderedGroup_4__18082);
                    rule__NodeDefinition__UnorderedGroup_4__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__1"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3641:1: rule__NodeDefinition__UnorderedGroup_4__2 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__3 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3645:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__3 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3646:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__28107);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3647:2: ( rule__NodeDefinition__UnorderedGroup_4__3 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 >=28 && LA47_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 >=25 && LA47_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt47=1;
            }
            else if ( LA47_0 >=22 && LA47_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt47=1;
            }
            else if ( LA47_0 >=45 && LA47_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt47=1;
            }
            else if ( LA47_0 >=12 && LA47_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3647:2: rule__NodeDefinition__UnorderedGroup_4__3
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__3_in_rule__NodeDefinition__UnorderedGroup_4__28110);
                    rule__NodeDefinition__UnorderedGroup_4__3();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__2"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3654:1: rule__NodeDefinition__UnorderedGroup_4__3 : rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__4 )? ;
    public final void rule__NodeDefinition__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3658:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__4 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3659:2: rule__NodeDefinition__UnorderedGroup_4__Impl ( rule__NodeDefinition__UnorderedGroup_4__4 )?
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__38135);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3660:2: ( rule__NodeDefinition__UnorderedGroup_4__4 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 >=28 && LA48_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 >=25 && LA48_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt48=1;
            }
            else if ( LA48_0 >=22 && LA48_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt48=1;
            }
            else if ( LA48_0 >=45 && LA48_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt48=1;
            }
            else if ( LA48_0 >=12 && LA48_0<=14 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeDefinitionAccess().getUnorderedGroup_4(), 4) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3660:2: rule__NodeDefinition__UnorderedGroup_4__4
                    {
                    pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__4_in_rule__NodeDefinition__UnorderedGroup_4__38138);
                    rule__NodeDefinition__UnorderedGroup_4__4();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__3"


    // $ANTLR start "rule__NodeDefinition__UnorderedGroup_4__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3667:1: rule__NodeDefinition__UnorderedGroup_4__4 : rule__NodeDefinition__UnorderedGroup_4__Impl ;
    public final void rule__NodeDefinition__UnorderedGroup_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3671:1: ( rule__NodeDefinition__UnorderedGroup_4__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3672:2: rule__NodeDefinition__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__48163);
            rule__NodeDefinition__UnorderedGroup_4__Impl();

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
    // $ANTLR end "rule__NodeDefinition__UnorderedGroup_4__4"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3689:1: rule__PropertyDefinition__UnorderedGroup_5 : ( rule__PropertyDefinition__UnorderedGroup_5__0 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3694:1: ( ( rule__PropertyDefinition__UnorderedGroup_5__0 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3695:2: ( rule__PropertyDefinition__UnorderedGroup_5__0 )?
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3695:2: ( rule__PropertyDefinition__UnorderedGroup_5__0 )?
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3695:2: rule__PropertyDefinition__UnorderedGroup_5__0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__0_in_rule__PropertyDefinition__UnorderedGroup_58197);
                    rule__PropertyDefinition__UnorderedGroup_5__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__Impl"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3705:1: rule__PropertyDefinition__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) ) ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3710:1: ( ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3711:3: ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3711:3: ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) )
            int alt50=9;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3713:4: ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3713:4: ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3714:5: {...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3714:115: ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3715:6: ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3721:6: ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3723:7: ( rule__PropertyDefinition__AutocreatedAssignment_5_0 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAssignment_5_0()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3724:7: ( rule__PropertyDefinition__AutocreatedAssignment_5_0 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3724:8: rule__PropertyDefinition__AutocreatedAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__AutocreatedAssignment_5_0_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8284);
                    rule__PropertyDefinition__AutocreatedAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAssignment_5_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3730:4: ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3730:4: ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3731:5: {...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3731:115: ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3732:6: ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3738:6: ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3740:7: ( rule__PropertyDefinition__MandatoryAssignment_5_1 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getMandatoryAssignment_5_1()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3741:7: ( rule__PropertyDefinition__MandatoryAssignment_5_1 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3741:8: rule__PropertyDefinition__MandatoryAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__MandatoryAssignment_5_1_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8375);
                    rule__PropertyDefinition__MandatoryAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getMandatoryAssignment_5_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3747:4: ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3747:4: ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3748:5: {...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3748:115: ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3749:6: ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3755:6: ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3757:7: ( rule__PropertyDefinition__ProtectedAssignment_5_2 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getProtectedAssignment_5_2()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3758:7: ( rule__PropertyDefinition__ProtectedAssignment_5_2 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3758:8: rule__PropertyDefinition__ProtectedAssignment_5_2
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__ProtectedAssignment_5_2_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8466);
                    rule__PropertyDefinition__ProtectedAssignment_5_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getProtectedAssignment_5_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3764:4: ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3764:4: ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3765:5: {...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3765:115: ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3766:6: ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3772:6: ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3774:7: ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionAssignment_5_3()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3775:7: ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3775:8: rule__PropertyDefinition__OnParentVersionAssignment_5_3
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__OnParentVersionAssignment_5_3_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8557);
                    rule__PropertyDefinition__OnParentVersionAssignment_5_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionAssignment_5_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3781:4: ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3781:4: ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3782:5: {...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3782:115: ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3783:6: ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3789:6: ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3791:7: ( rule__PropertyDefinition__MultipleAssignment_5_4 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getMultipleAssignment_5_4()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3792:7: ( rule__PropertyDefinition__MultipleAssignment_5_4 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3792:8: rule__PropertyDefinition__MultipleAssignment_5_4
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__MultipleAssignment_5_4_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8648);
                    rule__PropertyDefinition__MultipleAssignment_5_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getMultipleAssignment_5_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3798:4: ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3798:4: ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3799:5: {...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3799:115: ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3800:6: ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3806:6: ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3808:7: ( rule__PropertyDefinition__QueryOpsAssignment_5_5 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getQueryOpsAssignment_5_5()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3809:7: ( rule__PropertyDefinition__QueryOpsAssignment_5_5 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3809:8: rule__PropertyDefinition__QueryOpsAssignment_5_5
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__QueryOpsAssignment_5_5_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8739);
                    rule__PropertyDefinition__QueryOpsAssignment_5_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getQueryOpsAssignment_5_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3815:4: ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3815:4: ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3816:5: {...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3816:115: ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3817:6: ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3823:6: ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3825:7: ( rule__PropertyDefinition__NoFullTextAssignment_5_6 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getNoFullTextAssignment_5_6()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3826:7: ( rule__PropertyDefinition__NoFullTextAssignment_5_6 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3826:8: rule__PropertyDefinition__NoFullTextAssignment_5_6
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__NoFullTextAssignment_5_6_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8830);
                    rule__PropertyDefinition__NoFullTextAssignment_5_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getNoFullTextAssignment_5_6()); 

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3832:4: ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3832:4: ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3833:5: {...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3833:115: ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3834:6: ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3840:6: ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3842:7: ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderAssignment_5_7()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3843:7: ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3843:8: rule__PropertyDefinition__NoQueryOrderAssignment_5_7
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__NoQueryOrderAssignment_5_7_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8921);
                    rule__PropertyDefinition__NoQueryOrderAssignment_5_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderAssignment_5_7()); 

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3849:4: ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) )
                    {
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3849:4: ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3850:5: {...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {
                        throw new FailedPredicateException(input, "rule__PropertyDefinition__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8)");
                    }
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3850:115: ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3851:6: ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3857:6: ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3859:7: ( rule__PropertyDefinition__PrimaryAssignment_5_8 )
                    {
                     before(grammarAccess.getPropertyDefinitionAccess().getPrimaryAssignment_5_8()); 
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3860:7: ( rule__PropertyDefinition__PrimaryAssignment_5_8 )
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3860:8: rule__PropertyDefinition__PrimaryAssignment_5_8
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__PrimaryAssignment_5_8_in_rule__PropertyDefinition__UnorderedGroup_5__Impl9012);
                    rule__PropertyDefinition__PrimaryAssignment_5_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyDefinitionAccess().getPrimaryAssignment_5_8()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__Impl"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3875:1: rule__PropertyDefinition__UnorderedGroup_5__0 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__1 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3879:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__1 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3880:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__1 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__09071);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3881:2: ( rule__PropertyDefinition__UnorderedGroup_5__1 )?
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3881:2: rule__PropertyDefinition__UnorderedGroup_5__1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__1_in_rule__PropertyDefinition__UnorderedGroup_5__09074);
                    rule__PropertyDefinition__UnorderedGroup_5__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__0"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3888:1: rule__PropertyDefinition__UnorderedGroup_5__1 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__2 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3892:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__2 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3893:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__2 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__19099);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3894:2: ( rule__PropertyDefinition__UnorderedGroup_5__2 )?
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3894:2: rule__PropertyDefinition__UnorderedGroup_5__2
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__2_in_rule__PropertyDefinition__UnorderedGroup_5__19102);
                    rule__PropertyDefinition__UnorderedGroup_5__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__1"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3901:1: rule__PropertyDefinition__UnorderedGroup_5__2 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__3 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3905:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__3 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3906:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__3 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__29127);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3907:2: ( rule__PropertyDefinition__UnorderedGroup_5__3 )?
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3907:2: rule__PropertyDefinition__UnorderedGroup_5__3
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__3_in_rule__PropertyDefinition__UnorderedGroup_5__29130);
                    rule__PropertyDefinition__UnorderedGroup_5__3();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__2"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3914:1: rule__PropertyDefinition__UnorderedGroup_5__3 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__4 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3918:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__4 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3919:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__4 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__39155);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3920:2: ( rule__PropertyDefinition__UnorderedGroup_5__4 )?
            int alt54=2;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3920:2: rule__PropertyDefinition__UnorderedGroup_5__4
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__4_in_rule__PropertyDefinition__UnorderedGroup_5__39158);
                    rule__PropertyDefinition__UnorderedGroup_5__4();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__3"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3927:1: rule__PropertyDefinition__UnorderedGroup_5__4 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__5 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3931:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__5 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3932:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__5 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__49183);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3933:2: ( rule__PropertyDefinition__UnorderedGroup_5__5 )?
            int alt55=2;
            alt55 = dfa55.predict(input);
            switch (alt55) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3933:2: rule__PropertyDefinition__UnorderedGroup_5__5
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__5_in_rule__PropertyDefinition__UnorderedGroup_5__49186);
                    rule__PropertyDefinition__UnorderedGroup_5__5();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__4"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3940:1: rule__PropertyDefinition__UnorderedGroup_5__5 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__6 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3944:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__6 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3945:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__6 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__59211);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3946:2: ( rule__PropertyDefinition__UnorderedGroup_5__6 )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3946:2: rule__PropertyDefinition__UnorderedGroup_5__6
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__6_in_rule__PropertyDefinition__UnorderedGroup_5__59214);
                    rule__PropertyDefinition__UnorderedGroup_5__6();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__5"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__6"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3953:1: rule__PropertyDefinition__UnorderedGroup_5__6 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__7 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3957:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__7 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3958:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__7 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__69239);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3959:2: ( rule__PropertyDefinition__UnorderedGroup_5__7 )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3959:2: rule__PropertyDefinition__UnorderedGroup_5__7
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__7_in_rule__PropertyDefinition__UnorderedGroup_5__69242);
                    rule__PropertyDefinition__UnorderedGroup_5__7();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__6"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__7"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3966:1: rule__PropertyDefinition__UnorderedGroup_5__7 : rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__8 )? ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3970:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__8 )? )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3971:2: rule__PropertyDefinition__UnorderedGroup_5__Impl ( rule__PropertyDefinition__UnorderedGroup_5__8 )?
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__79267);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

            state._fsp--;

            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3972:2: ( rule__PropertyDefinition__UnorderedGroup_5__8 )?
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3972:2: rule__PropertyDefinition__UnorderedGroup_5__8
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__8_in_rule__PropertyDefinition__UnorderedGroup_5__79270);
                    rule__PropertyDefinition__UnorderedGroup_5__8();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__7"


    // $ANTLR start "rule__PropertyDefinition__UnorderedGroup_5__8"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3979:1: rule__PropertyDefinition__UnorderedGroup_5__8 : rule__PropertyDefinition__UnorderedGroup_5__Impl ;
    public final void rule__PropertyDefinition__UnorderedGroup_5__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3983:1: ( rule__PropertyDefinition__UnorderedGroup_5__Impl )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:3984:2: rule__PropertyDefinition__UnorderedGroup_5__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__89295);
            rule__PropertyDefinition__UnorderedGroup_5__Impl();

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
    // $ANTLR end "rule__PropertyDefinition__UnorderedGroup_5__8"


    // $ANTLR start "rule__Model__NamespacesAssignment_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4009:1: rule__Model__NamespacesAssignment_0 : ( ruleNsMapping ) ;
    public final void rule__Model__NamespacesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4013:1: ( ( ruleNsMapping ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4014:1: ( ruleNsMapping )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4014:1: ( ruleNsMapping )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4015:1: ruleNsMapping
            {
             before(grammarAccess.getModelAccess().getNamespacesNsMappingParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNsMapping_in_rule__Model__NamespacesAssignment_09341);
            ruleNsMapping();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNamespacesNsMappingParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__NamespacesAssignment_0"


    // $ANTLR start "rule__Model__NodeTypesAssignment_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4024:1: rule__Model__NodeTypesAssignment_1 : ( ruleNodeTypeDefinition ) ;
    public final void rule__Model__NodeTypesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4028:1: ( ( ruleNodeTypeDefinition ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4029:1: ( ruleNodeTypeDefinition )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4029:1: ( ruleNodeTypeDefinition )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4030:1: ruleNodeTypeDefinition
            {
             before(grammarAccess.getModelAccess().getNodeTypesNodeTypeDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeTypeDefinition_in_rule__Model__NodeTypesAssignment_19372);
            ruleNodeTypeDefinition();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNodeTypesNodeTypeDefinitionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NodeTypesAssignment_1"


    // $ANTLR start "rule__NodeTypeDefinition__NameAssignment_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4039:1: rule__NodeTypeDefinition__NameAssignment_1 : ( ruleJcrString ) ;
    public final void rule__NodeTypeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4043:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4044:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4044:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4045:1: ruleJcrString
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getNameJcrStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__NameAssignment_19403);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getNameJcrStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__NameAssignment_1"


    // $ANTLR start "rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4054:1: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1 : ( ruleJcrString ) ;
    public final void rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4058:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4059:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4059:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4060:1: ruleJcrString
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesJcrStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_19434);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesJcrStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1"


    // $ANTLR start "rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4069:1: rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1 : ( ruleJcrString ) ;
    public final void rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4073:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4074:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4074:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4075:1: ruleJcrString
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesJcrStringParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_19465);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredSupertypeNamesJcrStringParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1"


    // $ANTLR start "rule__NodeTypeDefinition__OrderableAssignment_4_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4084:1: rule__NodeTypeDefinition__OrderableAssignment_4_0 : ( ruleOrderable ) ;
    public final void rule__NodeTypeDefinition__OrderableAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4088:1: ( ( ruleOrderable ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4089:1: ( ruleOrderable )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4089:1: ( ruleOrderable )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4090:1: ruleOrderable
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getOrderableOrderableParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleOrderable_in_rule__NodeTypeDefinition__OrderableAssignment_4_09496);
            ruleOrderable();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getOrderableOrderableParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__OrderableAssignment_4_0"


    // $ANTLR start "rule__NodeTypeDefinition__MixinAssignment_4_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4099:1: rule__NodeTypeDefinition__MixinAssignment_4_1 : ( ruleMixin ) ;
    public final void rule__NodeTypeDefinition__MixinAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4103:1: ( ( ruleMixin ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4104:1: ( ruleMixin )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4104:1: ( ruleMixin )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4105:1: ruleMixin
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getMixinMixinParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMixin_in_rule__NodeTypeDefinition__MixinAssignment_4_19527);
            ruleMixin();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getMixinMixinParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__MixinAssignment_4_1"


    // $ANTLR start "rule__NodeTypeDefinition__AbstractAssignment_4_2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4114:1: rule__NodeTypeDefinition__AbstractAssignment_4_2 : ( ruleAbstract ) ;
    public final void rule__NodeTypeDefinition__AbstractAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4118:1: ( ( ruleAbstract ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4119:1: ( ruleAbstract )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4119:1: ( ruleAbstract )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4120:1: ruleAbstract
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAbstractParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleAbstract_in_rule__NodeTypeDefinition__AbstractAssignment_4_29558);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getAbstractAbstractParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__AbstractAssignment_4_2"


    // $ANTLR start "rule__NodeTypeDefinition__QueryableAssignment_4_3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4129:1: rule__NodeTypeDefinition__QueryableAssignment_4_3 : ( ruleQueryable ) ;
    public final void rule__NodeTypeDefinition__QueryableAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4133:1: ( ( ruleQueryable ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4134:1: ( ruleQueryable )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4134:1: ( ruleQueryable )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4135:1: ruleQueryable
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getQueryableQueryableParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleQueryable_in_rule__NodeTypeDefinition__QueryableAssignment_4_39589);
            ruleQueryable();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getQueryableQueryableParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__QueryableAssignment_4_3"


    // $ANTLR start "rule__NodeTypeDefinition__NotqueryableAssignment_4_4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4144:1: rule__NodeTypeDefinition__NotqueryableAssignment_4_4 : ( ruleNotqueryable ) ;
    public final void rule__NodeTypeDefinition__NotqueryableAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4148:1: ( ( ruleNotqueryable ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4149:1: ( ruleNotqueryable )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4149:1: ( ruleNotqueryable )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4150:1: ruleNotqueryable
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableNotqueryableParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_ruleNotqueryable_in_rule__NodeTypeDefinition__NotqueryableAssignment_4_49620);
            ruleNotqueryable();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getNotqueryableNotqueryableParserRuleCall_4_4_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__NotqueryableAssignment_4_4"


    // $ANTLR start "rule__NodeTypeDefinition__PrimaryItemAssignment_4_5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4159:1: rule__NodeTypeDefinition__PrimaryItemAssignment_4_5 : ( rulePrimaryItem ) ;
    public final void rule__NodeTypeDefinition__PrimaryItemAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4163:1: ( ( rulePrimaryItem ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4164:1: ( rulePrimaryItem )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4164:1: ( rulePrimaryItem )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4165:1: rulePrimaryItem
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemPrimaryItemParserRuleCall_4_5_0()); 
            pushFollow(FOLLOW_rulePrimaryItem_in_rule__NodeTypeDefinition__PrimaryItemAssignment_4_59651);
            rulePrimaryItem();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getPrimaryItemPrimaryItemParserRuleCall_4_5_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__PrimaryItemAssignment_4_5"


    // $ANTLR start "rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4174:1: rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0 : ( rulePropertyDefinition ) ;
    public final void rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4178:1: ( ( rulePropertyDefinition ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4179:1: ( rulePropertyDefinition )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4179:1: ( rulePropertyDefinition )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4180:1: rulePropertyDefinition
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsPropertyDefinitionParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_09682);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredPropertyDefinitionsPropertyDefinitionParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0"


    // $ANTLR start "rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4189:1: rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1 : ( ruleNodeDefinition ) ;
    public final void rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4193:1: ( ( ruleNodeDefinition ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4194:1: ( ruleNodeDefinition )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4194:1: ( ruleNodeDefinition )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4195:1: ruleNodeDefinition
            {
             before(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsNodeDefinitionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleNodeDefinition_in_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_19713);
            ruleNodeDefinition();

            state._fsp--;

             after(grammarAccess.getNodeTypeDefinitionAccess().getDeclaredChildNodeDefinitionsNodeDefinitionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1"


    // $ANTLR start "rule__NodeDefinition__NameAssignment_1_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4204:1: rule__NodeDefinition__NameAssignment_1_0 : ( ruleJcrString ) ;
    public final void rule__NodeDefinition__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4208:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4209:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4209:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4210:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameJcrStringParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__NameAssignment_1_09744);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getNameJcrStringParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__NodeDefinition__NameAssignment_1_0"


    // $ANTLR start "rule__NodeDefinition__NameAssignment_1_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4219:1: rule__NodeDefinition__NameAssignment_1_1 : ( ( '*' ) ) ;
    public final void rule__NodeDefinition__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4223:1: ( ( ( '*' ) ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4224:1: ( ( '*' ) )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4224:1: ( ( '*' ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4225:1: ( '*' )
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0()); 
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4226:1: ( '*' )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4227:1: '*'
            {
             before(grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0()); 
            match(input,13,FOLLOW_13_in_rule__NodeDefinition__NameAssignment_1_19780); 
             after(grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0()); 

            }

             after(grammarAccess.getNodeDefinitionAccess().getNameAsteriskKeyword_1_1_0()); 

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
    // $ANTLR end "rule__NodeDefinition__NameAssignment_1_1"


    // $ANTLR start "rule__NodeDefinition__RequiredTypesAssignment_2_1_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4242:1: rule__NodeDefinition__RequiredTypesAssignment_2_1_0 : ( ruleJcrString ) ;
    public final void rule__NodeDefinition__RequiredTypesAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4246:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4247:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4247:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4248:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesJcrStringParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_09819);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getRequiredTypesJcrStringParserRuleCall_2_1_0_0()); 

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
    // $ANTLR end "rule__NodeDefinition__RequiredTypesAssignment_2_1_0"


    // $ANTLR start "rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4257:1: rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1 : ( ruleJcrString ) ;
    public final void rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4261:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4262:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4262:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4263:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getRequiredTypesJcrStringParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_19850);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getRequiredTypesJcrStringParserRuleCall_2_1_1_1_0()); 

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
    // $ANTLR end "rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1"


    // $ANTLR start "rule__NodeDefinition__DefaultTypeAssignment_3_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4272:1: rule__NodeDefinition__DefaultTypeAssignment_3_1 : ( ruleJcrString ) ;
    public final void rule__NodeDefinition__DefaultTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4276:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4277:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4277:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4278:1: ruleJcrString
            {
             before(grammarAccess.getNodeDefinitionAccess().getDefaultTypeJcrStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__NodeDefinition__DefaultTypeAssignment_3_19881);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getDefaultTypeJcrStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__NodeDefinition__DefaultTypeAssignment_3_1"


    // $ANTLR start "rule__NodeDefinition__AutocreatedAssignment_4_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4287:1: rule__NodeDefinition__AutocreatedAssignment_4_0 : ( ruleAutocreated ) ;
    public final void rule__NodeDefinition__AutocreatedAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4291:1: ( ( ruleAutocreated ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4292:1: ( ruleAutocreated )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4292:1: ( ruleAutocreated )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4293:1: ruleAutocreated
            {
             before(grammarAccess.getNodeDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleAutocreated_in_rule__NodeDefinition__AutocreatedAssignment_4_09912);
            ruleAutocreated();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__NodeDefinition__AutocreatedAssignment_4_0"


    // $ANTLR start "rule__NodeDefinition__ManadatoryAssignment_4_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4302:1: rule__NodeDefinition__ManadatoryAssignment_4_1 : ( ruleMandatory ) ;
    public final void rule__NodeDefinition__ManadatoryAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4306:1: ( ( ruleMandatory ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4307:1: ( ruleMandatory )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4307:1: ( ruleMandatory )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4308:1: ruleMandatory
            {
             before(grammarAccess.getNodeDefinitionAccess().getManadatoryMandatoryParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__NodeDefinition__ManadatoryAssignment_4_19943);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getManadatoryMandatoryParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__NodeDefinition__ManadatoryAssignment_4_1"


    // $ANTLR start "rule__NodeDefinition__ProtectedAssignment_4_2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4317:1: rule__NodeDefinition__ProtectedAssignment_4_2 : ( ruleProtected ) ;
    public final void rule__NodeDefinition__ProtectedAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4321:1: ( ( ruleProtected ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4322:1: ( ruleProtected )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4322:1: ( ruleProtected )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4323:1: ruleProtected
            {
             before(grammarAccess.getNodeDefinitionAccess().getProtectedProtectedParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleProtected_in_rule__NodeDefinition__ProtectedAssignment_4_29974);
            ruleProtected();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getProtectedProtectedParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__NodeDefinition__ProtectedAssignment_4_2"


    // $ANTLR start "rule__NodeDefinition__OnParentVersionAssignment_4_3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4332:1: rule__NodeDefinition__OnParentVersionAssignment_4_3 : ( ruleOpv ) ;
    public final void rule__NodeDefinition__OnParentVersionAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4336:1: ( ( ruleOpv ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4337:1: ( ruleOpv )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4337:1: ( ruleOpv )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4338:1: ruleOpv
            {
             before(grammarAccess.getNodeDefinitionAccess().getOnParentVersionOpvEnumRuleCall_4_3_0()); 
            pushFollow(FOLLOW_ruleOpv_in_rule__NodeDefinition__OnParentVersionAssignment_4_310005);
            ruleOpv();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getOnParentVersionOpvEnumRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__NodeDefinition__OnParentVersionAssignment_4_3"


    // $ANTLR start "rule__NodeDefinition__SameNameSiblingsAssignment_4_4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4347:1: rule__NodeDefinition__SameNameSiblingsAssignment_4_4 : ( ruleSns ) ;
    public final void rule__NodeDefinition__SameNameSiblingsAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4351:1: ( ( ruleSns ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4352:1: ( ruleSns )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4352:1: ( ruleSns )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4353:1: ruleSns
            {
             before(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsSnsParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_ruleSns_in_rule__NodeDefinition__SameNameSiblingsAssignment_4_410036);
            ruleSns();

            state._fsp--;

             after(grammarAccess.getNodeDefinitionAccess().getSameNameSiblingsSnsParserRuleCall_4_4_0()); 

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
    // $ANTLR end "rule__NodeDefinition__SameNameSiblingsAssignment_4_4"


    // $ANTLR start "rule__PropertyDefinition__NameAssignment_2_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4362:1: rule__PropertyDefinition__NameAssignment_2_0 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__NameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4366:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4367:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4367:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4368:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameJcrStringParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__NameAssignment_2_010067);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getNameJcrStringParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__NameAssignment_2_0"


    // $ANTLR start "rule__PropertyDefinition__TypeAssignment_3_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4377:1: rule__PropertyDefinition__TypeAssignment_3_1 : ( rulePropertyType ) ;
    public final void rule__PropertyDefinition__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4381:1: ( ( rulePropertyType ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4382:1: ( rulePropertyType )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4382:1: ( rulePropertyType )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4383:1: rulePropertyType
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_rulePropertyType_in_rule__PropertyDefinition__TypeAssignment_3_110098);
            rulePropertyType();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getTypePropertyTypeEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__TypeAssignment_3_1"


    // $ANTLR start "rule__PropertyDefinition__DefaultValuesAssignment_4_1_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4392:1: rule__PropertyDefinition__DefaultValuesAssignment_4_1_0 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__DefaultValuesAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4396:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4397:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4397:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4398:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_010129);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_0_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__DefaultValuesAssignment_4_1_0"


    // $ANTLR start "rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4407:1: rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4411:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4412:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4412:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4413:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_1_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_110160);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getDefaultValuesJcrStringParserRuleCall_4_1_1_1_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1"


    // $ANTLR start "rule__PropertyDefinition__AutocreatedAssignment_5_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4422:1: rule__PropertyDefinition__AutocreatedAssignment_5_0 : ( ruleAutocreated ) ;
    public final void rule__PropertyDefinition__AutocreatedAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4426:1: ( ( ruleAutocreated ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4427:1: ( ruleAutocreated )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4427:1: ( ruleAutocreated )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4428:1: ruleAutocreated
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleAutocreated_in_rule__PropertyDefinition__AutocreatedAssignment_5_010191);
            ruleAutocreated();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getAutocreatedAutocreatedParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__AutocreatedAssignment_5_0"


    // $ANTLR start "rule__PropertyDefinition__MandatoryAssignment_5_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4437:1: rule__PropertyDefinition__MandatoryAssignment_5_1 : ( ruleMandatory ) ;
    public final void rule__PropertyDefinition__MandatoryAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4441:1: ( ( ruleMandatory ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4442:1: ( ruleMandatory )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4442:1: ( ruleMandatory )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4443:1: ruleMandatory
            {
             before(grammarAccess.getPropertyDefinitionAccess().getMandatoryMandatoryParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__PropertyDefinition__MandatoryAssignment_5_110222);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getMandatoryMandatoryParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__MandatoryAssignment_5_1"


    // $ANTLR start "rule__PropertyDefinition__ProtectedAssignment_5_2"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4452:1: rule__PropertyDefinition__ProtectedAssignment_5_2 : ( ruleProtected ) ;
    public final void rule__PropertyDefinition__ProtectedAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4456:1: ( ( ruleProtected ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4457:1: ( ruleProtected )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4457:1: ( ruleProtected )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4458:1: ruleProtected
            {
             before(grammarAccess.getPropertyDefinitionAccess().getProtectedProtectedParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleProtected_in_rule__PropertyDefinition__ProtectedAssignment_5_210253);
            ruleProtected();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getProtectedProtectedParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__ProtectedAssignment_5_2"


    // $ANTLR start "rule__PropertyDefinition__OnParentVersionAssignment_5_3"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4467:1: rule__PropertyDefinition__OnParentVersionAssignment_5_3 : ( ruleOpv ) ;
    public final void rule__PropertyDefinition__OnParentVersionAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4471:1: ( ( ruleOpv ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4472:1: ( ruleOpv )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4472:1: ( ruleOpv )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4473:1: ruleOpv
            {
             before(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionOpvEnumRuleCall_5_3_0()); 
            pushFollow(FOLLOW_ruleOpv_in_rule__PropertyDefinition__OnParentVersionAssignment_5_310284);
            ruleOpv();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getOnParentVersionOpvEnumRuleCall_5_3_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__OnParentVersionAssignment_5_3"


    // $ANTLR start "rule__PropertyDefinition__MultipleAssignment_5_4"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4482:1: rule__PropertyDefinition__MultipleAssignment_5_4 : ( ruleMultiple ) ;
    public final void rule__PropertyDefinition__MultipleAssignment_5_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4486:1: ( ( ruleMultiple ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4487:1: ( ruleMultiple )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4487:1: ( ruleMultiple )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4488:1: ruleMultiple
            {
             before(grammarAccess.getPropertyDefinitionAccess().getMultipleMultipleParserRuleCall_5_4_0()); 
            pushFollow(FOLLOW_ruleMultiple_in_rule__PropertyDefinition__MultipleAssignment_5_410315);
            ruleMultiple();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getMultipleMultipleParserRuleCall_5_4_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__MultipleAssignment_5_4"


    // $ANTLR start "rule__PropertyDefinition__QueryOpsAssignment_5_5"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4497:1: rule__PropertyDefinition__QueryOpsAssignment_5_5 : ( ruleQueryOps ) ;
    public final void rule__PropertyDefinition__QueryOpsAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4501:1: ( ( ruleQueryOps ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4502:1: ( ruleQueryOps )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4502:1: ( ruleQueryOps )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4503:1: ruleQueryOps
            {
             before(grammarAccess.getPropertyDefinitionAccess().getQueryOpsQueryOpsParserRuleCall_5_5_0()); 
            pushFollow(FOLLOW_ruleQueryOps_in_rule__PropertyDefinition__QueryOpsAssignment_5_510346);
            ruleQueryOps();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getQueryOpsQueryOpsParserRuleCall_5_5_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__QueryOpsAssignment_5_5"


    // $ANTLR start "rule__PropertyDefinition__NoFullTextAssignment_5_6"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4512:1: rule__PropertyDefinition__NoFullTextAssignment_5_6 : ( ruleNoFullText ) ;
    public final void rule__PropertyDefinition__NoFullTextAssignment_5_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4516:1: ( ( ruleNoFullText ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4517:1: ( ruleNoFullText )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4517:1: ( ruleNoFullText )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4518:1: ruleNoFullText
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNoFullTextNoFullTextParserRuleCall_5_6_0()); 
            pushFollow(FOLLOW_ruleNoFullText_in_rule__PropertyDefinition__NoFullTextAssignment_5_610377);
            ruleNoFullText();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getNoFullTextNoFullTextParserRuleCall_5_6_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__NoFullTextAssignment_5_6"


    // $ANTLR start "rule__PropertyDefinition__NoQueryOrderAssignment_5_7"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4527:1: rule__PropertyDefinition__NoQueryOrderAssignment_5_7 : ( ruleNoQueryOrder ) ;
    public final void rule__PropertyDefinition__NoQueryOrderAssignment_5_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4531:1: ( ( ruleNoQueryOrder ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4532:1: ( ruleNoQueryOrder )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4532:1: ( ruleNoQueryOrder )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4533:1: ruleNoQueryOrder
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderNoQueryOrderParserRuleCall_5_7_0()); 
            pushFollow(FOLLOW_ruleNoQueryOrder_in_rule__PropertyDefinition__NoQueryOrderAssignment_5_710408);
            ruleNoQueryOrder();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getNoQueryOrderNoQueryOrderParserRuleCall_5_7_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__NoQueryOrderAssignment_5_7"


    // $ANTLR start "rule__PropertyDefinition__PrimaryAssignment_5_8"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4542:1: rule__PropertyDefinition__PrimaryAssignment_5_8 : ( rulePrimary ) ;
    public final void rule__PropertyDefinition__PrimaryAssignment_5_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4546:1: ( ( rulePrimary ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4547:1: ( rulePrimary )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4547:1: ( rulePrimary )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4548:1: rulePrimary
            {
             before(grammarAccess.getPropertyDefinitionAccess().getPrimaryPrimaryParserRuleCall_5_8_0()); 
            pushFollow(FOLLOW_rulePrimary_in_rule__PropertyDefinition__PrimaryAssignment_5_810439);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getPrimaryPrimaryParserRuleCall_5_8_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__PrimaryAssignment_5_8"


    // $ANTLR start "rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4557:1: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4561:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4562:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4562:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4563:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_0_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_010470);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_0_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0"


    // $ANTLR start "rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4572:1: rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1 : ( ruleJcrString ) ;
    public final void rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4576:1: ( ( ruleJcrString ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4577:1: ( ruleJcrString )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4577:1: ( ruleJcrString )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4578:1: ruleJcrString
            {
             before(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_1_1_0()); 
            pushFollow(FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_110501);
            ruleJcrString();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getValueConstraintsJcrStringParserRuleCall_6_1_1_1_0()); 

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
    // $ANTLR end "rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1"


    // $ANTLR start "rule__NsMapping__NameAssignment_1"
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4587:1: rule__NsMapping__NameAssignment_1 : ( rulePrefix ) ;
    public final void rule__NsMapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4591:1: ( ( rulePrefix ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4592:1: ( rulePrefix )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4592:1: ( rulePrefix )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4593:1: rulePrefix
            {
             before(grammarAccess.getNsMappingAccess().getNamePrefixParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePrefix_in_rule__NsMapping__NameAssignment_110532);
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
    // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4602:1: rule__NsMapping__UriAssignment_3 : ( ruleUri ) ;
    public final void rule__NsMapping__UriAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4606:1: ( ( ruleUri ) )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4607:1: ( ruleUri )
            {
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4607:1: ( ruleUri )
            // ../com.github.evra.jcr.cnd.ui/src-gen/com/github/evra/jcr/ui/contentassist/antlr/internal/InternalCnd.g:4608:1: ruleUri
            {
             before(grammarAccess.getNsMappingAccess().getUriUriParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUri_in_rule__NsMapping__UriAssignment_310563);
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


    protected DFA49 dfa49 = new DFA49(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA49_eotS =
        "\13\uffff";
    static final String DFA49_eofS =
        "\1\12\12\uffff";
    static final String DFA49_minS =
        "\1\15\12\uffff";
    static final String DFA49_maxS =
        "\1\111\12\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA49_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA49_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "3695:2: ( rule__PropertyDefinition__UnorderedGroup_5__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_0 = input.LA(1);

                         
                        int index49_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA49_0 >=28 && LA49_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA49_0 >=25 && LA49_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA49_0 >=22 && LA49_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA49_0 >=45 && LA49_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA49_0 >=13 && LA49_0<=14 ||LA49_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA49_0 >=19 && LA49_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA49_0 >=17 && LA49_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA49_0 >=15 && LA49_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA49_0 >=31 && LA49_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA49_0==EOF||LA49_0==64||LA49_0==68||(LA49_0>=72 && LA49_0<=73)) ) {s = 10;}

                         
                        input.seek(index49_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA50_eotS =
        "\12\uffff";
    static final String DFA50_eofS =
        "\12\uffff";
    static final String DFA50_minS =
        "\1\15\11\uffff";
    static final String DFA50_maxS =
        "\1\62\11\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA50_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA50_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4",
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

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "3711:3: ( ({...}? => ( ( ( rule__PropertyDefinition__AutocreatedAssignment_5_0 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MandatoryAssignment_5_1 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__ProtectedAssignment_5_2 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__OnParentVersionAssignment_5_3 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__MultipleAssignment_5_4 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__QueryOpsAssignment_5_5 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoFullTextAssignment_5_6 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__NoQueryOrderAssignment_5_7 ) ) ) ) | ({...}? => ( ( ( rule__PropertyDefinition__PrimaryAssignment_5_8 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_0 = input.LA(1);

                         
                        int index50_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA50_0 >=28 && LA50_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA50_0 >=25 && LA50_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA50_0 >=22 && LA50_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA50_0 >=45 && LA50_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA50_0 >=13 && LA50_0<=14 ||LA50_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA50_0 >=19 && LA50_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA50_0 >=17 && LA50_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA50_0 >=15 && LA50_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA50_0 >=31 && LA50_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                         
                        input.seek(index50_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\13\uffff";
    static final String DFA51_eofS =
        "\1\12\12\uffff";
    static final String DFA51_minS =
        "\1\15\12\uffff";
    static final String DFA51_maxS =
        "\1\111\12\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA51_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA51_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "3881:2: ( rule__PropertyDefinition__UnorderedGroup_5__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_0 = input.LA(1);

                         
                        int index51_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA51_0 >=28 && LA51_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA51_0 >=25 && LA51_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA51_0 >=22 && LA51_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA51_0 >=45 && LA51_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA51_0 >=13 && LA51_0<=14 ||LA51_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA51_0 >=19 && LA51_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA51_0 >=17 && LA51_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA51_0 >=15 && LA51_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA51_0 >=31 && LA51_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA51_0==EOF||LA51_0==64||LA51_0==68||(LA51_0>=72 && LA51_0<=73)) ) {s = 10;}

                         
                        input.seek(index51_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\13\uffff";
    static final String DFA52_eofS =
        "\1\12\12\uffff";
    static final String DFA52_minS =
        "\1\15\12\uffff";
    static final String DFA52_maxS =
        "\1\111\12\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA52_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA52_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "3894:2: ( rule__PropertyDefinition__UnorderedGroup_5__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_0 = input.LA(1);

                         
                        int index52_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA52_0 >=28 && LA52_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA52_0 >=25 && LA52_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA52_0 >=22 && LA52_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA52_0 >=45 && LA52_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA52_0 >=13 && LA52_0<=14 ||LA52_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA52_0 >=19 && LA52_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA52_0 >=17 && LA52_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA52_0 >=15 && LA52_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA52_0 >=31 && LA52_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA52_0==EOF||LA52_0==64||LA52_0==68||(LA52_0>=72 && LA52_0<=73)) ) {s = 10;}

                         
                        input.seek(index52_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\13\uffff";
    static final String DFA53_eofS =
        "\1\12\12\uffff";
    static final String DFA53_minS =
        "\1\15\12\uffff";
    static final String DFA53_maxS =
        "\1\111\12\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA53_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA53_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "3907:2: ( rule__PropertyDefinition__UnorderedGroup_5__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA53_0 >=28 && LA53_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA53_0 >=25 && LA53_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA53_0 >=22 && LA53_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA53_0 >=45 && LA53_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA53_0 >=13 && LA53_0<=14 ||LA53_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA53_0 >=19 && LA53_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA53_0 >=17 && LA53_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA53_0 >=15 && LA53_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA53_0 >=31 && LA53_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA53_0==EOF||LA53_0==64||LA53_0==68||(LA53_0>=72 && LA53_0<=73)) ) {s = 10;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\13\uffff";
    static final String DFA54_eofS =
        "\1\12\12\uffff";
    static final String DFA54_minS =
        "\1\15\12\uffff";
    static final String DFA54_maxS =
        "\1\111\12\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA54_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA54_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "3920:2: ( rule__PropertyDefinition__UnorderedGroup_5__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_0 = input.LA(1);

                         
                        int index54_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA54_0 >=28 && LA54_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA54_0 >=25 && LA54_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA54_0 >=22 && LA54_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA54_0 >=45 && LA54_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA54_0 >=13 && LA54_0<=14 ||LA54_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA54_0 >=19 && LA54_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA54_0 >=17 && LA54_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA54_0 >=15 && LA54_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA54_0 >=31 && LA54_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA54_0==EOF||LA54_0==64||LA54_0==68||(LA54_0>=72 && LA54_0<=73)) ) {s = 10;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA55_eotS =
        "\13\uffff";
    static final String DFA55_eofS =
        "\1\12\12\uffff";
    static final String DFA55_minS =
        "\1\15\12\uffff";
    static final String DFA55_maxS =
        "\1\111\12\uffff";
    static final String DFA55_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA55_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA55_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
    static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
    static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
    static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
    static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
    static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
    static final short[][] DFA55_transition;

    static {
        int numStates = DFA55_transitionS.length;
        DFA55_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
        }
    }

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = DFA55_eot;
            this.eof = DFA55_eof;
            this.min = DFA55_min;
            this.max = DFA55_max;
            this.accept = DFA55_accept;
            this.special = DFA55_special;
            this.transition = DFA55_transition;
        }
        public String getDescription() {
            return "3933:2: ( rule__PropertyDefinition__UnorderedGroup_5__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_0 = input.LA(1);

                         
                        int index55_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA55_0 >=28 && LA55_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA55_0 >=25 && LA55_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA55_0 >=22 && LA55_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA55_0 >=45 && LA55_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA55_0 >=13 && LA55_0<=14 ||LA55_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA55_0 >=19 && LA55_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA55_0 >=17 && LA55_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA55_0 >=15 && LA55_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA55_0 >=31 && LA55_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA55_0==EOF||LA55_0==64||LA55_0==68||(LA55_0>=72 && LA55_0<=73)) ) {s = 10;}

                         
                        input.seek(index55_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\13\uffff";
    static final String DFA56_eofS =
        "\1\12\12\uffff";
    static final String DFA56_minS =
        "\1\15\12\uffff";
    static final String DFA56_maxS =
        "\1\111\12\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA56_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA56_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "3946:2: ( rule__PropertyDefinition__UnorderedGroup_5__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_0 = input.LA(1);

                         
                        int index56_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA56_0 >=28 && LA56_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA56_0 >=25 && LA56_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA56_0 >=22 && LA56_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA56_0 >=45 && LA56_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA56_0 >=13 && LA56_0<=14 ||LA56_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA56_0 >=19 && LA56_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA56_0 >=17 && LA56_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA56_0 >=15 && LA56_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA56_0 >=31 && LA56_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA56_0==EOF||LA56_0==64||LA56_0==68||(LA56_0>=72 && LA56_0<=73)) ) {s = 10;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\13\uffff";
    static final String DFA57_eofS =
        "\1\12\12\uffff";
    static final String DFA57_minS =
        "\1\15\12\uffff";
    static final String DFA57_maxS =
        "\1\111\12\uffff";
    static final String DFA57_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA57_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA57_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3959:2: ( rule__PropertyDefinition__UnorderedGroup_5__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA57_0 >=28 && LA57_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA57_0 >=25 && LA57_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA57_0 >=22 && LA57_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA57_0 >=45 && LA57_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA57_0 >=13 && LA57_0<=14 ||LA57_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA57_0 >=19 && LA57_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA57_0 >=17 && LA57_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA57_0 >=15 && LA57_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA57_0 >=31 && LA57_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA57_0==EOF||LA57_0==64||LA57_0==68||(LA57_0>=72 && LA57_0<=73)) ) {s = 10;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\13\uffff";
    static final String DFA58_eofS =
        "\1\12\12\uffff";
    static final String DFA58_minS =
        "\1\15\12\uffff";
    static final String DFA58_maxS =
        "\1\111\12\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\11\1\1\2";
    static final String DFA58_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA58_transitionS = {
            "\2\5\2\10\2\7\2\6\1\5\3\3\3\2\3\1\2\11\14\uffff\6\4\15\uffff"+
            "\1\12\3\uffff\1\12\3\uffff\2\12",
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

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3972:2: ( rule__PropertyDefinition__UnorderedGroup_5__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_0 = input.LA(1);

                         
                        int index58_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA58_0 >=28 && LA58_0<=30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 0) ) {s = 1;}

                        else if ( LA58_0 >=25 && LA58_0<=27 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 1) ) {s = 2;}

                        else if ( LA58_0 >=22 && LA58_0<=24 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 2) ) {s = 3;}

                        else if ( LA58_0 >=45 && LA58_0<=50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 3) ) {s = 4;}

                        else if ( ( LA58_0 >=13 && LA58_0<=14 ||LA58_0==21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 4) ) {s = 5;}

                        else if ( LA58_0 >=19 && LA58_0<=20 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 5) ) {s = 6;}

                        else if ( LA58_0 >=17 && LA58_0<=18 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 6) ) {s = 7;}

                        else if ( LA58_0 >=15 && LA58_0<=16 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 7) ) {s = 8;}

                        else if ( LA58_0 >=31 && LA58_0<=32 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyDefinitionAccess().getUnorderedGroup_5(), 8) ) {s = 9;}

                        else if ( (LA58_0==EOF||LA58_0==64||LA58_0==68||(LA58_0>=72 && LA58_0<=73)) ) {s = 10;}

                         
                        input.seek(index58_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000201L});
    public static final BitSet FOLLOW_ruleNodeTypeDefinition_in_entryRuleNodeTypeDefinition122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTypeDefinition129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__0_in_ruleNodeTypeDefinition155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_entryRuleNodeDefinition182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeDefinition189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__0_in_ruleNodeDefinition215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSns_in_entryRuleSns242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSns249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sns__Alternatives_in_ruleSns275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_entryRuleNoQueryOrder362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoQueryOrder369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoQueryOrder__Alternatives_in_ruleNoQueryOrder395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_entryRuleNoFullText422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoFullText429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoFullText__Alternatives_in_ruleNoFullText455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_entryRuleQueryOps482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryOps489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__0_in_ruleQueryOps515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_entryRuleMultiple542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiple549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiple__Alternatives_in_ruleMultiple575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_entryRuleProtected602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProtected609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Protected__Alternatives_in_ruleProtected635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Alternatives_in_ruleMandatory695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_entryRuleAutocreated722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAutocreated729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Autocreated__Alternatives_in_ruleAutocreated755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary__Alternatives_in_rulePrimary815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_entryRulePrimaryItem842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryItem849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__0_in_rulePrimaryItem875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryable_in_entryRuleQueryable902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQueryable909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Queryable__Alternatives_in_ruleQueryable935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_entryRuleNotqueryable962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotqueryable969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Notqueryable__Alternatives_in_ruleNotqueryable995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_entryRuleAbstract1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstract1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Abstract__Alternatives_in_ruleAbstract1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_entryRuleMixin1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMixin1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mixin__Alternatives_in_ruleMixin1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_entryRuleOrderable1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrderable1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Orderable__Alternatives_in_ruleOrderable1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_entryRuleNsMapping1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNsMapping1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__0_in_ruleNsMapping1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_entryRulePrefix1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefix1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rulePrefix1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_entryRuleUri1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUri1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_ruleUri1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_entryRuleJcrString1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJcrString1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JcrString__Alternatives_in_ruleJcrString1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_entryRuleXiD1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXiD1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__XiD__Alternatives_in_ruleXiD1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Opv__Alternatives_in_ruleOpv1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyType__Alternatives_in_rulePropertyType1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NamespacesAssignment_0_in_rule__Model__Alternatives1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NodeTypesAssignment_1_in_rule__Model__Alternatives1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_0_in_rule__NodeTypeDefinition__Alternatives_51632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_1_in_rule__NodeTypeDefinition__Alternatives_51650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__NameAssignment_1_0_in_rule__NodeDefinition__Alternatives_11683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__NameAssignment_1_1_in_rule__NodeDefinition__Alternatives_11701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sns__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Sns__Alternatives1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Sns__Alternatives1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_2_0_in_rule__PropertyDefinition__Alternatives_21809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PropertyDefinition__Alternatives_21828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NoQueryOrder__Alternatives1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NoQueryOrder__Alternatives1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NoFullText__Alternatives1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NoFullText__Alternatives1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QueryOps__Alternatives_01973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QueryOps__Alternatives_01993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Multiple__Alternatives2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Multiple__Alternatives2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Multiple__Alternatives2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Protected__Alternatives2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Protected__Alternatives2123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Protected__Alternatives2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Mandatory__Alternatives2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Mandatory__Alternatives2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Mandatory__Alternatives2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Autocreated__Alternatives2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Autocreated__Alternatives2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Autocreated__Alternatives2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Primary__Alternatives2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Primary__Alternatives2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PrimaryItem__Alternatives_02383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PrimaryItem__Alternatives_02403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Queryable__Alternatives2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Queryable__Alternatives2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Notqueryable__Alternatives2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Notqueryable__Alternatives2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Abstract__Alternatives2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Abstract__Alternatives2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Abstract__Alternatives2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Mixin__Alternatives2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Mixin__Alternatives2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Mixin__Alternatives2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Orderable__Alternatives2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Orderable__Alternatives2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Orderable__Alternatives2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JcrString__Alternatives2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXiD_in_rule__JcrString__Alternatives2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXID_in_rule__XiD__Alternatives2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__XiD__Alternatives2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Opv__Alternatives2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Opv__Alternatives2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Opv__Alternatives2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Opv__Alternatives2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Opv__Alternatives2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Opv__Alternatives2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__PropertyType__Alternatives3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__PropertyType__Alternatives3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__PropertyType__Alternatives3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__PropertyType__Alternatives3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__PropertyType__Alternatives3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__PropertyType__Alternatives3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__PropertyType__Alternatives3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__PropertyType__Alternatives3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__PropertyType__Alternatives3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__PropertyType__Alternatives3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__PropertyType__Alternatives3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__PropertyType__Alternatives3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__PropertyType__Alternatives3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__0__Impl_in_rule__NodeTypeDefinition__Group__03300 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__1_in_rule__NodeTypeDefinition__Group__03303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__NodeTypeDefinition__Group__0__Impl3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__1__Impl_in_rule__NodeTypeDefinition__Group__13362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__2_in_rule__NodeTypeDefinition__Group__13365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__NameAssignment_1_in_rule__NodeTypeDefinition__Group__1__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__2__Impl_in_rule__NodeTypeDefinition__Group__23422 = new BitSet(new long[]{0x00001FFF48000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__3_in_rule__NodeTypeDefinition__Group__23425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__NodeTypeDefinition__Group__2__Impl3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__3__Impl_in_rule__NodeTypeDefinition__Group__33484 = new BitSet(new long[]{0x00001FFF48000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__4_in_rule__NodeTypeDefinition__Group__33487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__0_in_rule__NodeTypeDefinition__Group__3__Impl3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__4__Impl_in_rule__NodeTypeDefinition__Group__43545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000110L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__5_in_rule__NodeTypeDefinition__Group__43548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4_in_rule__NodeTypeDefinition__Group__4__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group__5__Impl_in_rule__NodeTypeDefinition__Group__53605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Alternatives_5_in_rule__NodeTypeDefinition__Group__5__Impl3632 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000110L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__0__Impl_in_rule__NodeTypeDefinition__Group_3__03675 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__1_in_rule__NodeTypeDefinition__Group_3__03678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__NodeTypeDefinition__Group_3__0__Impl3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__1__Impl_in_rule__NodeTypeDefinition__Group_3__13737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__2_in_rule__NodeTypeDefinition__Group_3__13740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_1_in_rule__NodeTypeDefinition__Group_3__1__Impl3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3__2__Impl_in_rule__NodeTypeDefinition__Group_3__23797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__0_in_rule__NodeTypeDefinition__Group_3__2__Impl3824 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__0__Impl_in_rule__NodeTypeDefinition__Group_3_2__03861 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__1_in_rule__NodeTypeDefinition__Group_3_2__03864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__NodeTypeDefinition__Group_3_2__0__Impl3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__Group_3_2__1__Impl_in_rule__NodeTypeDefinition__Group_3_2__13923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_1_in_rule__NodeTypeDefinition__Group_3_2__1__Impl3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__0__Impl_in_rule__NodeDefinition__Group__03984 = new BitSet(new long[]{0x0000020000002030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__1_in_rule__NodeDefinition__Group__03987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__NodeDefinition__Group__0__Impl4015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__1__Impl_in_rule__NodeDefinition__Group__14046 = new BitSet(new long[]{0x0007E0007FC07000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__2_in_rule__NodeDefinition__Group__14049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Alternatives_1_in_rule__NodeDefinition__Group__1__Impl4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__2__Impl_in_rule__NodeDefinition__Group__24106 = new BitSet(new long[]{0x0007E0007FC07000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__3_in_rule__NodeDefinition__Group__24109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__0_in_rule__NodeDefinition__Group__2__Impl4136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__3__Impl_in_rule__NodeDefinition__Group__34167 = new BitSet(new long[]{0x0007E0007FC07000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__4_in_rule__NodeDefinition__Group__34170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__0_in_rule__NodeDefinition__Group__3__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group__4__Impl_in_rule__NodeDefinition__Group__44228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4_in_rule__NodeDefinition__Group__4__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__0__Impl_in_rule__NodeDefinition__Group_2__04295 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__1_in_rule__NodeDefinition__Group_2__04298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__NodeDefinition__Group_2__0__Impl4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__1__Impl_in_rule__NodeDefinition__Group_2__14357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__2_in_rule__NodeDefinition__Group_2__14360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__0_in_rule__NodeDefinition__Group_2__1__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2__2__Impl_in_rule__NodeDefinition__Group_2__24417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__NodeDefinition__Group_2__2__Impl4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__0__Impl_in_rule__NodeDefinition__Group_2_1__04482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__1_in_rule__NodeDefinition__Group_2_1__04485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_0_in_rule__NodeDefinition__Group_2_1__0__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1__1__Impl_in_rule__NodeDefinition__Group_2_1__14542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__0_in_rule__NodeDefinition__Group_2_1__1__Impl4569 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__0__Impl_in_rule__NodeDefinition__Group_2_1_1__04604 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__1_in_rule__NodeDefinition__Group_2_1_1__04607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__NodeDefinition__Group_2_1_1__0__Impl4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_2_1_1__1__Impl_in_rule__NodeDefinition__Group_2_1_1__14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_1_in_rule__NodeDefinition__Group_2_1_1__1__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__0__Impl_in_rule__NodeDefinition__Group_3__04727 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__1_in_rule__NodeDefinition__Group_3__04730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__NodeDefinition__Group_3__0__Impl4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__Group_3__1__Impl_in_rule__NodeDefinition__Group_3__14789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__DefaultTypeAssignment_3_1_in_rule__NodeDefinition__Group_3__1__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__04850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__04853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__14911 = new BitSet(new long[]{0x0000020000002030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__14914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__PropertyDefinition__Group__1__Impl4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__24973 = new BitSet(new long[]{0x0007E001FFFFE000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__24976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Alternatives_2_in_rule__PropertyDefinition__Group__2__Impl5003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__35033 = new BitSet(new long[]{0x0007E001FFFFE000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__35036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__0_in_rule__PropertyDefinition__Group__3__Impl5063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__45094 = new BitSet(new long[]{0x0007E001FFFFE000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__45097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__0_in_rule__PropertyDefinition__Group__4__Impl5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__55155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__6_in_rule__PropertyDefinition__Group__55158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5_in_rule__PropertyDefinition__Group__5__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__6__Impl_in_rule__PropertyDefinition__Group__65215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__0_in_rule__PropertyDefinition__Group__6__Impl5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__0__Impl_in_rule__PropertyDefinition__Group_3__05287 = new BitSet(new long[]{0xFFF8000000000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__1_in_rule__PropertyDefinition__Group_3__05290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__PropertyDefinition__Group_3__0__Impl5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__1__Impl_in_rule__PropertyDefinition__Group_3__15349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__2_in_rule__PropertyDefinition__Group_3__15352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__TypeAssignment_3_1_in_rule__PropertyDefinition__Group_3__1__Impl5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_3__2__Impl_in_rule__PropertyDefinition__Group_3__25409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__PropertyDefinition__Group_3__2__Impl5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__0__Impl_in_rule__PropertyDefinition__Group_4__05474 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__1_in_rule__PropertyDefinition__Group_4__05477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__PropertyDefinition__Group_4__0__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4__1__Impl_in_rule__PropertyDefinition__Group_4__15536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__0_in_rule__PropertyDefinition__Group_4__1__Impl5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__0__Impl_in_rule__PropertyDefinition__Group_4_1__05597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__1_in_rule__PropertyDefinition__Group_4_1__05600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_0_in_rule__PropertyDefinition__Group_4_1__0__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1__1__Impl_in_rule__PropertyDefinition__Group_4_1__15657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__0_in_rule__PropertyDefinition__Group_4_1__1__Impl5684 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__0__Impl_in_rule__PropertyDefinition__Group_4_1_1__05719 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__1_in_rule__PropertyDefinition__Group_4_1_1__05722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__PropertyDefinition__Group_4_1_1__0__Impl5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_4_1_1__1__Impl_in_rule__PropertyDefinition__Group_4_1_1__15781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_1_in_rule__PropertyDefinition__Group_4_1_1__1__Impl5808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__0__Impl_in_rule__PropertyDefinition__Group_6__05842 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__1_in_rule__PropertyDefinition__Group_6__05845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__PropertyDefinition__Group_6__0__Impl5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6__1__Impl_in_rule__PropertyDefinition__Group_6__15904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__0_in_rule__PropertyDefinition__Group_6__1__Impl5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__0__Impl_in_rule__PropertyDefinition__Group_6_1__05965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__1_in_rule__PropertyDefinition__Group_6_1__05968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_0_in_rule__PropertyDefinition__Group_6_1__0__Impl5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1__1__Impl_in_rule__PropertyDefinition__Group_6_1__16025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__0_in_rule__PropertyDefinition__Group_6_1__1__Impl6052 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__0__Impl_in_rule__PropertyDefinition__Group_6_1_1__06087 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__1_in_rule__PropertyDefinition__Group_6_1_1__06090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__PropertyDefinition__Group_6_1_1__0__Impl6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group_6_1_1__1__Impl_in_rule__PropertyDefinition__Group_6_1_1__16149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_1_in_rule__PropertyDefinition__Group_6_1_1__1__Impl6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__0__Impl_in_rule__QueryOps__Group__06210 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__1_in_rule__QueryOps__Group__06213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Alternatives_0_in_rule__QueryOps__Group__0__Impl6240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QueryOps__Group__1__Impl_in_rule__QueryOps__Group__16270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__QueryOps__Group__1__Impl6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__0__Impl_in_rule__PrimaryItem__Group__06330 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__1_in_rule__PrimaryItem__Group__06333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Alternatives_0_in_rule__PrimaryItem__Group__0__Impl6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryItem__Group__1__Impl_in_rule__PrimaryItem__Group__16390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PrimaryItem__Group__1__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__0__Impl_in_rule__NsMapping__Group__06450 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__1_in_rule__NsMapping__Group__06453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__NsMapping__Group__0__Impl6481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__1__Impl_in_rule__NsMapping__Group__16512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__2_in_rule__NsMapping__Group__16515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__NameAssignment_1_in_rule__NsMapping__Group__1__Impl6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__2__Impl_in_rule__NsMapping__Group__26572 = new BitSet(new long[]{0x0000020000000030L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__3_in_rule__NsMapping__Group__26575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__NsMapping__Group__2__Impl6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__3__Impl_in_rule__NsMapping__Group__36634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__4_in_rule__NsMapping__Group__36637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__UriAssignment_3_in_rule__NsMapping__Group__3__Impl6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NsMapping__Group__4__Impl_in_rule__NsMapping__Group__46694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__NsMapping__Group__4__Impl6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__0_in_rule__NodeTypeDefinition__UnorderedGroup_46764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__OrderableAssignment_4_0_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__MixinAssignment_4_1_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__AbstractAssignment_4_2_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__QueryableAssignment_4_3_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__NotqueryableAssignment_4_4_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__PrimaryItemAssignment_4_5_in_rule__NodeTypeDefinition__UnorderedGroup_4__Impl7306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__07365 = new BitSet(new long[]{0x00001FFF48000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__1_in_rule__NodeTypeDefinition__UnorderedGroup_4__07368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__17393 = new BitSet(new long[]{0x00001FFF48000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__2_in_rule__NodeTypeDefinition__UnorderedGroup_4__17396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__27421 = new BitSet(new long[]{0x00001FFF48000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__3_in_rule__NodeTypeDefinition__UnorderedGroup_4__27424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__37449 = new BitSet(new long[]{0x00001FFF48000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__4_in_rule__NodeTypeDefinition__UnorderedGroup_4__37452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__47477 = new BitSet(new long[]{0x00001FFF48000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__5_in_rule__NodeTypeDefinition__UnorderedGroup_4__47480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeTypeDefinition__UnorderedGroup_4__Impl_in_rule__NodeTypeDefinition__UnorderedGroup_4__57505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__0_in_rule__NodeDefinition__UnorderedGroup_47541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__AutocreatedAssignment_4_0_in_rule__NodeDefinition__UnorderedGroup_4__Impl7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__ManadatoryAssignment_4_1_in_rule__NodeDefinition__UnorderedGroup_4__Impl7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__ProtectedAssignment_4_2_in_rule__NodeDefinition__UnorderedGroup_4__Impl7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__OnParentVersionAssignment_4_3_in_rule__NodeDefinition__UnorderedGroup_4__Impl7901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__SameNameSiblingsAssignment_4_4_in_rule__NodeDefinition__UnorderedGroup_4__Impl7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__08051 = new BitSet(new long[]{0x0007E0007FC07002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__1_in_rule__NodeDefinition__UnorderedGroup_4__08054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__18079 = new BitSet(new long[]{0x0007E0007FC07002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__2_in_rule__NodeDefinition__UnorderedGroup_4__18082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__28107 = new BitSet(new long[]{0x0007E0007FC07002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__3_in_rule__NodeDefinition__UnorderedGroup_4__28110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__38135 = new BitSet(new long[]{0x0007E0007FC07002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__4_in_rule__NodeDefinition__UnorderedGroup_4__38138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeDefinition__UnorderedGroup_4__Impl_in_rule__NodeDefinition__UnorderedGroup_4__48163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__0_in_rule__PropertyDefinition__UnorderedGroup_58197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__AutocreatedAssignment_5_0_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__MandatoryAssignment_5_1_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__ProtectedAssignment_5_2_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__OnParentVersionAssignment_5_3_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__MultipleAssignment_5_4_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__QueryOpsAssignment_5_5_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NoFullTextAssignment_5_6_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NoQueryOrderAssignment_5_7_in_rule__PropertyDefinition__UnorderedGroup_5__Impl8921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__PrimaryAssignment_5_8_in_rule__PropertyDefinition__UnorderedGroup_5__Impl9012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__09071 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__1_in_rule__PropertyDefinition__UnorderedGroup_5__09074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__19099 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__2_in_rule__PropertyDefinition__UnorderedGroup_5__19102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__29127 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__3_in_rule__PropertyDefinition__UnorderedGroup_5__29130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__39155 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__4_in_rule__PropertyDefinition__UnorderedGroup_5__39158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__49183 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__5_in_rule__PropertyDefinition__UnorderedGroup_5__49186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__59211 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__6_in_rule__PropertyDefinition__UnorderedGroup_5__59214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__69239 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__7_in_rule__PropertyDefinition__UnorderedGroup_5__69242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__79267 = new BitSet(new long[]{0x0007E001FFFFE002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__8_in_rule__PropertyDefinition__UnorderedGroup_5__79270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__UnorderedGroup_5__Impl_in_rule__PropertyDefinition__UnorderedGroup_5__89295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNsMapping_in_rule__Model__NamespacesAssignment_09341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTypeDefinition_in_rule__Model__NodeTypesAssignment_19372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__NameAssignment_19403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_19434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeTypeDefinition__DeclaredSupertypeNamesAssignment_3_2_19465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrderable_in_rule__NodeTypeDefinition__OrderableAssignment_4_09496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMixin_in_rule__NodeTypeDefinition__MixinAssignment_4_19527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstract_in_rule__NodeTypeDefinition__AbstractAssignment_4_29558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryable_in_rule__NodeTypeDefinition__QueryableAssignment_4_39589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotqueryable_in_rule__NodeTypeDefinition__NotqueryableAssignment_4_49620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryItem_in_rule__NodeTypeDefinition__PrimaryItemAssignment_4_59651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__NodeTypeDefinition__DeclaredPropertyDefinitionsAssignment_5_09682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeDefinition_in_rule__NodeTypeDefinition__DeclaredChildNodeDefinitionsAssignment_5_19713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__NameAssignment_1_09744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeDefinition__NameAssignment_1_19780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_09819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__RequiredTypesAssignment_2_1_1_19850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__NodeDefinition__DefaultTypeAssignment_3_19881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rule__NodeDefinition__AutocreatedAssignment_4_09912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__NodeDefinition__ManadatoryAssignment_4_19943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_rule__NodeDefinition__ProtectedAssignment_4_29974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_rule__NodeDefinition__OnParentVersionAssignment_4_310005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSns_in_rule__NodeDefinition__SameNameSiblingsAssignment_4_410036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__NameAssignment_2_010067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyType_in_rule__PropertyDefinition__TypeAssignment_3_110098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_010129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__DefaultValuesAssignment_4_1_1_110160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAutocreated_in_rule__PropertyDefinition__AutocreatedAssignment_5_010191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__PropertyDefinition__MandatoryAssignment_5_110222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProtected_in_rule__PropertyDefinition__ProtectedAssignment_5_210253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpv_in_rule__PropertyDefinition__OnParentVersionAssignment_5_310284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiple_in_rule__PropertyDefinition__MultipleAssignment_5_410315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQueryOps_in_rule__PropertyDefinition__QueryOpsAssignment_5_510346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoFullText_in_rule__PropertyDefinition__NoFullTextAssignment_5_610377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoQueryOrder_in_rule__PropertyDefinition__NoQueryOrderAssignment_5_710408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_rule__PropertyDefinition__PrimaryAssignment_5_810439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_010470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJcrString_in_rule__PropertyDefinition__ValueConstraintsAssignment_6_1_1_110501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefix_in_rule__NsMapping__NameAssignment_110532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUri_in_rule__NsMapping__UriAssignment_310563 = new BitSet(new long[]{0x0000000000000002L});

}
