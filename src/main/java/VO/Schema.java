/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

public class Schema
{
    private String name;
    public Table tables;

    public Schema(String name, Table tables)
    {
        this.name = name;
        this.tables = tables;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Table getTables()
    {
        return tables;
    }

    public void setTables(Table tables)
    {
        this.tables = tables;
    }

    @Override
    public String toString()
    {
        return "Schema{" + "name=" + name + ", tables=" + tables + '}';
    }
}