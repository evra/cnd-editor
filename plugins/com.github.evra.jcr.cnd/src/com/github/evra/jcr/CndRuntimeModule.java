/*
 * generated by Xtext
 */
package com.github.evra.jcr;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.scoping.IScopeProvider;

import com.github.evra.jcr.conversion.CndConverters;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class CndRuntimeModule extends com.github.evra.jcr.AbstractCndRuntimeModule {

	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return super.bindIScopeProvider();
	}

	public void configureSerializerIScopeProvider(com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
				.annotatedWith(org.eclipse.xtext.serializer.tokens.SerializerScopeProviderBinding.class)
				.to(CNDSerializerScopeProvider.class);
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return CndConverters.class;
	}

}
