package com.java123.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class IterateTag extends TagSupport {

    private String var;
    private String items;
    private Iterator iterator;

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public Iterator getIterator() {
        return iterator;
    }

    public void setIterator(Iterator iterator) {
        this.iterator = iterator;
    }


    @Override
    public int doStartTag() throws JspException {
        Object value = this.pageContext.getAttribute(items);
        if (value != null && value instanceof List) {
            this.iterator = ((List)value).iterator();
            if (iterator.hasNext()) {
                this.pageContext.setAttribute(var, iterator.next());
                return TagSupport.EVAL_BODY_INCLUDE;
            } else {
                return TagSupport.SKIP_BODY;
            }
        } else {
            return TagSupport.SKIP_BODY;
        }
    }

    @Override
    public int doAfterBody() throws JspException {
        if (iterator.hasNext()) {
            this.pageContext.setAttribute(var, iterator.next());
            return TagSupport.EVAL_BODY_AGAIN;
        } else {
            return TagSupport.SKIP_BODY;
        }
    }
}
