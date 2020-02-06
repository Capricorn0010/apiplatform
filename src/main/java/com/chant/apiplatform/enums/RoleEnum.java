package com.chant.apiplatform.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;

/**
 * 枚举:角色
 *
 * Author: 郑楷山
 * Date: 2019-08-29
 **/

@Getter
@AllArgsConstructor
public enum RoleEnum implements GrantedAuthority {

	SUPER_ADMIN(0),

	USER(1),

	;

	private int value;

	@Override
	public String getAuthority() {
		return this.name();
	}
}
