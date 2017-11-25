/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author BRIAN
 */
public class Table
{
    public String name;
    public int oid;
    public Key keys;
    public ForeignKey tables;
    public ForeignKey foreignKey;
    public ViewComponent source;

    public Table(String name, int oid, Key keys, ForeignKey tables, ForeignKey foreignKey, ViewComponent source) {
        this.name = name;
        this.oid = oid;
        this.keys = keys;
        this.tables = tables;
        this.foreignKey = foreignKey;
        this.source = source;
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

    public ForeignKey getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(ForeignKey foreignKey) {
        this.foreignKey = foreignKey;
    }

    public ViewComponent getSource() {
        return source;
    }

    public void setSource(ViewComponent source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Table{" + "name=" + name + ", oid=" + oid + ", keys=" + keys + ", tables=" + tables + ", foreignKey=" + foreignKey + ", source=" + source + '}';
    }
}