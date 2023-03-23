/*******************************************************************
 * Copyright (c) 2006 - 2019, Martin Kesting, All rights reserved.
 *
 * This software is licenced under the Eclipse Public License v1.0,
 * see the LICENSE file or http://www.eclipse.org/legal/epl-v10.html
 * for details.
 *******************************************************************/
package net.sf.jautodoc.templates;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import net.sf.jautodoc.templates.wrapper.IMemberWrapper;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;

/**
 * This template manager is used, when no template engine is available.
 */
public class NullTemplateManager implements ITemplateManager {
    TemplateSet templates = new TemplateSet();

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#getTemplates()
     */
    @Override
    public TemplateSet getTemplates() throws Exception {
        return templates;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setTemplates(TemplateSet templates) throws Exception {
        // empty
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#getTypeTemplates()
     */
    @Override
    public List<TemplateEntry> getTypeTemplates() throws Exception {
        return templates.getTypeTemplates();
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#getFieldTemplates()
     */
    @Override
    public List<TemplateEntry> getFieldTemplates() throws Exception {
        return templates.getFieldTemplates();
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#getMethodTemplates()
     */
    @Override
    public List<TemplateEntry> getMethodTemplates() throws Exception {
        return templates.getMethodTemplates();
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#getParameterTemplates()
     */
    @Override
    public List<TemplateEntry> getParameterTemplates() throws Exception {
        return templates.getParameterTemplates();
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#getExceptionTemplates()
     */
    @Override
    public List<TemplateEntry> getExceptionTemplates() throws Exception {
        return templates.getExceptionTemplates();
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#applyTemplate(org.eclipse.jdt.core.IMember)
     */
    @Override
    public String applyTemplate(IMember member, Map<String, String> properties) throws Exception {
        return "";
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#applyParameterTemplate(org.eclipse.jdt.core.IMember, java.lang.String, java.lang.String)
     */
    @Override
    public String applyParameterTemplate(IMember member, String type,
            String name, Map<String, String> properties) throws Exception {
        return "";
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#applyExceptionTemplate(org.eclipse.jdt.core.IMethod, java.lang.String)
     */
    @Override
    public String applyExceptionTemplate(IMethod method, String name, Map<String, String> properties)
            throws Exception {
        return "";
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#getTemplateText(java.lang.String)
     */
    @Override
    public String getTemplateText(String templateName) {
        return "";
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#existsTemplate(java.lang.String)
     */
    @Override
    public boolean existsTemplate(String templateName) {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#evaluateTemplate(org.eclipse.jdt.core.IJavaElement, java.lang.String, java.lang.String)
     */
    @Override
    public String evaluateTemplate(IJavaElement javaElement, String template,
            String templateName, Map<String, String> properties) throws Exception {
        return template;
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#evaluateTemplate(java.util.regex.Matcher, java.util.regex.Matcher, java.lang.String,
     * net.sf.jautodoc.templates.TemplateEntry)
     */
    @Override
    public String evaluateTemplate(Matcher matcher, Matcher parentMatcher,
            String template, TemplateEntry entry, Map<String, String> properties) throws Exception {
        return template;
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#validateTemplate(java.lang.String)
     */
    @Override
    public void validateTemplate(String template) throws ValidationException,
            Exception {
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#initialize()
     */
    @Override
    public void initialize() throws Exception {
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#loadDefaultTemplates()
     */
    @Override
    public void loadDefaultTemplates() throws Exception {
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#loadTemplates()
     */
    @Override
    public void loadTemplates() throws Exception {
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#loadTemplates(java.io.File)
     */
    @Override
    public void loadTemplates(File file) throws Exception {
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#putTemplate(net.sf.jautodoc.templates.TemplateEntry)
     */
    @Override
    public void putTemplate(TemplateEntry entry) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#storeTemplates()
     */
    @Override
    public void storeTemplates() throws Exception {
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.sf.jautodoc.templates.ITemplateManager#storeTemplates(java.io.File)
     */
    @Override
    public void storeTemplates(File file) throws Exception {
    }

    @Override
    public MatchingElement searchMatchingElement(IMemberWrapper member) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}
