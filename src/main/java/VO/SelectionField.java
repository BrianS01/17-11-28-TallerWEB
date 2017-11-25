/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

public class SelectionField
{
    public boolean isMultiSelection;

    public boolean isIsMultiSelection()
    {
        return isMultiSelection;
    }

    public void setIsMultiSelection(boolean isMultiSelection)
    {
        this.isMultiSelection = isMultiSelection;
    }

    @Override
    public String toString()
    {
        return "SelectionField{" + "isMultiSelection=" + isMultiSelection + '}';
    }
}
