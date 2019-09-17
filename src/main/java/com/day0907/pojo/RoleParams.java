package com.day0907.pojo;

/**
 * @Author: YangxingLiu
 * @Description:
 * @Date: Created in 2019/9/16 23:23
 * @Modified By:
 */
public class RoleParams {
    private String roleName;
    private String note;
    private PageParams pageParams;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public PageParams getPageParams() {
        return pageParams;
    }

    public void setPageParams(PageParams pageParams) {
        this.pageParams = pageParams;
    }
}
