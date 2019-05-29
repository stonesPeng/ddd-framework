package com.medtreehealth.system.user.app.application.service

import com.medtreehealth.system.user.app.api.UserCommandService
import com.medtreehealth.system.user.core.context.adapter.CommandAdapter
import org.springframework.stereotype.Service

/**
 *@author honorstone
 *@date 2019/5/29 10:06
 */
@Service
class UserCommandServiceImpl(
        private val commandAdapter: CommandAdapter) : UserCommandService