/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

public class Schema
{
    private String name;

    public Schema(Table tables)
    {
        tables = new Table();
    }        
            
    public Schema(String name, Table tables)
    {
        this.name = name;
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
        return "Schema{" + "name=" + name + '}';
    }
}