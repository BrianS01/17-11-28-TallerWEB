/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

public class Table
{
    public String name;
    public int oid;
    private Key keys;
    public ForeignKey tables;
    public ViewComponent source;
    private ForeignKey foreignKey;
    
    public Table()
    {}

    public Table(String name, int oid, Key keys, ForeignKey tables, ViewComponent source, ForeignKey foreignKey)
    {
        this.name = name;
        this.oid = oid;
        this.keys = keys;
        this.tables = tables;
        this.source = source;
        this.foreignKey = foreignKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Key getKeys() {
        return keys;
    }

    public void setKeys(Key keys) {
        this.keys = keys;
    }

    public ForeignKey getTables() {
        return tables;
    }

    public void setTables(ForeignKey tables) {
        this.tables = tables;
    }

    public ViewComponent getSource() {
        return source;
    }

    public void setSource(ViewComponent source) {
        this.source = source;
    }

    public ForeignKey getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(ForeignKey foreignKey) {
        this.foreignKey = foreignKey;
    }
}