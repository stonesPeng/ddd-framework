package com.medtreehealth.system.user.core.infrastructure.adapter

import com.medtreehealth.system.user.core.domain.port.UserFactoryPort
import com.medtreehealth.system.user.core.infrastructure.port.repo.UserRepositoryPort
import org.springframework.stereotype.Service

/**
 *@author honorstone
 *@date 2019/5/21 11:34
 */
@Service
class UserFactoryAdapter(
        private val userRepositoryPort: UserRepositoryPort
) : UserFactoryPort
