/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

public class ViewContainer extends ViewElement
{
    public boolean isLandMark;
    public boolean isDefault;
    public boolean isXOR;
    public boolean protect;
    private ViewElement viewElements;
    
    public ViewContainer()
    {
        ViewElement viewElements = new ViewElement() {};
    }
    
    public ViewContainer(boolean isLandMark, boolean isDefault, boolean isXOR, boolean protect, ViewElement viewElements)
    {
        this.isLandMark = isLandMark;
        this.isDefault = isDefault;
        this.isXOR = isXOR;
        this.protect = protect;
    }

    public boolean isIsLandMark()
    {
        return isLandMark;
    }

    public void setIsLandMark(boolean isLandMark)
    {
        this.isLandMark = isLandMark;
    }

    public boolean isIsDefault()
    {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault)
    {
        this.isDefault = isDefault;
    }

    public boolean isIsXOR()
    {
        return isXOR;
    }

    public void setIsXOR(boolean isXOR)
    {
        this.isXOR = isXOR;
    }

    public boolean isProtect()
    {
        return protect;
    }

    public void setProtect(boolean protect)
    {
        this.protect = protect;
    }

    @Override
    public String toString()
    {
        return "ViewContainer{" + "isLandMark=" + isLandMark + ", isDefault=" + isDefault + ", isXOR=" + isXOR + ", protect=" + protect + '}';
    }
}