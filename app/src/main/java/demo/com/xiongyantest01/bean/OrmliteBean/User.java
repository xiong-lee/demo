package demo.com.xiongyantest01.bean.OrmliteBean;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by xiongyan on 2017/8/1.
 * Ormlite Sqlite 框架
 */
@DatabaseTable(tableName = "tb_user")
public class User {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = "name")
    private String name;
    @DatabaseField(columnName = "desc")
    private String desc;

    public User() {
    }

    public User(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
