/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

public abstract class Field
{
    protected String name;
    protected String type;
    protected String helpMessage;
    protected String comment;
    public String initialValue;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getHelpMessage()
    {
        return helpMessage;
    }

    public void setHelpMessage(String helpMessage)
    {
        this.helpMessage = helpMessage;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }

    public String getInitialValue()
    {
        return initialValue;
    }

    public void setInitialValue(String initialValue)
    {
        this.initialValue = initialValue;
    }

    @Override
    public String toString()
    {
        return "Field{" + "name=" + name + ", type=" + type + ", helpMessage=" + helpMessage + ", comment=" + comment + ", initialValue=" + initialValue + '}';
    }
}