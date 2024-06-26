package tkaxv7s.xposed.sesame.model.normal.webDav;

import tkaxv7s.xposed.sesame.data.Model;
import tkaxv7s.xposed.sesame.data.ModelFields;
import tkaxv7s.xposed.sesame.data.modelFieldExt.BooleanModelField;
import tkaxv7s.xposed.sesame.data.modelFieldExt.StringModelField;

/**
 * WebDav备份与同步
 * @author xiong
 */
public class WebDav extends Model {

    @Override
    public String setName() {
        return "备份与同步";
    }

    private final BooleanModelField enableBackupSync = new BooleanModelField("enableBackupSync", "开启备份与同步", false);
    private final StringModelField webDavUrl = new StringModelField("webDavUrl", "WebDav | 地址", "");
    private final StringModelField webDavUserName = new StringModelField("webDavUserName", "WebDav | 用户", "");
    private final StringModelField webDavPassWord = new StringModelField("webDavPassWord", "WebDav | 密码", "");

    @Override
    public ModelFields setFields() {
        ModelFields modelFields = new ModelFields();
        modelFields.addField(enableBackupSync);
        modelFields.addField(webDavUrl);
        modelFields.addField(webDavUserName);
        modelFields.addField(webDavPassWord);
        return modelFields;
    }

}
