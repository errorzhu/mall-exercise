package com.errorzhu.mall.admin.dao;


import com.errorzhu.mall.admin.model.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * 订单操作记录自定义Dao
 * Created by macro on 2018/10/12.
 */
public interface OmsOrderOperateHistoryDao {
    int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}
