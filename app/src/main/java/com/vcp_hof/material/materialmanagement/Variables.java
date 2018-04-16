package com.vcp_hof.material.materialmanagement;

import android.app.Application;

/**
 * Created by Max on 10.03.2018.
 */

public class Variables extends Application {
    private String PermissionGroup="";

    public String getPermissionGroup() {
        return PermissionGroup;
    }

    public void setPermissionGroup(String PermissionGroup) {
        this.PermissionGroup = PermissionGroup;
    }
}
