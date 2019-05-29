package com.medtreehealth.system.user.app.infrastructure.repository

import com.medtreehealth.system.user.app.api.UserQueryService
import com.medtreehealth.system.user.app.infrastructure.repository.mapper.UserMapper
import com.medtreehealth.system.user.core.infrastructure.port.repo.UserRepositoryPort
import org.springframework.stereotype.Repository

/**
 *@author honorstone
 *@date 2019/5/28 9:49
 */
@Repository
class UserRepository(
        private val userMapper: UserMapper
) : UserRepositoryPort, UserQueryService