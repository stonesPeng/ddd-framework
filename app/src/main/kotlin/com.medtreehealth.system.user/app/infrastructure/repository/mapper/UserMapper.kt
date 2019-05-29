package com.medtreehealth.system.user.app.infrastructure.repository.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.medtreehealth.system.user.app.infrastructure.repository.entity.UserEntity
import org.apache.ibatis.annotations.Mapper

/**
 *@author honorstone
 *@date 2019/5/29 10:03
 */
@Mapper
interface UserMapper : BaseMapper<UserEntity> {
}