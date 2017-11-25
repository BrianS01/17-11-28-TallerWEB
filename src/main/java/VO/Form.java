/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

public class Form
{
    private Field field;

    public Form(Field field)
    {
        field = new Field() {};
    }

    public Field getField()
    {
        return field;
    }

    public void setField(Field field)
    {
        this.field = field;
    }

    @Override
    public String toString()
    {
        return "Form{" + "field=" + field + '}';
    }
}