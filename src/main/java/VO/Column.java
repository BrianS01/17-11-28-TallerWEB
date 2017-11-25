/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author BRIAN
 */
public class Column
{
    protected String name;
    protected String type;
    protected int size;
    private String defaultValue;
    private boolean isRequired;
    private boolean acceptNull;
    protected String alias;
    protected String comment;
    protected String helpMessage;

    public Column(String name, String type, int size, String defaultValue, boolean isRequired, boolean acceptNull, String alias, String comment, String helpMessage)
    {
        this.name = name;
        this.type = type;
        this.size = size;
        this.defaultValue = defaultValue;
        this.isRequired = isRequired;
        this.acceptNull = acceptNull;
        this.alias = alias;
        this.comment = comment;
        this.helpMessage = helpMessage;
    }
    
    
}
