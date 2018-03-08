package com.java123.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class SimpleTag extends SimpleTagSupport {

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
    public void doTag() throws JspException, IOException {
        Object value = this.getJspContext().getAttribute(items);
        if (value != null && value instanceof List) {
            this.iterator = ((List)value).iterator();
            while (iterator.hasNext()) {
                this.getJspContext().setAttribute(var, iterator.next());
                this.getJspBody().invoke(null);
            }
        }
    }
}
