
package VO;

public class SimpleField
{
    public String editionMask;
    public String defaultValue;
    public String validationMessage;

    public String getEditionMask()
    {
        return editionMask;
    }

    public void setEditionMask(String editionMask)
    {
        this.editionMask = editionMask;
    }

    public String getDefaultValue()
    {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue)
    {
        this.defaultValue = defaultValue;
    }

    public String getValidationMessage()
    {
        return validationMessage;
    }

    public void setValidationMessage(String validationMessage)
    {
        this.validationMessage = validationMessage;
    }

    @Override
    public String toString()
    {
        return "SimpleField{" + "editionMask=" + editionMask + ", defaultValue=" + defaultValue + ", validationMessage=" + validationMessage + '}';
    }
}