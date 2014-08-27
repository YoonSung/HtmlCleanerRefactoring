package org.htmlcleaner.node;


/**
 * All nodes.
 */
public class TagAllCondition implements ITagNodeCondition {
    public boolean satisfy(TagNode tagNode) {
        return true;
    }
}