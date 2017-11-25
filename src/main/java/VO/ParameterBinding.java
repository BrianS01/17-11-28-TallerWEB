/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

public class ParameterBinding
{
    private int id;
    private Parameters target;
    private Parameters source;

    public ParameterBinding()
    {
        Parameters target = new Parameters();
        Parameters source = new Parameters();
    }
  
    public ParameterBinding(int id, Parameters target, Parameters source)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ParameterBinding{" + "id=" + id + ", target=" + target + ", source=" + source + '}';
    }
}