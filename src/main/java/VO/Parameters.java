/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

public class Parameters
{
    public int id;
    private ParameterBinding target;
    private ParameterBinding source;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public ParameterBinding getTarget()
    {
        return target;
    }

    public void setTarget(ParameterBinding target)
    {
        this.target = target;
    }

    public ParameterBinding getSource()
    {
        return source;
    }

    public void setSource(ParameterBinding source)
    {
        this.source = source;
    }

    @Override
    public String toString()
    {
        return "Parameters{" + "id=" + id + ", target=" + target + ", source=" + source + '}';
    }
}