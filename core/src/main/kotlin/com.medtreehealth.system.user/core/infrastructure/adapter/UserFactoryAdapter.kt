package com.medtreehealth.system.user.core.infrastructure.adapter

import com.medtreehealth.system.user.core.context.port.UserQueryPort
import com.medtreehealth.system.user.core.domain.port.UserFactoryPort
import org.springframework.stereotype.Service

/**
 *@author honorstone
 *@date 2019/5/21 11:34
 */
@Service
class UserFactoryAdapter(
):UserFactoryPort, UserQueryPort {


}
