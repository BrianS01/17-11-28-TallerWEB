/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

public class ParameterBindingGroup
{
    private int id;
    private ParameterBinding parameterBinding;

    public ParameterBindingGroup()
    {
        ParameterBinding parameterBinding = new ParameterBinding();
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
        return "ParameterBindingGroup{" + "id=" + id + ", parameterBinding=" + parameterBinding + '}';
    } 
}