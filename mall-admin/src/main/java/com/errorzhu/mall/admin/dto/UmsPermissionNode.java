package com.errorzhu.mall.admin.dto;

import com.errorzhu.mall.admin.model.UmsPermission;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by macro on 2018/9/30.
 */
public class UmsPermissionNode extends UmsPermission {
    @Getter
    @Setter
    private List<UmsPermissionNode> children;
}
