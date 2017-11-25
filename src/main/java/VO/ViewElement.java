/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

public abstract class ViewElement
{
    private String name;
    private InteractionFlow interactionFlow;
    
    public ViewElement()
    {
        InteractionFlow interactionFlow = new InteractionFlow() {};
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ViewElement{" + "name=" + name + '}';
    }
}