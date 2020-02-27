package com.errorzhu.mall.admin.dto;


import com.errorzhu.mall.admin.model.OmsCompanyAddress;
import com.errorzhu.mall.admin.model.OmsOrderReturnApply;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * Created by macro on 2018/10/18.
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    private OmsCompanyAddress companyAddress;
}
